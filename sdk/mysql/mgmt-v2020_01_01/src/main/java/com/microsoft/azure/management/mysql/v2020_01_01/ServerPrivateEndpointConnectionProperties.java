/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a private endpoint connection.
 */
public class ServerPrivateEndpointConnectionProperties {
    /**
     * Private endpoint which the connection belongs to.
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpointProperty privateEndpoint;

    /**
     * Connection state of the private endpoint connection.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private ServerPrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState;

    /**
     * State of the private endpoint connection. Possible values include:
     * 'Approving', 'Ready', 'Dropping', 'Failed', 'Rejecting'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointProvisioningState provisioningState;

    /**
     * Get private endpoint which the connection belongs to.
     *
     * @return the privateEndpoint value
     */
    public PrivateEndpointProperty privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set private endpoint which the connection belongs to.
     *
     * @param privateEndpoint the privateEndpoint value to set
     * @return the ServerPrivateEndpointConnectionProperties object itself.
     */
    public ServerPrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpointProperty privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get connection state of the private endpoint connection.
     *
     * @return the privateLinkServiceConnectionState value
     */
    public ServerPrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set connection state of the private endpoint connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set
     * @return the ServerPrivateEndpointConnectionProperties object itself.
     */
    public ServerPrivateEndpointConnectionProperties withPrivateLinkServiceConnectionState(ServerPrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get state of the private endpoint connection. Possible values include: 'Approving', 'Ready', 'Dropping', 'Failed', 'Rejecting'.
     *
     * @return the provisioningState value
     */
    public PrivateEndpointProvisioningState provisioningState() {
        return this.provisioningState;
    }

}
