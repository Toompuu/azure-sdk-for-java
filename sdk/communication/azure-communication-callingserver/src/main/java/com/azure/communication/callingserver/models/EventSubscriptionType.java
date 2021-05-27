// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/** Defines values for EventSubscriptionType. */
public final class EventSubscriptionType extends ExpandableStringEnum<EventSubscriptionType> {
    /** Static value participantsUpdated for EventSubscriptionType. */
    public static final EventSubscriptionType PARTICIPANTS_UPDATED = fromString("participantsUpdated");

    /** Static value dtmfReceived for EventSubscriptionType. */
    public static final EventSubscriptionType DTMF_RECEIVED = fromString("dtmfReceived");

    /**
     * Creates or finds a EventSubscriptionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventSubscriptionType.
     */
    @JsonCreator
    public static EventSubscriptionType fromString(String name) {
        return fromString(name, EventSubscriptionType.class);
    }

    /** @return known EventSubscriptionType values. */
    public static Collection<EventSubscriptionType> values() {
        return values(EventSubscriptionType.class);
    }
}
