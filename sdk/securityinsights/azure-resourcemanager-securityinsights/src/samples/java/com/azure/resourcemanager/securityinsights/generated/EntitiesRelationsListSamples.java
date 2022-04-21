// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for EntitiesRelations List. */
public final class EntitiesRelationsListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2021-09-01-preview/examples/entities/relations/GetAllEntityRelations.json
     */
    /**
     * Sample code: Get all relations of an entity.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllRelationsOfAnEntity(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .entitiesRelations()
            .list("myRg", "myWorkspace", "afbd324f-6c48-459c-8710-8d1e1cd03812", null, null, null, null, Context.NONE);
    }
}
