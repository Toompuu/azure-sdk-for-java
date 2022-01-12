// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ConnectionMonitorDestination;
import com.azure.resourcemanager.network.models.ConnectionMonitorSource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Information about the connection monitor. */
@Fluent
public final class ConnectionMonitorResultInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorResultInner.class);

    /*
     * The etag property.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Describes the properties of a connection monitor.
     */
    @JsonProperty(value = "properties")
    private ConnectionMonitorResultProperties innerProperties;

    /**
     * Get the etag property: The etag property.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag property.
     *
     * @param etag the etag value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: Describes the properties of a connection monitor.
     *
     * @return the innerProperties value.
     */
    private ConnectionMonitorResultProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionMonitorResultInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionMonitorResultInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the connection monitor.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The provisioning state of the connection monitor.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withProvisioningState(ProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the startTime property: The date and time when the connection monitor was started.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: The date and time when the connection monitor was started.
     *
     * @param startTime the startTime value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the monitoringStatus property: The monitoring status of the connection monitor.
     *
     * @return the monitoringStatus value.
     */
    public String monitoringStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().monitoringStatus();
    }

    /**
     * Set the monitoringStatus property: The monitoring status of the connection monitor.
     *
     * @param monitoringStatus the monitoringStatus value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withMonitoringStatus(String monitoringStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withMonitoringStatus(monitoringStatus);
        return this;
    }

    /**
     * Get the source property: Describes the source of connection monitor.
     *
     * @return the source value.
     */
    public ConnectionMonitorSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Describes the source of connection monitor.
     *
     * @param source the source value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withSource(ConnectionMonitorSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the destination property: Describes the destination of connection monitor.
     *
     * @return the destination value.
     */
    public ConnectionMonitorDestination destination() {
        return this.innerProperties() == null ? null : this.innerProperties().destination();
    }

    /**
     * Set the destination property: Describes the destination of connection monitor.
     *
     * @param destination the destination value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withDestination(ConnectionMonitorDestination destination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withDestination(destination);
        return this;
    }

    /**
     * Get the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @return the autoStart value.
     */
    public Boolean autoStart() {
        return this.innerProperties() == null ? null : this.innerProperties().autoStart();
    }

    /**
     * Set the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @param autoStart the autoStart value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withAutoStart(Boolean autoStart) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withAutoStart(autoStart);
        return this;
    }

    /**
     * Get the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @return the monitoringIntervalInSeconds value.
     */
    public Integer monitoringIntervalInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().monitoringIntervalInSeconds();
    }

    /**
     * Set the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value to set.
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionMonitorResultProperties();
        }
        this.innerProperties().withMonitoringIntervalInSeconds(monitoringIntervalInSeconds);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
