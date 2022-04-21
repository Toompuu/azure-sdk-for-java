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
import java.time.Duration;

/**
 * Specifies the clip time as an absolute time position in the media file. The absolute time can point to a different
 * position depending on whether the media file starts from a timestamp of zero or not.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.AbsoluteClipTime")
@JsonFlatten
@Fluent
public class AbsoluteClipTime extends ClipTime {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AbsoluteClipTime.class);

    /*
     * The time position on the timeline of the input media. It is usually
     * specified as an ISO8601 period. e.g PT30S for 30 seconds.
     */
    @JsonProperty(value = "time", required = true)
    private Duration time;

    /**
     * Get the time property: The time position on the timeline of the input media. It is usually specified as an
     * ISO8601 period. e.g PT30S for 30 seconds.
     *
     * @return the time value.
     */
    public Duration time() {
        return this.time;
    }

    /**
     * Set the time property: The time position on the timeline of the input media. It is usually specified as an
     * ISO8601 period. e.g PT30S for 30 seconds.
     *
     * @param time the time value to set.
     * @return the AbsoluteClipTime object itself.
     */
    public AbsoluteClipTime withTime(Duration time) {
        this.time = time;
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
        if (time() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property time in model AbsoluteClipTime"));
        }
    }
}
