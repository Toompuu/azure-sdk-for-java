// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Azure VM workload-specific protected item representing SQL Database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("AzureVmWorkloadSQLDatabase")
@Fluent
public final class AzureVmWorkloadSqlDatabaseProtectedItem extends AzureVmWorkloadProtectedItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureVmWorkloadSqlDatabaseProtectedItem.class);

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withParentType(String parentType) {
        super.withParentType(parentType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withProtectionStatus(String protectionStatus) {
        super.withProtectionStatus(protectionStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withProtectionState(ProtectionState protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withLastBackupStatus(LastBackupStatus lastBackupStatus) {
        super.withLastBackupStatus(lastBackupStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withLastBackupTime(OffsetDateTime lastBackupTime) {
        super.withLastBackupTime(lastBackupTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withLastBackupErrorDetail(ErrorDetail lastBackupErrorDetail) {
        super.withLastBackupErrorDetail(lastBackupErrorDetail);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withProtectedItemDataSourceId(String protectedItemDataSourceId) {
        super.withProtectedItemDataSourceId(protectedItemDataSourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withProtectedItemHealthStatus(
        ProtectedItemHealthStatus protectedItemHealthStatus) {
        super.withProtectedItemHealthStatus(protectedItemHealthStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withExtendedInfo(
        AzureVmWorkloadProtectedItemExtendedInfo extendedInfo) {
        super.withExtendedInfo(extendedInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withKpisHealths(Map<String, KpiResourceHealthDetails> kpisHealths) {
        super.withKpisHealths(kpisHealths);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withWorkloadType(DataSourceType workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withDeferredDeleteTimeInUtc(OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withIsScheduledForDeferredDelete(
        Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withDeferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withIsDeferredDeleteScheduleUpcoming(
        Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withIsRehydrate(Boolean isRehydrate) {
        super.withIsRehydrate(isRehydrate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectedItem withResourceGuardOperationRequests(
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
    }
}
