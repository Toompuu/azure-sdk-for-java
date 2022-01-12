// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that determine the run agent configuration. */
@Fluent
public final class AgentProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AgentProperties.class);

    /*
     * The CPU configuration in terms of number of cores required for the run.
     */
    @JsonProperty(value = "cpu")
    private Integer cpu;

    /**
     * Get the cpu property: The CPU configuration in terms of number of cores required for the run.
     *
     * @return the cpu value.
     */
    public Integer cpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: The CPU configuration in terms of number of cores required for the run.
     *
     * @param cpu the cpu value to set.
     * @return the AgentProperties object itself.
     */
    public AgentProperties withCpu(Integer cpu) {
        this.cpu = cpu;
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
