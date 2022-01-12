// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.VirtualMachineReimageParameters;

/** Samples for VirtualMachines Reimage. */
public final class VirtualMachinesReimageSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/compute/ReimageVirtualMachine.json
     */
    /**
     * Sample code: Reimage a Virtual Machine.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void reimageAVirtualMachine(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .reimage(
                "myResourceGroup", "myVMName", new VirtualMachineReimageParameters().withTempDisk(true), Context.NONE);
    }
}
