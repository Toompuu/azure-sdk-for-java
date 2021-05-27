// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with CommunicationError information. */
public final class CommunicationErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the CommunicationErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public CommunicationErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the CommunicationErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public CommunicationErrorException(String message, HttpResponse response, CommunicationError value) {
        super(message, response, value);
    }

    @Override
    public CommunicationError getValue() {
        return (CommunicationError) super.getValue();
    }
}
