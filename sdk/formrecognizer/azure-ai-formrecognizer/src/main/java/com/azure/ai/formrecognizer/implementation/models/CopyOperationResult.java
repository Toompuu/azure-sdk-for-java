// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Status and result of the queued copy operation. */
@Fluent
public final class CopyOperationResult {
    /*
     * Operation status.
     */
    @JsonProperty(value = "status", required = true)
    private OperationStatus status;

    /*
     * Date and time (UTC) when the copy operation was submitted.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private OffsetDateTime createdDateTime;

    /*
     * Date and time (UTC) when the status was last updated.
     */
    @JsonProperty(value = "lastUpdatedDateTime", required = true)
    private OffsetDateTime lastUpdatedDateTime;

    /*
     * Results of the copy operation.
     */
    @JsonProperty(value = "copyResult")
    private CopyResult copyResult;

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Operation status.
     *
     * @param status the status value to set.
     * @return the CopyOperationResult object itself.
     */
    public CopyOperationResult setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time (UTC) when the copy operation was submitted.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time (UTC) when the copy operation was submitted.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the CopyOperationResult object itself.
     */
    public CopyOperationResult setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: Date and time (UTC) when the status was last updated.
     *
     * @return the lastUpdatedDateTime value.
     */
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Set the lastUpdatedDateTime property: Date and time (UTC) when the status was last updated.
     *
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @return the CopyOperationResult object itself.
     */
    public CopyOperationResult setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * Get the copyResult property: Results of the copy operation.
     *
     * @return the copyResult value.
     */
    public CopyResult getCopyResult() {
        return this.copyResult;
    }

    /**
     * Set the copyResult property: Results of the copy operation.
     *
     * @param copyResult the copyResult value to set.
     * @return the CopyOperationResult object itself.
     */
    public CopyOperationResult setCopyResult(CopyResult copyResult) {
        this.copyResult = copyResult;
        return this;
    }
}
