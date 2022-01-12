// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for DdosCustomPolicies GetByResourceGroup. */
public final class DdosCustomPoliciesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/DdosCustomPolicyGet.json
     */
    /**
     * Sample code: Get DDoS custom policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDDoSCustomPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getDdosCustomPolicies()
            .getByResourceGroupWithResponse("rg1", "test-ddos-custom-policy", Context.NONE);
    }
}
