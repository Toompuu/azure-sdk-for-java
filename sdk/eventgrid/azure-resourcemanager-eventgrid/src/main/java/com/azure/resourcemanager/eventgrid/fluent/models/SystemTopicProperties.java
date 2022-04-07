// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.models.ResourceProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the System Topic. */
@Fluent
public final class SystemTopicProperties {
    /*
     * Provisioning state of the system topic.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceProvisioningState provisioningState;

    /*
     * Source for the system topic.
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * TopicType for the system topic.
     */
    @JsonProperty(value = "topicType")
    private String topicType;

    /*
     * Metric resource id for the system topic.
     */
    @JsonProperty(value = "metricResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricResourceId;

    /**
     * Get the provisioningState property: Provisioning state of the system topic.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the source property: Source for the system topic.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Source for the system topic.
     *
     * @param source the source value to set.
     * @return the SystemTopicProperties object itself.
     */
    public SystemTopicProperties withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the topicType property: TopicType for the system topic.
     *
     * @return the topicType value.
     */
    public String topicType() {
        return this.topicType;
    }

    /**
     * Set the topicType property: TopicType for the system topic.
     *
     * @param topicType the topicType value to set.
     * @return the SystemTopicProperties object itself.
     */
    public SystemTopicProperties withTopicType(String topicType) {
        this.topicType = topicType;
        return this;
    }

    /**
     * Get the metricResourceId property: Metric resource id for the system topic.
     *
     * @return the metricResourceId value.
     */
    public String metricResourceId() {
        return this.metricResourceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
