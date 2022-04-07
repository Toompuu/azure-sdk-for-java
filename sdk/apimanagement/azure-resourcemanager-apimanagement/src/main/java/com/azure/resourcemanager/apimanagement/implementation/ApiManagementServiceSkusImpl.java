// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ApiManagementServiceSkusClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ResourceSkuResultInner;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceSkus;
import com.azure.resourcemanager.apimanagement.models.ResourceSkuResult;

public final class ApiManagementServiceSkusImpl implements ApiManagementServiceSkus {
    private static final ClientLogger LOGGER = new ClientLogger(ApiManagementServiceSkusImpl.class);

    private final ApiManagementServiceSkusClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ApiManagementServiceSkusImpl(
        ApiManagementServiceSkusClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceSkuResult> listAvailableServiceSkus(String resourceGroupName, String serviceName) {
        PagedIterable<ResourceSkuResultInner> inner =
            this.serviceClient().listAvailableServiceSkus(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new ResourceSkuResultImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceSkuResult> listAvailableServiceSkus(
        String resourceGroupName, String serviceName, Context context) {
        PagedIterable<ResourceSkuResultInner> inner =
            this.serviceClient().listAvailableServiceSkus(resourceGroupName, serviceName, context);
        return Utils.mapPage(inner, inner1 -> new ResourceSkuResultImpl(inner1, this.manager()));
    }

    private ApiManagementServiceSkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
