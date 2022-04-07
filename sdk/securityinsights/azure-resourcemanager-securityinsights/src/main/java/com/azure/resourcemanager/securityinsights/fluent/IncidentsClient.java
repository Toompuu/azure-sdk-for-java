// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentAlertListInner;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentBookmarkListInner;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentEntitiesResponseInner;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentInner;
import com.azure.resourcemanager.securityinsights.fluent.models.TeamInformationInner;
import com.azure.resourcemanager.securityinsights.models.ManualTriggerRequestBody;
import com.azure.resourcemanager.securityinsights.models.TeamProperties;

/** An instance of this class provides access to all the operations defined in IncidentsClient. */
public interface IncidentsClient {
    /**
     * Triggers playbook on a specific incident.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentIdentifier The incidentIdentifier parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object runPlaybook(String resourceGroupName, String workspaceName, String incidentIdentifier);

    /**
     * Triggers playbook on a specific incident.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentIdentifier The incidentIdentifier parameter.
     * @param requestBody The requestBody parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Object> runPlaybookWithResponse(
        String resourceGroupName,
        String workspaceName,
        String incidentIdentifier,
        ManualTriggerRequestBody requestBody,
        Context context);

    /**
     * Gets all incidents.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all incidents as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IncidentInner> list(String resourceGroupName, String workspaceName);

    /**
     * Gets all incidents.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param filter Filters the results, based on a Boolean condition. Optional.
     * @param orderby Sorts the results. Optional.
     * @param top Returns only the first n results. Optional.
     * @param skipToken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all incidents as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IncidentInner> list(
        String resourceGroupName,
        String workspaceName,
        String filter,
        String orderby,
        Integer top,
        String skipToken,
        Context context);

    /**
     * Gets an incident.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an incident.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IncidentInner get(String resourceGroupName, String workspaceName, String incidentId);

    /**
     * Gets an incident.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an incident along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IncidentInner> getWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context);

    /**
     * Creates or updates the incident.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @param incident The incident.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an incident in Azure Security Insights.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IncidentInner createOrUpdate(
        String resourceGroupName, String workspaceName, String incidentId, IncidentInner incident);

    /**
     * Creates or updates the incident.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @param incident The incident.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an incident in Azure Security Insights along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IncidentInner> createOrUpdateWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, IncidentInner incident, Context context);

    /**
     * Delete the incident.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String incidentId);

    /**
     * Delete the incident.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context);

    /**
     * Creates a Microsoft team to investigate the incident by sharing information and insights between participants.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @param teamProperties Team properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes team information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TeamInformationInner createTeam(
        String resourceGroupName, String workspaceName, String incidentId, TeamProperties teamProperties);

    /**
     * Creates a Microsoft team to investigate the incident by sharing information and insights between participants.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @param teamProperties Team properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes team information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TeamInformationInner> createTeamWithResponse(
        String resourceGroupName,
        String workspaceName,
        String incidentId,
        TeamProperties teamProperties,
        Context context);

    /**
     * Gets all incident alerts.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all incident alerts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IncidentAlertListInner listAlerts(String resourceGroupName, String workspaceName, String incidentId);

    /**
     * Gets all incident alerts.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all incident alerts along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IncidentAlertListInner> listAlertsWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context);

    /**
     * Gets all incident bookmarks.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all incident bookmarks.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IncidentBookmarkListInner listBookmarks(String resourceGroupName, String workspaceName, String incidentId);

    /**
     * Gets all incident bookmarks.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all incident bookmarks along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IncidentBookmarkListInner> listBookmarksWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context);

    /**
     * Gets all incident related entities.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all incident related entities.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IncidentEntitiesResponseInner listEntities(String resourceGroupName, String workspaceName, String incidentId);

    /**
     * Gets all incident related entities.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param incidentId Incident ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all incident related entities along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IncidentEntitiesResponseInner> listEntitiesWithResponse(
        String resourceGroupName, String workspaceName, String incidentId, Context context);
}
