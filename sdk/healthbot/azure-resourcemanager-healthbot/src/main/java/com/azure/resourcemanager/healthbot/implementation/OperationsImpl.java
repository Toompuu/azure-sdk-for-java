// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthbot.HealthbotManager;
import com.azure.resourcemanager.healthbot.fluent.OperationsClient;
import com.azure.resourcemanager.healthbot.fluent.models.OperationDetailInner;
import com.azure.resourcemanager.healthbot.models.OperationDetail;
import com.azure.resourcemanager.healthbot.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final HealthbotManager serviceManager;

    public OperationsImpl(OperationsClient innerClient, HealthbotManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OperationDetail> list() {
        PagedIterable<OperationDetailInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new OperationDetailImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationDetail> list(Context context) {
        PagedIterable<OperationDetailInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new OperationDetailImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private HealthbotManager manager() {
        return this.serviceManager;
    }
}
