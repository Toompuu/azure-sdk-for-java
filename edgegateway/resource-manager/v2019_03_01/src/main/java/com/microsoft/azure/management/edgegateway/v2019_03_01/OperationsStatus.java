/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import rx.Observable;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.OperationsStatusInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing OperationsStatus.
 */
public interface OperationsStatus extends HasInner<OperationsStatusInner> {
    /**
     * Gets the details of a specified job on a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataBoxEdgeDeviceJobModel> getAsync(String deviceName, String name, String resourceGroupName);

}
