// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderBaseParameters;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The external Identity Providers like Facebook, Google, Microsoft, Twitter or Azure Active Directory which can be used
 * to enable access to the API Management service developer portal for all users.
 */
@Fluent
public final class IdentityProviderContractProperties extends IdentityProviderBaseParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IdentityProviderContractProperties.class);

    /*
     * Client Id of the Application in the external Identity Provider. It is
     * App ID for Facebook login, Client ID for Google login, App ID for
     * Microsoft.
     */
    @JsonProperty(value = "clientId", required = true)
    private String clientId;

    /*
     * Client secret of the Application in external Identity Provider, used to
     * authenticate login request. For example, it is App Secret for Facebook
     * login, API Key for Google login, Public Key for Microsoft. This property
     * will not be filled on 'GET' operations! Use '/listSecrets' POST request
     * to get the value.
     */
    @JsonProperty(value = "clientSecret")
    private String clientSecret;

    /**
     * Get the clientId property: Client Id of the Application in the external Identity Provider. It is App ID for
     * Facebook login, Client ID for Google login, App ID for Microsoft.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client Id of the Application in the external Identity Provider. It is App ID for
     * Facebook login, Client ID for Google login, App ID for Microsoft.
     *
     * @param clientId the clientId value to set.
     * @return the IdentityProviderContractProperties object itself.
     */
    public IdentityProviderContractProperties withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: Client secret of the Application in external Identity Provider, used to
     * authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public
     * Key for Microsoft. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get
     * the value.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: Client secret of the Application in external Identity Provider, used to
     * authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public
     * Key for Microsoft. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get
     * the value.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the IdentityProviderContractProperties object itself.
     */
    public IdentityProviderContractProperties withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderContractProperties withType(IdentityProviderType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderContractProperties withSigninTenant(String signinTenant) {
        super.withSigninTenant(signinTenant);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderContractProperties withAllowedTenants(List<String> allowedTenants) {
        super.withAllowedTenants(allowedTenants);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderContractProperties withAuthority(String authority) {
        super.withAuthority(authority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderContractProperties withSignupPolicyName(String signupPolicyName) {
        super.withSignupPolicyName(signupPolicyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderContractProperties withSigninPolicyName(String signinPolicyName) {
        super.withSigninPolicyName(signinPolicyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderContractProperties withProfileEditingPolicyName(String profileEditingPolicyName) {
        super.withProfileEditingPolicyName(profileEditingPolicyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderContractProperties withPasswordResetPolicyName(String passwordResetPolicyName) {
        super.withPasswordResetPolicyName(passwordResetPolicyName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (clientId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientId in model IdentityProviderContractProperties"));
        }
    }
}
