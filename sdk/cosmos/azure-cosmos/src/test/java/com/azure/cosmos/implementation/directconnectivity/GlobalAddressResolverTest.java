// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;


import com.azure.cosmos.ConnectionPolicy;
import com.azure.cosmos.implementation.DocumentCollection;
import com.azure.cosmos.implementation.GlobalEndpointManager;
import com.azure.cosmos.implementation.IAuthorizationTokenProvider;
import com.azure.cosmos.implementation.OperationType;
import com.azure.cosmos.implementation.PartitionKeyRange;
import com.azure.cosmos.implementation.ResourceType;
import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import com.azure.cosmos.implementation.UserAgentContainer;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.caches.RxCollectionCache;
import com.azure.cosmos.implementation.caches.RxPartitionKeyRangeCache;
import com.azure.cosmos.implementation.http.HttpClient;
import com.azure.cosmos.implementation.routing.CollectionRoutingMap;
import com.azure.cosmos.implementation.routing.PartitionKeyInternalHelper;
import com.azure.cosmos.implementation.routing.PartitionKeyRangeIdentity;
import org.apache.commons.collections4.list.UnmodifiableList;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reactor.core.publisher.Mono;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class GlobalAddressResolverTest {

    private HttpClient httpClient;
    private GlobalEndpointManager endpointManager;
    private IAuthorizationTokenProvider authorizationTokenProvider;
    private UserAgentContainer userAgentContainer;
    private RxCollectionCache collectionCache;
    private GatewayServiceConfigurationReader serviceConfigReader;
    private RxPartitionKeyRangeCache routingMapProvider;
    private ConnectionPolicy connectionPolicy;
    private URL urlforRead1;
    private URL urlforRead2;
    private URL urlforRead3;

    private URL urlforWrite1;
    private URL urlforWrite2;
    private URL urlforWrite3;

    @BeforeClass(groups = "unit")
    public void before_GlobalAddressResolverTest() throws Exception {
        urlforRead1 = new URL("http://testRead1.com/");
        urlforRead2 = new URL("http://testRead2.com/");
        urlforRead3 = new URL("http://testRead3.com/");
        urlforWrite1 = new URL("http://testWrite1.com/");
        urlforWrite2 = new URL("http://testWrite2.com/");
        urlforWrite3 = new URL("http://testWrite3.com/");

        connectionPolicy = new ConnectionPolicy();
        connectionPolicy.setEnableReadRequestsFallback(true);
        httpClient = Mockito.mock(HttpClient.class);
        endpointManager = Mockito.mock(GlobalEndpointManager.class);

        List<URL> readEndPointList = new ArrayList<>();
        readEndPointList.add(urlforRead1);
        readEndPointList.add(urlforRead2);
        readEndPointList.add(urlforRead3);
        UnmodifiableList readList = new UnmodifiableList(readEndPointList);

        List<URL> writeEndPointList = new ArrayList<>();
        writeEndPointList.add(urlforWrite1);
        writeEndPointList.add(urlforWrite2);
        writeEndPointList.add(urlforWrite3);
        UnmodifiableList writeList = new UnmodifiableList(writeEndPointList);

        Mockito.when(endpointManager.getReadEndpoints()).thenReturn(readList);
        Mockito.when(endpointManager.getWriteEndpoints()).thenReturn(writeList);

        authorizationTokenProvider = Mockito.mock(IAuthorizationTokenProvider.class);

        DocumentCollection collectionDefinition = new DocumentCollection();
        collectionDefinition.setId(UUID.randomUUID().toString());
        collectionCache = Mockito.mock(RxCollectionCache.class);
        Mockito.when(collectionCache.resolveCollectionAsync(Matchers.any(RxDocumentServiceRequest.class))).thenReturn(Mono.just(new Utils.ValueHolder<>(collectionDefinition)));
        routingMapProvider = Mockito.mock(RxPartitionKeyRangeCache.class);
        userAgentContainer = Mockito.mock(UserAgentContainer.class);
        serviceConfigReader = Mockito.mock(GatewayServiceConfigurationReader.class);

    }

    @Test(groups = "unit")
    public void resolveAsync() throws Exception {

        GlobalAddressResolver globalAddressResolver = new GlobalAddressResolver(httpClient, endpointManager, Protocol.HTTPS, authorizationTokenProvider, collectionCache, routingMapProvider,
                userAgentContainer,
                serviceConfigReader, connectionPolicy);
        RxDocumentServiceRequest request;
        request = RxDocumentServiceRequest.createFromName(
                OperationType.Read,
                "dbs/db/colls/coll/docs/doc1",
                ResourceType.Document);

        Set<URL> urlsBeforeResolve = globalAddressResolver.addressCacheByEndpoint.keySet();
        assertThat(urlsBeforeResolve.size()).isEqualTo(5);
        assertThat(urlsBeforeResolve.contains(urlforRead3)).isFalse();//Last read will be removed from addressCacheByEndpoint after 5 endpoints
        assertThat(urlsBeforeResolve.contains(urlforRead2)).isTrue();

        URL testUrl = new URL("http://Test.com/");
        Mockito.when(endpointManager.resolveServiceEndpoint(Matchers.any(RxDocumentServiceRequest.class))).thenReturn(testUrl);
        globalAddressResolver.resolveAsync(request, true);
        Set<URL> urlsAfterResolve = globalAddressResolver.addressCacheByEndpoint.keySet();
        assertThat(urlsAfterResolve.size()).isEqualTo(5);
        assertThat(urlsAfterResolve.contains(urlforRead2)).isFalse();//Last read will be removed from addressCacheByEndpoint after 5 endpoints
        assertThat(urlsBeforeResolve.contains(testUrl)).isTrue();//New endpoint will be added in addressCacheByEndpoint
    }

    @Test(groups = "unit")
    public void openAsync() throws Exception {
        GlobalAddressResolver globalAddressResolver = new GlobalAddressResolver(httpClient, endpointManager, Protocol.HTTPS, authorizationTokenProvider, collectionCache, routingMapProvider,
                userAgentContainer,
                serviceConfigReader, connectionPolicy);
        Map<URL, GlobalAddressResolver.EndpointCache> addressCacheByEndpoint = Mockito.spy(globalAddressResolver.addressCacheByEndpoint);
        GlobalAddressResolver.EndpointCache endpointCache = new GlobalAddressResolver.EndpointCache();
        GatewayAddressCache gatewayAddressCache = Mockito.mock(GatewayAddressCache.class);
        AtomicInteger numberOfTaskCompleted = new AtomicInteger(0);
        endpointCache.addressCache = gatewayAddressCache;
        globalAddressResolver.addressCacheByEndpoint.clear();
        globalAddressResolver.addressCacheByEndpoint.put(urlforRead1, endpointCache);
        globalAddressResolver.addressCacheByEndpoint.put(urlforRead2, endpointCache);


        DocumentCollection documentCollection = new DocumentCollection();
        documentCollection.setId("TestColl");
        documentCollection.setResourceId("IXYFAOHEBPM=");
        CollectionRoutingMap collectionRoutingMap = Mockito.mock(CollectionRoutingMap.class);
        PartitionKeyRange range = new PartitionKeyRange("0", PartitionKeyInternalHelper.MinimumInclusiveEffectivePartitionKey,
                PartitionKeyInternalHelper.MaximumExclusiveEffectivePartitionKey);
        List<PartitionKeyRange> partitionKeyRanges = new ArrayList<>();
        partitionKeyRanges.add(range);
        Mockito.when(collectionRoutingMap.getOrderedPartitionKeyRanges()).thenReturn(partitionKeyRanges);
        Mono<Utils.ValueHolder<CollectionRoutingMap>> collectionRoutingMapSingle = Mono.just(new Utils.ValueHolder<>(collectionRoutingMap));
        Mockito.when(routingMapProvider.tryLookupAsync(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(collectionRoutingMapSingle);

        List<PartitionKeyRangeIdentity> ranges = new ArrayList<>();
        for (PartitionKeyRange partitionKeyRange : (List<PartitionKeyRange>) collectionRoutingMap.getOrderedPartitionKeyRanges()) {
            PartitionKeyRangeIdentity partitionKeyRangeIdentity = new PartitionKeyRangeIdentity(documentCollection.getResourceId(), partitionKeyRange.getId());
            ranges.add(partitionKeyRangeIdentity);
        }

        Mono<Void> completable = Mono.fromCallable(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                numberOfTaskCompleted.getAndIncrement();
                return null;
            }
        });
        Mockito.when(gatewayAddressCache.openAsync(documentCollection, ranges)).thenReturn(completable);

        globalAddressResolver.openAsync(documentCollection).block();
        assertThat(numberOfTaskCompleted.get()).isEqualTo(2);
    }
}
