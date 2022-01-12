// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.ApplicationInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeletedApplicationsClient. */
public interface DeletedApplicationsClient {
    /**
     * Restores the deleted application in the directory.
     *
     * @param objectId Application object ID.
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory application information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ApplicationInner>> restoreWithResponseAsync(String objectId, String tenantId);

    /**
     * Restores the deleted application in the directory.
     *
     * @param objectId Application object ID.
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory application information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ApplicationInner> restoreAsync(String objectId, String tenantId);

    /**
     * Restores the deleted application in the directory.
     *
     * @param objectId Application object ID.
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory application information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInner restore(String objectId, String tenantId);

    /**
     * Restores the deleted application in the directory.
     *
     * @param objectId Application object ID.
     * @param tenantId The tenant ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory application information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInner> restoreWithResponse(String objectId, String tenantId, Context context);

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param tenantId The tenant ID.
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ApplicationInner> listAsync(String tenantId, String filter);

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ApplicationInner> listAsync(String tenantId);

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationInner> list(String tenantId);

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param tenantId The tenant ID.
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationInner> list(String tenantId, String filter, Context context);

    /**
     * Hard-delete an application.
     *
     * @param applicationObjectId Application object ID.
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> hardDeleteWithResponseAsync(String applicationObjectId, String tenantId);

    /**
     * Hard-delete an application.
     *
     * @param applicationObjectId Application object ID.
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> hardDeleteAsync(String applicationObjectId, String tenantId);

    /**
     * Hard-delete an application.
     *
     * @param applicationObjectId Application object ID.
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void hardDelete(String applicationObjectId, String tenantId);

    /**
     * Hard-delete an application.
     *
     * @param applicationObjectId Application object ID.
     * @param tenantId The tenant ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> hardDeleteWithResponse(String applicationObjectId, String tenantId, Context context);
}
