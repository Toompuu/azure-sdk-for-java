// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class to specify configurations of Widevine in Streaming Policy. */
@Fluent
public final class StreamingPolicyWidevineConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StreamingPolicyWidevineConfiguration.class);

    /*
     * Template for the URL of the custom service delivering licenses to end
     * user players.  Not required when using Azure Media Services for issuing
     * licenses.  The template supports replaceable tokens that the service
     * will update at runtime with the value specific to the request.  The
     * currently supported token values are {AlternativeMediaId}, which is
     * replaced with the value of StreamingLocatorId.AlternativeMediaId, and
     * {ContentKeyId}, which is replaced with the value of identifier of the
     * key being requested.
     */
    @JsonProperty(value = "customLicenseAcquisitionUrlTemplate")
    private String customLicenseAcquisitionUrlTemplate;

    /**
     * Get the customLicenseAcquisitionUrlTemplate property: Template for the URL of the custom service delivering
     * licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template
     * supports replaceable tokens that the service will update at runtime with the value specific to the request. The
     * currently supported token values are {AlternativeMediaId}, which is replaced with the value of
     * StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the
     * key being requested.
     *
     * @return the customLicenseAcquisitionUrlTemplate value.
     */
    public String customLicenseAcquisitionUrlTemplate() {
        return this.customLicenseAcquisitionUrlTemplate;
    }

    /**
     * Set the customLicenseAcquisitionUrlTemplate property: Template for the URL of the custom service delivering
     * licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template
     * supports replaceable tokens that the service will update at runtime with the value specific to the request. The
     * currently supported token values are {AlternativeMediaId}, which is replaced with the value of
     * StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the
     * key being requested.
     *
     * @param customLicenseAcquisitionUrlTemplate the customLicenseAcquisitionUrlTemplate value to set.
     * @return the StreamingPolicyWidevineConfiguration object itself.
     */
    public StreamingPolicyWidevineConfiguration withCustomLicenseAcquisitionUrlTemplate(
        String customLicenseAcquisitionUrlTemplate) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
