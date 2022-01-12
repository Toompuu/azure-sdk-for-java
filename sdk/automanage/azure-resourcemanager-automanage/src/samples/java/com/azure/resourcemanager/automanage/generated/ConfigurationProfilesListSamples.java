// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

import com.azure.core.util.Context;

/** Samples for ConfigurationProfiles List. */
public final class ConfigurationProfilesListSamples {
    /*
     * x-ms-original-file: specification/automanage/resource-manager/Microsoft.Automanage/preview/2021-04-30-preview/examples/listConfigurationProfilesBySubscription.json
     */
    /**
     * Sample code: List configuration profiles by subscription.
     *
     * @param manager Entry point to AutomanageManager.
     */
    public static void listConfigurationProfilesBySubscription(
        com.azure.resourcemanager.automanage.AutomanageManager manager) {
        manager.configurationProfiles().list(Context.NONE);
    }
}
