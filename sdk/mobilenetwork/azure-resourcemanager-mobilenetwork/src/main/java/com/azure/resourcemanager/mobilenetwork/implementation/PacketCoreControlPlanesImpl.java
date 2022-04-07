// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.PacketCoreControlPlanesClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlane;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlanes;

public final class PacketCoreControlPlanesImpl implements PacketCoreControlPlanes {
    private static final ClientLogger LOGGER = new ClientLogger(PacketCoreControlPlanesImpl.class);

    private final PacketCoreControlPlanesClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public PacketCoreControlPlanesImpl(
        PacketCoreControlPlanesClient innerClient,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String packetCoreControlPlaneName) {
        this.serviceClient().delete(resourceGroupName, packetCoreControlPlaneName);
    }

    public void delete(String resourceGroupName, String packetCoreControlPlaneName, Context context) {
        this.serviceClient().delete(resourceGroupName, packetCoreControlPlaneName, context);
    }

    public PacketCoreControlPlane getByResourceGroup(String resourceGroupName, String packetCoreControlPlaneName) {
        PacketCoreControlPlaneInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, packetCoreControlPlaneName);
        if (inner != null) {
            return new PacketCoreControlPlaneImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PacketCoreControlPlane> getByResourceGroupWithResponse(
        String resourceGroupName, String packetCoreControlPlaneName, Context context) {
        Response<PacketCoreControlPlaneInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, packetCoreControlPlaneName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PacketCoreControlPlaneImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PacketCoreControlPlane> list() {
        PagedIterable<PacketCoreControlPlaneInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PacketCoreControlPlaneImpl(inner1, this.manager()));
    }

    public PagedIterable<PacketCoreControlPlane> list(Context context) {
        PagedIterable<PacketCoreControlPlaneInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PacketCoreControlPlaneImpl(inner1, this.manager()));
    }

    public PagedIterable<PacketCoreControlPlane> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PacketCoreControlPlaneInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PacketCoreControlPlaneImpl(inner1, this.manager()));
    }

    public PagedIterable<PacketCoreControlPlane> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PacketCoreControlPlaneInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new PacketCoreControlPlaneImpl(inner1, this.manager()));
    }

    public PacketCoreControlPlane getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, packetCoreControlPlaneName, Context.NONE)
            .getValue();
    }

    public Response<PacketCoreControlPlane> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, packetCoreControlPlaneName, context);
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
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        this.delete(resourceGroupName, packetCoreControlPlaneName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        this.delete(resourceGroupName, packetCoreControlPlaneName, context);
    }

    private PacketCoreControlPlanesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public PacketCoreControlPlaneImpl define(String name) {
        return new PacketCoreControlPlaneImpl(name, this.manager());
    }
}
