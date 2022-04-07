// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.models.SyncStorageKeysInput;

/** Samples for Mediaservices SyncStorageKeys. */
public final class MediaservicesSyncStorageKeysSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-06-01/examples/accounts-sync-storage-keys.json
     */
    /**
     * Sample code: Synchronizes Storage Account Keys.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void synchronizesStorageAccountKeys(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .mediaservices()
            .syncStorageKeysWithResponse(
                "contoso", "contososports", new SyncStorageKeysInput().withId("contososportsstore"), Context.NONE);
    }
}
