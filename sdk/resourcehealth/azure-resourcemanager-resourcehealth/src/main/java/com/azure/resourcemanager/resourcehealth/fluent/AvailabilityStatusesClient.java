// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcehealth.fluent.models.AvailabilityStatusInner;

/** An instance of this class provides access to all the operations defined in AvailabilityStatusesClient. */
public interface AvailabilityStatusesClient {
    /**
     * Lists the current availability status for all the resources in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilityStatusInner> listBySubscriptionId();

    /**
     * Lists the current availability status for all the resources in the subscription.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilityStatusInner> listBySubscriptionId(String filter, String expand, Context context);

    /**
     * Lists the current availability status for all the resources in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilityStatusInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the current availability status for all the resources in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilityStatusInner> listByResourceGroup(
        String resourceGroupName, String filter, String expand, Context context);

    /**
     * Gets current availability status for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current availability status for a single resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailabilityStatusInner getByResource(String resourceUri);

    /**
     * Gets current availability status for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return current availability status for a single resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AvailabilityStatusInner> getByResourceWithResponse(
        String resourceUri, String filter, String expand, Context context);

    /**
     * Lists all historical availability transitions and impacting events for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilityStatusInner> list(String resourceUri);

    /**
     * Lists all historical availability transitions and impacting events for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param expand Setting $expand=recommendedactions in url query expands the recommendedactions in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List availabilityStatus operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilityStatusInner> list(String resourceUri, String filter, String expand, Context context);
}
