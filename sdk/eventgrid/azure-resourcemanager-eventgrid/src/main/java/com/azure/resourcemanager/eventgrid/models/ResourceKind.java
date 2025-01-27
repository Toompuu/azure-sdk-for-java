// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceKind. */
public final class ResourceKind extends ExpandableStringEnum<ResourceKind> {
    /** Static value Azure for ResourceKind. */
    public static final ResourceKind AZURE = fromString("Azure");

    /** Static value AzureArc for ResourceKind. */
    public static final ResourceKind AZURE_ARC = fromString("AzureArc");

    /**
     * Creates or finds a ResourceKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceKind.
     */
    @JsonCreator
    public static ResourceKind fromString(String name) {
        return fromString(name, ResourceKind.class);
    }

    /**
     * Gets known ResourceKind values.
     *
     * @return known ResourceKind values.
     */
    public static Collection<ResourceKind> values() {
        return values(ResourceKind.class);
    }
}
