// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ResourceGuardProxyBaseResourceInner;
import java.util.Map;

/** An immutable client-side representation of ResourceGuardProxyBaseResource. */
public interface ResourceGuardProxyBaseResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: ResourceGuardProxyBaseResource properties.
     *
     * @return the properties value.
     */
    ResourceGuardProxyBase properties();

    /**
     * Gets the etag property: Optional ETag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ResourceGuardProxyBaseResourceInner
     * object.
     *
     * @return the inner object.
     */
    ResourceGuardProxyBaseResourceInner innerModel();
}
