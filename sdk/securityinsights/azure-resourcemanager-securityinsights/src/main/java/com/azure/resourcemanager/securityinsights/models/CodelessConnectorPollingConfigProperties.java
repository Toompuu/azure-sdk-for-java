// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Config to describe the polling config for API poller connector. */
@Fluent
public final class CodelessConnectorPollingConfigProperties {
    /*
     * The poller active status
     */
    @JsonProperty(value = "isActive")
    private Boolean isActive;

    /*
     * Describe the authentication type of the poller
     */
    @JsonProperty(value = "auth", required = true)
    private CodelessConnectorPollingAuthProperties auth;

    /*
     * Describe the poll request config parameters of the poller
     */
    @JsonProperty(value = "request", required = true)
    private CodelessConnectorPollingRequestProperties request;

    /*
     * Describe the poll request paging config of the poller
     */
    @JsonProperty(value = "paging")
    private CodelessConnectorPollingPagingProperties paging;

    /*
     * Describe the response config parameters of the poller
     */
    @JsonProperty(value = "response")
    private CodelessConnectorPollingResponseProperties response;

    /**
     * Get the isActive property: The poller active status.
     *
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Set the isActive property: The poller active status.
     *
     * @param isActive the isActive value to set.
     * @return the CodelessConnectorPollingConfigProperties object itself.
     */
    public CodelessConnectorPollingConfigProperties withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Get the auth property: Describe the authentication type of the poller.
     *
     * @return the auth value.
     */
    public CodelessConnectorPollingAuthProperties auth() {
        return this.auth;
    }

    /**
     * Set the auth property: Describe the authentication type of the poller.
     *
     * @param auth the auth value to set.
     * @return the CodelessConnectorPollingConfigProperties object itself.
     */
    public CodelessConnectorPollingConfigProperties withAuth(CodelessConnectorPollingAuthProperties auth) {
        this.auth = auth;
        return this;
    }

    /**
     * Get the request property: Describe the poll request config parameters of the poller.
     *
     * @return the request value.
     */
    public CodelessConnectorPollingRequestProperties request() {
        return this.request;
    }

    /**
     * Set the request property: Describe the poll request config parameters of the poller.
     *
     * @param request the request value to set.
     * @return the CodelessConnectorPollingConfigProperties object itself.
     */
    public CodelessConnectorPollingConfigProperties withRequest(CodelessConnectorPollingRequestProperties request) {
        this.request = request;
        return this;
    }

    /**
     * Get the paging property: Describe the poll request paging config of the poller.
     *
     * @return the paging value.
     */
    public CodelessConnectorPollingPagingProperties paging() {
        return this.paging;
    }

    /**
     * Set the paging property: Describe the poll request paging config of the poller.
     *
     * @param paging the paging value to set.
     * @return the CodelessConnectorPollingConfigProperties object itself.
     */
    public CodelessConnectorPollingConfigProperties withPaging(CodelessConnectorPollingPagingProperties paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Get the response property: Describe the response config parameters of the poller.
     *
     * @return the response value.
     */
    public CodelessConnectorPollingResponseProperties response() {
        return this.response;
    }

    /**
     * Set the response property: Describe the response config parameters of the poller.
     *
     * @param response the response value to set.
     * @return the CodelessConnectorPollingConfigProperties object itself.
     */
    public CodelessConnectorPollingConfigProperties withResponse(CodelessConnectorPollingResponseProperties response) {
        this.response = response;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (auth() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property auth in model CodelessConnectorPollingConfigProperties"));
        } else {
            auth().validate();
        }
        if (request() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property request in model CodelessConnectorPollingConfigProperties"));
        } else {
            request().validate();
        }
        if (paging() != null) {
            paging().validate();
        }
        if (response() != null) {
            response().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CodelessConnectorPollingConfigProperties.class);
}
