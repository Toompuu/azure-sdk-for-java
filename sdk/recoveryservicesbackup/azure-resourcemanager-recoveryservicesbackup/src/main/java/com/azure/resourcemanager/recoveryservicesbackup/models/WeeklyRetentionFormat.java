// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Weekly retention format. */
@Fluent
public final class WeeklyRetentionFormat {
    /*
     * List of days of the week.
     */
    @JsonProperty(value = "daysOfTheWeek")
    private List<DayOfWeek> daysOfTheWeek;

    /*
     * List of weeks of month.
     */
    @JsonProperty(value = "weeksOfTheMonth")
    private List<WeekOfMonth> weeksOfTheMonth;

    /**
     * Get the daysOfTheWeek property: List of days of the week.
     *
     * @return the daysOfTheWeek value.
     */
    public List<DayOfWeek> daysOfTheWeek() {
        return this.daysOfTheWeek;
    }

    /**
     * Set the daysOfTheWeek property: List of days of the week.
     *
     * @param daysOfTheWeek the daysOfTheWeek value to set.
     * @return the WeeklyRetentionFormat object itself.
     */
    public WeeklyRetentionFormat withDaysOfTheWeek(List<DayOfWeek> daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
        return this;
    }

    /**
     * Get the weeksOfTheMonth property: List of weeks of month.
     *
     * @return the weeksOfTheMonth value.
     */
    public List<WeekOfMonth> weeksOfTheMonth() {
        return this.weeksOfTheMonth;
    }

    /**
     * Set the weeksOfTheMonth property: List of weeks of month.
     *
     * @param weeksOfTheMonth the weeksOfTheMonth value to set.
     * @return the WeeklyRetentionFormat object itself.
     */
    public WeeklyRetentionFormat withWeeksOfTheMonth(List<WeekOfMonth> weeksOfTheMonth) {
        this.weeksOfTheMonth = weeksOfTheMonth;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
