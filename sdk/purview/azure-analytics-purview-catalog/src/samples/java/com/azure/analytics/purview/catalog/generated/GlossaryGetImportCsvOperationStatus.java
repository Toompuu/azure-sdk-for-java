// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryGetImportCsvOperationStatus {
    public static void main(String[] args) {
        // BEGIN:
        // com.azure.analytics.purview.catalog.generated.glossarygetimportcsvoperationstatus.glossarygetimportcsvoperationstatus
        GlossaryClient glossaryClient =
                new GlossaryClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                glossaryClient.getImportCsvOperationStatusWithResponse(
                        "3ffca165-75a7-4987-ba71-cfc0a273d6b7", requestOptions);
        // END:
        // com.azure.analytics.purview.catalog.generated.glossarygetimportcsvoperationstatus.glossarygetimportcsvoperationstatus
    }
}
