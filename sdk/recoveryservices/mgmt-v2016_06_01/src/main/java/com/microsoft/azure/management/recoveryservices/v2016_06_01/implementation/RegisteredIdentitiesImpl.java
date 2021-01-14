/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.RegisteredIdentities;
import rx.Completable;

class RegisteredIdentitiesImpl extends WrapperImpl<RegisteredIdentitiesInner> implements RegisteredIdentities {
    private final RecoveryServicesManager manager;

    RegisteredIdentitiesImpl(RecoveryServicesManager manager) {
        super(manager.inner().registeredIdentities());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String vaultName, String identityName) {
        return inner().deleteAsync(resourceGroupName, vaultName, identityName).toCompletable();
    }
}
