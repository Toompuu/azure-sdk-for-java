// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.service.implementation.cosmos;

import com.azure.cosmos.ConnectionMode;
import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.DirectConnectionConfig;
import com.azure.cosmos.GatewayConnectionConfig;
import com.azure.cosmos.ThrottlingRetryOptions;
import com.azure.spring.core.aware.RetryAware;
import com.azure.spring.core.aware.authentication.KeyAware;
import com.azure.spring.core.properties.AzureProperties;
import com.azure.spring.core.properties.retry.RetryProperties;

import java.util.List;

/**
 * Configuration properties for Cosmos database, consistency, telemetry, connection, query metrics and diagnostics.
 */
public interface CosmosClientProperties extends AzureProperties, KeyAware {

    /**
     * Get the cosmos service endpoint.
     * @return the cosmos service endpoint.
     */
    String getEndpoint();

    /**
     * Get the cosmos resource token.
     * @return the resource token.
     */
    String getResourceToken();

    /**
     * Get the client telemetry switch.
     * @return true or false.
     */
    Boolean getClientTelemetryEnabled();

    /**
     * Get the cosmos endpoint discovery switch.
     * @return true or false.
     */
    Boolean getEndpointDiscoveryEnabled();

    /**
     * Get the cosmos client connection sharing across clients switch.
     * @return true or false.
     */
    Boolean getConnectionSharingAcrossClientsEnabled();

    /**
     * Get the cosmos client content response on write switch.
     * @return true or false.
     */
    Boolean getContentResponseOnWriteEnabled();

    /**
     * Get the cosmos client multiple write region switch.
     * @return true or false.
     */
    Boolean getMultipleWriteRegionsEnabled();

    /**
     * Get the cosmos client session capturing override switch.
     * @return true or false.
     */
    Boolean getSessionCapturingOverrideEnabled();

    /**
     * Get the cosmos client session capturing override switch.
     * @return true or false.
     */
    Boolean getReadRequestsFallbackEnabled();

    /**
     * Get the cosmos client preferred regions.
     * @return the cosmos client preferred regions.
     */
    List<String> getPreferredRegions();

    /**
     * Get the cosmos client gateway connection.
     * @return the cosmos client gateway connection.
     */
    GatewayConnectionConfig getGatewayConnection();

    /**
     * Get the cosmos client direct connection config.
     * @return the cosmos client direct connection config.
     */
    DirectConnectionConfig getDirectConnection();

    /**
     * Get the cosmos client consistency level.
     * @return the cosmos client consistency level.
     */
    ConsistencyLevel getConsistencyLevel();

    /**
     * Get the cosmos database name.
     * @return the cosmos database name.
     */
    String getDatabase();

    /**
     * Get the cosmos client connection mode.
     * @return the cosmos client connection mode.
     */
    ConnectionMode getConnectionMode();

    /**
     * Get the cosmos client throttling retry options.
     * @return the cosmos client throttling retry options.
     */
    ThrottlingRetryOptions getThrottlingRetryOptions();

    @Override
    default RetryAware.Retry getRetry() {
        return new RetryProperties();
    }
}
