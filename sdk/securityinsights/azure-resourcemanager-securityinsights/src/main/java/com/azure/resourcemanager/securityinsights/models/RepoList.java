// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.RepoInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List all the source controls. */
@Fluent
public final class RepoList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RepoList.class);

    /*
     * URL to fetch the next set of repositories.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Array of repositories.
     */
    @JsonProperty(value = "value", required = true)
    private List<RepoInner> value;

    /**
     * Get the nextLink property: URL to fetch the next set of repositories.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Array of repositories.
     *
     * @return the value value.
     */
    public List<RepoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of repositories.
     *
     * @param value the value value to set.
     * @return the RepoList object itself.
     */
    public RepoList withValue(List<RepoInner> value) {
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
                .logExceptionAsError(new IllegalArgumentException("Missing required property value in model RepoList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
