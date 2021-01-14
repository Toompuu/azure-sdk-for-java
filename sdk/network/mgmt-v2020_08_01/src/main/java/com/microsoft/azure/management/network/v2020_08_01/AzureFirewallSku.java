/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU of an Azure Firewall.
 */
public class AzureFirewallSku {
    /**
     * Name of an Azure Firewall SKU. Possible values include: 'AZFW_VNet',
     * 'AZFW_Hub'.
     */
    @JsonProperty(value = "name")
    private AzureFirewallSkuName name;

    /**
     * Tier of an Azure Firewall. Possible values include: 'Standard',
     * 'Premium'.
     */
    @JsonProperty(value = "tier")
    private AzureFirewallSkuTier tier;

    /**
     * Get name of an Azure Firewall SKU. Possible values include: 'AZFW_VNet', 'AZFW_Hub'.
     *
     * @return the name value
     */
    public AzureFirewallSkuName name() {
        return this.name;
    }

    /**
     * Set name of an Azure Firewall SKU. Possible values include: 'AZFW_VNet', 'AZFW_Hub'.
     *
     * @param name the name value to set
     * @return the AzureFirewallSku object itself.
     */
    public AzureFirewallSku withName(AzureFirewallSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get tier of an Azure Firewall. Possible values include: 'Standard', 'Premium'.
     *
     * @return the tier value
     */
    public AzureFirewallSkuTier tier() {
        return this.tier;
    }

    /**
     * Set tier of an Azure Firewall. Possible values include: 'Standard', 'Premium'.
     *
     * @param tier the tier value to set
     * @return the AzureFirewallSku object itself.
     */
    public AzureFirewallSku withTier(AzureFirewallSkuTier tier) {
        this.tier = tier;
        return this;
    }

}
