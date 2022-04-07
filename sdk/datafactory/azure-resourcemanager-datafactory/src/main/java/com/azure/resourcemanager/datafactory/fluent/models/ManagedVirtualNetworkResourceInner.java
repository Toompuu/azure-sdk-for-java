// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetwork;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Managed Virtual Network resource type. */
@Fluent
public final class ManagedVirtualNetworkResourceInner extends SubResource {
    /*
     * Managed Virtual Network properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ManagedVirtualNetwork properties;

    /*
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Etag identifies change in the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the properties property: Managed Virtual Network properties.
     *
     * @return the properties value.
     */
    public ManagedVirtualNetwork properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Managed Virtual Network properties.
     *
     * @param properties the properties value to set.
     * @return the ManagedVirtualNetworkResourceInner object itself.
     */
    public ManagedVirtualNetworkResourceInner withProperties(ManagedVirtualNetwork properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: Etag identifies change in the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedVirtualNetworkResourceInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model ManagedVirtualNetworkResourceInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedVirtualNetworkResourceInner.class);
}
