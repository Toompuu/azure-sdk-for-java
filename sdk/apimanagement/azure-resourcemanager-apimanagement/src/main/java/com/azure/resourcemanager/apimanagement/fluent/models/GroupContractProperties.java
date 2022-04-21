// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.GroupType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Group contract Properties. */
@Fluent
public final class GroupContractProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GroupContractProperties.class);

    /*
     * Group name.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Group description. Can contain HTML formatting tags.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * true if the group is one of the three system groups (Administrators,
     * Developers, or Guests); otherwise false.
     */
    @JsonProperty(value = "builtIn", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean builtIn;

    /*
     * Group type.
     */
    @JsonProperty(value = "type")
    private GroupType type;

    /*
     * For external groups, this property contains the id of the group from the
     * external identity provider, e.g. for Azure Active Directory
     * `aad://<tenant>.onmicrosoft.com/groups/<group object id>`; otherwise the
     * value is null.
     */
    @JsonProperty(value = "externalId")
    private String externalId;

    /**
     * Get the displayName property: Group name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Group name.
     *
     * @param displayName the displayName value to set.
     * @return the GroupContractProperties object itself.
     */
    public GroupContractProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: Group description. Can contain HTML formatting tags.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Group description. Can contain HTML formatting tags.
     *
     * @param description the description value to set.
     * @return the GroupContractProperties object itself.
     */
    public GroupContractProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the builtIn property: true if the group is one of the three system groups (Administrators, Developers, or
     * Guests); otherwise false.
     *
     * @return the builtIn value.
     */
    public Boolean builtIn() {
        return this.builtIn;
    }

    /**
     * Get the type property: Group type.
     *
     * @return the type value.
     */
    public GroupType type() {
        return this.type;
    }

    /**
     * Set the type property: Group type.
     *
     * @param type the type value to set.
     * @return the GroupContractProperties object itself.
     */
    public GroupContractProperties withType(GroupType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the externalId property: For external groups, this property contains the id of the group from the external
     * identity provider, e.g. for Azure Active Directory `aad://&lt;tenant&gt;.onmicrosoft.com/groups/&lt;group object
     * id&gt;`; otherwise the value is null.
     *
     * @return the externalId value.
     */
    public String externalId() {
        return this.externalId;
    }

    /**
     * Set the externalId property: For external groups, this property contains the id of the group from the external
     * identity provider, e.g. for Azure Active Directory `aad://&lt;tenant&gt;.onmicrosoft.com/groups/&lt;group object
     * id&gt;`; otherwise the value is null.
     *
     * @param externalId the externalId value to set.
     * @return the GroupContractProperties object itself.
     */
    public GroupContractProperties withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (displayName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model GroupContractProperties"));
        }
    }
}
