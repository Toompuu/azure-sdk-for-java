// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** The workflow trigger recurrence. */
@Fluent
public final class ScheduleTriggerRecurrence {
    /*
     * The frequency.
     */
    @JsonProperty(value = "frequency")
    private RecurrenceFrequency frequency;

    /*
     * The interval.
     */
    @JsonProperty(value = "interval")
    private Integer interval;

    /*
     * The start time.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The time zone.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * The recurrence schedule.
     */
    @JsonProperty(value = "schedule")
    private RecurrenceSchedule schedule;

    /*
     * The workflow trigger recurrence.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the frequency property: The frequency.
     *
     * @return the frequency value.
     */
    public RecurrenceFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: The frequency.
     *
     * @param frequency the frequency value to set.
     * @return the ScheduleTriggerRecurrence object itself.
     */
    public ScheduleTriggerRecurrence withFrequency(RecurrenceFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the interval property: The interval.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval.
     *
     * @param interval the interval value to set.
     * @return the ScheduleTriggerRecurrence object itself.
     */
    public ScheduleTriggerRecurrence withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the startTime property: The start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time.
     *
     * @param startTime the startTime value to set.
     * @return the ScheduleTriggerRecurrence object itself.
     */
    public ScheduleTriggerRecurrence withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time.
     *
     * @param endTime the endTime value to set.
     * @return the ScheduleTriggerRecurrence object itself.
     */
    public ScheduleTriggerRecurrence withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the timeZone property: The time zone.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: The time zone.
     *
     * @param timeZone the timeZone value to set.
     * @return the ScheduleTriggerRecurrence object itself.
     */
    public ScheduleTriggerRecurrence withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the schedule property: The recurrence schedule.
     *
     * @return the schedule value.
     */
    public RecurrenceSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: The recurrence schedule.
     *
     * @param schedule the schedule value to set.
     * @return the ScheduleTriggerRecurrence object itself.
     */
    public ScheduleTriggerRecurrence withSchedule(RecurrenceSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the additionalProperties property: The workflow trigger recurrence.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The workflow trigger recurrence.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ScheduleTriggerRecurrence object itself.
     */
    public ScheduleTriggerRecurrence withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schedule() != null) {
            schedule().validate();
        }
    }
}
