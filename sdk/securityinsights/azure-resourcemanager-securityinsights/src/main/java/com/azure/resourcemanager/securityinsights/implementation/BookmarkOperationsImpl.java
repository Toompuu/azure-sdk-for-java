// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.BookmarkOperationsClient;
import com.azure.resourcemanager.securityinsights.fluent.models.BookmarkExpandResponseInner;
import com.azure.resourcemanager.securityinsights.models.BookmarkExpandParameters;
import com.azure.resourcemanager.securityinsights.models.BookmarkExpandResponse;
import com.azure.resourcemanager.securityinsights.models.BookmarkOperations;

public final class BookmarkOperationsImpl implements BookmarkOperations {
    private static final ClientLogger LOGGER = new ClientLogger(BookmarkOperationsImpl.class);

    private final BookmarkOperationsClient innerClient;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public BookmarkOperationsImpl(
        BookmarkOperationsClient innerClient,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public BookmarkExpandResponse expand(
        String resourceGroupName, String workspaceName, String bookmarkId, BookmarkExpandParameters parameters) {
        BookmarkExpandResponseInner inner =
            this.serviceClient().expand(resourceGroupName, workspaceName, bookmarkId, parameters);
        if (inner != null) {
            return new BookmarkExpandResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BookmarkExpandResponse> expandWithResponse(
        String resourceGroupName,
        String workspaceName,
        String bookmarkId,
        BookmarkExpandParameters parameters,
        Context context) {
        Response<BookmarkExpandResponseInner> inner =
            this.serviceClient().expandWithResponse(resourceGroupName, workspaceName, bookmarkId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BookmarkExpandResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private BookmarkOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}
