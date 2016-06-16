/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.azure;

/**
 * ServiceClient is the abstraction for accessing REST operations and their payload data types.
 */
public abstract class AzureServiceClient {
    /**
     * The RestClient instance storing all information needed for making REST calls.
     */
    private RestClient restClient;

    protected AzureServiceClient(String baseUrl) {
        this(new RestClient.Builder().withBaseUrl(baseUrl)
                .withInterceptor(new RequestIdHeaderInterceptor()).build());
    }

    /**
     * Initializes a new instance of the ServiceClient class.
     *
     * @param restClient the REST client
     */
    protected AzureServiceClient(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * The default User-Agent header. Override this method to override the user agent.
     *
     * @return the user agent string.
     */
    public String userAgent() {
        return "Azure-SDK-For-Java/" + getClass().getPackage().getImplementationVersion();
    }

    /**
     * @return the {@link RestClient} instance.
     */
    public RestClient restClient() {
        return restClient;
    }
}
