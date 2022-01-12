// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Tag attributes. */
@JsonFlatten
@Fluent
public class ArtifactTagProperties {
    /*
     * Registry login server name. This is likely to be similar to
     * {registry-name}.azurecr.io.
     */
    @JsonProperty(value = "registry", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String registryLoginServer;

    /*
     * Image name
     */
    @JsonProperty(value = "imageName", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String repositoryName;

    /*
     * Tag name
     */
    @JsonProperty(value = "tag.name", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Tag digest
     */
    @JsonProperty(value = "tag.digest", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String digest;

    /*
     * Tag created time
     */
    @JsonProperty(value = "tag.createdTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Tag last update time
     */
    @JsonProperty(value = "tag.lastUpdateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedOn;

    /*
     * Delete enabled
     */
    @JsonProperty(value = "tag.changeableAttributes.deleteEnabled")
    private Boolean deleteEnabled;

    /*
     * Write enabled
     */
    @JsonProperty(value = "tag.changeableAttributes.writeEnabled")
    private Boolean writeEnabled;

    /*
     * List enabled
     */
    @JsonProperty(value = "tag.changeableAttributes.listEnabled")
    private Boolean listEnabled;

    /*
     * Read enabled
     */
    @JsonProperty(value = "tag.changeableAttributes.readEnabled")
    private Boolean readEnabled;

    /**
     * Get the registryLoginServer property: Registry login server name. This is likely to be similar to
     * {registry-name}.azurecr.io.
     *
     * @return the registryLoginServer value.
     */
    public String getRegistryLoginServer() {
        return this.registryLoginServer;
    }

    /**
     * Get the repositoryName property: Image name.
     *
     * @return the repositoryName value.
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * Get the name property: Tag name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the digest property: Tag digest.
     *
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Get the createdOn property: Tag created time.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Get the lastUpdatedOn property: Tag last update time.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the deleteEnabled property: Delete enabled.
     *
     * @return the deleteEnabled value.
     */
    public Boolean isDeleteEnabled() {
        return this.deleteEnabled;
    }

    /**
     * Set the deleteEnabled property: Delete enabled.
     *
     * @param deleteEnabled the deleteEnabled value to set.
     * @return the ArtifactTagProperties object itself.
     */
    public ArtifactTagProperties setDeleteEnabled(Boolean deleteEnabled) {
        this.deleteEnabled = deleteEnabled;
        return this;
    }

    /**
     * Get the writeEnabled property: Write enabled.
     *
     * @return the writeEnabled value.
     */
    public Boolean isWriteEnabled() {
        return this.writeEnabled;
    }

    /**
     * Set the writeEnabled property: Write enabled.
     *
     * @param writeEnabled the writeEnabled value to set.
     * @return the ArtifactTagProperties object itself.
     */
    public ArtifactTagProperties setWriteEnabled(Boolean writeEnabled) {
        this.writeEnabled = writeEnabled;
        return this;
    }

    /**
     * Get the listEnabled property: List enabled.
     *
     * @return the listEnabled value.
     */
    public Boolean isListEnabled() {
        return this.listEnabled;
    }

    /**
     * Set the listEnabled property: List enabled.
     *
     * @param listEnabled the listEnabled value to set.
     * @return the ArtifactTagProperties object itself.
     */
    public ArtifactTagProperties setListEnabled(Boolean listEnabled) {
        this.listEnabled = listEnabled;
        return this;
    }

    /**
     * Get the readEnabled property: Read enabled.
     *
     * @return the readEnabled value.
     */
    public Boolean isReadEnabled() {
        return this.readEnabled;
    }

    /**
     * Set the readEnabled property: Read enabled.
     *
     * @param readEnabled the readEnabled value to set.
     * @return the ArtifactTagProperties object itself.
     */
    public ArtifactTagProperties setReadEnabled(Boolean readEnabled) {
        this.readEnabled = readEnabled;
        return this;
    }
}
