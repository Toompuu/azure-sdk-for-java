// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Custom activity type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Custom")
@JsonFlatten
@Fluent
public class CustomActivity extends ExecutionActivity {
    /*
     * Command for custom activity Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.command", required = true)
    private Object command;

    /*
     * Resource linked service reference.
     */
    @JsonProperty(value = "typeProperties.resourceLinkedService")
    private LinkedServiceReference resourceLinkedService;

    /*
     * Folder path for resource files Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.folderPath")
    private Object folderPath;

    /*
     * Reference objects
     */
    @JsonProperty(value = "typeProperties.referenceObjects")
    private CustomActivityReferenceObject referenceObjects;

    /*
     * User defined property bag. There is no restriction on the keys or values
     * that can be used. The user specified custom activity has the full
     * responsibility to consume and interpret the content defined.
     */
    @JsonProperty(value = "typeProperties.extendedProperties")
    private Map<String, Object> extendedProperties;

    /*
     * The retention time for the files submitted for custom activity. Type:
     * double (or Expression with resultType double).
     */
    @JsonProperty(value = "typeProperties.retentionTimeInDays")
    private Object retentionTimeInDays;

    /**
     * Get the command property: Command for custom activity Type: string (or Expression with resultType string).
     *
     * @return the command value.
     */
    public Object getCommand() {
        return this.command;
    }

    /**
     * Set the command property: Command for custom activity Type: string (or Expression with resultType string).
     *
     * @param command the command value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity setCommand(Object command) {
        this.command = command;
        return this;
    }

    /**
     * Get the resourceLinkedService property: Resource linked service reference.
     *
     * @return the resourceLinkedService value.
     */
    public LinkedServiceReference getResourceLinkedService() {
        return this.resourceLinkedService;
    }

    /**
     * Set the resourceLinkedService property: Resource linked service reference.
     *
     * @param resourceLinkedService the resourceLinkedService value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity setResourceLinkedService(LinkedServiceReference resourceLinkedService) {
        this.resourceLinkedService = resourceLinkedService;
        return this;
    }

    /**
     * Get the folderPath property: Folder path for resource files Type: string (or Expression with resultType string).
     *
     * @return the folderPath value.
     */
    public Object getFolderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: Folder path for resource files Type: string (or Expression with resultType string).
     *
     * @param folderPath the folderPath value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity setFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the referenceObjects property: Reference objects.
     *
     * @return the referenceObjects value.
     */
    public CustomActivityReferenceObject getReferenceObjects() {
        return this.referenceObjects;
    }

    /**
     * Set the referenceObjects property: Reference objects.
     *
     * @param referenceObjects the referenceObjects value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity setReferenceObjects(CustomActivityReferenceObject referenceObjects) {
        this.referenceObjects = referenceObjects;
        return this;
    }

    /**
     * Get the extendedProperties property: User defined property bag. There is no restriction on the keys or values
     * that can be used. The user specified custom activity has the full responsibility to consume and interpret the
     * content defined.
     *
     * @return the extendedProperties value.
     */
    public Map<String, Object> getExtendedProperties() {
        return this.extendedProperties;
    }

    /**
     * Set the extendedProperties property: User defined property bag. There is no restriction on the keys or values
     * that can be used. The user specified custom activity has the full responsibility to consume and interpret the
     * content defined.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity setExtendedProperties(Map<String, Object> extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    /**
     * Get the retentionTimeInDays property: The retention time for the files submitted for custom activity. Type:
     * double (or Expression with resultType double).
     *
     * @return the retentionTimeInDays value.
     */
    public Object getRetentionTimeInDays() {
        return this.retentionTimeInDays;
    }

    /**
     * Set the retentionTimeInDays property: The retention time for the files submitted for custom activity. Type:
     * double (or Expression with resultType double).
     *
     * @param retentionTimeInDays the retentionTimeInDays value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity setRetentionTimeInDays(Object retentionTimeInDays) {
        this.retentionTimeInDays = retentionTimeInDays;
        return this;
    }
}
