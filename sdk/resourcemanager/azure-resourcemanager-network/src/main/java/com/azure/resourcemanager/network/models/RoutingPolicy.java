// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The routing policy object used in a RoutingIntent resource. */
@Fluent
public final class RoutingPolicy {
    /*
     * The unique name for the routing policy.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * List of all destinations which this routing policy is applicable to (for
     * example: Internet, PrivateTraffic).
     */
    @JsonProperty(value = "destinations", required = true)
    private List<String> destinations;

    /*
     * The next hop resource id on which this routing policy is applicable to.
     */
    @JsonProperty(value = "nextHop", required = true)
    private String nextHop;

    /**
     * Get the name property: The unique name for the routing policy.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The unique name for the routing policy.
     *
     * @param name the name value to set.
     * @return the RoutingPolicy object itself.
     */
    public RoutingPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the destinations property: List of all destinations which this routing policy is applicable to (for example:
     * Internet, PrivateTraffic).
     *
     * @return the destinations value.
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: List of all destinations which this routing policy is applicable to (for example:
     * Internet, PrivateTraffic).
     *
     * @param destinations the destinations value to set.
     * @return the RoutingPolicy object itself.
     */
    public RoutingPolicy withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Get the nextHop property: The next hop resource id on which this routing policy is applicable to.
     *
     * @return the nextHop value.
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Set the nextHop property: The next hop resource id on which this routing policy is applicable to.
     *
     * @param nextHop the nextHop value to set.
     * @return the RoutingPolicy object itself.
     */
    public RoutingPolicy withNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model RoutingPolicy"));
        }
        if (destinations() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property destinations in model RoutingPolicy"));
        }
        if (nextHop() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property nextHop in model RoutingPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoutingPolicy.class);
}
