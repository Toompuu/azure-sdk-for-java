// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.SitesClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SiteInner;
import com.azure.resourcemanager.mobilenetwork.models.Site;
import com.azure.resourcemanager.mobilenetwork.models.Sites;

public final class SitesImpl implements Sites {
    private static final ClientLogger LOGGER = new ClientLogger(SitesImpl.class);

    private final SitesClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public SitesImpl(
        SitesClient innerClient, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String mobileNetworkName, String siteName) {
        this.serviceClient().delete(resourceGroupName, mobileNetworkName, siteName);
    }

    public void delete(String resourceGroupName, String mobileNetworkName, String siteName, Context context) {
        this.serviceClient().delete(resourceGroupName, mobileNetworkName, siteName, context);
    }

    public Site get(String resourceGroupName, String mobileNetworkName, String siteName) {
        SiteInner inner = this.serviceClient().get(resourceGroupName, mobileNetworkName, siteName);
        if (inner != null) {
            return new SiteImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Site> getWithResponse(
        String resourceGroupName, String mobileNetworkName, String siteName, Context context) {
        Response<SiteInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, mobileNetworkName, siteName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SiteImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Site> listByMobileNetwork(String resourceGroupName, String mobileNetworkName) {
        PagedIterable<SiteInner> inner = this.serviceClient().listByMobileNetwork(resourceGroupName, mobileNetworkName);
        return Utils.mapPage(inner, inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public PagedIterable<Site> listByMobileNetwork(
        String resourceGroupName, String mobileNetworkName, Context context) {
        PagedIterable<SiteInner> inner =
            this.serviceClient().listByMobileNetwork(resourceGroupName, mobileNetworkName, context);
        return Utils.mapPage(inner, inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public Site getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String siteName = Utils.getValueFromIdByName(id, "sites");
        if (siteName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sites'.", id)));
        }
        return this.getWithResponse(resourceGroupName, mobileNetworkName, siteName, Context.NONE).getValue();
    }

    public Response<Site> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String siteName = Utils.getValueFromIdByName(id, "sites");
        if (siteName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sites'.", id)));
        }
        return this.getWithResponse(resourceGroupName, mobileNetworkName, siteName, context);
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
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String siteName = Utils.getValueFromIdByName(id, "sites");
        if (siteName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sites'.", id)));
        }
        this.delete(resourceGroupName, mobileNetworkName, siteName, Context.NONE);
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
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String siteName = Utils.getValueFromIdByName(id, "sites");
        if (siteName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sites'.", id)));
        }
        this.delete(resourceGroupName, mobileNetworkName, siteName, context);
    }

    private SitesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public SiteImpl define(String name) {
        return new SiteImpl(name, this.manager());
    }
}
