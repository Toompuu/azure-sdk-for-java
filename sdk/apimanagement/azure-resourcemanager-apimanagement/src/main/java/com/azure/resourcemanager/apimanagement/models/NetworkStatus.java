// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of NetworkStatus. */
public interface NetworkStatus {
    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    List<NetworkStatusContractByLocation> listByService(String resourceGroupName, String serviceName);

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service along with {@link Response}.
     */
    Response<List<NetworkStatusContractByLocation>> listByServiceWithResponse(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions
     *     like West US, East US, South Central US.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    NetworkStatusContract listByLocation(String resourceGroupName, String serviceName, String locationName);

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions
     *     like West US, East US, South Central US.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service along with {@link Response}.
     */
    Response<NetworkStatusContract> listByLocationWithResponse(
        String resourceGroupName, String serviceName, String locationName, Context context);
}
