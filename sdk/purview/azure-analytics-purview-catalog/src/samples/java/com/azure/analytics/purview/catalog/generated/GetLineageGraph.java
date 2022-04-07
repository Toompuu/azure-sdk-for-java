// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.LineageClient;
import com.azure.analytics.purview.catalog.LineageClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetLineageGraph {
    public static void main(String[] args) {
        // BEGIN: com.azure.analytics.purview.catalog.generated.lineagegetlineagegraph.getlineagegraph
        LineageClient lineageClient =
                new LineageClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("depth", "1");
        requestOptions.addQueryParam("direction", "INPUT");
        requestOptions.addQueryParam("getDerivedLineage", "true");
        requestOptions.addQueryParam("includeParent", "true");
        requestOptions.addQueryParam("width", "5");
        Response<BinaryData> response =
                lineageClient.getLineageGraphWithResponse("a6894eb3-81f3-829b-2adc-52f3e603411a", requestOptions);
        // END: com.azure.analytics.purview.catalog.generated.lineagegetlineagegraph.getlineagegraph
    }
}
