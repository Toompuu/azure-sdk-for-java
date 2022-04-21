// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GPU resource. */
@Fluent
public final class GpuResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GpuResource.class);

    /*
     * The count of the GPU resource.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * The SKU of the GPU resource.
     */
    @JsonProperty(value = "sku", required = true)
    private GpuSku sku;

    /**
     * Get the count property: The count of the GPU resource.
     *
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: The count of the GPU resource.
     *
     * @param count the count value to set.
     * @return the GpuResource object itself.
     */
    public GpuResource withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the sku property: The SKU of the GPU resource.
     *
     * @return the sku value.
     */
    public GpuSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the GPU resource.
     *
     * @param sku the sku value to set.
     * @return the GpuResource object itself.
     */
    public GpuResource withSku(GpuSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model GpuResource"));
        }
    }
}
