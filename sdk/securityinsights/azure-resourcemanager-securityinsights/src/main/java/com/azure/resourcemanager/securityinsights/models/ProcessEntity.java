// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.azure.resourcemanager.securityinsights.fluent.models.ProcessEntityProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.Map;

/** Represents a process entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Process")
@Fluent
public final class ProcessEntity extends EntityInner {
    /*
     * Process entity properties
     */
    @JsonProperty(value = "properties")
    private ProcessEntityProperties innerProperties;

    /**
     * Get the innerProperties property: Process entity properties.
     *
     * @return the innerProperties value.
     */
    private ProcessEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the accountEntityId property: The account entity id running the processes.
     *
     * @return the accountEntityId value.
     */
    public String accountEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().accountEntityId();
    }

    /**
     * Get the commandLine property: The command line used to create the process.
     *
     * @return the commandLine value.
     */
    public String commandLine() {
        return this.innerProperties() == null ? null : this.innerProperties().commandLine();
    }

    /**
     * Get the creationTimeUtc property: The time when the process started to run.
     *
     * @return the creationTimeUtc value.
     */
    public OffsetDateTime creationTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTimeUtc();
    }

    /**
     * Get the elevationToken property: The elevation token associated with the process.
     *
     * @return the elevationToken value.
     */
    public ElevationToken elevationToken() {
        return this.innerProperties() == null ? null : this.innerProperties().elevationToken();
    }

    /**
     * Set the elevationToken property: The elevation token associated with the process.
     *
     * @param elevationToken the elevationToken value to set.
     * @return the ProcessEntity object itself.
     */
    public ProcessEntity withElevationToken(ElevationToken elevationToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessEntityProperties();
        }
        this.innerProperties().withElevationToken(elevationToken);
        return this;
    }

    /**
     * Get the hostEntityId property: The host entity id on which the process was running.
     *
     * @return the hostEntityId value.
     */
    public String hostEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().hostEntityId();
    }

    /**
     * Get the hostLogonSessionEntityId property: The session entity id in which the process was running.
     *
     * @return the hostLogonSessionEntityId value.
     */
    public String hostLogonSessionEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().hostLogonSessionEntityId();
    }

    /**
     * Get the imageFileEntityId property: Image file entity id.
     *
     * @return the imageFileEntityId value.
     */
    public String imageFileEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().imageFileEntityId();
    }

    /**
     * Get the parentProcessEntityId property: The parent process entity id.
     *
     * @return the parentProcessEntityId value.
     */
    public String parentProcessEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().parentProcessEntityId();
    }

    /**
     * Get the processId property: The process ID.
     *
     * @return the processId value.
     */
    public String processId() {
        return this.innerProperties() == null ? null : this.innerProperties().processId();
    }

    /**
     * Get the additionalData property: A bag of custom fields that should be part of the entity and will be presented
     * to the user.
     *
     * @return the additionalData value.
     */
    public Map<String, Object> additionalData() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalData();
    }

    /**
     * Get the friendlyName property: The graph item display name which is a short humanly readable description of the
     * graph item instance. This property is optional and might be system generated.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
