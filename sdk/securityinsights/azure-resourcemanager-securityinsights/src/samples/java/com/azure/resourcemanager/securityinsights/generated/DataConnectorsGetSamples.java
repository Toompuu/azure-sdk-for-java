// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for DataConnectors Get. */
public final class DataConnectorsGetSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetOffice365ProjectDataConnetorById.json
     */
    /**
     * Sample code: Get an Office365 Project data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnOffice365ProjectDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "73e01a99-5cd7-4139-a149-9f2736ff2ab5", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetGenericUI.json
     */
    /**
     * Sample code: Get a GenericUI data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAGenericUIDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "316ec55e-7138-4d63-ab18-90c8a60fd1c8", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetOffice365AdvancedThreatProtectionById.json
     */
    /**
     * Sample code: Get an Office ATP data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnOfficeATPDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "3d3e955e-33eb-401d-89a7-251c81ddd660", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetIoTById.json
     */
    /**
     * Sample code: Get a IoT data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAIoTDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "d2e5dc7a-f3a2-429d-954b-939fa8c2932e", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetMicrosoftCloudAppSecurityById.json
     */
    /**
     * Sample code: Get a MCAS data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAMCASDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "b96d014d-b5c2-4a01-9aba-a8058f629d42", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetThreatIntelligenceTaxiiById.json
     */
    /**
     * Sample code: Get a TI Taxii data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getATITaxiiDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "c39bb458-02a7-4b3f-b0c8-71a1d2692652", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetMicrosoftThreatIntelligenceById.json
     */
    /**
     * Sample code: Get a MicrosoftThreatIntelligence data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAMicrosoftThreatIntelligenceDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "c345bf40-8509-4ed2-b947-50cb773aaf04", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetAzureSecurityCenterById.json
     */
    /**
     * Sample code: Get a ASC data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAASCDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "763f9fa1-c2d3-4fa2-93e9-bccd4899aa12", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetThreatIntelligenceById.json
     */
    /**
     * Sample code: Get a TI data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getATIDataConnector(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "c345bf40-8509-4ed2-b947-50cb773aaf04", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetAmazonWebServicesCloudTrailById.json
     */
    /**
     * Sample code: Get an AwsCloudTrail data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnAwsCloudTrailDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "c345bf40-8509-4ed2-b947-50cb773aaf04", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetMicrosoftDefenderAdvancedThreatProtectionById.json
     */
    /**
     * Sample code: Get a MDATP data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAMDATPDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "06b3ccb8-1384-4bcc-aec7-852f6d57161b", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetMicrosoftThreatProtectionById.json
     */
    /**
     * Sample code: Get a MicrosoftThreatProtection data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAMicrosoftThreatProtectionDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "c345bf40-8509-4ed2-b947-50cb773aaf04", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetAzureActiveDirectoryById.json
     */
    /**
     * Sample code: Get an AAD data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnAADDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "f0cd27d2-5f03-4c06-ba31-d2dc82dcb51d", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetAzureAdvancedThreatProtectionById.json
     */
    /**
     * Sample code: Get an AATP data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnAATPDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "07e42cb3-e658-4e90-801c-efa0f29d3d44", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetAPIPolling.json
     */
    /**
     * Sample code: Get a APIPolling data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAAPIPollingDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "316ec55e-7138-4d63-ab18-90c8a60fd1c8", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetMicrosoftInsiderRiskManagementById.json
     */
    /**
     * Sample code: Get an Office IRM data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnOfficeIRMDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "3d3e955e-33eb-401d-89a7-251c81ddd660", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetDynamics365DataConnectorById.json
     */
    /**
     * Sample code: Get a Dynamics365 data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getADynamics365DataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "c2541efb-c9a6-47fe-9501-87d1017d1512", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetOfficeDataConnetorById.json
     */
    /**
     * Sample code: Get an Office365 data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnOffice365DataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "73e01a99-5cd7-4139-a149-9f2736ff2ab5", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetAmazonWebServicesS3ById.json
     */
    /**
     * Sample code: Get an Aws S3 data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnAwsS3DataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "afef3743-0c88-469c-84ff-ca2e87dc1e48", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/dataConnectors/GetOfficePowerBIDataConnetorById.json
     */
    /**
     * Sample code: Get an Office365 PowerBI data connector.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAnOffice365PowerBIDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .dataConnectors()
            .getWithResponse("myRg", "myWorkspace", "73e01a99-5cd7-4139-a149-9f2736ff2ab5", Context.NONE);
    }
}
