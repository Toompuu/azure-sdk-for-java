// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for WatchlistItems Get. */
public final class WatchlistItemsGetSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/watchlists/GetWatchlistItemById.json
     */
    /**
     * Sample code: Get a watchlist item.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAWatchlistItem(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .watchlistItems()
            .getWithResponse(
                "myRg", "myWorkspace", "highValueAsset", "3f8901fe-63d9-4875-9ad5-9fb3b8105797", Context.NONE);
    }
}
