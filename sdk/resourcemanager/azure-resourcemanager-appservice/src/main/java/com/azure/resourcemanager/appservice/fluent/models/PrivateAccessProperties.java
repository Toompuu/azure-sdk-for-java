// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.PrivateAccessVirtualNetwork;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PrivateAccess resource specific properties. */
@Fluent
public final class PrivateAccessProperties {
    /*
     * Whether private access is enabled or not.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The Virtual Networks (and subnets) allowed to access the site privately.
     */
    @JsonProperty(value = "virtualNetworks")
    private List<PrivateAccessVirtualNetwork> virtualNetworks;

    /**
     * Get the enabled property: Whether private access is enabled or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether private access is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the PrivateAccessProperties object itself.
     */
    public PrivateAccessProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the virtualNetworks property: The Virtual Networks (and subnets) allowed to access the site privately.
     *
     * @return the virtualNetworks value.
     */
    public List<PrivateAccessVirtualNetwork> virtualNetworks() {
        return this.virtualNetworks;
    }

    /**
     * Set the virtualNetworks property: The Virtual Networks (and subnets) allowed to access the site privately.
     *
     * @param virtualNetworks the virtualNetworks value to set.
     * @return the PrivateAccessProperties object itself.
     */
    public PrivateAccessProperties withVirtualNetworks(List<PrivateAccessVirtualNetwork> virtualNetworks) {
        this.virtualNetworks = virtualNetworks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworks() != null) {
            virtualNetworks().forEach(e -> e.validate());
        }
    }
}
