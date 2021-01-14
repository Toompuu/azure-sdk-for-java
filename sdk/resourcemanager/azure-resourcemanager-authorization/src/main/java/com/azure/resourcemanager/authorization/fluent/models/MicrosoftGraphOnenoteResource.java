// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** onenoteResource. */
@Fluent
public final class MicrosoftGraphOnenoteResource extends MicrosoftGraphOnenoteEntityBaseModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOnenoteResource.class);

    /*
     * The content stream
     */
    @JsonProperty(value = "content")
    private Base64Url content;

    /*
     * The URL for downloading the content
     */
    @JsonProperty(value = "contentUrl")
    private String contentUrl;

    /*
     * onenoteResource
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the content property: The content stream.
     *
     * @return the content value.
     */
    public byte[] content() {
        if (this.content == null) {
            return null;
        }
        return this.content.decodedBytes();
    }

    /**
     * Set the content property: The content stream.
     *
     * @param content the content value to set.
     * @return the MicrosoftGraphOnenoteResource object itself.
     */
    public MicrosoftGraphOnenoteResource withContent(byte[] content) {
        if (content == null) {
            this.content = null;
        } else {
            this.content = Base64Url.encode(CoreUtils.clone(content));
        }
        return this;
    }

    /**
     * Get the contentUrl property: The URL for downloading the content.
     *
     * @return the contentUrl value.
     */
    public String contentUrl() {
        return this.contentUrl;
    }

    /**
     * Set the contentUrl property: The URL for downloading the content.
     *
     * @param contentUrl the contentUrl value to set.
     * @return the MicrosoftGraphOnenoteResource object itself.
     */
    public MicrosoftGraphOnenoteResource withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * Get the additionalProperties property: onenoteResource.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onenoteResource.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnenoteResource object itself.
     */
    public MicrosoftGraphOnenoteResource withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOnenoteResource withSelf(String self) {
        super.withSelf(self);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOnenoteResource withId(String id) {
        super.withId(id);
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
