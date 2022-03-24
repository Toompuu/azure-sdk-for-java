// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.AccountFilterInner;

/** An instance of this class provides access to all the operations defined in AccountFiltersClient. */
public interface AccountFiltersClient {
    /**
     * List Account Filters in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AccountFilter items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountFilterInner> list(String resourceGroupName, String accountName);

    /**
     * List Account Filters in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AccountFilter items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountFilterInner> list(String resourceGroupName, String accountName, Context context);

    /**
     * Get the details of an Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Account Filter in the Media Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountFilterInner get(String resourceGroupName, String accountName, String filterName);

    /**
     * Get the details of an Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Account Filter in the Media Services account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccountFilterInner> getWithResponse(
        String resourceGroupName, String accountName, String filterName, Context context);

    /**
     * Creates or updates an Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Account Filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountFilterInner createOrUpdate(
        String resourceGroupName, String accountName, String filterName, AccountFilterInner parameters);

    /**
     * Creates or updates an Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Account Filter along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccountFilterInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String accountName,
        String filterName,
        AccountFilterInner parameters,
        Context context);

    /**
     * Deletes an Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String filterName);

    /**
     * Deletes an Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String filterName, Context context);

    /**
     * Updates an existing Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Account Filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountFilterInner update(
        String resourceGroupName, String accountName, String filterName, AccountFilterInner parameters);

    /**
     * Updates an existing Account Filter in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filterName The Account Filter name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Account Filter along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccountFilterInner> updateWithResponse(
        String resourceGroupName,
        String accountName,
        String filterName,
        AccountFilterInner parameters,
        Context context);
}
