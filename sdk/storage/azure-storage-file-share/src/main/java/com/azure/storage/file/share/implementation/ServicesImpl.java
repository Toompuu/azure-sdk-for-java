// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.storage.file.share.implementation.models.ListSharesIncludeType;
import com.azure.storage.file.share.implementation.models.ServicesGetPropertiesResponse;
import com.azure.storage.file.share.implementation.models.ServicesListSharesSegmentNextResponse;
import com.azure.storage.file.share.implementation.models.ServicesListSharesSegmentResponse;
import com.azure.storage.file.share.implementation.models.ServicesSetPropertiesResponse;
import com.azure.storage.file.share.implementation.models.ShareItemInternal;
import com.azure.storage.file.share.models.ShareServiceProperties;
import com.azure.storage.file.share.models.ShareStorageException;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Services. */
public final class ServicesImpl {
    /** The proxy service used to perform REST calls. */
    private final ServicesService service;

    /** The service client containing this operation class. */
    private final AzureFileStorageImpl client;

    /**
     * Initializes an instance of ServicesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServicesImpl(AzureFileStorageImpl client) {
        this.service = RestProxy.create(ServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureFileStorageServices to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureFileStorageServ")
    public interface ServicesService {
        @Put("/")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ShareStorageException.class)
        Mono<ServicesSetPropertiesResponse> setProperties(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @BodyParam("application/xml") ShareServiceProperties shareServiceProperties,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ShareStorageException.class)
        Mono<ServicesGetPropertiesResponse> getProperties(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ShareStorageException.class)
        Mono<ServicesListSharesSegmentResponse> listSharesSegment(
                @HostParam("url") String url,
                @QueryParam("comp") String comp,
                @QueryParam("prefix") String prefix,
                @QueryParam("marker") String marker,
                @QueryParam("maxresults") Integer maxresults,
                @QueryParam("include") String include,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ShareStorageException.class)
        Mono<ServicesListSharesSegmentNextResponse> listSharesSegmentNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("url") String url,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Sets properties for a storage account's File service endpoint, including properties for Storage Analytics metrics
     * and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param shareServiceProperties The StorageService properties.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting
     *     Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ShareStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithResponseAsync(
            ShareServiceProperties shareServiceProperties, Integer timeout, Context context) {
        final String restype = "service";
        final String comp = "properties";
        final String accept = "application/xml";
        return service.setProperties(
                this.client.getUrl(),
                restype,
                comp,
                timeout,
                this.client.getVersion(),
                shareServiceProperties,
                accept,
                context);
    }

    /**
     * Gets the properties of a storage account's File service, including properties for Storage Analytics metrics and
     * CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting
     *     Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ShareStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account's File service, including properties for Storage Analytics metrics
     *     and CORS (Cross-Origin Resource Sharing) rules on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithResponseAsync(Integer timeout, Context context) {
        final String restype = "service";
        final String comp = "properties";
        final String accept = "application/xml";
        return service.getProperties(
                this.client.getUrl(), restype, comp, timeout, this.client.getVersion(), accept, context);
    }

    /**
     * The List Shares Segment operation returns a list of the shares and share snapshots under the specified account.
     *
     * @param prefix Filters the results to return only entries whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list to be returned with the next list operation.
     *     The operation returns a marker value within the response body if the list returned was not complete. The
     *     marker value may then be used in a subsequent call to request the next set of list items. The marker value is
     *     opaque to the client.
     * @param maxresults Specifies the maximum number of entries to return. If the request does not specify maxresults,
     *     or specifies a value greater than 5,000, the server will return up to 5,000 items.
     * @param include Include this parameter to specify one or more datasets to include in the response.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting
     *     Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ShareStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an enumeration of shares along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ShareItemInternal>> listSharesSegmentSinglePageAsync(
            String prefix,
            String marker,
            Integer maxresults,
            List<ListSharesIncludeType> include,
            Integer timeout,
            Context context) {
        final String comp = "list";
        final String accept = "application/xml";
        String includeConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(include, CollectionFormat.CSV);
        return service.listSharesSegment(
                        this.client.getUrl(),
                        comp,
                        prefix,
                        marker,
                        maxresults,
                        includeConverted,
                        timeout,
                        this.client.getVersion(),
                        accept,
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getShareItems(),
                                        res.getValue().getNextMarker(),
                                        res.getDeserializedHeaders()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ShareStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an enumeration of shares along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ShareItemInternal>> listSharesSegmentNextSinglePageAsync(
            String nextLink, Context context) {
        final String accept = "application/xml";
        return service.listSharesSegmentNext(nextLink, this.client.getUrl(), this.client.getVersion(), accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getShareItems(),
                                        res.getValue().getNextMarker(),
                                        res.getDeserializedHeaders()));
    }
}
