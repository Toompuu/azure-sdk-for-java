// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The properties of the Azure File volume. Azure File shares are mounted as volumes. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFileVolume")
@Fluent
public final class AzureFileVolume extends CustomPersistentDiskProperties {
    /*
     * The share name of the Azure File share.
     */
    @JsonProperty(value = "shareName", required = true)
    private String shareName;

    /**
     * Get the shareName property: The share name of the Azure File share.
     *
     * @return the shareName value.
     */
    public String shareName() {
        return this.shareName;
    }

    /**
     * Set the shareName property: The share name of the Azure File share.
     *
     * @param shareName the shareName value to set.
     * @return the AzureFileVolume object itself.
     */
    public AzureFileVolume withShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileVolume withMountPath(String mountPath) {
        super.withMountPath(mountPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileVolume withReadOnly(Boolean readOnly) {
        super.withReadOnly(readOnly);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileVolume withMountOptions(List<String> mountOptions) {
        super.withMountOptions(mountOptions);
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
        if (shareName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property shareName in model AzureFileVolume"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureFileVolume.class);
}
