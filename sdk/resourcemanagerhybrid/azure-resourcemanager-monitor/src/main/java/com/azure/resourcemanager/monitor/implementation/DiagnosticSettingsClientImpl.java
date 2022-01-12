// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.fluent.DiagnosticSettingsClient;
import com.azure.resourcemanager.monitor.fluent.models.DiagnosticSettingsResourceCollectionInner;
import com.azure.resourcemanager.monitor.fluent.models.DiagnosticSettingsResourceInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DiagnosticSettingsClient. */
public final class DiagnosticSettingsClientImpl implements InnerSupportsDelete<Void>, DiagnosticSettingsClient {
    private final ClientLogger logger = new ClientLogger(DiagnosticSettingsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DiagnosticSettingsService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of DiagnosticSettingsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DiagnosticSettingsClientImpl(MonitorClientImpl client) {
        this.service =
            RestProxy.create(DiagnosticSettingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientDiagnosticSettings to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientDiagnos")
    private interface DiagnosticSettingsService {
        @Headers({"Content-Type: application/json"})
        @Get("/{resourceUri}/providers/Microsoft.Insights/diagnosticSettings/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiagnosticSettingsResourceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @PathParam("name") String name,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put("/{resourceUri}/providers/Microsoft.Insights/diagnosticSettings/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiagnosticSettingsResourceInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @PathParam("name") String name,
            @BodyParam("application/json") DiagnosticSettingsResourceInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Delete("/{resourceUri}/providers/Microsoft.Insights/diagnosticSettings/{name}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @PathParam("name") String name,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/{resourceUri}/providers/Microsoft.Insights/diagnosticSettings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiagnosticSettingsResourceCollectionInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DiagnosticSettingsResourceInner>> getWithResponseAsync(String resourceUri, String name) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.get(this.client.getEndpoint(), resourceUri, apiVersion, name, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiagnosticSettingsResourceInner>> getWithResponseAsync(
        String resourceUri, String name, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceUri, apiVersion, name, accept, context);
    }

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DiagnosticSettingsResourceInner> getAsync(String resourceUri, String name) {
        return getWithResponseAsync(resourceUri, name)
            .flatMap(
                (Response<DiagnosticSettingsResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiagnosticSettingsResourceInner get(String resourceUri, String name) {
        return getAsync(resourceUri, name).block();
    }

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiagnosticSettingsResourceInner> getWithResponse(String resourceUri, String name, Context context) {
        return getWithResponseAsync(resourceUri, name, context).block();
    }

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DiagnosticSettingsResourceInner>> createOrUpdateWithResponseAsync(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(), resourceUri, apiVersion, name, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiagnosticSettingsResourceInner>> createOrUpdateWithResponseAsync(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(this.client.getEndpoint(), resourceUri, apiVersion, name, parameters, accept, context);
    }

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DiagnosticSettingsResourceInner> createOrUpdateAsync(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters) {
        return createOrUpdateWithResponseAsync(resourceUri, name, parameters)
            .flatMap(
                (Response<DiagnosticSettingsResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiagnosticSettingsResourceInner createOrUpdate(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters) {
        return createOrUpdateAsync(resourceUri, name, parameters).block();
    }

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiagnosticSettingsResourceInner> createOrUpdateWithResponse(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters, Context context) {
        return createOrUpdateWithResponseAsync(resourceUri, name, parameters, context).block();
    }

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceUri, String name) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.delete(this.client.getEndpoint(), resourceUri, apiVersion, name, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceUri, String name, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), resourceUri, apiVersion, name, accept, context);
    }

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceUri, String name) {
        return deleteWithResponseAsync(resourceUri, name).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceUri, String name) {
        deleteAsync(resourceUri, name).block();
    }

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String resourceUri, String name, Context context) {
        return deleteWithResponseAsync(resourceUri, name, context).block();
    }

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings list for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DiagnosticSettingsResourceCollectionInner>> listWithResponseAsync(String resourceUri) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), resourceUri, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings list for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiagnosticSettingsResourceCollectionInner>> listWithResponseAsync(
        String resourceUri, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), resourceUri, apiVersion, accept, context);
    }

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings list for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DiagnosticSettingsResourceCollectionInner> listAsync(String resourceUri) {
        return listWithResponseAsync(resourceUri)
            .flatMap(
                (Response<DiagnosticSettingsResourceCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings list for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiagnosticSettingsResourceCollectionInner list(String resourceUri) {
        return listAsync(resourceUri).block();
    }

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings list for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiagnosticSettingsResourceCollectionInner> listWithResponse(String resourceUri, Context context) {
        return listWithResponseAsync(resourceUri, context).block();
    }
}
