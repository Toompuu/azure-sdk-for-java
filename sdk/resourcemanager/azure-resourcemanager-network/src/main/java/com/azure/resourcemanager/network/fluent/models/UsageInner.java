// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.UsageName;
import com.azure.resourcemanager.network.models.UsageUnit;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The network resource usage. */
@Fluent
public final class UsageInner {
    /*
     * Resource identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * An enum describing the unit of measurement.
     */
    @JsonProperty(value = "unit", required = true)
    private UsageUnit unit;

    /*
     * The current value of the usage.
     */
    @JsonProperty(value = "currentValue", required = true)
    private long currentValue;

    /*
     * The limit of usage.
     */
    @JsonProperty(value = "limit", required = true)
    private long limit;

    /*
     * The name of the type of usage.
     */
    @JsonProperty(value = "name", required = true)
    private UsageName name;

    /**
     * Get the id property: Resource identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the unit property: An enum describing the unit of measurement.
     *
     * @return the unit value.
     */
    public UsageUnit unit() {
        return this.unit;
    }

    /**
     * Set the unit property: An enum describing the unit of measurement.
     *
     * @param unit the unit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withUnit(UsageUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the currentValue property: The current value of the usage.
     *
     * @return the currentValue value.
     */
    public long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current value of the usage.
     *
     * @param currentValue the currentValue value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withCurrentValue(long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: The limit of usage.
     *
     * @return the limit value.
     */
    public long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The limit of usage.
     *
     * @param limit the limit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withLimit(long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: The name of the type of usage.
     *
     * @return the name value.
     */
    public UsageName name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the type of usage.
     *
     * @param name the name value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withName(UsageName name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (unit() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property unit in model UsageInner"));
        }
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model UsageInner"));
        } else {
            name().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UsageInner.class);
}
