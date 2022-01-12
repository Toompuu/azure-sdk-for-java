// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;

/** Samples for StorageAccounts GetByResourceGroup. */
public final class StorageAccountsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-04-01/examples/StorageAccountGetProperties.json
     */
    /**
     * Sample code: StorageAccountGetProperties.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountGetProperties(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getStorageAccounts()
            .getByResourceGroupWithResponse("res9407", "sto8596", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-04-01/examples/StorageAccountGetPropertiesCMKEnabled.json
     */
    /**
     * Sample code: StorageAccountGetPropertiesCMKEnabled.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountGetPropertiesCMKEnabled(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getStorageAccounts()
            .getByResourceGroupWithResponse("res9407", "sto8596", null, Context.NONE);
    }
}
