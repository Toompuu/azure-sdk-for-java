// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.models.ThroughputSettingsResource;
import com.azure.resourcemanager.cosmos.models.ThroughputSettingsUpdateParameters;
import java.util.HashMap;
import java.util.Map;

/** Samples for GremlinResources UpdateGremlinGraphThroughput. */
public final class GremlinResourcesUpdateGremlinGraphThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2021-10-15/examples/CosmosDBGremlinGraphThroughputUpdate.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphThroughputUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGremlinGraphThroughputUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getGremlinResources()
            .updateGremlinGraphThroughput(
                "rg1",
                "ddb1",
                "databaseName",
                "graphName",
                new ThroughputSettingsUpdateParameters()
                    .withLocation("West US")
                    .withTags(mapOf())
                    .withResource(new ThroughputSettingsResource().withThroughput(400)),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
