// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the list policy operation. */
@Fluent
public final class PolicyCollectionInner {
    /*
     * Policy Contract value.
     */
    @JsonProperty(value = "value")
    private List<PolicyContractInner> value;

    /*
     * Total record count number.
     */
    @JsonProperty(value = "count")
    private Long count;

    /*
     * Next page link if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Policy Contract value.
     *
     * @return the value value.
     */
    public List<PolicyContractInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Policy Contract value.
     *
     * @param value the value value to set.
     * @return the PolicyCollectionInner object itself.
     */
    public PolicyCollectionInner withValue(List<PolicyContractInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the count property: Total record count number.
     *
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total record count number.
     *
     * @param count the count value to set.
     * @return the PolicyCollectionInner object itself.
     */
    public PolicyCollectionInner withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the nextLink property: Next page link if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Next page link if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the PolicyCollectionInner object itself.
     */
    public PolicyCollectionInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
