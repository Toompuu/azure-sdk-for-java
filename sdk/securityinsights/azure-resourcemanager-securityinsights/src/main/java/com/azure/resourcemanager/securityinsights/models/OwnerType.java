// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OwnerType. */
public final class OwnerType extends ExpandableStringEnum<OwnerType> {
    /** Static value Unknown for OwnerType. */
    public static final OwnerType UNKNOWN = fromString("Unknown");

    /** Static value User for OwnerType. */
    public static final OwnerType USER = fromString("User");

    /** Static value Group for OwnerType. */
    public static final OwnerType GROUP = fromString("Group");

    /**
     * Creates or finds a OwnerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OwnerType.
     */
    @JsonCreator
    public static OwnerType fromString(String name) {
        return fromString(name, OwnerType.class);
    }

    /**
     * Gets known OwnerType values.
     *
     * @return known OwnerType values.
     */
    public static Collection<OwnerType> values() {
        return values(OwnerType.class);
    }
}
