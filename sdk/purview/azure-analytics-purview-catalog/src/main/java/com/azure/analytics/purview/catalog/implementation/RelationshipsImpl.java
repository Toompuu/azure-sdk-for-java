// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Relationships. */
public final class RelationshipsImpl {
    /** The proxy service used to perform REST calls. */
    private final RelationshipsService service;

    /** The service client containing this operation class. */
    private final PurviewCatalogClientImpl client;

    /**
     * Initializes an instance of RelationshipsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RelationshipsImpl(PurviewCatalogClientImpl client) {
        this.service =
                RestProxy.create(RelationshipsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PurviewCatalogClientRelationships to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{Endpoint}/catalog/api")
    @ServiceInterface(name = "PurviewCatalogClient")
    public interface RelationshipsService {
        @Post("/atlas/v2/relationship")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> create(
                @HostParam("Endpoint") String endpoint,
                @BodyParam("application/json") BinaryData relationship,
                RequestOptions requestOptions,
                Context context);

        @Put("/atlas/v2/relationship")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> update(
                @HostParam("Endpoint") String endpoint,
                @BodyParam("application/json") BinaryData relationship,
                RequestOptions requestOptions,
                Context context);

        @Get("/atlas/v2/relationship/guid/{guid}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> get(
                @HostParam("Endpoint") String endpoint,
                @PathParam("guid") String guid,
                RequestOptions requestOptions,
                Context context);

        @Delete("/atlas/v2/relationship/guid/{guid}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> delete(
                @HostParam("Endpoint") String endpoint,
                @PathParam("guid") String guid,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Create a new relationship between entities.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasRelationship along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createWithResponseAsync(BinaryData relationship, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.create(this.client.getEndpoint(), relationship, requestOptions, context));
    }

    /**
     * Create a new relationship between entities.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasRelationship along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createWithResponseAsync(
            BinaryData relationship, RequestOptions requestOptions, Context context) {
        return service.create(this.client.getEndpoint(), relationship, requestOptions, context);
    }

    /**
     * Create a new relationship between entities.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasRelationship along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createWithResponse(BinaryData relationship, RequestOptions requestOptions) {
        return createWithResponseAsync(relationship, requestOptions).block();
    }

    /**
     * Update an existing relationship between entities.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasRelationship along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(BinaryData relationship, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.update(this.client.getEndpoint(), relationship, requestOptions, context));
    }

    /**
     * Update an existing relationship between entities.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasRelationship along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            BinaryData relationship, RequestOptions requestOptions, Context context) {
        return service.update(this.client.getEndpoint(), relationship, requestOptions, context);
    }

    /**
     * Update an existing relationship between entities.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasRelationship along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(BinaryData relationship, RequestOptions requestOptions) {
        return updateWithResponseAsync(relationship, requestOptions).block();
    }

    /**
     * Get relationship information between entities by its GUID.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>extendedInfo</td><td>String</td><td>No</td><td>Limits whether includes extended information.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     referredEntities: {
     *         String: {
     *             attributes: {
     *                 String: Object
     *             }
     *             typeName: String
     *             lastModifiedTS: String
     *             classificationNames: [
     *                 String
     *             ]
     *             classifications: [
     *                 {
     *                     attributes: {
     *                         String: Object
     *                     }
     *                     typeName: String
     *                     lastModifiedTS: String
     *                     entityGuid: String
     *                     entityStatus: String(ACTIVE/DELETED)
     *                     removePropagationsOnEntityDelete: Boolean
     *                     validityPeriods: [
     *                         {
     *                             endTime: String
     *                             startTime: String
     *                             timeZone: String
     *                         }
     *                     ]
     *                     source: String
     *                     sourceDetails: {
     *                         String: Object
     *                     }
     *                 }
     *             ]
     *             displayText: String
     *             guid: String
     *             meaningNames: [
     *                 String
     *             ]
     *             meanings: [
     *                 {
     *                     confidence: Integer
     *                     createdBy: String
     *                     description: String
     *                     displayText: String
     *                     expression: String
     *                     relationGuid: String
     *                     source: String
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER)
     *                     steward: String
     *                     termGuid: String
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED)
     *         }
     *     }
     *     relationship: {
     *         attributes: {
     *             String: Object
     *         }
     *         typeName: String
     *         lastModifiedTS: String
     *         createTime: Float
     *         createdBy: String
     *         end1: {
     *             guid: String
     *             typeName: String
     *             uniqueAttributes: {
     *                 String: Object
     *             }
     *         }
     *         end2: (recursive schema, see end2 above)
     *         guid: String
     *         homeId: String
     *         label: String
     *         provenanceType: Float
     *         status: String(ACTIVE/DELETED)
     *         updateTime: Float
     *         updatedBy: String
     *         version: Float
     *     }
     * }
     * }</pre>
     *
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return relationship information between entities by its GUID along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(String guid, RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.get(this.client.getEndpoint(), guid, requestOptions, context));
    }

    /**
     * Get relationship information between entities by its GUID.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>extendedInfo</td><td>String</td><td>No</td><td>Limits whether includes extended information.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     referredEntities: {
     *         String: {
     *             attributes: {
     *                 String: Object
     *             }
     *             typeName: String
     *             lastModifiedTS: String
     *             classificationNames: [
     *                 String
     *             ]
     *             classifications: [
     *                 {
     *                     attributes: {
     *                         String: Object
     *                     }
     *                     typeName: String
     *                     lastModifiedTS: String
     *                     entityGuid: String
     *                     entityStatus: String(ACTIVE/DELETED)
     *                     removePropagationsOnEntityDelete: Boolean
     *                     validityPeriods: [
     *                         {
     *                             endTime: String
     *                             startTime: String
     *                             timeZone: String
     *                         }
     *                     ]
     *                     source: String
     *                     sourceDetails: {
     *                         String: Object
     *                     }
     *                 }
     *             ]
     *             displayText: String
     *             guid: String
     *             meaningNames: [
     *                 String
     *             ]
     *             meanings: [
     *                 {
     *                     confidence: Integer
     *                     createdBy: String
     *                     description: String
     *                     displayText: String
     *                     expression: String
     *                     relationGuid: String
     *                     source: String
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER)
     *                     steward: String
     *                     termGuid: String
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED)
     *         }
     *     }
     *     relationship: {
     *         attributes: {
     *             String: Object
     *         }
     *         typeName: String
     *         lastModifiedTS: String
     *         createTime: Float
     *         createdBy: String
     *         end1: {
     *             guid: String
     *             typeName: String
     *             uniqueAttributes: {
     *                 String: Object
     *             }
     *         }
     *         end2: (recursive schema, see end2 above)
     *         guid: String
     *         homeId: String
     *         label: String
     *         provenanceType: Float
     *         status: String(ACTIVE/DELETED)
     *         updateTime: Float
     *         updatedBy: String
     *         version: Float
     *     }
     * }
     * }</pre>
     *
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return relationship information between entities by its GUID along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String guid, RequestOptions requestOptions, Context context) {
        return service.get(this.client.getEndpoint(), guid, requestOptions, context);
    }

    /**
     * Get relationship information between entities by its GUID.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>extendedInfo</td><td>String</td><td>No</td><td>Limits whether includes extended information.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     referredEntities: {
     *         String: {
     *             attributes: {
     *                 String: Object
     *             }
     *             typeName: String
     *             lastModifiedTS: String
     *             classificationNames: [
     *                 String
     *             ]
     *             classifications: [
     *                 {
     *                     attributes: {
     *                         String: Object
     *                     }
     *                     typeName: String
     *                     lastModifiedTS: String
     *                     entityGuid: String
     *                     entityStatus: String(ACTIVE/DELETED)
     *                     removePropagationsOnEntityDelete: Boolean
     *                     validityPeriods: [
     *                         {
     *                             endTime: String
     *                             startTime: String
     *                             timeZone: String
     *                         }
     *                     ]
     *                     source: String
     *                     sourceDetails: {
     *                         String: Object
     *                     }
     *                 }
     *             ]
     *             displayText: String
     *             guid: String
     *             meaningNames: [
     *                 String
     *             ]
     *             meanings: [
     *                 {
     *                     confidence: Integer
     *                     createdBy: String
     *                     description: String
     *                     displayText: String
     *                     expression: String
     *                     relationGuid: String
     *                     source: String
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER)
     *                     steward: String
     *                     termGuid: String
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED)
     *         }
     *     }
     *     relationship: {
     *         attributes: {
     *             String: Object
     *         }
     *         typeName: String
     *         lastModifiedTS: String
     *         createTime: Float
     *         createdBy: String
     *         end1: {
     *             guid: String
     *             typeName: String
     *             uniqueAttributes: {
     *                 String: Object
     *             }
     *         }
     *         end2: (recursive schema, see end2 above)
     *         guid: String
     *         homeId: String
     *         label: String
     *         provenanceType: Float
     *         status: String(ACTIVE/DELETED)
     *         updateTime: Float
     *         updatedBy: String
     *         version: Float
     *     }
     * }
     * }</pre>
     *
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return relationship information between entities by its GUID along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String guid, RequestOptions requestOptions) {
        return getWithResponseAsync(guid, requestOptions).block();
    }

    /**
     * Delete a relationship between entities by its GUID.
     *
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String guid, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.delete(this.client.getEndpoint(), guid, requestOptions, context));
    }

    /**
     * Delete a relationship between entities by its GUID.
     *
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String guid, RequestOptions requestOptions, Context context) {
        return service.delete(this.client.getEndpoint(), guid, requestOptions, context);
    }

    /**
     * Delete a relationship between entities by its GUID.
     *
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String guid, RequestOptions requestOptions) {
        return deleteWithResponseAsync(guid, requestOptions).block();
    }
}
