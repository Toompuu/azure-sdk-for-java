// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceManagementClient;
import com.azure.iot.deviceupdate.DeviceManagementClientBuilder;

public class DeviceManagementListOperations {
    public static void main(String[] args) {
        // BEGIN: com.azure.iot.deviceupdate.generated.devicemanagementlistoperations.devicemanagementlistoperations
        DeviceManagementClient deviceManagementClient =
                new DeviceManagementClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildClient();
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = deviceManagementClient.listOperations(requestOptions);
        // END: com.azure.iot.deviceupdate.generated.devicemanagementlistoperations.devicemanagementlistoperations
    }
}
