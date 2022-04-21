// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** API OAuth2 Authentication settings details. */
@Fluent
public final class OAuth2AuthenticationSettingsContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OAuth2AuthenticationSettingsContract.class);

    /*
     * OAuth authorization server identifier.
     */
    @JsonProperty(value = "authorizationServerId")
    private String authorizationServerId;

    /*
     * operations scope.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /**
     * Get the authorizationServerId property: OAuth authorization server identifier.
     *
     * @return the authorizationServerId value.
     */
    public String authorizationServerId() {
        return this.authorizationServerId;
    }

    /**
     * Set the authorizationServerId property: OAuth authorization server identifier.
     *
     * @param authorizationServerId the authorizationServerId value to set.
     * @return the OAuth2AuthenticationSettingsContract object itself.
     */
    public OAuth2AuthenticationSettingsContract withAuthorizationServerId(String authorizationServerId) {
        this.authorizationServerId = authorizationServerId;
        return this;
    }

    /**
     * Get the scope property: operations scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: operations scope.
     *
     * @param scope the scope value to set.
     * @return the OAuth2AuthenticationSettingsContract object itself.
     */
    public OAuth2AuthenticationSettingsContract withScope(String scope) {
        this.scope = scope;
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
