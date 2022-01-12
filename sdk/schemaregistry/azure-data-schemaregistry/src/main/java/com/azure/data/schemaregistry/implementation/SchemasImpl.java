// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.schemaregistry.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.data.schemaregistry.implementation.models.ErrorException;
import com.azure.data.schemaregistry.implementation.models.SchemaVersions;
import com.azure.data.schemaregistry.implementation.models.SchemasGetByIdResponse;
import com.azure.data.schemaregistry.implementation.models.SchemasQueryIdByContentResponse;
import com.azure.data.schemaregistry.implementation.models.SchemasRegisterResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Schemas. */
public final class SchemasImpl {
    /** The proxy service used to perform REST calls. */
    private final SchemasService service;

    /** The service client containing this operation class. */
    private final AzureSchemaRegistryImpl client;

    /**
     * Initializes an instance of SchemasImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SchemasImpl(AzureSchemaRegistryImpl client) {
        this.service = RestProxy.create(SchemasService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureSchemaRegistrySchemas to be used by the proxy service to perform
     * REST calls.
     */
    @Host("https://{endpoint}")
    @ServiceInterface(name = "AzureSchemaRegistryS")
    private interface SchemasService {
        @Get("/$schemaGroups/$schemas/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SchemasGetByIdResponse> getById(
                @HostParam("endpoint") String endpoint,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/$schemaGroups/{groupName}/schemas/{schemaName}/versions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<SchemaVersions>> getVersions(
                @HostParam("endpoint") String endpoint,
                @PathParam("groupName") String groupName,
                @PathParam("schemaName") String schemaName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/$schemaGroups/{groupName}/schemas/{schemaName}:get-id")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = ErrorException.class,
                code = {415})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SchemasQueryIdByContentResponse> queryIdByContent(
                @HostParam("endpoint") String endpoint,
                @PathParam("groupName") String groupName,
                @PathParam("schemaName") String schemaName,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json; serialization=Avro") String schemaContent,
                @HeaderParam("Content-Type") String contentType,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/$schemaGroups/{groupName}/schemas/{schemaName}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = ErrorException.class,
                code = {415})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SchemasRegisterResponse> register(
                @HostParam("endpoint") String endpoint,
                @PathParam("groupName") String groupName,
                @PathParam("schemaName") String schemaName,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json; serialization=Avro") String schemaContent,
                @HeaderParam("Content-Type") String contentType,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Gets a registered schema by its unique ID. Azure Schema Registry guarantees that ID is unique within a namespace.
     * Operation response type is based on serialization of schema requested.
     *
     * @param id References specific schema in registry namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a registered schema by its unique ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SchemasGetByIdResponse> getByIdWithResponseAsync(String id, Context context) {
        final String accept = "application/json; serialization=avro";
        return service.getById(this.client.getEndpoint(), id, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets the list of all versions of one schema.
     *
     * @param groupName Schema group under which schema is registered. Group's serialization type should match the
     *     serialization type specified in the request.
     * @param schemaName Name of schema being registered.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of all versions of one schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SchemaVersions>> getVersionsWithResponseAsync(
            String groupName, String schemaName, Context context) {
        final String accept = "application/json";
        return service.getVersions(
                this.client.getEndpoint(), groupName, schemaName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets the ID referencing an existing schema within the specified schema group, as matched by schema content
     * comparison.
     *
     * @param groupName Schema group under which schema is registered. Group's serialization type should match the
     *     serialization type specified in the request.
     * @param schemaName Name of requested schema.
     * @param schemaContent String representation (UTF-8) of the registered schema.
     * @param contentType The contentType parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws ErrorException thrown if the request is rejected by server on status code 415.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ID referencing an existing schema within the specified schema group, as matched by schema content
     *     comparison.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SchemasQueryIdByContentResponse> queryIdByContentWithResponseAsync(
            String groupName, String schemaName, String schemaContent, String contentType, Context context) {
        final String accept = "application/json";
        return service.queryIdByContent(
                this.client.getEndpoint(),
                groupName,
                schemaName,
                this.client.getApiVersion(),
                schemaContent,
                contentType,
                accept,
                context);
    }

    /**
     * Register new schema. If schema of specified name does not exist in specified group, schema is created at version
     * 1. If schema of specified name exists already in specified group, schema is created at latest version + 1.
     *
     * @param groupName Schema group under which schema should be registered. Group's serialization type should match
     *     the serialization type specified in the request.
     * @param schemaName Name of schema being registered.
     * @param schemaContent String representation (UTF-8) of the schema being registered.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws ErrorException thrown if the request is rejected by server on status code 415.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SchemasRegisterResponse> registerWithResponseAsync(
            String groupName, String schemaName, String schemaContent, String contentType, Context context) {
        final String accept = "application/json";
        return service.register(
                this.client.getEndpoint(),
                groupName,
                schemaName,
                this.client.getApiVersion(),
                schemaContent,
                contentType,
                accept,
                context);
    }
}
