// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.VirtualHubRouteTableV2Inner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of VirtualHubRouteTableV2s and a URL nextLink to get the next set of results. */
@Fluent
public final class ListVirtualHubRouteTableV2SResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListVirtualHubRouteTableV2SResult.class);

    /*
     * List of VirtualHubRouteTableV2s.
     */
    @JsonProperty(value = "value")
    private List<VirtualHubRouteTableV2Inner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of VirtualHubRouteTableV2s.
     *
     * @return the value value.
     */
    public List<VirtualHubRouteTableV2Inner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of VirtualHubRouteTableV2s.
     *
     * @param value the value value to set.
     * @return the ListVirtualHubRouteTableV2SResult object itself.
     */
    public ListVirtualHubRouteTableV2SResult withValue(List<VirtualHubRouteTableV2Inner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListVirtualHubRouteTableV2SResult object itself.
     */
    public ListVirtualHubRouteTableV2SResult withNextLink(String nextLink) {
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
