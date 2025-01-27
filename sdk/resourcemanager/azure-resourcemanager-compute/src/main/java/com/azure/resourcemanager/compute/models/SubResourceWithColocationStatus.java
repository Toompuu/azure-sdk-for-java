// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SubResourceWithColocationStatus model. */
@Fluent
public final class SubResourceWithColocationStatus extends SubResource {
    /*
     * Describes colocation status of a resource in the Proximity Placement
     * Group.
     */
    @JsonProperty(value = "colocationStatus")
    private InstanceViewStatus colocationStatus;

    /**
     * Get the colocationStatus property: Describes colocation status of a resource in the Proximity Placement Group.
     *
     * @return the colocationStatus value.
     */
    public InstanceViewStatus colocationStatus() {
        return this.colocationStatus;
    }

    /**
     * Set the colocationStatus property: Describes colocation status of a resource in the Proximity Placement Group.
     *
     * @param colocationStatus the colocationStatus value to set.
     * @return the SubResourceWithColocationStatus object itself.
     */
    public SubResourceWithColocationStatus withColocationStatus(InstanceViewStatus colocationStatus) {
        this.colocationStatus = colocationStatus;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SubResourceWithColocationStatus withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (colocationStatus() != null) {
            colocationStatus().validate();
        }
    }
}
