// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.fluent.models.Office365ProjectCheckRequirementsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents Office365 Project requirements check request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Office365Project")
@Fluent
public final class Office365ProjectCheckRequirements extends DataConnectorsCheckRequirements {
    /*
     * Office365 Project requirements check properties.
     */
    @JsonProperty(value = "properties")
    private Office365ProjectCheckRequirementsProperties innerProperties;

    /**
     * Get the innerProperties property: Office365 Project requirements check properties.
     *
     * @return the innerProperties value.
     */
    private Office365ProjectCheckRequirementsProperties innerProperties() {
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
