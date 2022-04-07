// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.PipelineRunsClient;
import com.azure.resourcemanager.datafactory.fluent.models.PipelineRunInner;
import com.azure.resourcemanager.datafactory.fluent.models.PipelineRunsQueryResponseInner;
import com.azure.resourcemanager.datafactory.models.PipelineRun;
import com.azure.resourcemanager.datafactory.models.PipelineRuns;
import com.azure.resourcemanager.datafactory.models.PipelineRunsQueryResponse;
import com.azure.resourcemanager.datafactory.models.RunFilterParameters;

public final class PipelineRunsImpl implements PipelineRuns {
    private static final ClientLogger LOGGER = new ClientLogger(PipelineRunsImpl.class);

    private final PipelineRunsClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public PipelineRunsImpl(
        PipelineRunsClient innerClient, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PipelineRunsQueryResponse queryByFactory(
        String resourceGroupName, String factoryName, RunFilterParameters filterParameters) {
        PipelineRunsQueryResponseInner inner =
            this.serviceClient().queryByFactory(resourceGroupName, factoryName, filterParameters);
        if (inner != null) {
            return new PipelineRunsQueryResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PipelineRunsQueryResponse> queryByFactoryWithResponse(
        String resourceGroupName, String factoryName, RunFilterParameters filterParameters, Context context) {
        Response<PipelineRunsQueryResponseInner> inner =
            this.serviceClient().queryByFactoryWithResponse(resourceGroupName, factoryName, filterParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PipelineRunsQueryResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PipelineRun get(String resourceGroupName, String factoryName, String runId) {
        PipelineRunInner inner = this.serviceClient().get(resourceGroupName, factoryName, runId);
        if (inner != null) {
            return new PipelineRunImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PipelineRun> getWithResponse(
        String resourceGroupName, String factoryName, String runId, Context context) {
        Response<PipelineRunInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, factoryName, runId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PipelineRunImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void cancel(String resourceGroupName, String factoryName, String runId) {
        this.serviceClient().cancel(resourceGroupName, factoryName, runId);
    }

    public Response<Void> cancelWithResponse(
        String resourceGroupName, String factoryName, String runId, Boolean isRecursive, Context context) {
        return this.serviceClient().cancelWithResponse(resourceGroupName, factoryName, runId, isRecursive, context);
    }

    private PipelineRunsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
