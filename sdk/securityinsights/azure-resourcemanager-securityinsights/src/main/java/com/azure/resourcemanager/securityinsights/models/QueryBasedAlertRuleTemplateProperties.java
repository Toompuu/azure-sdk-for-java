// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Query based alert rule template base property bag. */
@Fluent
public class QueryBasedAlertRuleTemplateProperties {
    /*
     * The query that creates alerts for this rule.
     */
    @JsonProperty(value = "query")
    private String query;

    /*
     * The severity for alerts created by this alert rule.
     */
    @JsonProperty(value = "severity")
    private AlertSeverity severity;

    /*
     * The version of this template - in format <a.b.c>, where all are numbers.
     * For example <1.0.2>.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Dictionary of string key-value pairs of columns to be attached to the
     * alert
     */
    @JsonProperty(value = "customDetails")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> customDetails;

    /*
     * Array of the entity mappings of the alert rule
     */
    @JsonProperty(value = "entityMappings")
    private List<EntityMapping> entityMappings;

    /*
     * The alert details override settings
     */
    @JsonProperty(value = "alertDetailsOverride")
    private AlertDetailsOverride alertDetailsOverride;

    /**
     * Get the query property: The query that creates alerts for this rule.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: The query that creates alerts for this rule.
     *
     * @param query the query value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the severity property: The severity for alerts created by this alert rule.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity for alerts created by this alert rule.
     *
     * @param severity the severity value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the version property: The version of this template - in format &lt;a.b.c&gt;, where all are numbers. For
     * example &lt;1.0.2&gt;.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of this template - in format &lt;a.b.c&gt;, where all are numbers. For
     * example &lt;1.0.2&gt;.
     *
     * @param version the version value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the customDetails property: Dictionary of string key-value pairs of columns to be attached to the alert.
     *
     * @return the customDetails value.
     */
    public Map<String, String> customDetails() {
        return this.customDetails;
    }

    /**
     * Set the customDetails property: Dictionary of string key-value pairs of columns to be attached to the alert.
     *
     * @param customDetails the customDetails value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withCustomDetails(Map<String, String> customDetails) {
        this.customDetails = customDetails;
        return this;
    }

    /**
     * Get the entityMappings property: Array of the entity mappings of the alert rule.
     *
     * @return the entityMappings value.
     */
    public List<EntityMapping> entityMappings() {
        return this.entityMappings;
    }

    /**
     * Set the entityMappings property: Array of the entity mappings of the alert rule.
     *
     * @param entityMappings the entityMappings value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withEntityMappings(List<EntityMapping> entityMappings) {
        this.entityMappings = entityMappings;
        return this;
    }

    /**
     * Get the alertDetailsOverride property: The alert details override settings.
     *
     * @return the alertDetailsOverride value.
     */
    public AlertDetailsOverride alertDetailsOverride() {
        return this.alertDetailsOverride;
    }

    /**
     * Set the alertDetailsOverride property: The alert details override settings.
     *
     * @param alertDetailsOverride the alertDetailsOverride value to set.
     * @return the QueryBasedAlertRuleTemplateProperties object itself.
     */
    public QueryBasedAlertRuleTemplateProperties withAlertDetailsOverride(AlertDetailsOverride alertDetailsOverride) {
        this.alertDetailsOverride = alertDetailsOverride;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (entityMappings() != null) {
            entityMappings().forEach(e -> e.validate());
        }
        if (alertDetailsOverride() != null) {
            alertDetailsOverride().validate();
        }
    }
}
