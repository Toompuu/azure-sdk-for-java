// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appcontainers.fluent.models.ReplicaInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of Replica. */
public interface Replica {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the createdTime property: Timestamp describing when the pod was created by controller.
     *
     * @return the createdTime value.
     */
    OffsetDateTime createdTime();

    /**
     * Gets the containers property: The containers collection under a replica.
     *
     * @return the containers value.
     */
    List<ReplicaContainer> containers();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.ReplicaInner object.
     *
     * @return the inner object.
     */
    ReplicaInner innerModel();
}
