// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

import com.azure.core.util.Context;

/** Samples for Clusters GetByResourceGroup. */
public final class ClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/stable/2021-11-01/examples/Clusters/ClusterGet.json
     */
    /**
     * Sample code: ClusterGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void clusterGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .eventHubs()
            .manager()
            .serviceClient()
            .getClusters()
            .getByResourceGroupWithResponse("myResourceGroup", "testCluster", Context.NONE);
    }
}
