// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectedItemOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectedItemResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemOperationResults;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemResource;

public final class ProtectedItemOperationResultsImpl implements ProtectedItemOperationResults {
    private static final ClientLogger LOGGER = new ClientLogger(ProtectedItemOperationResultsImpl.class);

    private final ProtectedItemOperationResultsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public ProtectedItemOperationResultsImpl(
        ProtectedItemOperationResultsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ProtectedItemResource get(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String operationId) {
        ProtectedItemResourceInner inner =
            this
                .serviceClient()
                .get(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId);
        if (inner != null) {
            return new ProtectedItemResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProtectedItemResource> getWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String operationId,
        Context context) {
        Response<ProtectedItemResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProtectedItemResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ProtectedItemOperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
