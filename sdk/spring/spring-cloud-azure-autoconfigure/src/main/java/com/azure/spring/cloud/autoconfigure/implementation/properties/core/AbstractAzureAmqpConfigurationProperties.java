// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.implementation.properties.core;

import com.azure.spring.cloud.autoconfigure.implementation.properties.core.client.AmqpClientConfigurationProperties;
import com.azure.spring.cloud.autoconfigure.implementation.properties.core.proxy.ProxyConfigurationProperties;
import com.azure.spring.cloud.autoconfigure.implementation.properties.core.retry.AmqpRetryConfigurationProperties;
import com.azure.spring.core.aware.RetryOptionsAware;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Configuration properties base class for all AMQP-based Azure Service clients.
 */
public abstract class AbstractAzureAmqpConfigurationProperties extends AbstractAzureServiceConfigurationProperties
    implements RetryOptionsAware {

    @NestedConfigurationProperty
    protected final AmqpClientConfigurationProperties client = new AmqpClientConfigurationProperties();

    @NestedConfigurationProperty
    protected final AmqpRetryConfigurationProperties retry = new AmqpRetryConfigurationProperties();

    @NestedConfigurationProperty
    protected final ProxyConfigurationProperties proxy = new ProxyConfigurationProperties();

    @Override
    public AmqpClientConfigurationProperties getClient() {
        return client;
    }

    @Override
    public AmqpRetryConfigurationProperties getRetry() {
        return retry;
    }

    @Override
    public ProxyConfigurationProperties getProxy() {
        return proxy;
    }
}
