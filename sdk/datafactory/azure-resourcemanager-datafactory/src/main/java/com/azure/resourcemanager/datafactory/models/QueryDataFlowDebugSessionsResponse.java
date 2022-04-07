// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugSessionInfoInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of active debug sessions. */
@Fluent
public final class QueryDataFlowDebugSessionsResponse {
    /*
     * Array with all active debug sessions.
     */
    @JsonProperty(value = "value")
    private List<DataFlowDebugSessionInfoInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Array with all active debug sessions.
     *
     * @return the value value.
     */
    public List<DataFlowDebugSessionInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array with all active debug sessions.
     *
     * @param value the value value to set.
     * @return the QueryDataFlowDebugSessionsResponse object itself.
     */
    public QueryDataFlowDebugSessionsResponse withValue(List<DataFlowDebugSessionInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @param nextLink the nextLink value to set.
     * @return the QueryDataFlowDebugSessionsResponse object itself.
     */
    public QueryDataFlowDebugSessionsResponse withNextLink(String nextLink) {
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
