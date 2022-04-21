// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.KeyVaultContractProperties;
import com.azure.resourcemanager.apimanagement.models.NamedValueEntityBaseParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** NamedValue Contract properties. */
@Fluent
public final class NamedValueContractProperties extends NamedValueEntityBaseParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NamedValueContractProperties.class);

    /*
     * Unique name of NamedValue. It may contain only letters, digits, period,
     * dash, and underscore characters.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Value of the NamedValue. Can contain policy expressions. It may not be
     * empty or consist only of whitespace. This property will not be filled on
     * 'GET' operations! Use '/listSecrets' POST request to get the value.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * KeyVault location details of the namedValue.
     */
    @JsonProperty(value = "keyVault")
    private KeyVaultContractProperties keyVault;

    /**
     * Get the displayName property: Unique name of NamedValue. It may contain only letters, digits, period, dash, and
     * underscore characters.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Unique name of NamedValue. It may contain only letters, digits, period, dash, and
     * underscore characters.
     *
     * @param displayName the displayName value to set.
     * @return the NamedValueContractProperties object itself.
     */
    public NamedValueContractProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the value property: Value of the NamedValue. Can contain policy expressions. It may not be empty or consist
     * only of whitespace. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get
     * the value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the NamedValue. Can contain policy expressions. It may not be empty or consist
     * only of whitespace. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get
     * the value.
     *
     * @param value the value value to set.
     * @return the NamedValueContractProperties object itself.
     */
    public NamedValueContractProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the keyVault property: KeyVault location details of the namedValue.
     *
     * @return the keyVault value.
     */
    public KeyVaultContractProperties keyVault() {
        return this.keyVault;
    }

    /**
     * Set the keyVault property: KeyVault location details of the namedValue.
     *
     * @param keyVault the keyVault value to set.
     * @return the NamedValueContractProperties object itself.
     */
    public NamedValueContractProperties withKeyVault(KeyVaultContractProperties keyVault) {
        this.keyVault = keyVault;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NamedValueContractProperties withTags(List<String> tags) {
        super.withTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NamedValueContractProperties withSecret(Boolean secret) {
        super.withSecret(secret);
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
        if (displayName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model NamedValueContractProperties"));
        }
        if (keyVault() != null) {
            keyVault().validate();
        }
    }
}
