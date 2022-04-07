// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ManagedRulesDefinition;
import com.azure.resourcemanager.network.models.PolicySettings;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.WebApplicationFirewallCustomRule;
import com.azure.resourcemanager.network.models.WebApplicationFirewallPolicyResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines web application firewall policy properties. */
@Fluent
public final class WebApplicationFirewallPolicyPropertiesFormat {
    /*
     * The PolicySettings for policy.
     */
    @JsonProperty(value = "policySettings")
    private PolicySettings policySettings;

    /*
     * The custom rules inside the policy.
     */
    @JsonProperty(value = "customRules")
    private List<WebApplicationFirewallCustomRule> customRules;

    /*
     * A collection of references to application gateways.
     */
    @JsonProperty(value = "applicationGateways", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationGatewayInner> applicationGateways;

    /*
     * The provisioning state of the web application firewall policy resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource status of the policy.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private WebApplicationFirewallPolicyResourceState resourceState;

    /*
     * Describes the managedRules structure.
     */
    @JsonProperty(value = "managedRules", required = true)
    private ManagedRulesDefinition managedRules;

    /*
     * A collection of references to application gateway http listeners.
     */
    @JsonProperty(value = "httpListeners", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> httpListeners;

    /*
     * A collection of references to application gateway path rules.
     */
    @JsonProperty(value = "pathBasedRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> pathBasedRules;

    /**
     * Get the policySettings property: The PolicySettings for policy.
     *
     * @return the policySettings value.
     */
    public PolicySettings policySettings() {
        return this.policySettings;
    }

    /**
     * Set the policySettings property: The PolicySettings for policy.
     *
     * @param policySettings the policySettings value to set.
     * @return the WebApplicationFirewallPolicyPropertiesFormat object itself.
     */
    public WebApplicationFirewallPolicyPropertiesFormat withPolicySettings(PolicySettings policySettings) {
        this.policySettings = policySettings;
        return this;
    }

    /**
     * Get the customRules property: The custom rules inside the policy.
     *
     * @return the customRules value.
     */
    public List<WebApplicationFirewallCustomRule> customRules() {
        return this.customRules;
    }

    /**
     * Set the customRules property: The custom rules inside the policy.
     *
     * @param customRules the customRules value to set.
     * @return the WebApplicationFirewallPolicyPropertiesFormat object itself.
     */
    public WebApplicationFirewallPolicyPropertiesFormat withCustomRules(
        List<WebApplicationFirewallCustomRule> customRules) {
        this.customRules = customRules;
        return this;
    }

    /**
     * Get the applicationGateways property: A collection of references to application gateways.
     *
     * @return the applicationGateways value.
     */
    public List<ApplicationGatewayInner> applicationGateways() {
        return this.applicationGateways;
    }

    /**
     * Get the provisioningState property: The provisioning state of the web application firewall policy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceState property: Resource status of the policy.
     *
     * @return the resourceState value.
     */
    public WebApplicationFirewallPolicyResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the managedRules property: Describes the managedRules structure.
     *
     * @return the managedRules value.
     */
    public ManagedRulesDefinition managedRules() {
        return this.managedRules;
    }

    /**
     * Set the managedRules property: Describes the managedRules structure.
     *
     * @param managedRules the managedRules value to set.
     * @return the WebApplicationFirewallPolicyPropertiesFormat object itself.
     */
    public WebApplicationFirewallPolicyPropertiesFormat withManagedRules(ManagedRulesDefinition managedRules) {
        this.managedRules = managedRules;
        return this;
    }

    /**
     * Get the httpListeners property: A collection of references to application gateway http listeners.
     *
     * @return the httpListeners value.
     */
    public List<SubResource> httpListeners() {
        return this.httpListeners;
    }

    /**
     * Get the pathBasedRules property: A collection of references to application gateway path rules.
     *
     * @return the pathBasedRules value.
     */
    public List<SubResource> pathBasedRules() {
        return this.pathBasedRules;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policySettings() != null) {
            policySettings().validate();
        }
        if (customRules() != null) {
            customRules().forEach(e -> e.validate());
        }
        if (applicationGateways() != null) {
            applicationGateways().forEach(e -> e.validate());
        }
        if (managedRules() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property managedRules in model"
                            + " WebApplicationFirewallPolicyPropertiesFormat"));
        } else {
            managedRules().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebApplicationFirewallPolicyPropertiesFormat.class);
}
