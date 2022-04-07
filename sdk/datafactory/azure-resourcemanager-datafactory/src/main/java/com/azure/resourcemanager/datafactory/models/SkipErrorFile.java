// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Skip error file. */
@Fluent
public final class SkipErrorFile {
    /*
     * Skip if file is deleted by other client during copy. Default is true.
     * Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "fileMissing")
    private Object fileMissing;

    /*
     * Skip if source/sink file changed by other concurrent write. Default is
     * false. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "dataInconsistency")
    private Object dataInconsistency;

    /**
     * Get the fileMissing property: Skip if file is deleted by other client during copy. Default is true. Type: boolean
     * (or Expression with resultType boolean).
     *
     * @return the fileMissing value.
     */
    public Object fileMissing() {
        return this.fileMissing;
    }

    /**
     * Set the fileMissing property: Skip if file is deleted by other client during copy. Default is true. Type: boolean
     * (or Expression with resultType boolean).
     *
     * @param fileMissing the fileMissing value to set.
     * @return the SkipErrorFile object itself.
     */
    public SkipErrorFile withFileMissing(Object fileMissing) {
        this.fileMissing = fileMissing;
        return this;
    }

    /**
     * Get the dataInconsistency property: Skip if source/sink file changed by other concurrent write. Default is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @return the dataInconsistency value.
     */
    public Object dataInconsistency() {
        return this.dataInconsistency;
    }

    /**
     * Set the dataInconsistency property: Skip if source/sink file changed by other concurrent write. Default is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @param dataInconsistency the dataInconsistency value to set.
     * @return the SkipErrorFile object itself.
     */
    public SkipErrorFile withDataInconsistency(Object dataInconsistency) {
        this.dataInconsistency = dataInconsistency;
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
