// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.SparkJobDefinitionsImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.SparkBatchJob;
import com.azure.analytics.synapse.artifacts.models.SparkJobDefinitionResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class SparkJobDefinitionClient {
    private final SparkJobDefinitionsImpl serviceClient;

    /**
     * Initializes an instance of SparkJobDefinitions client.
     *
     * @param serviceClient the service client implementation.
     */
    SparkJobDefinitionClient(SparkJobDefinitionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists spark job definitions.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of spark job definitions resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkJobDefinitionResource> getSparkJobDefinitionsByWorkspace() {
        return this.serviceClient.getSparkJobDefinitionsByWorkspace();
    }

    /**
     * Lists spark job definitions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of spark job definitions resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SparkJobDefinitionResource> getSparkJobDefinitionsByWorkspace(Context context) {
        return this.serviceClient.getSparkJobDefinitionsByWorkspace(context);
    }

    /**
     * Creates or updates a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param sparkJobDefinition Spark Job Definition resource definition.
     * @param ifMatch ETag of the Spark Job Definition entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark job definition resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkJobDefinitionResource createOrUpdateSparkJobDefinition(
            String sparkJobDefinitionName, SparkJobDefinitionResource sparkJobDefinition, String ifMatch) {
        return this.serviceClient.createOrUpdateSparkJobDefinition(sparkJobDefinitionName, sparkJobDefinition, ifMatch);
    }

    /**
     * Creates or updates a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param sparkJobDefinition Spark Job Definition resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark job definition resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkJobDefinitionResource createOrUpdateSparkJobDefinition(
            String sparkJobDefinitionName, SparkJobDefinitionResource sparkJobDefinition) {
        return this.serviceClient.createOrUpdateSparkJobDefinition(sparkJobDefinitionName, sparkJobDefinition);
    }

    /**
     * Creates or updates a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param sparkJobDefinition Spark Job Definition resource definition.
     * @param ifMatch ETag of the Spark Job Definition entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark job definition resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkJobDefinitionResource> createOrUpdateSparkJobDefinitionWithResponse(
            String sparkJobDefinitionName,
            SparkJobDefinitionResource sparkJobDefinition,
            String ifMatch,
            Context context) {
        return this.serviceClient.createOrUpdateSparkJobDefinitionWithResponse(
                sparkJobDefinitionName, sparkJobDefinition, ifMatch, context);
    }

    /**
     * Gets a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param ifNoneMatch ETag of the Spark Job Definition entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Spark Job Definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkJobDefinitionResource getSparkJobDefinition(String sparkJobDefinitionName, String ifNoneMatch) {
        return this.serviceClient.getSparkJobDefinition(sparkJobDefinitionName, ifNoneMatch);
    }

    /**
     * Gets a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Spark Job Definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkJobDefinitionResource getSparkJobDefinition(String sparkJobDefinitionName) {
        return this.serviceClient.getSparkJobDefinition(sparkJobDefinitionName);
    }

    /**
     * Gets a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param ifNoneMatch ETag of the Spark Job Definition entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Spark Job Definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkJobDefinitionResource> getSparkJobDefinitionWithResponse(
            String sparkJobDefinitionName, String ifNoneMatch, Context context) {
        return this.serviceClient.getSparkJobDefinitionWithResponse(sparkJobDefinitionName, ifNoneMatch, context);
    }

    /**
     * Deletes a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteSparkJobDefinition(String sparkJobDefinitionName) {
        this.serviceClient.deleteSparkJobDefinition(sparkJobDefinitionName);
    }

    /**
     * Deletes a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteSparkJobDefinitionWithResponse(String sparkJobDefinitionName, Context context) {
        return this.serviceClient.deleteSparkJobDefinitionWithResponse(sparkJobDefinitionName, context);
    }

    /**
     * Executes the spark job definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJob executeSparkJobDefinition(String sparkJobDefinitionName) {
        return this.serviceClient.executeSparkJobDefinition(sparkJobDefinitionName);
    }

    /**
     * Executes the spark job definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkBatchJob> executeSparkJobDefinitionWithResponse(
            String sparkJobDefinitionName, Context context) {
        return this.serviceClient.executeSparkJobDefinitionWithResponse(sparkJobDefinitionName, context);
    }

    /**
     * Renames a sparkJobDefinition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renameSparkJobDefinition(String sparkJobDefinitionName, ArtifactRenameRequest request) {
        this.serviceClient.renameSparkJobDefinition(sparkJobDefinitionName, request);
    }

    /**
     * Renames a sparkJobDefinition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param request proposed new name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renameSparkJobDefinitionWithResponse(
            String sparkJobDefinitionName, ArtifactRenameRequest request, Context context) {
        return this.serviceClient.renameSparkJobDefinitionWithResponse(sparkJobDefinitionName, request, context);
    }

    /**
     * Debug the spark job definition.
     *
     * @param sparkJobDefinitionAzureResource Spark Job Definition resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SparkBatchJob debugSparkJobDefinition(SparkJobDefinitionResource sparkJobDefinitionAzureResource) {
        return this.serviceClient.debugSparkJobDefinition(sparkJobDefinitionAzureResource);
    }

    /**
     * Debug the spark job definition.
     *
     * @param sparkJobDefinitionAzureResource Spark Job Definition resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SparkBatchJob> debugSparkJobDefinitionWithResponse(
            SparkJobDefinitionResource sparkJobDefinitionAzureResource, Context context) {
        return this.serviceClient.debugSparkJobDefinitionWithResponse(sparkJobDefinitionAzureResource, context);
    }
}
