// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Salesforce Service Cloud object dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SalesforceServiceCloudObject")
@JsonFlatten
@Fluent
public class SalesforceServiceCloudObjectDataset extends Dataset {
    /*
     * The Salesforce Service Cloud object API name. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.objectApiName")
    private Object objectApiName;

    /**
     * Get the objectApiName property: The Salesforce Service Cloud object API name. Type: string (or Expression with
     * resultType string).
     *
     * @return the objectApiName value.
     */
    public Object getObjectApiName() {
        return this.objectApiName;
    }

    /**
     * Set the objectApiName property: The Salesforce Service Cloud object API name. Type: string (or Expression with
     * resultType string).
     *
     * @param objectApiName the objectApiName value to set.
     * @return the SalesforceServiceCloudObjectDataset object itself.
     */
    public SalesforceServiceCloudObjectDataset setObjectApiName(Object objectApiName) {
        this.objectApiName = objectApiName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
