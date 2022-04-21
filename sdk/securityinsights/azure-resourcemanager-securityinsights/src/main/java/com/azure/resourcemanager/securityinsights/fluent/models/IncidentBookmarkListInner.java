// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.HuntingBookmark;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of incident bookmarks. */
@Fluent
public final class IncidentBookmarkListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IncidentBookmarkListInner.class);

    /*
     * Array of incident bookmarks.
     */
    @JsonProperty(value = "value", required = true)
    private List<HuntingBookmark> value;

    /**
     * Get the value property: Array of incident bookmarks.
     *
     * @return the value value.
     */
    public List<HuntingBookmark> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of incident bookmarks.
     *
     * @param value the value value to set.
     * @return the IncidentBookmarkListInner object itself.
     */
    public IncidentBookmarkListInner withValue(List<HuntingBookmark> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model IncidentBookmarkListInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
