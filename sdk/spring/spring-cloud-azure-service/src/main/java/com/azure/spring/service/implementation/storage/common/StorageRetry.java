// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.service.implementation.storage.common;

import com.azure.spring.core.aware.RetryOptionsAware;

/**
 *  Interface to be implemented by classes that wish to describe storage sdks related retry operations.
 */
public interface StorageRetry extends RetryOptionsAware.HttpRetry {

    /**
     * Get the secondary host for retry.
     * @return the secondary host.
     */
    String getSecondaryHost();
}
