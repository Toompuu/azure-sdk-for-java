// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;

/** Samples for OperationResults Get. */
public final class OperationResultsGetSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/asset-tracks-operation-result-by-id.json
     */
    /**
     * Sample code: Get result of asynchronous operation.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void getResultOfAsynchronousOperation(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .operationResults()
            .getWithResponse(
                "contoso",
                "contosomedia",
                "ClimbingMountRainer",
                "text1",
                "e78f8d40-7aaa-4f2f-8ae6-73987e7c5a08",
                Context.NONE);
    }
}
