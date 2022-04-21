// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** audioConferencing. */
@Fluent
public final class MicrosoftGraphAudioConferencing {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphAudioConferencing.class);

    /*
     * The conferenceId property.
     */
    @JsonProperty(value = "conferenceId")
    private String conferenceId;

    /*
     * A URL to the externally-accessible web page that contains dial-in
     * information.
     */
    @JsonProperty(value = "dialinUrl")
    private String dialinUrl;

    /*
     * The toll-free number that connects to the Audio Conference Provider.
     */
    @JsonProperty(value = "tollFreeNumber")
    private String tollFreeNumber;

    /*
     * The toll number that connects to the Audio Conference Provider.
     */
    @JsonProperty(value = "tollNumber")
    private String tollNumber;

    /*
     * audioConferencing
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the conferenceId property: The conferenceId property.
     *
     * @return the conferenceId value.
     */
    public String conferenceId() {
        return this.conferenceId;
    }

    /**
     * Set the conferenceId property: The conferenceId property.
     *
     * @param conferenceId the conferenceId value to set.
     * @return the MicrosoftGraphAudioConferencing object itself.
     */
    public MicrosoftGraphAudioConferencing withConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * Get the dialinUrl property: A URL to the externally-accessible web page that contains dial-in information.
     *
     * @return the dialinUrl value.
     */
    public String dialinUrl() {
        return this.dialinUrl;
    }

    /**
     * Set the dialinUrl property: A URL to the externally-accessible web page that contains dial-in information.
     *
     * @param dialinUrl the dialinUrl value to set.
     * @return the MicrosoftGraphAudioConferencing object itself.
     */
    public MicrosoftGraphAudioConferencing withDialinUrl(String dialinUrl) {
        this.dialinUrl = dialinUrl;
        return this;
    }

    /**
     * Get the tollFreeNumber property: The toll-free number that connects to the Audio Conference Provider.
     *
     * @return the tollFreeNumber value.
     */
    public String tollFreeNumber() {
        return this.tollFreeNumber;
    }

    /**
     * Set the tollFreeNumber property: The toll-free number that connects to the Audio Conference Provider.
     *
     * @param tollFreeNumber the tollFreeNumber value to set.
     * @return the MicrosoftGraphAudioConferencing object itself.
     */
    public MicrosoftGraphAudioConferencing withTollFreeNumber(String tollFreeNumber) {
        this.tollFreeNumber = tollFreeNumber;
        return this;
    }

    /**
     * Get the tollNumber property: The toll number that connects to the Audio Conference Provider.
     *
     * @return the tollNumber value.
     */
    public String tollNumber() {
        return this.tollNumber;
    }

    /**
     * Set the tollNumber property: The toll number that connects to the Audio Conference Provider.
     *
     * @param tollNumber the tollNumber value to set.
     * @return the MicrosoftGraphAudioConferencing object itself.
     */
    public MicrosoftGraphAudioConferencing withTollNumber(String tollNumber) {
        this.tollNumber = tollNumber;
        return this;
    }

    /**
     * Get the additionalProperties property: audioConferencing.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: audioConferencing.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAudioConferencing object itself.
     */
    public MicrosoftGraphAudioConferencing withAdditionalProperties(Map<String, Object> additionalProperties) {
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
