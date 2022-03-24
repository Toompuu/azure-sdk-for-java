// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of EntitiesRelations. */
public interface EntitiesRelations {
    /**
     * Gets all relations of an entity.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param entityId entity ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all relations of an entity as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Relation> list(String resourceGroupName, String workspaceName, String entityId);

    /**
     * Gets all relations of an entity.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param entityId entity ID.
     * @param filter Filters the results, based on a Boolean condition. Optional.
     * @param orderby Sorts the results. Optional.
     * @param top Returns only the first n results. Optional.
     * @param skipToken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all relations of an entity as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Relation> list(
        String resourceGroupName,
        String workspaceName,
        String entityId,
        String filter,
        String orderby,
        Integer top,
        String skipToken,
        Context context);
}
