// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Operation request details. */
@Fluent
public final class RequestContract {
    /*
     * Operation request description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Collection of operation request query parameters.
     */
    @JsonProperty(value = "queryParameters")
    private List<ParameterContract> queryParameters;

    /*
     * Collection of operation request headers.
     */
    @JsonProperty(value = "headers")
    private List<ParameterContract> headers;

    /*
     * Collection of operation request representations.
     */
    @JsonProperty(value = "representations")
    private List<RepresentationContract> representations;

    /**
     * Get the description property: Operation request description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Operation request description.
     *
     * @param description the description value to set.
     * @return the RequestContract object itself.
     */
    public RequestContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the queryParameters property: Collection of operation request query parameters.
     *
     * @return the queryParameters value.
     */
    public List<ParameterContract> queryParameters() {
        return this.queryParameters;
    }

    /**
     * Set the queryParameters property: Collection of operation request query parameters.
     *
     * @param queryParameters the queryParameters value to set.
     * @return the RequestContract object itself.
     */
    public RequestContract withQueryParameters(List<ParameterContract> queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    /**
     * Get the headers property: Collection of operation request headers.
     *
     * @return the headers value.
     */
    public List<ParameterContract> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Collection of operation request headers.
     *
     * @param headers the headers value to set.
     * @return the RequestContract object itself.
     */
    public RequestContract withHeaders(List<ParameterContract> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the representations property: Collection of operation request representations.
     *
     * @return the representations value.
     */
    public List<RepresentationContract> representations() {
        return this.representations;
    }

    /**
     * Set the representations property: Collection of operation request representations.
     *
     * @param representations the representations value to set.
     * @return the RequestContract object itself.
     */
    public RequestContract withRepresentations(List<RepresentationContract> representations) {
        this.representations = representations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queryParameters() != null) {
            queryParameters().forEach(e -> e.validate());
        }
        if (headers() != null) {
            headers().forEach(e -> e.validate());
        }
        if (representations() != null) {
            representations().forEach(e -> e.validate());
        }
    }
}
