// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.RegistrationDelegationSettingsProperties;
import com.azure.resourcemanager.apimanagement.models.SubscriptionsDelegationSettingsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Delegation settings contract properties. */
@Fluent
public final class PortalDelegationSettingsProperties {
    /*
     * A delegation Url.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * A base64-encoded validation key to validate, that a request is coming
     * from Azure API Management.
     */
    @JsonProperty(value = "validationKey")
    private String validationKey;

    /*
     * Subscriptions delegation settings.
     */
    @JsonProperty(value = "subscriptions")
    private SubscriptionsDelegationSettingsProperties subscriptions;

    /*
     * User registration delegation settings.
     */
    @JsonProperty(value = "userRegistration")
    private RegistrationDelegationSettingsProperties userRegistration;

    /**
     * Get the url property: A delegation Url.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: A delegation Url.
     *
     * @param url the url value to set.
     * @return the PortalDelegationSettingsProperties object itself.
     */
    public PortalDelegationSettingsProperties withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the validationKey property: A base64-encoded validation key to validate, that a request is coming from Azure
     * API Management.
     *
     * @return the validationKey value.
     */
    public String validationKey() {
        return this.validationKey;
    }

    /**
     * Set the validationKey property: A base64-encoded validation key to validate, that a request is coming from Azure
     * API Management.
     *
     * @param validationKey the validationKey value to set.
     * @return the PortalDelegationSettingsProperties object itself.
     */
    public PortalDelegationSettingsProperties withValidationKey(String validationKey) {
        this.validationKey = validationKey;
        return this;
    }

    /**
     * Get the subscriptions property: Subscriptions delegation settings.
     *
     * @return the subscriptions value.
     */
    public SubscriptionsDelegationSettingsProperties subscriptions() {
        return this.subscriptions;
    }

    /**
     * Set the subscriptions property: Subscriptions delegation settings.
     *
     * @param subscriptions the subscriptions value to set.
     * @return the PortalDelegationSettingsProperties object itself.
     */
    public PortalDelegationSettingsProperties withSubscriptions(
        SubscriptionsDelegationSettingsProperties subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    /**
     * Get the userRegistration property: User registration delegation settings.
     *
     * @return the userRegistration value.
     */
    public RegistrationDelegationSettingsProperties userRegistration() {
        return this.userRegistration;
    }

    /**
     * Set the userRegistration property: User registration delegation settings.
     *
     * @param userRegistration the userRegistration value to set.
     * @return the PortalDelegationSettingsProperties object itself.
     */
    public PortalDelegationSettingsProperties withUserRegistration(
        RegistrationDelegationSettingsProperties userRegistration) {
        this.userRegistration = userRegistration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subscriptions() != null) {
            subscriptions().validate();
        }
        if (userRegistration() != null) {
            userRegistration().validate();
        }
    }
}
