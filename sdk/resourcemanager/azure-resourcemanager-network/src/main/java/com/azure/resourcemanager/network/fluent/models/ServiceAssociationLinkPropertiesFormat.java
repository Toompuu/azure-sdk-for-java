// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of ServiceAssociationLink. */
@Fluent
public final class ServiceAssociationLinkPropertiesFormat {
    /*
     * Resource type of the linked resource.
     */
    @JsonProperty(value = "linkedResourceType")
    private String linkedResourceType;

    /*
     * Link to the external resource.
     */
    @JsonProperty(value = "link")
    private String link;

    /*
     * The provisioning state of the service association link resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * If true, the resource can be deleted.
     */
    @JsonProperty(value = "allowDelete")
    private Boolean allowDelete;

    /*
     * A list of locations.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /**
     * Get the linkedResourceType property: Resource type of the linked resource.
     *
     * @return the linkedResourceType value.
     */
    public String linkedResourceType() {
        return this.linkedResourceType;
    }

    /**
     * Set the linkedResourceType property: Resource type of the linked resource.
     *
     * @param linkedResourceType the linkedResourceType value to set.
     * @return the ServiceAssociationLinkPropertiesFormat object itself.
     */
    public ServiceAssociationLinkPropertiesFormat withLinkedResourceType(String linkedResourceType) {
        this.linkedResourceType = linkedResourceType;
        return this;
    }

    /**
     * Get the link property: Link to the external resource.
     *
     * @return the link value.
     */
    public String link() {
        return this.link;
    }

    /**
     * Set the link property: Link to the external resource.
     *
     * @param link the link value to set.
     * @return the ServiceAssociationLinkPropertiesFormat object itself.
     */
    public ServiceAssociationLinkPropertiesFormat withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the service association link resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the allowDelete property: If true, the resource can be deleted.
     *
     * @return the allowDelete value.
     */
    public Boolean allowDelete() {
        return this.allowDelete;
    }

    /**
     * Set the allowDelete property: If true, the resource can be deleted.
     *
     * @param allowDelete the allowDelete value to set.
     * @return the ServiceAssociationLinkPropertiesFormat object itself.
     */
    public ServiceAssociationLinkPropertiesFormat withAllowDelete(Boolean allowDelete) {
        this.allowDelete = allowDelete;
        return this;
    }

    /**
     * Get the locations property: A list of locations.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: A list of locations.
     *
     * @param locations the locations value to set.
     * @return the ServiceAssociationLinkPropertiesFormat object itself.
     */
    public ServiceAssociationLinkPropertiesFormat withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
