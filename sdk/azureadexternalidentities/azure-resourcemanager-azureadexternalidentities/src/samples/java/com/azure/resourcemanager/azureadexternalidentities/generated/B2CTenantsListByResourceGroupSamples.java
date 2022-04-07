// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureadexternalidentities.generated;

import com.azure.core.util.Context;

/** Samples for B2CTenants ListByResourceGroup. */
public final class B2CTenantsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cpim/resource-manager/Microsoft.AzureActiveDirectory/stable/2021-04-01/examples/listTenantsByResourceGroup.json
     */
    /**
     * Sample code: B2CTenants_ListByResourceGroup.
     *
     * @param manager Entry point to ExternalIdentitiesConfigurationManager.
     */
    public static void b2CTenantsListByResourceGroup(
        com.azure.resourcemanager.azureadexternalidentities.ExternalIdentitiesConfigurationManager manager) {
        manager.b2CTenants().listByResourceGroup("contosoResourceGroup", Context.NONE);
    }
}
