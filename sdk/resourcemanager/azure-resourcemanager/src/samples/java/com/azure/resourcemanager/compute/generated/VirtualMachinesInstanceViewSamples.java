// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines InstanceView. */
public final class VirtualMachinesInstanceViewSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/compute/GetVirtualMachineInstanceView.json
     */
    /**
     * Sample code: Get Virtual Machine Instance View.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualMachineInstanceView(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .instanceViewWithResponse("myResourceGroup", "myVM", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/compute/GetVirtualMachineInstanceViewAutoPlacedOnDedicatedHostGroup.json
     */
    /**
     * Sample code: Get instance view of a virtual machine placed on a dedicated host group through automatic placement.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getInstanceViewOfAVirtualMachinePlacedOnADedicatedHostGroupThroughAutomaticPlacement(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .instanceViewWithResponse("myResourceGroup", "myVM", Context.NONE);
    }
}
