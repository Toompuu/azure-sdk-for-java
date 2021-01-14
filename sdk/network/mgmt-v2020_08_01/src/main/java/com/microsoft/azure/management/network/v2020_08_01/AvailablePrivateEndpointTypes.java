/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2020_08_01.implementation.AvailablePrivateEndpointTypesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AvailablePrivateEndpointTypes.
 */
public interface AvailablePrivateEndpointTypes extends HasInner<AvailablePrivateEndpointTypesInner> {
    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailablePrivateEndpointType> listByResourceGroupAsync(final String location, final String resourceGroupName);

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailablePrivateEndpointType> listAsync(final String location);

}
