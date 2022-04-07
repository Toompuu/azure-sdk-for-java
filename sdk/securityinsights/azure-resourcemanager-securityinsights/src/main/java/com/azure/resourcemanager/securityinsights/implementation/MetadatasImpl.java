// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.MetadatasClient;
import com.azure.resourcemanager.securityinsights.fluent.models.MetadataModelInner;
import com.azure.resourcemanager.securityinsights.models.MetadataModel;
import com.azure.resourcemanager.securityinsights.models.Metadatas;

public final class MetadatasImpl implements Metadatas {
    private static final ClientLogger LOGGER = new ClientLogger(MetadatasImpl.class);

    private final MetadatasClient innerClient;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public MetadatasImpl(
        MetadatasClient innerClient,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MetadataModel> list(String resourceGroupName, String workspaceName) {
        PagedIterable<MetadataModelInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new MetadataModelImpl(inner1, this.manager()));
    }

    public PagedIterable<MetadataModel> list(
        String resourceGroupName,
        String workspaceName,
        String filter,
        String orderby,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<MetadataModelInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, filter, orderby, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new MetadataModelImpl(inner1, this.manager()));
    }

    public MetadataModel get(String resourceGroupName, String workspaceName, String metadataName) {
        MetadataModelInner inner = this.serviceClient().get(resourceGroupName, workspaceName, metadataName);
        if (inner != null) {
            return new MetadataModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MetadataModel> getWithResponse(
        String resourceGroupName, String workspaceName, String metadataName, Context context) {
        Response<MetadataModelInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, metadataName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MetadataModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String metadataName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, metadataName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String metadataName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, metadataName, context);
    }

    public MetadataModel getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String metadataName = Utils.getValueFromIdByName(id, "metadata");
        if (metadataName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metadata'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, metadataName, Context.NONE).getValue();
    }

    public Response<MetadataModel> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String metadataName = Utils.getValueFromIdByName(id, "metadata");
        if (metadataName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metadata'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, metadataName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String metadataName = Utils.getValueFromIdByName(id, "metadata");
        if (metadataName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metadata'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, metadataName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String metadataName = Utils.getValueFromIdByName(id, "metadata");
        if (metadataName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metadata'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, metadataName, context);
    }

    private MetadatasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }

    public MetadataModelImpl define(String name) {
        return new MetadataModelImpl(name, this.manager());
    }
}
