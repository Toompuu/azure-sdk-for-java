// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryDeleteGlossary {
    public static void main(String[] args) {
        // BEGIN: com.azure.analytics.purview.catalog.generated.glossarydeleteglossary.glossarydeleteglossary
        GlossaryClient glossaryClient =
                new GlossaryClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                glossaryClient.deleteGlossaryWithResponse("c0c54153-13d1-1608-13af-43457cdffe75", requestOptions);
        // END: com.azure.analytics.purview.catalog.generated.glossarydeleteglossary.glossarydeleteglossary
    }
}
