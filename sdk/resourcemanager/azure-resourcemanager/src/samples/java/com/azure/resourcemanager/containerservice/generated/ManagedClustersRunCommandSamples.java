// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.models.RunCommandRequest;

/** Samples for ManagedClusters RunCommand. */
public final class ManagedClustersRunCommandSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/stable/2021-09-01/examples/RunCommandRequest.json
     */
    /**
     * Sample code: submitNewCommand.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void submitNewCommand(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getManagedClusters()
            .runCommand(
                "rg1",
                "clustername1",
                new RunCommandRequest().withCommand("kubectl apply -f ns.yaml").withContext("").withClusterToken(""),
                Context.NONE);
    }
}
