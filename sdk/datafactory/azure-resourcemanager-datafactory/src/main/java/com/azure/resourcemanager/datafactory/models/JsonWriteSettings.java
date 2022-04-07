// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Json write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("JsonWriteSettings")
@Fluent
public final class JsonWriteSettings extends FormatWriteSettings {
    /*
     * File pattern of JSON. This setting controls the way a collection of JSON
     * objects will be treated. The default value is 'setOfObjects'. It is
     * case-sensitive.
     */
    @JsonProperty(value = "filePattern")
    private Object filePattern;

    /**
     * Get the filePattern property: File pattern of JSON. This setting controls the way a collection of JSON objects
     * will be treated. The default value is 'setOfObjects'. It is case-sensitive.
     *
     * @return the filePattern value.
     */
    public Object filePattern() {
        return this.filePattern;
    }

    /**
     * Set the filePattern property: File pattern of JSON. This setting controls the way a collection of JSON objects
     * will be treated. The default value is 'setOfObjects'. It is case-sensitive.
     *
     * @param filePattern the filePattern value to set.
     * @return the JsonWriteSettings object itself.
     */
    public JsonWriteSettings withFilePattern(Object filePattern) {
        this.filePattern = filePattern;
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
    }
}
