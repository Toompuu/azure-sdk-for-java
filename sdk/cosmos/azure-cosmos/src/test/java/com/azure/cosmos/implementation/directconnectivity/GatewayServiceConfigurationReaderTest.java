// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.ConnectionPolicy;
import com.azure.cosmos.CosmosKeyCredential;
import com.azure.cosmos.DatabaseAccount;
import com.azure.cosmos.implementation.AsyncDocumentClient;
import com.azure.cosmos.implementation.AsyncDocumentClient.Builder;
import com.azure.cosmos.implementation.BaseAuthorizationTokenProvider;
import com.azure.cosmos.implementation.SpyClientUnderTestFactory;
import com.azure.cosmos.implementation.TestConfigurations;
import com.azure.cosmos.implementation.TestSuiteBase;
import com.azure.cosmos.implementation.http.HttpClient;
import com.azure.cosmos.implementation.http.HttpHeaders;
import com.azure.cosmos.implementation.http.HttpRequest;
import com.azure.cosmos.implementation.http.HttpResponse;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufUtil;
import io.reactivex.subscribers.TestSubscriber;
import org.apache.commons.io.IOUtils;
import org.mockito.Mockito;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class GatewayServiceConfigurationReaderTest extends TestSuiteBase {

    private static final int TIMEOUT = 8000;
    private HttpClient mockHttpClient;
    private BaseAuthorizationTokenProvider baseAuthorizationTokenProvider;
    private ConnectionPolicy connectionPolicy;
    private GatewayServiceConfigurationReader mockGatewayServiceConfigurationReader;
    private GatewayServiceConfigurationReader gatewayServiceConfigurationReader;
    private AsyncDocumentClient client;
    private String databaseAccountJson;
    private DatabaseAccount expectedDatabaseAccount;

    @Factory(dataProvider = "clientBuilders")
    public GatewayServiceConfigurationReaderTest(Builder clientBuilder) {
        super(clientBuilder);
    }

    @BeforeClass(groups = "simple")
    public void before_GatewayServiceConfigurationReaderTest() throws Exception {
        client = clientBuilder().build();
        SpyClientUnderTestFactory.ClientUnderTest clientUnderTest = SpyClientUnderTestFactory.createClientUnderTest(this.clientBuilder());
        HttpClient httpClient = clientUnderTest.getSpyHttpClient();
        baseAuthorizationTokenProvider = new BaseAuthorizationTokenProvider(new CosmosKeyCredential(TestConfigurations.MASTER_KEY));
        connectionPolicy = ConnectionPolicy.getDefaultPolicy();
        mockHttpClient = Mockito.mock(HttpClient.class);
        mockGatewayServiceConfigurationReader = new GatewayServiceConfigurationReader(new URI(TestConfigurations.HOST),
                false, TestConfigurations.MASTER_KEY, connectionPolicy, baseAuthorizationTokenProvider, mockHttpClient);

        gatewayServiceConfigurationReader = new GatewayServiceConfigurationReader(new URI(TestConfigurations.HOST),
                                                                                  false,
                                                                                  TestConfigurations.MASTER_KEY,
                                                                                  connectionPolicy,
                                                                                  baseAuthorizationTokenProvider,
                                                                                  httpClient);
        databaseAccountJson = IOUtils
                .toString(getClass().getClassLoader().getResourceAsStream("databaseAccount.json"), "UTF-8");
        expectedDatabaseAccount = new DatabaseAccount(databaseAccountJson);
        HttpResponse mockResponse = getMockResponse(databaseAccountJson);
        Mockito.when(mockHttpClient.send(Mockito.any(HttpRequest.class))).thenReturn(Mono.just(mockResponse));
    }

    @AfterClass(groups = { "simple" }, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        safeClose(client);
    }

    @Test(groups = "simple")
    public void mockInitializeReaderAsync() {
        Mono<DatabaseAccount> databaseAccount = mockGatewayServiceConfigurationReader.initializeReaderAsync();
        validateSuccess(databaseAccount, expectedDatabaseAccount);
    }

    @Test(groups = "simple")
    public void mockInitializeReaderAsyncWithResourceToken() throws Exception {
        HttpResponse mockResponse = getMockResponse(databaseAccountJson);
        Mockito.when(mockHttpClient.send(Mockito.any(HttpRequest.class))).thenReturn(Mono.just(mockResponse));

        mockGatewayServiceConfigurationReader = new GatewayServiceConfigurationReader(new URI(TestConfigurations.HOST),
                true, "SampleResourceToken", connectionPolicy, baseAuthorizationTokenProvider, mockHttpClient);

        Mono<DatabaseAccount> databaseAccount = mockGatewayServiceConfigurationReader.initializeReaderAsync();
        validateSuccess(databaseAccount, expectedDatabaseAccount);
    }

    @Test(groups = "simple")
    public void initializeReaderAsync() {
        Mono<DatabaseAccount> databaseAccount = gatewayServiceConfigurationReader.initializeReaderAsync();
        validateSuccess(databaseAccount);
    }

    public static void validateSuccess(Mono<DatabaseAccount> observable) {
        TestSubscriber<DatabaseAccount> testSubscriber = new TestSubscriber<DatabaseAccount>();

        observable.subscribe(testSubscriber);
        testSubscriber.awaitTerminalEvent(TIMEOUT, TimeUnit.MILLISECONDS);
        testSubscriber.assertNoErrors();
        testSubscriber.assertComplete();
        testSubscriber.assertValueCount(1);
        DatabaseAccount databaseAccount = testSubscriber.values().get(0);
        assertThat(BridgeInternal.getQueryEngineConfiuration(databaseAccount).size() > 0).isTrue();
        assertThat(BridgeInternal.getReplicationPolicy(databaseAccount)).isNotNull();
        assertThat(BridgeInternal.getSystemReplicationPolicy(databaseAccount)).isNotNull();
    }

    public static void validateSuccess(Mono<DatabaseAccount> observable, DatabaseAccount expectedDatabaseAccount) {
        TestSubscriber<DatabaseAccount> testSubscriber = new TestSubscriber<DatabaseAccount>();

        observable.subscribe(testSubscriber);
        testSubscriber.awaitTerminalEvent(TIMEOUT, TimeUnit.MILLISECONDS);
        testSubscriber.assertNoErrors();
        testSubscriber.assertComplete();
        testSubscriber.assertValueCount(1);
        DatabaseAccount databaseAccount = testSubscriber.values().get(0);
        assertThat(databaseAccount.getId()).isEqualTo(expectedDatabaseAccount.getId());
        assertThat(BridgeInternal.getAddressesLink(databaseAccount))
                .isEqualTo(BridgeInternal.getAddressesLink(expectedDatabaseAccount));
        assertThat(databaseAccount.getWritableLocations().iterator().next().getEndpoint())
                .isEqualTo(expectedDatabaseAccount.getWritableLocations().iterator().next().getEndpoint());
        assertThat(BridgeInternal.getSystemReplicationPolicy(databaseAccount).getMaxReplicaSetSize())
                .isEqualTo(BridgeInternal.getSystemReplicationPolicy(expectedDatabaseAccount).getMaxReplicaSetSize());
        assertThat(BridgeInternal.getSystemReplicationPolicy(databaseAccount).getMaxReplicaSetSize())
                .isEqualTo(BridgeInternal.getSystemReplicationPolicy(expectedDatabaseAccount).getMaxReplicaSetSize());
        assertThat(BridgeInternal.getQueryEngineConfiuration(databaseAccount))
                .isEqualTo(BridgeInternal.getQueryEngineConfiuration(expectedDatabaseAccount));
    }

    private HttpResponse getMockResponse(String databaseAccountJson) {
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        Mockito.doReturn(200).when(httpResponse).statusCode();
        Mockito.doReturn(Flux.just(ByteBufUtil.writeUtf8(ByteBufAllocator.DEFAULT, databaseAccountJson)))
                .when(httpResponse).body();
        Mockito.doReturn(Mono.just(databaseAccountJson))
                .when(httpResponse).bodyAsString();

        Mockito.doReturn(new HttpHeaders()).when(httpResponse).headers();
        return httpResponse;
    }
}
