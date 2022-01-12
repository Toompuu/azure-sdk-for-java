// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machine scale set sku. NOTE: If the new VM SKU is not supported on the hardware the scale set is
 * currently on, you need to deallocate the VMs in the scale set before you modify the SKU name.
 */
@Fluent
public final class Sku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Sku.class);

    /*
     * The sku name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Specifies the tier of virtual machines in a scale set.<br /><br />
     * Possible Values:<br /><br /> **Standard**<br /><br /> **Basic**
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * Specifies the number of virtual machines in the scale set.
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /**
     * Get the name property: The sku name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The sku name.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Specifies the tier of virtual machines in a scale set.&lt;br /&gt;&lt;br /&gt; Possible
     * Values:&lt;br /&gt;&lt;br /&gt; **Standard**&lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Specifies the tier of virtual machines in a scale set.&lt;br /&gt;&lt;br /&gt; Possible
     * Values:&lt;br /&gt;&lt;br /&gt; **Standard**&lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: Specifies the number of virtual machines in the scale set.
     *
     * @return the capacity value.
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Specifies the number of virtual machines in the scale set.
     *
     * @param capacity the capacity value to set.
     * @return the Sku object itself.
     */
    public Sku withCapacity(Long capacity) {
        this.capacity = capacity;
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
