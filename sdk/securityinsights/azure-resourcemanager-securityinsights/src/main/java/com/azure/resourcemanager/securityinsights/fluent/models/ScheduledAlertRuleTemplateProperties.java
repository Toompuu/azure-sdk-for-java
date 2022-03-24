// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.models.AlertDetailsOverride;
import com.azure.resourcemanager.securityinsights.models.AlertRuleTemplateDataSource;
import com.azure.resourcemanager.securityinsights.models.AlertSeverity;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.EntityMapping;
import com.azure.resourcemanager.securityinsights.models.EventGroupingSettings;
import com.azure.resourcemanager.securityinsights.models.TemplateStatus;
import com.azure.resourcemanager.securityinsights.models.TriggerOperator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Scheduled alert rule template properties. */
@Fluent
public final class ScheduledAlertRuleTemplateProperties {
    /*
     * the number of alert rules that were created by this template
     */
    @JsonProperty(value = "alertRulesCreatedByTemplateCount")
    private Integer alertRulesCreatedByTemplateCount;

    /*
     * The time that this alert rule template has been added.
     */
    @JsonProperty(value = "createdDateUTC", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateUtc;

    /*
     * The time that this alert rule template was last updated.
     */
    @JsonProperty(value = "lastUpdatedDateUTC", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedDateUtc;

    /*
     * The description of the alert rule template.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The display name for alert rule template.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The required data connectors for this template
     */
    @JsonProperty(value = "requiredDataConnectors")
    private List<AlertRuleTemplateDataSource> requiredDataConnectors;

    /*
     * The alert rule template status.
     */
    @JsonProperty(value = "status")
    private TemplateStatus status;

    /*
     * The query that creates alerts for this rule.
     */
    @JsonProperty(value = "query")
    private String query;

    /*
     * The frequency (in ISO 8601 duration format) for this alert rule to run.
     */
    @JsonProperty(value = "queryFrequency")
    private Duration queryFrequency;

    /*
     * The period (in ISO 8601 duration format) that this alert rule looks at.
     */
    @JsonProperty(value = "queryPeriod")
    private Duration queryPeriod;

    /*
     * The severity for alerts created by this alert rule.
     */
    @JsonProperty(value = "severity")
    private AlertSeverity severity;

    /*
     * The operation against the threshold that triggers alert rule.
     */
    @JsonProperty(value = "triggerOperator")
    private TriggerOperator triggerOperator;

    /*
     * The threshold triggers this alert rule.
     */
    @JsonProperty(value = "triggerThreshold")
    private Integer triggerThreshold;

    /*
     * The tactics of the alert rule template
     */
    @JsonProperty(value = "tactics")
    private List<AttackTactic> tactics;

    /*
     * The techniques of the alert rule
     */
    @JsonProperty(value = "techniques")
    private List<String> techniques;

    /*
     * The version of this template - in format <a.b.c>, where all are numbers.
     * For example <1.0.2>.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The event grouping settings.
     */
    @JsonProperty(value = "eventGroupingSettings")
    private EventGroupingSettings eventGroupingSettings;

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
     * Get the alertRulesCreatedByTemplateCount property: the number of alert rules that were created by this template.
     *
     * @return the alertRulesCreatedByTemplateCount value.
     */
    public Integer alertRulesCreatedByTemplateCount() {
        return this.alertRulesCreatedByTemplateCount;
    }

    /**
     * Set the alertRulesCreatedByTemplateCount property: the number of alert rules that were created by this template.
     *
     * @param alertRulesCreatedByTemplateCount the alertRulesCreatedByTemplateCount value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withAlertRulesCreatedByTemplateCount(
        Integer alertRulesCreatedByTemplateCount) {
        this.alertRulesCreatedByTemplateCount = alertRulesCreatedByTemplateCount;
        return this;
    }

    /**
     * Get the createdDateUtc property: The time that this alert rule template has been added.
     *
     * @return the createdDateUtc value.
     */
    public OffsetDateTime createdDateUtc() {
        return this.createdDateUtc;
    }

    /**
     * Get the lastUpdatedDateUtc property: The time that this alert rule template was last updated.
     *
     * @return the lastUpdatedDateUtc value.
     */
    public OffsetDateTime lastUpdatedDateUtc() {
        return this.lastUpdatedDateUtc;
    }

    /**
     * Get the description property: The description of the alert rule template.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the alert rule template.
     *
     * @param description the description value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The display name for alert rule template.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for alert rule template.
     *
     * @param displayName the displayName value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the requiredDataConnectors property: The required data connectors for this template.
     *
     * @return the requiredDataConnectors value.
     */
    public List<AlertRuleTemplateDataSource> requiredDataConnectors() {
        return this.requiredDataConnectors;
    }

    /**
     * Set the requiredDataConnectors property: The required data connectors for this template.
     *
     * @param requiredDataConnectors the requiredDataConnectors value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withRequiredDataConnectors(
        List<AlertRuleTemplateDataSource> requiredDataConnectors) {
        this.requiredDataConnectors = requiredDataConnectors;
        return this;
    }

    /**
     * Get the status property: The alert rule template status.
     *
     * @return the status value.
     */
    public TemplateStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The alert rule template status.
     *
     * @param status the status value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withStatus(TemplateStatus status) {
        this.status = status;
        return this;
    }

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
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the queryFrequency property: The frequency (in ISO 8601 duration format) for this alert rule to run.
     *
     * @return the queryFrequency value.
     */
    public Duration queryFrequency() {
        return this.queryFrequency;
    }

    /**
     * Set the queryFrequency property: The frequency (in ISO 8601 duration format) for this alert rule to run.
     *
     * @param queryFrequency the queryFrequency value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withQueryFrequency(Duration queryFrequency) {
        this.queryFrequency = queryFrequency;
        return this;
    }

    /**
     * Get the queryPeriod property: The period (in ISO 8601 duration format) that this alert rule looks at.
     *
     * @return the queryPeriod value.
     */
    public Duration queryPeriod() {
        return this.queryPeriod;
    }

    /**
     * Set the queryPeriod property: The period (in ISO 8601 duration format) that this alert rule looks at.
     *
     * @param queryPeriod the queryPeriod value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withQueryPeriod(Duration queryPeriod) {
        this.queryPeriod = queryPeriod;
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
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the triggerOperator property: The operation against the threshold that triggers alert rule.
     *
     * @return the triggerOperator value.
     */
    public TriggerOperator triggerOperator() {
        return this.triggerOperator;
    }

    /**
     * Set the triggerOperator property: The operation against the threshold that triggers alert rule.
     *
     * @param triggerOperator the triggerOperator value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withTriggerOperator(TriggerOperator triggerOperator) {
        this.triggerOperator = triggerOperator;
        return this;
    }

    /**
     * Get the triggerThreshold property: The threshold triggers this alert rule.
     *
     * @return the triggerThreshold value.
     */
    public Integer triggerThreshold() {
        return this.triggerThreshold;
    }

    /**
     * Set the triggerThreshold property: The threshold triggers this alert rule.
     *
     * @param triggerThreshold the triggerThreshold value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withTriggerThreshold(Integer triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
        return this;
    }

    /**
     * Get the tactics property: The tactics of the alert rule template.
     *
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.tactics;
    }

    /**
     * Set the tactics property: The tactics of the alert rule template.
     *
     * @param tactics the tactics value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withTactics(List<AttackTactic> tactics) {
        this.tactics = tactics;
        return this;
    }

    /**
     * Get the techniques property: The techniques of the alert rule.
     *
     * @return the techniques value.
     */
    public List<String> techniques() {
        return this.techniques;
    }

    /**
     * Set the techniques property: The techniques of the alert rule.
     *
     * @param techniques the techniques value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withTechniques(List<String> techniques) {
        this.techniques = techniques;
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
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the eventGroupingSettings property: The event grouping settings.
     *
     * @return the eventGroupingSettings value.
     */
    public EventGroupingSettings eventGroupingSettings() {
        return this.eventGroupingSettings;
    }

    /**
     * Set the eventGroupingSettings property: The event grouping settings.
     *
     * @param eventGroupingSettings the eventGroupingSettings value to set.
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withEventGroupingSettings(EventGroupingSettings eventGroupingSettings) {
        this.eventGroupingSettings = eventGroupingSettings;
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
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withCustomDetails(Map<String, String> customDetails) {
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
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withEntityMappings(List<EntityMapping> entityMappings) {
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
     * @return the ScheduledAlertRuleTemplateProperties object itself.
     */
    public ScheduledAlertRuleTemplateProperties withAlertDetailsOverride(AlertDetailsOverride alertDetailsOverride) {
        this.alertDetailsOverride = alertDetailsOverride;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (requiredDataConnectors() != null) {
            requiredDataConnectors().forEach(e -> e.validate());
        }
        if (eventGroupingSettings() != null) {
            eventGroupingSettings().validate();
        }
        if (entityMappings() != null) {
            entityMappings().forEach(e -> e.validate());
        }
        if (alertDetailsOverride() != null) {
            alertDetailsOverride().validate();
        }
    }
}
