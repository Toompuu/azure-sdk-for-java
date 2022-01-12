// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.models.WebTestGeolocation;
import com.azure.resourcemanager.applicationinsights.models.WebTestKind;
import com.azure.resourcemanager.applicationinsights.models.WebTestPropertiesConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Metadata describing a web test for an Azure resource. */
@Fluent
public final class WebTestProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebTestProperties.class);

    /*
     * Unique ID of this WebTest. This is typically the same value as the Name
     * field.
     */
    @JsonProperty(value = "SyntheticMonitorId", required = true)
    private String syntheticMonitorId;

    /*
     * User defined name if this WebTest.
     */
    @JsonProperty(value = "Name", required = true)
    private String webTestName;

    /*
     * Purpose/user defined descriptive test for this WebTest.
     */
    @JsonProperty(value = "Description")
    private String description;

    /*
     * Is the test actively being monitored.
     */
    @JsonProperty(value = "Enabled")
    private Boolean enabled;

    /*
     * Interval in seconds between test runs for this WebTest. Default value is
     * 300.
     */
    @JsonProperty(value = "Frequency")
    private Integer frequency;

    /*
     * Seconds until this WebTest will timeout and fail. Default value is 30.
     */
    @JsonProperty(value = "Timeout")
    private Integer timeout;

    /*
     * The kind of web test this is, valid choices are ping and multistep.
     */
    @JsonProperty(value = "Kind", required = true)
    private WebTestKind webTestKind;

    /*
     * Allow for retries should this WebTest fail.
     */
    @JsonProperty(value = "RetryEnabled")
    private Boolean retryEnabled;

    /*
     * A list of where to physically run the tests from to give global coverage
     * for accessibility of your application.
     */
    @JsonProperty(value = "Locations", required = true)
    private List<WebTestGeolocation> locations;

    /*
     * An XML configuration specification for a WebTest.
     */
    @JsonProperty(value = "Configuration")
    private WebTestPropertiesConfiguration configuration;

    /*
     * Current state of this component, whether or not is has been provisioned
     * within the resource group it is defined. Users cannot change this value
     * but are able to read from it. Values will include Succeeded, Deploying,
     * Canceled, and Failed.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the syntheticMonitorId property: Unique ID of this WebTest. This is typically the same value as the Name
     * field.
     *
     * @return the syntheticMonitorId value.
     */
    public String syntheticMonitorId() {
        return this.syntheticMonitorId;
    }

    /**
     * Set the syntheticMonitorId property: Unique ID of this WebTest. This is typically the same value as the Name
     * field.
     *
     * @param syntheticMonitorId the syntheticMonitorId value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withSyntheticMonitorId(String syntheticMonitorId) {
        this.syntheticMonitorId = syntheticMonitorId;
        return this;
    }

    /**
     * Get the webTestName property: User defined name if this WebTest.
     *
     * @return the webTestName value.
     */
    public String webTestName() {
        return this.webTestName;
    }

    /**
     * Set the webTestName property: User defined name if this WebTest.
     *
     * @param webTestName the webTestName value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withWebTestName(String webTestName) {
        this.webTestName = webTestName;
        return this;
    }

    /**
     * Get the description property: Purpose/user defined descriptive test for this WebTest.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Purpose/user defined descriptive test for this WebTest.
     *
     * @param description the description value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the enabled property: Is the test actively being monitored.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is the test actively being monitored.
     *
     * @param enabled the enabled value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the frequency property: Interval in seconds between test runs for this WebTest. Default value is 300.
     *
     * @return the frequency value.
     */
    public Integer frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: Interval in seconds between test runs for this WebTest. Default value is 300.
     *
     * @param frequency the frequency value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the timeout property: Seconds until this WebTest will timeout and fail. Default value is 30.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: Seconds until this WebTest will timeout and fail. Default value is 30.
     *
     * @param timeout the timeout value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the webTestKind property: The kind of web test this is, valid choices are ping and multistep.
     *
     * @return the webTestKind value.
     */
    public WebTestKind webTestKind() {
        return this.webTestKind;
    }

    /**
     * Set the webTestKind property: The kind of web test this is, valid choices are ping and multistep.
     *
     * @param webTestKind the webTestKind value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withWebTestKind(WebTestKind webTestKind) {
        this.webTestKind = webTestKind;
        return this;
    }

    /**
     * Get the retryEnabled property: Allow for retries should this WebTest fail.
     *
     * @return the retryEnabled value.
     */
    public Boolean retryEnabled() {
        return this.retryEnabled;
    }

    /**
     * Set the retryEnabled property: Allow for retries should this WebTest fail.
     *
     * @param retryEnabled the retryEnabled value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withRetryEnabled(Boolean retryEnabled) {
        this.retryEnabled = retryEnabled;
        return this;
    }

    /**
     * Get the locations property: A list of where to physically run the tests from to give global coverage for
     * accessibility of your application.
     *
     * @return the locations value.
     */
    public List<WebTestGeolocation> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: A list of where to physically run the tests from to give global coverage for
     * accessibility of your application.
     *
     * @param locations the locations value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withLocations(List<WebTestGeolocation> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the configuration property: An XML configuration specification for a WebTest.
     *
     * @return the configuration value.
     */
    public WebTestPropertiesConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: An XML configuration specification for a WebTest.
     *
     * @param configuration the configuration value to set.
     * @return the WebTestProperties object itself.
     */
    public WebTestProperties withConfiguration(WebTestPropertiesConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the provisioningState property: Current state of this component, whether or not is has been provisioned
     * within the resource group it is defined. Users cannot change this value but are able to read from it. Values will
     * include Succeeded, Deploying, Canceled, and Failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (syntheticMonitorId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property syntheticMonitorId in model WebTestProperties"));
        }
        if (webTestName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property webTestName in model WebTestProperties"));
        }
        if (webTestKind() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property webTestKind in model WebTestProperties"));
        }
        if (locations() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property locations in model WebTestProperties"));
        } else {
            locations().forEach(e -> e.validate());
        }
        if (configuration() != null) {
            configuration().validate();
        }
    }
}
