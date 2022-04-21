// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.models.AzureEntityResource;
import com.azure.resourcemanager.storage.models.ImmutabilityPolicyState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag. */
@Fluent
public final class ImmutabilityPolicyInner extends AzureEntityResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImmutabilityPolicyInner.class);

    /*
     * The properties of an ImmutabilityPolicy of a blob container.
     */
    @JsonProperty(value = "properties", required = true)
    private ImmutabilityPolicyProperty innerProperties = new ImmutabilityPolicyProperty();

    /**
     * Get the innerProperties property: The properties of an ImmutabilityPolicy of a blob container.
     *
     * @return the innerProperties value.
     */
    private ImmutabilityPolicyProperty innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @return the immutabilityPeriodSinceCreationInDays value.
     */
    public Integer immutabilityPeriodSinceCreationInDays() {
        return this.innerProperties() == null ? null : this.innerProperties().immutabilityPeriodSinceCreationInDays();
    }

    /**
     * Set the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @param immutabilityPeriodSinceCreationInDays the immutabilityPeriodSinceCreationInDays value to set.
     * @return the ImmutabilityPolicyInner object itself.
     */
    public ImmutabilityPolicyInner withImmutabilityPeriodSinceCreationInDays(
        Integer immutabilityPeriodSinceCreationInDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImmutabilityPolicyProperty();
        }
        this.innerProperties().withImmutabilityPeriodSinceCreationInDays(immutabilityPeriodSinceCreationInDays);
        return this;
    }

    /**
     * Get the state property: The ImmutabilityPolicy state of a blob container, possible values include: Locked and
     * Unlocked.
     *
     * @return the state value.
     */
    public ImmutabilityPolicyState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @return the allowProtectedAppendWrites value.
     */
    public Boolean allowProtectedAppendWrites() {
        return this.innerProperties() == null ? null : this.innerProperties().allowProtectedAppendWrites();
    }

    /**
     * Set the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @param allowProtectedAppendWrites the allowProtectedAppendWrites value to set.
     * @return the ImmutabilityPolicyInner object itself.
     */
    public ImmutabilityPolicyInner withAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImmutabilityPolicyProperty();
        }
        this.innerProperties().withAllowProtectedAppendWrites(allowProtectedAppendWrites);
        return this;
    }

    /**
     * Get the allowProtectedAppendWritesAll property: This property can only be changed for unlocked time-based
     * retention policies. When enabled, new blocks can be written to both 'Append and Bock Blobs' while maintaining
     * immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified
     * or deleted. This property cannot be changed with ExtendImmutabilityPolicy API. The 'allowProtectedAppendWrites'
     * and 'allowProtectedAppendWritesAll' properties are mutually exclusive.
     *
     * @return the allowProtectedAppendWritesAll value.
     */
    public Boolean allowProtectedAppendWritesAll() {
        return this.innerProperties() == null ? null : this.innerProperties().allowProtectedAppendWritesAll();
    }

    /**
     * Set the allowProtectedAppendWritesAll property: This property can only be changed for unlocked time-based
     * retention policies. When enabled, new blocks can be written to both 'Append and Bock Blobs' while maintaining
     * immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified
     * or deleted. This property cannot be changed with ExtendImmutabilityPolicy API. The 'allowProtectedAppendWrites'
     * and 'allowProtectedAppendWritesAll' properties are mutually exclusive.
     *
     * @param allowProtectedAppendWritesAll the allowProtectedAppendWritesAll value to set.
     * @return the ImmutabilityPolicyInner object itself.
     */
    public ImmutabilityPolicyInner withAllowProtectedAppendWritesAll(Boolean allowProtectedAppendWritesAll) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImmutabilityPolicyProperty();
        }
        this.innerProperties().withAllowProtectedAppendWritesAll(allowProtectedAppendWritesAll);
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
        if (innerProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ImmutabilityPolicyInner"));
        } else {
            innerProperties().validate();
        }
    }
}
