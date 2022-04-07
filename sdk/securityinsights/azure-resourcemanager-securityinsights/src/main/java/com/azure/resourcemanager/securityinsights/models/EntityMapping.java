// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Single entity mapping for the alert rule. */
@Fluent
public final class EntityMapping {
    /*
     * The V3 type of the mapped entity
     */
    @JsonProperty(value = "entityType")
    private EntityMappingType entityType;

    /*
     * array of field mappings for the given entity mapping
     */
    @JsonProperty(value = "fieldMappings")
    private List<FieldMapping> fieldMappings;

    /**
     * Get the entityType property: The V3 type of the mapped entity.
     *
     * @return the entityType value.
     */
    public EntityMappingType entityType() {
        return this.entityType;
    }

    /**
     * Set the entityType property: The V3 type of the mapped entity.
     *
     * @param entityType the entityType value to set.
     * @return the EntityMapping object itself.
     */
    public EntityMapping withEntityType(EntityMappingType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get the fieldMappings property: array of field mappings for the given entity mapping.
     *
     * @return the fieldMappings value.
     */
    public List<FieldMapping> fieldMappings() {
        return this.fieldMappings;
    }

    /**
     * Set the fieldMappings property: array of field mappings for the given entity mapping.
     *
     * @param fieldMappings the fieldMappings value to set.
     * @return the EntityMapping object itself.
     */
    public EntityMapping withFieldMappings(List<FieldMapping> fieldMappings) {
        this.fieldMappings = fieldMappings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fieldMappings() != null) {
            fieldMappings().forEach(e -> e.validate());
        }
    }
}
