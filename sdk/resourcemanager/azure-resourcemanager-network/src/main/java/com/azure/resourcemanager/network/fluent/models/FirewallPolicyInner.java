// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.models.DnsSettings;
import com.azure.resourcemanager.network.models.ExplicitProxySettings;
import com.azure.resourcemanager.network.models.FirewallPolicyInsights;
import com.azure.resourcemanager.network.models.FirewallPolicyIntrusionDetection;
import com.azure.resourcemanager.network.models.FirewallPolicySku;
import com.azure.resourcemanager.network.models.FirewallPolicySnat;
import com.azure.resourcemanager.network.models.FirewallPolicySql;
import com.azure.resourcemanager.network.models.FirewallPolicyThreatIntelWhitelist;
import com.azure.resourcemanager.network.models.FirewallPolicyTransportSecurity;
import com.azure.resourcemanager.network.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** FirewallPolicy Resource. */
@Fluent
public final class FirewallPolicyInner extends Resource {
    /*
     * Properties of the firewall policy.
     */
    @JsonProperty(value = "properties")
    private FirewallPolicyPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The identity of the firewall policy.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the firewall policy.
     *
     * @return the innerProperties value.
     */
    private FirewallPolicyPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the identity property: The identity of the firewall policy.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the firewall policy.
     *
     * @param identity the identity value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the ruleCollectionGroups property: List of references to FirewallPolicyRuleCollectionGroups.
     *
     * @return the ruleCollectionGroups value.
     */
    public List<SubResource> ruleCollectionGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleCollectionGroups();
    }

    /**
     * Get the provisioningState property: The provisioning state of the firewall policy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the basePolicy property: The parent firewall policy from which rules are inherited.
     *
     * @return the basePolicy value.
     */
    public SubResource basePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().basePolicy();
    }

    /**
     * Set the basePolicy property: The parent firewall policy from which rules are inherited.
     *
     * @param basePolicy the basePolicy value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withBasePolicy(SubResource basePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withBasePolicy(basePolicy);
        return this;
    }

    /**
     * Get the firewalls property: List of references to Azure Firewalls that this Firewall Policy is associated with.
     *
     * @return the firewalls value.
     */
    public List<SubResource> firewalls() {
        return this.innerProperties() == null ? null : this.innerProperties().firewalls();
    }

    /**
     * Get the childPolicies property: List of references to Child Firewall Policies.
     *
     * @return the childPolicies value.
     */
    public List<SubResource> childPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().childPolicies();
    }

    /**
     * Get the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @return the threatIntelMode value.
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.innerProperties() == null ? null : this.innerProperties().threatIntelMode();
    }

    /**
     * Set the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @param threatIntelMode the threatIntelMode value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withThreatIntelMode(threatIntelMode);
        return this;
    }

    /**
     * Get the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     *
     * @return the threatIntelWhitelist value.
     */
    public FirewallPolicyThreatIntelWhitelist threatIntelWhitelist() {
        return this.innerProperties() == null ? null : this.innerProperties().threatIntelWhitelist();
    }

    /**
     * Set the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     *
     * @param threatIntelWhitelist the threatIntelWhitelist value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withThreatIntelWhitelist(FirewallPolicyThreatIntelWhitelist threatIntelWhitelist) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withThreatIntelWhitelist(threatIntelWhitelist);
        return this;
    }

    /**
     * Get the insights property: Insights on Firewall Policy.
     *
     * @return the insights value.
     */
    public FirewallPolicyInsights insights() {
        return this.innerProperties() == null ? null : this.innerProperties().insights();
    }

    /**
     * Set the insights property: Insights on Firewall Policy.
     *
     * @param insights the insights value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withInsights(FirewallPolicyInsights insights) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withInsights(insights);
        return this;
    }

    /**
     * Get the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     *
     * @return the snat value.
     */
    public FirewallPolicySnat snat() {
        return this.innerProperties() == null ? null : this.innerProperties().snat();
    }

    /**
     * Set the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     *
     * @param snat the snat value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withSnat(FirewallPolicySnat snat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withSnat(snat);
        return this;
    }

    /**
     * Get the sql property: SQL Settings definition.
     *
     * @return the sql value.
     */
    public FirewallPolicySql sql() {
        return this.innerProperties() == null ? null : this.innerProperties().sql();
    }

    /**
     * Set the sql property: SQL Settings definition.
     *
     * @param sql the sql value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withSql(FirewallPolicySql sql) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withSql(sql);
        return this;
    }

    /**
     * Get the dnsSettings property: DNS Proxy Settings definition.
     *
     * @return the dnsSettings value.
     */
    public DnsSettings dnsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSettings();
    }

    /**
     * Set the dnsSettings property: DNS Proxy Settings definition.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withDnsSettings(DnsSettings dnsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withDnsSettings(dnsSettings);
        return this;
    }

    /**
     * Get the explicitProxySettings property: Explicit Proxy Settings definition.
     *
     * @return the explicitProxySettings value.
     */
    public ExplicitProxySettings explicitProxySettings() {
        return this.innerProperties() == null ? null : this.innerProperties().explicitProxySettings();
    }

    /**
     * Set the explicitProxySettings property: Explicit Proxy Settings definition.
     *
     * @param explicitProxySettings the explicitProxySettings value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withExplicitProxySettings(ExplicitProxySettings explicitProxySettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withExplicitProxySettings(explicitProxySettings);
        return this;
    }

    /**
     * Get the intrusionDetection property: The configuration for Intrusion detection.
     *
     * @return the intrusionDetection value.
     */
    public FirewallPolicyIntrusionDetection intrusionDetection() {
        return this.innerProperties() == null ? null : this.innerProperties().intrusionDetection();
    }

    /**
     * Set the intrusionDetection property: The configuration for Intrusion detection.
     *
     * @param intrusionDetection the intrusionDetection value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withIntrusionDetection(FirewallPolicyIntrusionDetection intrusionDetection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withIntrusionDetection(intrusionDetection);
        return this;
    }

    /**
     * Get the transportSecurity property: TLS Configuration definition.
     *
     * @return the transportSecurity value.
     */
    public FirewallPolicyTransportSecurity transportSecurity() {
        return this.innerProperties() == null ? null : this.innerProperties().transportSecurity();
    }

    /**
     * Set the transportSecurity property: TLS Configuration definition.
     *
     * @param transportSecurity the transportSecurity value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withTransportSecurity(FirewallPolicyTransportSecurity transportSecurity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withTransportSecurity(transportSecurity);
        return this;
    }

    /**
     * Get the sku property: The Firewall Policy SKU.
     *
     * @return the sku value.
     */
    public FirewallPolicySku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The Firewall Policy SKU.
     *
     * @param sku the sku value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withSku(FirewallPolicySku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallPolicyPropertiesFormat();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
