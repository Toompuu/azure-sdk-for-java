// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration for container-enabled pools. */
@Fluent
public final class ContainerConfiguration {
    /*
     * The container technology to be used.
     */
    @JsonProperty(value = "type", required = true)
    private String type = "DockerCompatible";

    /*
     * The collection of container image names. This is the full image
     * reference, as would be specified to "docker pull". An image will be
     * sourced from the default Docker registry unless the image is fully
     * qualified with an alternative registry.
     */
    @JsonProperty(value = "containerImageNames")
    private List<String> containerImageNames;

    /*
     * Additional private registries from which containers can be pulled. If
     * any images must be downloaded from a private registry which requires
     * credentials, then those credentials must be provided here.
     */
    @JsonProperty(value = "containerRegistries")
    private List<ContainerRegistry> containerRegistries;

    /** Creates an instance of ContainerConfiguration class. */
    public ContainerConfiguration() {
        type = "DockerCompatible";
    }

    /**
     * Get the type property: The container technology to be used.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The container technology to be used.
     *
     * @param type the type value to set.
     * @return the ContainerConfiguration object itself.
     */
    public ContainerConfiguration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the containerImageNames property: The collection of container image names. This is the full image reference,
     * as would be specified to "docker pull". An image will be sourced from the default Docker registry unless the
     * image is fully qualified with an alternative registry.
     *
     * @return the containerImageNames value.
     */
    public List<String> containerImageNames() {
        return this.containerImageNames;
    }

    /**
     * Set the containerImageNames property: The collection of container image names. This is the full image reference,
     * as would be specified to "docker pull". An image will be sourced from the default Docker registry unless the
     * image is fully qualified with an alternative registry.
     *
     * @param containerImageNames the containerImageNames value to set.
     * @return the ContainerConfiguration object itself.
     */
    public ContainerConfiguration withContainerImageNames(List<String> containerImageNames) {
        this.containerImageNames = containerImageNames;
        return this;
    }

    /**
     * Get the containerRegistries property: Additional private registries from which containers can be pulled. If any
     * images must be downloaded from a private registry which requires credentials, then those credentials must be
     * provided here.
     *
     * @return the containerRegistries value.
     */
    public List<ContainerRegistry> containerRegistries() {
        return this.containerRegistries;
    }

    /**
     * Set the containerRegistries property: Additional private registries from which containers can be pulled. If any
     * images must be downloaded from a private registry which requires credentials, then those credentials must be
     * provided here.
     *
     * @param containerRegistries the containerRegistries value to set.
     * @return the ContainerConfiguration object itself.
     */
    public ContainerConfiguration withContainerRegistries(List<ContainerRegistry> containerRegistries) {
        this.containerRegistries = containerRegistries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containerRegistries() != null) {
            containerRegistries().forEach(e -> e.validate());
        }
    }
}
