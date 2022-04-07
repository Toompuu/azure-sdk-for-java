// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A copy activity Azure Data Lake Storage Gen2 sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobFSSink")
@Fluent
public final class AzureBlobFSSink extends CopySink {
    /*
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

    /*
     * Specify the custom metadata to be added to sink data. Type: array of
     * objects (or Expression with resultType array of objects).
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Get the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @return the copyBehavior value.
     */
    public Object copyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @param copyBehavior the copyBehavior value to set.
     * @return the AzureBlobFSSink object itself.
     */
    public AzureBlobFSSink withCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

    /**
     * Get the metadata property: Specify the custom metadata to be added to sink data. Type: array of objects (or
     * Expression with resultType array of objects).
     *
     * @return the metadata value.
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Specify the custom metadata to be added to sink data. Type: array of objects (or
     * Expression with resultType array of objects).
     *
     * @param metadata the metadata value to set.
     * @return the AzureBlobFSSink object itself.
     */
    public AzureBlobFSSink withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (metadata() != null) {
            metadata().forEach(e -> e.validate());
        }
    }
}
