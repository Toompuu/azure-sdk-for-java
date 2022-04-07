// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The storage account details. */
@Fluent
public final class StorageAccount {
    /*
     * The ID of the storage account resource. Media Services relies on tables
     * and queues as well as blobs, so the primary storage account must be a
     * Standard Storage account (either Microsoft.ClassicStorage or
     * Microsoft.Storage). Blob only storage accounts can be added as secondary
     * storage accounts.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The type of the storage account.
     */
    @JsonProperty(value = "type", required = true)
    private StorageAccountType type;

    /*
     * The storage account identity.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * The current status of the storage account mapping.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get the id property: The ID of the storage account resource. Media Services relies on tables and queues as well
     * as blobs, so the primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or
     * Microsoft.Storage). Blob only storage accounts can be added as secondary storage accounts.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the storage account resource. Media Services relies on tables and queues as well
     * as blobs, so the primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or
     * Microsoft.Storage). Blob only storage accounts can be added as secondary storage accounts.
     *
     * @param id the id value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The type of the storage account.
     *
     * @return the type value.
     */
    public StorageAccountType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the storage account.
     *
     * @param type the type value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withType(StorageAccountType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the identity property: The storage account identity.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The storage account identity.
     *
     * @param identity the identity value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the status property: The current status of the storage account mapping.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model StorageAccount"));
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageAccount.class);
}
