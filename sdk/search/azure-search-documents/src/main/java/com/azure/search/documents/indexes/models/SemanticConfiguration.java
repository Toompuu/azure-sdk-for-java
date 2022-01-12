// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines a specific configuration to be used in the context of semantic capabilities. */
@Fluent
public final class SemanticConfiguration {
    /*
     * The name of the semantic configuration.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Describes the title, content, and keyword fields to be used for semantic
     * ranking, captions, highlights, and answers. At least one of the three
     * sub properties (titleField, prioritizedKeywordsFields and
     * prioritizedContentFields) need to be set.
     */
    @JsonProperty(value = "prioritizedFields", required = true)
    private PrioritizedFields prioritizedFields;

    /**
     * Creates an instance of SemanticConfiguration class.
     *
     * @param name the name value to set.
     * @param prioritizedFields the prioritizedFields value to set.
     */
    @JsonCreator
    public SemanticConfiguration(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "prioritizedFields", required = true) PrioritizedFields prioritizedFields) {
        this.name = name;
        this.prioritizedFields = prioritizedFields;
    }

    /**
     * Get the name property: The name of the semantic configuration.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the prioritizedFields property: Describes the title, content, and keyword fields to be used for semantic
     * ranking, captions, highlights, and answers. At least one of the three sub properties (titleField,
     * prioritizedKeywordsFields and prioritizedContentFields) need to be set.
     *
     * @return the prioritizedFields value.
     */
    public PrioritizedFields getPrioritizedFields() {
        return this.prioritizedFields;
    }
}
