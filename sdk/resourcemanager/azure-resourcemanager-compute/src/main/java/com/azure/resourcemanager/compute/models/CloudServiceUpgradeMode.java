// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CloudServiceUpgradeMode. */
public final class CloudServiceUpgradeMode extends ExpandableStringEnum<CloudServiceUpgradeMode> {
    /** Static value Auto for CloudServiceUpgradeMode. */
    public static final CloudServiceUpgradeMode AUTO = fromString("Auto");

    /** Static value Manual for CloudServiceUpgradeMode. */
    public static final CloudServiceUpgradeMode MANUAL = fromString("Manual");

    /** Static value Simultaneous for CloudServiceUpgradeMode. */
    public static final CloudServiceUpgradeMode SIMULTANEOUS = fromString("Simultaneous");

    /**
     * Creates or finds a CloudServiceUpgradeMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CloudServiceUpgradeMode.
     */
    @JsonCreator
    public static CloudServiceUpgradeMode fromString(String name) {
        return fromString(name, CloudServiceUpgradeMode.class);
    }

    /**
     * Gets known CloudServiceUpgradeMode values.
     *
     * @return known CloudServiceUpgradeMode values.
     */
    public static Collection<CloudServiceUpgradeMode> values() {
        return values(CloudServiceUpgradeMode.class);
    }
}
