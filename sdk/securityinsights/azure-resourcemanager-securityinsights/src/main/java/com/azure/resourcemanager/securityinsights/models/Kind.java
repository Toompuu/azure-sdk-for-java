// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Kind. */
public final class Kind extends ExpandableStringEnum<Kind> {
    /** Static value DataConnector for Kind. */
    public static final Kind DATA_CONNECTOR = fromString("DataConnector");

    /** Static value DataType for Kind. */
    public static final Kind DATA_TYPE = fromString("DataType");

    /** Static value Workbook for Kind. */
    public static final Kind WORKBOOK = fromString("Workbook");

    /** Static value WorkbookTemplate for Kind. */
    public static final Kind WORKBOOK_TEMPLATE = fromString("WorkbookTemplate");

    /** Static value Playbook for Kind. */
    public static final Kind PLAYBOOK = fromString("Playbook");

    /** Static value PlaybookTemplate for Kind. */
    public static final Kind PLAYBOOK_TEMPLATE = fromString("PlaybookTemplate");

    /** Static value AnalyticsRuleTemplate for Kind. */
    public static final Kind ANALYTICS_RULE_TEMPLATE = fromString("AnalyticsRuleTemplate");

    /** Static value AnalyticsRule for Kind. */
    public static final Kind ANALYTICS_RULE = fromString("AnalyticsRule");

    /** Static value HuntingQuery for Kind. */
    public static final Kind HUNTING_QUERY = fromString("HuntingQuery");

    /** Static value InvestigationQuery for Kind. */
    public static final Kind INVESTIGATION_QUERY = fromString("InvestigationQuery");

    /** Static value Parser for Kind. */
    public static final Kind PARSER = fromString("Parser");

    /** Static value Watchlist for Kind. */
    public static final Kind WATCHLIST = fromString("Watchlist");

    /** Static value WatchlistTemplate for Kind. */
    public static final Kind WATCHLIST_TEMPLATE = fromString("WatchlistTemplate");

    /** Static value Solution for Kind. */
    public static final Kind SOLUTION = fromString("Solution");

    /** Static value AzureFunction for Kind. */
    public static final Kind AZURE_FUNCTION = fromString("AzureFunction");

    /** Static value LogicAppsCustomConnector for Kind. */
    public static final Kind LOGIC_APPS_CUSTOM_CONNECTOR = fromString("LogicAppsCustomConnector");

    /** Static value AutomationRule for Kind. */
    public static final Kind AUTOMATION_RULE = fromString("AutomationRule");

    /**
     * Creates or finds a Kind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Kind.
     */
    @JsonCreator
    public static Kind fromString(String name) {
        return fromString(name, Kind.class);
    }

    /** @return known Kind values. */
    public static Collection<Kind> values() {
        return values(Kind.class);
    }
}
