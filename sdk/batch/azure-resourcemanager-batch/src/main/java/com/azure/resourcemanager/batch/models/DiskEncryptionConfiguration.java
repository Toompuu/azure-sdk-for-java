// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The disk encryption configuration applied on compute nodes in the pool. Disk encryption configuration is not
 * supported on Linux pool created with Virtual Machine Image or Shared Image Gallery Image.
 */
@Fluent
public final class DiskEncryptionConfiguration {
    /*
     * The list of disk targets Batch Service will encrypt on the compute node
     * On Linux pool, only "TemporaryDisk" is supported; on Windows pool,
     * "OsDisk" and "TemporaryDisk" must be specified.
     */
    @JsonProperty(value = "targets")
    private List<DiskEncryptionTarget> targets;

    /**
     * Get the targets property: The list of disk targets Batch Service will encrypt on the compute node On Linux pool,
     * only "TemporaryDisk" is supported; on Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     *
     * @return the targets value.
     */
    public List<DiskEncryptionTarget> targets() {
        return this.targets;
    }

    /**
     * Set the targets property: The list of disk targets Batch Service will encrypt on the compute node On Linux pool,
     * only "TemporaryDisk" is supported; on Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     *
     * @param targets the targets value to set.
     * @return the DiskEncryptionConfiguration object itself.
     */
    public DiskEncryptionConfiguration withTargets(List<DiskEncryptionTarget> targets) {
        this.targets = targets;
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
