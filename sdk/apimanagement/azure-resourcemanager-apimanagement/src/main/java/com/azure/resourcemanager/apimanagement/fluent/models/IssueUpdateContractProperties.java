// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.IssueContractBaseProperties;
import com.azure.resourcemanager.apimanagement.models.State;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Issue contract Update Properties. */
@Fluent
public final class IssueUpdateContractProperties extends IssueContractBaseProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IssueUpdateContractProperties.class);

    /*
     * The issue title.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Text describing the issue.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A resource identifier for the user created the issue.
     */
    @JsonProperty(value = "userId")
    private String userId;

    /**
     * Get the title property: The issue title.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The issue title.
     *
     * @param title the title value to set.
     * @return the IssueUpdateContractProperties object itself.
     */
    public IssueUpdateContractProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: Text describing the issue.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Text describing the issue.
     *
     * @param description the description value to set.
     * @return the IssueUpdateContractProperties object itself.
     */
    public IssueUpdateContractProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the userId property: A resource identifier for the user created the issue.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId property: A resource identifier for the user created the issue.
     *
     * @param userId the userId value to set.
     * @return the IssueUpdateContractProperties object itself.
     */
    public IssueUpdateContractProperties withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IssueUpdateContractProperties withCreatedDate(OffsetDateTime createdDate) {
        super.withCreatedDate(createdDate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IssueUpdateContractProperties withState(State state) {
        super.withState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IssueUpdateContractProperties withApiId(String apiId) {
        super.withApiId(apiId);
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
    }
}
