// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.Context;

/** Samples for ExportConfigurations Delete. */
public final class ExportConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2015-05-01/examples/ExportConfigurationDelete.json
     */
    /**
     * Sample code: ExportConfigurationDelete.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void exportConfigurationDelete(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .exportConfigurations()
            .deleteWithResponse("my-resource-group", "my-component", "uGOoki0jQsyEs3IdQ83Q4QsNr4=", Context.NONE);
    }
}
