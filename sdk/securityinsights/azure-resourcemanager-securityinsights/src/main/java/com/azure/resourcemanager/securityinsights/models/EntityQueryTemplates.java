// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of EntityQueryTemplates. */
public interface EntityQueryTemplates {
    /**
     * Gets all entity query templates.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all entity query templates as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EntityQueryTemplate> list(String resourceGroupName, String workspaceName);

    /**
     * Gets all entity query templates.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kind The entity template query kind we want to fetch.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all entity query templates as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EntityQueryTemplate> list(
        String resourceGroupName, String workspaceName, Constant74 kind, Context context);

    /**
     * Gets an entity query.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param entityQueryTemplateId entity query template ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an entity query.
     */
    EntityQueryTemplate get(String resourceGroupName, String workspaceName, String entityQueryTemplateId);

    /**
     * Gets an entity query.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param entityQueryTemplateId entity query template ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an entity query along with {@link Response}.
     */
    Response<EntityQueryTemplate> getWithResponse(
        String resourceGroupName, String workspaceName, String entityQueryTemplateId, Context context);
}
