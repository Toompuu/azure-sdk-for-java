// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the connection monitor endpoint scope item. */
@Fluent
public final class ConnectionMonitorEndpointScopeItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorEndpointScopeItem.class);

    /*
     * The address of the endpoint item. Supported types are IPv4/IPv6 subnet
     * mask or IPv4/IPv6 IP address.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * Get the address property: The address of the endpoint item. Supported types are IPv4/IPv6 subnet mask or
     * IPv4/IPv6 IP address.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: The address of the endpoint item. Supported types are IPv4/IPv6 subnet mask or
     * IPv4/IPv6 IP address.
     *
     * @param address the address value to set.
     * @return the ConnectionMonitorEndpointScopeItem object itself.
     */
    public ConnectionMonitorEndpointScopeItem withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
