// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.Context;

/** Samples for Caches Flush. */
public final class CachesFlushSamples {
    /*
     * x-ms-original-file: specification/storagecache/resource-manager/Microsoft.StorageCache/stable/2021-09-01/examples/Caches_Flush.json
     */
    /**
     * Sample code: Caches_Flush.
     *
     * @param manager Entry point to StorageCacheManager.
     */
    public static void cachesFlush(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.caches().flush("scgroup", "sc", Context.NONE);
    }
}
