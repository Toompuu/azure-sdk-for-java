// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileProperties;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ConfigurationProfiles CreateOrUpdate. */
public final class ConfigurationProfilesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/automanage/resource-manager/Microsoft.Automanage/preview/2021-04-30-preview/examples/createOrUpdateConfigurationProfile.json
     */
    /**
     * Sample code: Create or update configuration profile.
     *
     * @param manager Entry point to AutomanageManager.
     */
    public static void createOrUpdateConfigurationProfile(
        com.azure.resourcemanager.automanage.AutomanageManager manager) throws IOException {
        manager
            .configurationProfiles()
            .define("customConfigurationProfile")
            .withRegion("East US")
            .withExistingResourceGroup("myResourceGroupName")
            .withTags(mapOf("Organization", "Administration"))
            .withProperties(
                new ConfigurationProfileProperties()
                    .withConfiguration(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize(
                                "{\"Antimalware/Enable\":false,\"AzureSecurityCenter/Enable\":true,\"Backup/Enable\":false,\"BootDiagnostics/Enable\":true,\"ChangeTrackingAndInventory/Enable\":true,\"GuestConfiguration/Enable\":true,\"LogAnalytics/Enable\":true,\"UpdateManagement/Enable\":true,\"VMInsights/Enable\":true}",
                                Object.class,
                                SerializerEncoding.JSON))
                    .withOverrides(
                        Arrays
                            .asList(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize(
                                        "{\"if\":{\"equals\":\"eastus\",\"field\":\"$.location\"},\"priority\":100,\"then\":{\"LogAnalytics/Enable\":true,\"LogAnalytics/Reprovision\":true,\"LogAnalytics/Workspace\":\"/subscriptions/abc/resourceGroups/xyz/providers/Microsoft.La/Workspaces/eastus\"}}",
                                        Object.class,
                                        SerializerEncoding.JSON),
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize(
                                        "{\"if\":{\"equals\":\"centralcanada\",\"field\":\"$.location\"},\"priority\":200,\"then\":{\"LogAnalytics/Enable\":true,\"LogAnalytics/Reprovision\":true,\"LogAnalytics/Workspace\":\"/subscriptions/abc/resourceGroups/xyz/providers/Microsoft.La/Workspaces/centralcanada\"}}",
                                        Object.class,
                                        SerializerEncoding.JSON))))
            .create();
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
