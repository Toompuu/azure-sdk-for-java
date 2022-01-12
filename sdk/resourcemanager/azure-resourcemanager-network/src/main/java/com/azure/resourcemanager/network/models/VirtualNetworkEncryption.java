// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Indicates if encryption is enabled on virtual network and if VM without encryption is allowed in encrypted VNet. */
@Fluent
public final class VirtualNetworkEncryption {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkEncryption.class);

    /*
     * Indicates if encryption is enabled on the virtual network.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * If the encrypted VNet allows VM that does not support encryption
     */
    @JsonProperty(value = "enforcement")
    private VirtualNetworkEncryptionEnforcement enforcement;

    /**
     * Get the enabled property: Indicates if encryption is enabled on the virtual network.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates if encryption is enabled on the virtual network.
     *
     * @param enabled the enabled value to set.
     * @return the VirtualNetworkEncryption object itself.
     */
    public VirtualNetworkEncryption withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the enforcement property: If the encrypted VNet allows VM that does not support encryption.
     *
     * @return the enforcement value.
     */
    public VirtualNetworkEncryptionEnforcement enforcement() {
        return this.enforcement;
    }

    /**
     * Set the enforcement property: If the encrypted VNet allows VM that does not support encryption.
     *
     * @param enforcement the enforcement value to set.
     * @return the VirtualNetworkEncryption object itself.
     */
    public VirtualNetworkEncryption withEnforcement(VirtualNetworkEncryptionEnforcement enforcement) {
        this.enforcement = enforcement;
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
