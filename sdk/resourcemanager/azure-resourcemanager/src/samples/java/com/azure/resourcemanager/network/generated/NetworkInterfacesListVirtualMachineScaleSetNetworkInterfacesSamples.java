// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaces ListVirtualMachineScaleSetNetworkInterfaces. */
public final class NetworkInterfacesListVirtualMachineScaleSetNetworkInterfacesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VmssNetworkInterfaceList.json
     */
    /**
     * Sample code: List virtual machine scale set network interfaces.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listVirtualMachineScaleSetNetworkInterfaces(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkInterfaces()
            .listVirtualMachineScaleSetNetworkInterfaces("rg1", "vmss1", Context.NONE);
    }
}
