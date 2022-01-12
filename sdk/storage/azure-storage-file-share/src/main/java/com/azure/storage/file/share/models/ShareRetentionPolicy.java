// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The retention policy. */
@Fluent
@JacksonXmlRootElement(localName = "RetentionPolicy")
public final class ShareRetentionPolicy {

    /*
     * Indicates whether a retention policy is enabled for the File service. If
     * false, metrics data is retained, and the user is responsible for
     * deleting it.
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /*
     * Indicates the number of days that metrics data should be retained. All
     * data older than this value will be deleted. Metrics data is deleted on a
     * best-effort basis after the retention period expires.
     */
    @JsonProperty(value = "Days")
    private Integer days;

    /**
     * Get the enabled property: Indicates whether a retention policy is enabled for the File service. If false, metrics
     * data is retained, and the user is responsible for deleting it.
     *
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether a retention policy is enabled for the File service. If false, metrics
     * data is retained, and the user is responsible for deleting it.
     *
     * @param enabled the enabled value to set.
     * @return the ShareRetentionPolicy object itself.
     */
    public ShareRetentionPolicy setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days property: Indicates the number of days that metrics data should be retained. All data older than
     * this value will be deleted. Metrics data is deleted on a best-effort basis after the retention period expires.
     *
     * @return the days value.
     */
    public Integer getDays() {
        return this.days;
    }

    /**
     * Set the days property: Indicates the number of days that metrics data should be retained. All data older than
     * this value will be deleted. Metrics data is deleted on a best-effort basis after the retention period expires.
     *
     * @param days the days value to set.
     * @return the ShareRetentionPolicy object itself.
     */
    public ShareRetentionPolicy setDays(Integer days) {
        this.days = days;
        return this;
    }
}
