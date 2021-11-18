// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.ApiEntityReference;
import com.azure.resourcemanager.compute.models.ConsistencyModeTypes;
import com.azure.resourcemanager.compute.models.RestorePointSourceMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Restore Point details. */
@Fluent
public final class RestorePointInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorePointInner.class);

    /*
     * The restore point properties.
     */
    @JsonProperty(value = "properties")
    private RestorePointProperties innerProperties;

    /**
     * Get the innerProperties property: The restore point properties.
     *
     * @return the innerProperties value.
     */
    private RestorePointProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the excludeDisks property: List of disk resource ids that the customer wishes to exclude from the restore
     * point. If no disks are specified, all disks will be included.
     *
     * @return the excludeDisks value.
     */
    public List<ApiEntityReference> excludeDisks() {
        return this.innerProperties() == null ? null : this.innerProperties().excludeDisks();
    }

    /**
     * Set the excludeDisks property: List of disk resource ids that the customer wishes to exclude from the restore
     * point. If no disks are specified, all disks will be included.
     *
     * @param excludeDisks the excludeDisks value to set.
     * @return the RestorePointInner object itself.
     */
    public RestorePointInner withExcludeDisks(List<ApiEntityReference> excludeDisks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestorePointProperties();
        }
        this.innerProperties().withExcludeDisks(excludeDisks);
        return this;
    }

    /**
     * Get the sourceMetadata property: Gets the details of the VM captured at the time of the restore point creation.
     *
     * @return the sourceMetadata value.
     */
    public RestorePointSourceMetadata sourceMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceMetadata();
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the restore point.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the consistencyMode property: Gets the consistency mode for the restore point. Please refer to
     * https://aka.ms/RestorePoints for more details.
     *
     * @return the consistencyMode value.
     */
    public ConsistencyModeTypes consistencyMode() {
        return this.innerProperties() == null ? null : this.innerProperties().consistencyMode();
    }

    /**
     * Get the timeCreated property: Gets the creation time of the restore point.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Set the timeCreated property: Gets the creation time of the restore point.
     *
     * @param timeCreated the timeCreated value to set.
     * @return the RestorePointInner object itself.
     */
    public RestorePointInner withTimeCreated(OffsetDateTime timeCreated) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestorePointProperties();
        }
        this.innerProperties().withTimeCreated(timeCreated);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
