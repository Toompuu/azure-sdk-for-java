// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagecache.fluent.models.ResourceUsageInner;

/** An instance of this class provides access to all the operations defined in AscUsagesClient. */
public interface AscUsagesClient {
    /**
     * Gets the quantity used and quota limit for resources.
     *
     * @param location The name of the region to query for usage information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quantity used and quota limit for resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceUsageInner> list(String location);

    /**
     * Gets the quantity used and quota limit for resources.
     *
     * @param location The name of the region to query for usage information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quantity used and quota limit for resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceUsageInner> list(String location, Context context);
}
