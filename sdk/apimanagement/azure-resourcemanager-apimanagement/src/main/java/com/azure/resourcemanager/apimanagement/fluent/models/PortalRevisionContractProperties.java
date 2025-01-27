// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.PortalRevisionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The PortalRevisionContractProperties model. */
@Fluent
public final class PortalRevisionContractProperties {
    /*
     * Portal revision description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Portal revision publishing status details.
     */
    @JsonProperty(value = "statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * Status of the portal's revision.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private PortalRevisionStatus status;

    /*
     * Indicates if the portal's revision is public.
     */
    @JsonProperty(value = "isCurrent")
    private Boolean isCurrent;

    /*
     * Portal's revision creation date and time.
     */
    @JsonProperty(value = "createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateTime;

    /*
     * Last updated date and time.
     */
    @JsonProperty(value = "updatedDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedDateTime;

    /**
     * Get the description property: Portal revision description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Portal revision description.
     *
     * @param description the description value to set.
     * @return the PortalRevisionContractProperties object itself.
     */
    public PortalRevisionContractProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the statusDetails property: Portal revision publishing status details.
     *
     * @return the statusDetails value.
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the status property: Status of the portal's revision.
     *
     * @return the status value.
     */
    public PortalRevisionStatus status() {
        return this.status;
    }

    /**
     * Get the isCurrent property: Indicates if the portal's revision is public.
     *
     * @return the isCurrent value.
     */
    public Boolean isCurrent() {
        return this.isCurrent;
    }

    /**
     * Set the isCurrent property: Indicates if the portal's revision is public.
     *
     * @param isCurrent the isCurrent value to set.
     * @return the PortalRevisionContractProperties object itself.
     */
    public PortalRevisionContractProperties withIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }

    /**
     * Get the createdDateTime property: Portal's revision creation date and time.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the updatedDateTime property: Last updated date and time.
     *
     * @return the updatedDateTime value.
     */
    public OffsetDateTime updatedDateTime() {
        return this.updatedDateTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
