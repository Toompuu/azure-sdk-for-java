// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes Advanced Audio Codec (AAC) audio encoding settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.AacAudio")
@JsonFlatten
@Fluent
public class AacAudio extends Audio {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AacAudio.class);

    /*
     * The encoding profile to be used when encoding audio with AAC.
     */
    @JsonProperty(value = "profile")
    private AacAudioProfile profile;

    /**
     * Get the profile property: The encoding profile to be used when encoding audio with AAC.
     *
     * @return the profile value.
     */
    public AacAudioProfile profile() {
        return this.profile;
    }

    /**
     * Set the profile property: The encoding profile to be used when encoding audio with AAC.
     *
     * @param profile the profile value to set.
     * @return the AacAudio object itself.
     */
    public AacAudio withProfile(AacAudioProfile profile) {
        this.profile = profile;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AacAudio withChannels(Integer channels) {
        super.withChannels(channels);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AacAudio withSamplingRate(Integer samplingRate) {
        super.withSamplingRate(samplingRate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AacAudio withBitrate(Integer bitrate) {
        super.withBitrate(bitrate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AacAudio withLabel(String label) {
        super.withLabel(label);
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
