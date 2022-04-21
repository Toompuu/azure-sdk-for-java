// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.McasCheckRequirementsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents MCAS (Microsoft Cloud App Security) requirements check request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("MicrosoftCloudAppSecurity")
@Fluent
public final class McasCheckRequirements extends DataConnectorsCheckRequirements {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(McasCheckRequirements.class);

    /*
     * MCAS (Microsoft Cloud App Security) requirements check properties.
     */
    @JsonProperty(value = "properties")
    private McasCheckRequirementsProperties innerProperties;

    /**
     * Get the innerProperties property: MCAS (Microsoft Cloud App Security) requirements check properties.
     *
     * @return the innerProperties value.
     */
    private McasCheckRequirementsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
