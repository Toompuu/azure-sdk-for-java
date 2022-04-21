// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base type for all Presets, which define the recipe or instructions on how the input media files should be processed.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata\\.type",
    defaultImpl = Preset.class)
@JsonTypeName("Preset")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.FaceDetectorPreset", value = FaceDetectorPreset.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.AudioAnalyzerPreset", value = AudioAnalyzerPreset.class),
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.BuiltInStandardEncoderPreset",
        value = BuiltInStandardEncoderPreset.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.StandardEncoderPreset", value = StandardEncoderPreset.class)
})
@JsonFlatten
@Immutable
public class Preset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Preset.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
