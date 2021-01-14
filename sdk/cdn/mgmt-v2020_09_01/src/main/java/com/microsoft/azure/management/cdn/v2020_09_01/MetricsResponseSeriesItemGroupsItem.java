/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MetricsResponseSeriesItemGroupsItem model.
 */
public class MetricsResponseSeriesItemGroupsItem {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the MetricsResponseSeriesItemGroupsItem object itself.
     */
    public MetricsResponseSeriesItemGroupsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the MetricsResponseSeriesItemGroupsItem object itself.
     */
    public MetricsResponseSeriesItemGroupsItem withValue(String value) {
        this.value = value;
        return this;
    }

}
