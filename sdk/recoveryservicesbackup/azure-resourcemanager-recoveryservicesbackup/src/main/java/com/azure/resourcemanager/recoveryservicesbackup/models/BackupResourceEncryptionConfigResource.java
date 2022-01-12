// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The BackupResourceEncryptionConfigResource model. */
@Fluent
public final class BackupResourceEncryptionConfigResource extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupResourceEncryptionConfigResource.class);

    /*
     * BackupResourceEncryptionConfigResource properties
     */
    @JsonProperty(value = "properties")
    private BackupResourceEncryptionConfig properties;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Get the properties property: BackupResourceEncryptionConfigResource properties.
     *
     * @return the properties value.
     */
    public BackupResourceEncryptionConfig properties() {
        return this.properties;
    }

    /**
     * Set the properties property: BackupResourceEncryptionConfigResource properties.
     *
     * @param properties the properties value to set.
     * @return the BackupResourceEncryptionConfigResource object itself.
     */
    public BackupResourceEncryptionConfigResource withProperties(BackupResourceEncryptionConfig properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: Optional ETag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Optional ETag.
     *
     * @param etag the etag value to set.
     * @return the BackupResourceEncryptionConfigResource object itself.
     */
    public BackupResourceEncryptionConfigResource withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackupResourceEncryptionConfigResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackupResourceEncryptionConfigResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
