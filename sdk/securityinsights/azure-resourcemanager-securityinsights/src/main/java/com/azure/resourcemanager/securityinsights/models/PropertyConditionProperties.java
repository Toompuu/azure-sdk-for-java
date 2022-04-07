// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes an automation rule condition that evaluates a property's value. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "conditionType")
@JsonTypeName("Property")
@Fluent
public final class PropertyConditionProperties extends AutomationRuleCondition {
    /*
     * The conditionProperties property.
     */
    @JsonProperty(value = "conditionProperties")
    private AutomationRulePropertyValuesCondition conditionProperties;

    /**
     * Get the conditionProperties property: The conditionProperties property.
     *
     * @return the conditionProperties value.
     */
    public AutomationRulePropertyValuesCondition conditionProperties() {
        return this.conditionProperties;
    }

    /**
     * Set the conditionProperties property: The conditionProperties property.
     *
     * @param conditionProperties the conditionProperties value to set.
     * @return the PropertyConditionProperties object itself.
     */
    public PropertyConditionProperties withConditionProperties(
        AutomationRulePropertyValuesCondition conditionProperties) {
        this.conditionProperties = conditionProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (conditionProperties() != null) {
            conditionProperties().validate();
        }
    }
}
