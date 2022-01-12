// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WebhookAction. */
public final class WebhookAction extends ExpandableStringEnum<WebhookAction> {
    /** Static value push for WebhookAction. */
    public static final WebhookAction PUSH = fromString("push");

    /** Static value delete for WebhookAction. */
    public static final WebhookAction DELETE = fromString("delete");

    /** Static value quarantine for WebhookAction. */
    public static final WebhookAction QUARANTINE = fromString("quarantine");

    /** Static value chart_push for WebhookAction. */
    public static final WebhookAction CHART_PUSH = fromString("chart_push");

    /** Static value chart_delete for WebhookAction. */
    public static final WebhookAction CHART_DELETE = fromString("chart_delete");

    /**
     * Creates or finds a WebhookAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WebhookAction.
     */
    @JsonCreator
    public static WebhookAction fromString(String name) {
        return fromString(name, WebhookAction.class);
    }

    /** @return known WebhookAction values. */
    public static Collection<WebhookAction> values() {
        return values(WebhookAction.class);
    }
}
