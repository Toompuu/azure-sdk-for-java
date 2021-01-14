// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.fluent.models.ClusterPrincipalAssignmentInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list Kusto cluster principal assignments operation response. */
@Fluent
public final class ClusterPrincipalAssignmentListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterPrincipalAssignmentListResult.class);

    /*
     * The list of Kusto cluster principal assignments.
     */
    @JsonProperty(value = "value")
    private List<ClusterPrincipalAssignmentInner> value;

    /**
     * Get the value property: The list of Kusto cluster principal assignments.
     *
     * @return the value value.
     */
    public List<ClusterPrincipalAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Kusto cluster principal assignments.
     *
     * @param value the value value to set.
     * @return the ClusterPrincipalAssignmentListResult object itself.
     */
    public ClusterPrincipalAssignmentListResult withValue(List<ClusterPrincipalAssignmentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
