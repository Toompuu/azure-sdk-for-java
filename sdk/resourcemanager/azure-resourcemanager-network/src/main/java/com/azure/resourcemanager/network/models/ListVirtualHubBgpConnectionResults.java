// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.BgpConnectionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VirtualHubBgpConnections list. */
@Fluent
public final class ListVirtualHubBgpConnectionResults {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListVirtualHubBgpConnectionResults.class);

    /*
     * The list of VirtualHubBgpConnections.
     */
    @JsonProperty(value = "value")
    private List<BgpConnectionInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of VirtualHubBgpConnections.
     *
     * @return the value value.
     */
    public List<BgpConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of VirtualHubBgpConnections.
     *
     * @param value the value value to set.
     * @return the ListVirtualHubBgpConnectionResults object itself.
     */
    public ListVirtualHubBgpConnectionResults withValue(List<BgpConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListVirtualHubBgpConnectionResults object itself.
     */
    public ListVirtualHubBgpConnectionResults withNextLink(String nextLink) {
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
