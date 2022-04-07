// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU of Firewall policy. */
@Fluent
public final class FirewallPolicySku {
    /*
     * Tier of Firewall Policy.
     */
    @JsonProperty(value = "tier")
    private FirewallPolicySkuTier tier;

    /**
     * Get the tier property: Tier of Firewall Policy.
     *
     * @return the tier value.
     */
    public FirewallPolicySkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Tier of Firewall Policy.
     *
     * @param tier the tier value to set.
     * @return the FirewallPolicySku object itself.
     */
    public FirewallPolicySku withTier(FirewallPolicySkuTier tier) {
        this.tier = tier;
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
