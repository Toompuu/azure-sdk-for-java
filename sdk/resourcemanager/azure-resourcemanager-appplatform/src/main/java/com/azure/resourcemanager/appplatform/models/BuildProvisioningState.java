// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BuildProvisioningState. */
public final class BuildProvisioningState extends ExpandableStringEnum<BuildProvisioningState> {
    /** Static value Creating for BuildProvisioningState. */
    public static final BuildProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for BuildProvisioningState. */
    public static final BuildProvisioningState UPDATING = fromString("Updating");

    /** Static value Succeeded for BuildProvisioningState. */
    public static final BuildProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for BuildProvisioningState. */
    public static final BuildProvisioningState FAILED = fromString("Failed");

    /** Static value Deleting for BuildProvisioningState. */
    public static final BuildProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a BuildProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BuildProvisioningState.
     */
    @JsonCreator
    public static BuildProvisioningState fromString(String name) {
        return fromString(name, BuildProvisioningState.class);
    }

    /** @return known BuildProvisioningState values. */
    public static Collection<BuildProvisioningState> values() {
        return values(BuildProvisioningState.class);
    }
}
