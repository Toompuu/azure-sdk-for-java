// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.scvmm.fluent.VmmServersClient;
import com.azure.resourcemanager.scvmm.fluent.models.VmmServerInner;
import com.azure.resourcemanager.scvmm.models.VmmServer;
import com.azure.resourcemanager.scvmm.models.VmmServers;

public final class VmmServersImpl implements VmmServers {
    private static final ClientLogger LOGGER = new ClientLogger(VmmServersImpl.class);

    private final VmmServersClient innerClient;

    private final com.azure.resourcemanager.scvmm.ScvmmManager serviceManager;

    public VmmServersImpl(VmmServersClient innerClient, com.azure.resourcemanager.scvmm.ScvmmManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VmmServer getByResourceGroup(String resourceGroupName, String vmmServerName) {
        VmmServerInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, vmmServerName);
        if (inner != null) {
            return new VmmServerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VmmServer> getByResourceGroupWithResponse(
        String resourceGroupName, String vmmServerName, Context context) {
        Response<VmmServerInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, vmmServerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VmmServerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String vmmServerName, Boolean force) {
        this.serviceClient().delete(resourceGroupName, vmmServerName, force);
    }

    public void delete(String resourceGroupName, String vmmServerName) {
        this.serviceClient().delete(resourceGroupName, vmmServerName);
    }

    public void delete(String resourceGroupName, String vmmServerName, Boolean force, Context context) {
        this.serviceClient().delete(resourceGroupName, vmmServerName, force, context);
    }

    public PagedIterable<VmmServer> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VmmServerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VmmServerImpl(inner1, this.manager()));
    }

    public PagedIterable<VmmServer> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VmmServerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VmmServerImpl(inner1, this.manager()));
    }

    public PagedIterable<VmmServer> list() {
        PagedIterable<VmmServerInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new VmmServerImpl(inner1, this.manager()));
    }

    public PagedIterable<VmmServer> list(Context context) {
        PagedIterable<VmmServerInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new VmmServerImpl(inner1, this.manager()));
    }

    public VmmServer getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmmServerName = Utils.getValueFromIdByName(id, "vmmServers");
        if (vmmServerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vmmServers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vmmServerName, Context.NONE).getValue();
    }

    public Response<VmmServer> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmmServerName = Utils.getValueFromIdByName(id, "vmmServers");
        if (vmmServerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vmmServers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vmmServerName, context);
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
        String vmmServerName = Utils.getValueFromIdByName(id, "vmmServers");
        if (vmmServerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vmmServers'.", id)));
        }
        Boolean localForce = null;
        this.delete(resourceGroupName, vmmServerName, localForce, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean force, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmmServerName = Utils.getValueFromIdByName(id, "vmmServers");
        if (vmmServerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vmmServers'.", id)));
        }
        this.delete(resourceGroupName, vmmServerName, force, context);
    }

    private VmmServersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.scvmm.ScvmmManager manager() {
        return this.serviceManager;
    }

    public VmmServerImpl define(String name) {
        return new VmmServerImpl(name, this.manager());
    }
}
