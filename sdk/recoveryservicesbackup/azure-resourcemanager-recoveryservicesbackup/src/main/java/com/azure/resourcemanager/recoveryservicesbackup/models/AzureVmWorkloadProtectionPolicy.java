// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Azure VM (Mercury) workload-specific backup policy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "backupManagementType")
@JsonTypeName("AzureWorkload")
@Fluent
public final class AzureVmWorkloadProtectionPolicy extends ProtectionPolicy {
    /*
     * Type of workload for the backup management
     */
    @JsonProperty(value = "workLoadType")
    private WorkloadType workLoadType;

    /*
     * Common settings for the backup management
     */
    @JsonProperty(value = "settings")
    private Settings settings;

    /*
     * List of sub-protection policies which includes schedule and retention
     */
    @JsonProperty(value = "subProtectionPolicy")
    private List<SubProtectionPolicy> subProtectionPolicy;

    /*
     * Fix the policy inconsistency
     */
    @JsonProperty(value = "makePolicyConsistent")
    private Boolean makePolicyConsistent;

    /**
     * Get the workLoadType property: Type of workload for the backup management.
     *
     * @return the workLoadType value.
     */
    public WorkloadType workLoadType() {
        return this.workLoadType;
    }

    /**
     * Set the workLoadType property: Type of workload for the backup management.
     *
     * @param workLoadType the workLoadType value to set.
     * @return the AzureVmWorkloadProtectionPolicy object itself.
     */
    public AzureVmWorkloadProtectionPolicy withWorkLoadType(WorkloadType workLoadType) {
        this.workLoadType = workLoadType;
        return this;
    }

    /**
     * Get the settings property: Common settings for the backup management.
     *
     * @return the settings value.
     */
    public Settings settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Common settings for the backup management.
     *
     * @param settings the settings value to set.
     * @return the AzureVmWorkloadProtectionPolicy object itself.
     */
    public AzureVmWorkloadProtectionPolicy withSettings(Settings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the subProtectionPolicy property: List of sub-protection policies which includes schedule and retention.
     *
     * @return the subProtectionPolicy value.
     */
    public List<SubProtectionPolicy> subProtectionPolicy() {
        return this.subProtectionPolicy;
    }

    /**
     * Set the subProtectionPolicy property: List of sub-protection policies which includes schedule and retention.
     *
     * @param subProtectionPolicy the subProtectionPolicy value to set.
     * @return the AzureVmWorkloadProtectionPolicy object itself.
     */
    public AzureVmWorkloadProtectionPolicy withSubProtectionPolicy(List<SubProtectionPolicy> subProtectionPolicy) {
        this.subProtectionPolicy = subProtectionPolicy;
        return this;
    }

    /**
     * Get the makePolicyConsistent property: Fix the policy inconsistency.
     *
     * @return the makePolicyConsistent value.
     */
    public Boolean makePolicyConsistent() {
        return this.makePolicyConsistent;
    }

    /**
     * Set the makePolicyConsistent property: Fix the policy inconsistency.
     *
     * @param makePolicyConsistent the makePolicyConsistent value to set.
     * @return the AzureVmWorkloadProtectionPolicy object itself.
     */
    public AzureVmWorkloadProtectionPolicy withMakePolicyConsistent(Boolean makePolicyConsistent) {
        this.makePolicyConsistent = makePolicyConsistent;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadProtectionPolicy withProtectedItemsCount(Integer protectedItemsCount) {
        super.withProtectedItemsCount(protectedItemsCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadProtectionPolicy withResourceGuardOperationRequests(
        List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (settings() != null) {
            settings().validate();
        }
        if (subProtectionPolicy() != null) {
            subProtectionPolicy().forEach(e -> e.validate());
        }
    }
}
