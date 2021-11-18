// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.core.util.Context;

/** Samples for Tasks Get. */
public final class TasksGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksGet.json
     */
    /**
     * Sample code: Tasks_Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void tasksGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getTasks()
            .getWithResponse("myResourceGroup", "myRegistry", "myTask", Context.NONE);
    }
}
