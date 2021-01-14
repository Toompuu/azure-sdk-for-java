/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MatchVariable.
 */
public final class MatchVariable extends ExpandableStringEnum<MatchVariable> {
    /** Static value RemoteAddr for MatchVariable. */
    public static final MatchVariable REMOTE_ADDR = fromString("RemoteAddr");

    /** Static value SocketAddr for MatchVariable. */
    public static final MatchVariable SOCKET_ADDR = fromString("SocketAddr");

    /** Static value RequestMethod for MatchVariable. */
    public static final MatchVariable REQUEST_METHOD = fromString("RequestMethod");

    /** Static value RequestHeader for MatchVariable. */
    public static final MatchVariable REQUEST_HEADER = fromString("RequestHeader");

    /** Static value RequestUri for MatchVariable. */
    public static final MatchVariable REQUEST_URI = fromString("RequestUri");

    /** Static value QueryString for MatchVariable. */
    public static final MatchVariable QUERY_STRING = fromString("QueryString");

    /** Static value RequestBody for MatchVariable. */
    public static final MatchVariable REQUEST_BODY = fromString("RequestBody");

    /** Static value Cookies for MatchVariable. */
    public static final MatchVariable COOKIES = fromString("Cookies");

    /** Static value PostArgs for MatchVariable. */
    public static final MatchVariable POST_ARGS = fromString("PostArgs");

    /**
     * Creates or finds a MatchVariable from its string representation.
     * @param name a name to look for
     * @return the corresponding MatchVariable
     */
    @JsonCreator
    public static MatchVariable fromString(String name) {
        return fromString(name, MatchVariable.class);
    }

    /**
     * @return known MatchVariable values
     */
    public static Collection<MatchVariable> values() {
        return values(MatchVariable.class);
    }
}
