// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/** Defines values for CallRecordingState. */
public final class CallRecordingState extends ExpandableStringEnum<CallRecordingState> {
    /** Static value active for CallRecordingState. */
    public static final CallRecordingState ACTIVE = fromString("active");

    /** Static value inactive for CallRecordingState. */
    public static final CallRecordingState INACTIVE = fromString("inactive");

    /**
     * Creates or finds a CallRecordingState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CallRecordingState.
     */
    @JsonCreator
    public static CallRecordingState fromString(String name) {
        return fromString(name, CallRecordingState.class);
    }

    /** @return known CallRecordingState values. */
    public static Collection<CallRecordingState> values() {
        return values(CallRecordingState.class);
    }
}
