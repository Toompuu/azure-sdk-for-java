// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Azure Data Factory nested object which contains the information and credential which can be used to connect with
 * related store or compute resource.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = Credential.class)
@JsonTypeName("Credential")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ServicePrincipal", value = ServicePrincipalCredential.class),
    @JsonSubTypes.Type(name = "ManagedIdentity", value = ManagedIdentityCredential.class)
})
@Fluent
public class Credential {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Credential.class);

    /*
     * Credential description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * List of tags that can be used for describing the Credential.
     */
    @JsonProperty(value = "annotations")
    private List<Object> annotations;

    /*
     * The Azure Data Factory nested object which contains the information and
     * credential which can be used to connect with related store or compute
     * resource.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the description property: Credential description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Credential description.
     *
     * @param description the description value to set.
     * @return the Credential object itself.
     */
    public Credential withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the annotations property: List of tags that can be used for describing the Credential.
     *
     * @return the annotations value.
     */
    public List<Object> annotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: List of tags that can be used for describing the Credential.
     *
     * @param annotations the annotations value to set.
     * @return the Credential object itself.
     */
    public Credential withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the additionalProperties property: The Azure Data Factory nested object which contains the information and
     * credential which can be used to connect with related store or compute resource.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The Azure Data Factory nested object which contains the information and
     * credential which can be used to connect with related store or compute resource.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the Credential object itself.
     */
    public Credential withAdditionalProperties(Map<String, Object> additionalProperties) {
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
