// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Application Gateway Ssl policy. */
@Fluent
public final class ApplicationGatewaySslPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewaySslPolicy.class);

    /*
     * Ssl protocols to be disabled on application gateway.
     */
    @JsonProperty(value = "disabledSslProtocols")
    private List<ApplicationGatewaySslProtocol> disabledSslProtocols;

    /*
     * Type of Ssl Policy
     */
    @JsonProperty(value = "policyType")
    private ApplicationGatewaySslPolicyType policyType;

    /*
     * Name of Ssl predefined policy
     */
    @JsonProperty(value = "policyName")
    private ApplicationGatewaySslPolicyName policyName;

    /*
     * Ssl cipher suites to be enabled in the specified order to application
     * gateway.
     */
    @JsonProperty(value = "cipherSuites")
    private List<ApplicationGatewaySslCipherSuite> cipherSuites;

    /*
     * Minimum version of Ssl protocol to be supported on application gateway.
     */
    @JsonProperty(value = "minProtocolVersion")
    private ApplicationGatewaySslProtocol minProtocolVersion;

    /**
     * Get the disabledSslProtocols property: Ssl protocols to be disabled on application gateway.
     *
     * @return the disabledSslProtocols value.
     */
    public List<ApplicationGatewaySslProtocol> disabledSslProtocols() {
        return this.disabledSslProtocols;
    }

    /**
     * Set the disabledSslProtocols property: Ssl protocols to be disabled on application gateway.
     *
     * @param disabledSslProtocols the disabledSslProtocols value to set.
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withDisabledSslProtocols(
        List<ApplicationGatewaySslProtocol> disabledSslProtocols) {
        this.disabledSslProtocols = disabledSslProtocols;
        return this;
    }

    /**
     * Get the policyType property: Type of Ssl Policy.
     *
     * @return the policyType value.
     */
    public ApplicationGatewaySslPolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the policyType property: Type of Ssl Policy.
     *
     * @param policyType the policyType value to set.
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withPolicyType(ApplicationGatewaySslPolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the policyName property: Name of Ssl predefined policy.
     *
     * @return the policyName value.
     */
    public ApplicationGatewaySslPolicyName policyName() {
        return this.policyName;
    }

    /**
     * Set the policyName property: Name of Ssl predefined policy.
     *
     * @param policyName the policyName value to set.
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withPolicyName(ApplicationGatewaySslPolicyName policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get the cipherSuites property: Ssl cipher suites to be enabled in the specified order to application gateway.
     *
     * @return the cipherSuites value.
     */
    public List<ApplicationGatewaySslCipherSuite> cipherSuites() {
        return this.cipherSuites;
    }

    /**
     * Set the cipherSuites property: Ssl cipher suites to be enabled in the specified order to application gateway.
     *
     * @param cipherSuites the cipherSuites value to set.
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withCipherSuites(List<ApplicationGatewaySslCipherSuite> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }

    /**
     * Get the minProtocolVersion property: Minimum version of Ssl protocol to be supported on application gateway.
     *
     * @return the minProtocolVersion value.
     */
    public ApplicationGatewaySslProtocol minProtocolVersion() {
        return this.minProtocolVersion;
    }

    /**
     * Set the minProtocolVersion property: Minimum version of Ssl protocol to be supported on application gateway.
     *
     * @param minProtocolVersion the minProtocolVersion value to set.
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withMinProtocolVersion(ApplicationGatewaySslProtocol minProtocolVersion) {
        this.minProtocolVersion = minProtocolVersion;
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
