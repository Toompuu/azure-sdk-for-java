// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data factory name for linked integration runtime request. */
@Fluent
public final class LinkedIntegrationRuntimeRequest {
    /*
     * The data factory name for linked integration runtime.
     */
    @JsonProperty(value = "factoryName", required = true)
    private String linkedFactoryName;

    /**
     * Get the linkedFactoryName property: The data factory name for linked integration runtime.
     *
     * @return the linkedFactoryName value.
     */
    public String linkedFactoryName() {
        return this.linkedFactoryName;
    }

    /**
     * Set the linkedFactoryName property: The data factory name for linked integration runtime.
     *
     * @param linkedFactoryName the linkedFactoryName value to set.
     * @return the LinkedIntegrationRuntimeRequest object itself.
     */
    public LinkedIntegrationRuntimeRequest withLinkedFactoryName(String linkedFactoryName) {
        this.linkedFactoryName = linkedFactoryName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkedFactoryName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property linkedFactoryName in model LinkedIntegrationRuntimeRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LinkedIntegrationRuntimeRequest.class);
}
