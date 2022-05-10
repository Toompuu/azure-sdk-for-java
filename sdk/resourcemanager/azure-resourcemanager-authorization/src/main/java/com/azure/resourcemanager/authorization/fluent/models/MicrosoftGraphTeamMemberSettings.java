// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** teamMemberSettings. */
@Fluent
public final class MicrosoftGraphTeamMemberSettings {
    /*
     * If set to true, members can add and remove apps.
     */
    @JsonProperty(value = "allowAddRemoveApps")
    private Boolean allowAddRemoveApps;

    /*
     * If set to true, members can add and update private channels.
     */
    @JsonProperty(value = "allowCreatePrivateChannels")
    private Boolean allowCreatePrivateChannels;

    /*
     * If set to true, members can add and update channels.
     */
    @JsonProperty(value = "allowCreateUpdateChannels")
    private Boolean allowCreateUpdateChannels;

    /*
     * If set to true, members can add, update, and remove connectors.
     */
    @JsonProperty(value = "allowCreateUpdateRemoveConnectors")
    private Boolean allowCreateUpdateRemoveConnectors;

    /*
     * If set to true, members can add, update, and remove tabs.
     */
    @JsonProperty(value = "allowCreateUpdateRemoveTabs")
    private Boolean allowCreateUpdateRemoveTabs;

    /*
     * If set to true, members can delete channels.
     */
    @JsonProperty(value = "allowDeleteChannels")
    private Boolean allowDeleteChannels;

    /*
     * teamMemberSettings
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the allowAddRemoveApps property: If set to true, members can add and remove apps.
     *
     * @return the allowAddRemoveApps value.
     */
    public Boolean allowAddRemoveApps() {
        return this.allowAddRemoveApps;
    }

    /**
     * Set the allowAddRemoveApps property: If set to true, members can add and remove apps.
     *
     * @param allowAddRemoveApps the allowAddRemoveApps value to set.
     * @return the MicrosoftGraphTeamMemberSettings object itself.
     */
    public MicrosoftGraphTeamMemberSettings withAllowAddRemoveApps(Boolean allowAddRemoveApps) {
        this.allowAddRemoveApps = allowAddRemoveApps;
        return this;
    }

    /**
     * Get the allowCreatePrivateChannels property: If set to true, members can add and update private channels.
     *
     * @return the allowCreatePrivateChannels value.
     */
    public Boolean allowCreatePrivateChannels() {
        return this.allowCreatePrivateChannels;
    }

    /**
     * Set the allowCreatePrivateChannels property: If set to true, members can add and update private channels.
     *
     * @param allowCreatePrivateChannels the allowCreatePrivateChannels value to set.
     * @return the MicrosoftGraphTeamMemberSettings object itself.
     */
    public MicrosoftGraphTeamMemberSettings withAllowCreatePrivateChannels(Boolean allowCreatePrivateChannels) {
        this.allowCreatePrivateChannels = allowCreatePrivateChannels;
        return this;
    }

    /**
     * Get the allowCreateUpdateChannels property: If set to true, members can add and update channels.
     *
     * @return the allowCreateUpdateChannels value.
     */
    public Boolean allowCreateUpdateChannels() {
        return this.allowCreateUpdateChannels;
    }

    /**
     * Set the allowCreateUpdateChannels property: If set to true, members can add and update channels.
     *
     * @param allowCreateUpdateChannels the allowCreateUpdateChannels value to set.
     * @return the MicrosoftGraphTeamMemberSettings object itself.
     */
    public MicrosoftGraphTeamMemberSettings withAllowCreateUpdateChannels(Boolean allowCreateUpdateChannels) {
        this.allowCreateUpdateChannels = allowCreateUpdateChannels;
        return this;
    }

    /**
     * Get the allowCreateUpdateRemoveConnectors property: If set to true, members can add, update, and remove
     * connectors.
     *
     * @return the allowCreateUpdateRemoveConnectors value.
     */
    public Boolean allowCreateUpdateRemoveConnectors() {
        return this.allowCreateUpdateRemoveConnectors;
    }

    /**
     * Set the allowCreateUpdateRemoveConnectors property: If set to true, members can add, update, and remove
     * connectors.
     *
     * @param allowCreateUpdateRemoveConnectors the allowCreateUpdateRemoveConnectors value to set.
     * @return the MicrosoftGraphTeamMemberSettings object itself.
     */
    public MicrosoftGraphTeamMemberSettings withAllowCreateUpdateRemoveConnectors(
        Boolean allowCreateUpdateRemoveConnectors) {
        this.allowCreateUpdateRemoveConnectors = allowCreateUpdateRemoveConnectors;
        return this;
    }

    /**
     * Get the allowCreateUpdateRemoveTabs property: If set to true, members can add, update, and remove tabs.
     *
     * @return the allowCreateUpdateRemoveTabs value.
     */
    public Boolean allowCreateUpdateRemoveTabs() {
        return this.allowCreateUpdateRemoveTabs;
    }

    /**
     * Set the allowCreateUpdateRemoveTabs property: If set to true, members can add, update, and remove tabs.
     *
     * @param allowCreateUpdateRemoveTabs the allowCreateUpdateRemoveTabs value to set.
     * @return the MicrosoftGraphTeamMemberSettings object itself.
     */
    public MicrosoftGraphTeamMemberSettings withAllowCreateUpdateRemoveTabs(Boolean allowCreateUpdateRemoveTabs) {
        this.allowCreateUpdateRemoveTabs = allowCreateUpdateRemoveTabs;
        return this;
    }

    /**
     * Get the allowDeleteChannels property: If set to true, members can delete channels.
     *
     * @return the allowDeleteChannels value.
     */
    public Boolean allowDeleteChannels() {
        return this.allowDeleteChannels;
    }

    /**
     * Set the allowDeleteChannels property: If set to true, members can delete channels.
     *
     * @param allowDeleteChannels the allowDeleteChannels value to set.
     * @return the MicrosoftGraphTeamMemberSettings object itself.
     */
    public MicrosoftGraphTeamMemberSettings withAllowDeleteChannels(Boolean allowDeleteChannels) {
        this.allowDeleteChannels = allowDeleteChannels;
        return this;
    }

    /**
     * Get the additionalProperties property: teamMemberSettings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: teamMemberSettings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTeamMemberSettings object itself.
     */
    public MicrosoftGraphTeamMemberSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
