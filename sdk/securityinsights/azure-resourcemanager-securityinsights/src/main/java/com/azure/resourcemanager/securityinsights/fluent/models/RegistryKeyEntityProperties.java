// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.azure.resourcemanager.securityinsights.models.RegistryHive;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RegistryKey entity property bag. */
@Immutable
public final class RegistryKeyEntityProperties extends EntityCommonProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistryKeyEntityProperties.class);

    /*
     * the hive that holds the registry key.
     */
    @JsonProperty(value = "hive", access = JsonProperty.Access.WRITE_ONLY)
    private RegistryHive hive;

    /*
     * The registry key path.
     */
    @JsonProperty(value = "key", access = JsonProperty.Access.WRITE_ONLY)
    private String key;

    /**
     * Get the hive property: the hive that holds the registry key.
     *
     * @return the hive value.
     */
    public RegistryHive hive() {
        return this.hive;
    }

    /**
     * Get the key property: The registry key path.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
