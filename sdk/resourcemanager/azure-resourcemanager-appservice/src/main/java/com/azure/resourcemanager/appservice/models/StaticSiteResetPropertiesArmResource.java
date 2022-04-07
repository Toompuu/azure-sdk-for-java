// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.fluent.models.StaticSiteResetPropertiesArmResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Static Site Reset Properties ARM resource. */
@Fluent
public final class StaticSiteResetPropertiesArmResource extends ProxyOnlyResource {
    /*
     * StaticSiteResetPropertiesARMResource resource specific properties
     */
    @JsonProperty(value = "properties")
    private StaticSiteResetPropertiesArmResourceProperties innerProperties;

    /**
     * Get the innerProperties property: StaticSiteResetPropertiesARMResource resource specific properties.
     *
     * @return the innerProperties value.
     */
    private StaticSiteResetPropertiesArmResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteResetPropertiesArmResource withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the repositoryToken property: The token which proves admin privileges to the repository.
     *
     * @return the repositoryToken value.
     */
    public String repositoryToken() {
        return this.innerProperties() == null ? null : this.innerProperties().repositoryToken();
    }

    /**
     * Set the repositoryToken property: The token which proves admin privileges to the repository.
     *
     * @param repositoryToken the repositoryToken value to set.
     * @return the StaticSiteResetPropertiesArmResource object itself.
     */
    public StaticSiteResetPropertiesArmResource withRepositoryToken(String repositoryToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteResetPropertiesArmResourceProperties();
        }
        this.innerProperties().withRepositoryToken(repositoryToken);
        return this;
    }

    /**
     * Get the shouldUpdateRepository property: Determines whether the repository should be updated with the new
     * properties.
     *
     * @return the shouldUpdateRepository value.
     */
    public Boolean shouldUpdateRepository() {
        return this.innerProperties() == null ? null : this.innerProperties().shouldUpdateRepository();
    }

    /**
     * Set the shouldUpdateRepository property: Determines whether the repository should be updated with the new
     * properties.
     *
     * @param shouldUpdateRepository the shouldUpdateRepository value to set.
     * @return the StaticSiteResetPropertiesArmResource object itself.
     */
    public StaticSiteResetPropertiesArmResource withShouldUpdateRepository(Boolean shouldUpdateRepository) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteResetPropertiesArmResourceProperties();
        }
        this.innerProperties().withShouldUpdateRepository(shouldUpdateRepository);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
