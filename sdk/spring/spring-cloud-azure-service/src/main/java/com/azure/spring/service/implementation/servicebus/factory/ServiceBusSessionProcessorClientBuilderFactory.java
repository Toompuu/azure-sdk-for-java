// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.service.implementation.servicebus.factory;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.spring.core.implementation.properties.PropertyMapper;
import com.azure.spring.service.implementation.servicebus.properties.ServiceBusProcessorClientProperties;
import com.azure.spring.service.servicebus.consumer.ServiceBusErrorHandler;
import com.azure.spring.service.servicebus.consumer.ServiceBusMessageListener;
import com.azure.spring.service.servicebus.consumer.ServiceBusRecordMessageListener;
import com.azure.spring.service.servicebus.properties.ServiceBusEntityType;
import org.springframework.util.Assert;

/**
 * Service Bus client builder factory, it builds the {@link ServiceBusClientBuilder}.
 */
public class ServiceBusSessionProcessorClientBuilderFactory extends AbstractServiceBusSubClientBuilderFactory<ServiceBusClientBuilder.ServiceBusSessionProcessorClientBuilder, ServiceBusProcessorClientProperties> {

    private final ServiceBusProcessorClientProperties processorClientProperties;
    private final ServiceBusMessageListener messageListener;
    private final ServiceBusErrorHandler errorHandler;

    /**
     * Create a {@link ServiceBusSessionProcessorClientBuilderFactory} instance with the {@link
     * ServiceBusProcessorClientProperties} and a {@link ServiceBusMessageListener}.
     *
     * @param properties the properties of a Service Bus processor client.
     * @param messageListener the message processing listener.
     * @param errorHandler the error handler.
     */
    public ServiceBusSessionProcessorClientBuilderFactory(ServiceBusProcessorClientProperties properties,
                                                          ServiceBusMessageListener messageListener,
                                                          ServiceBusErrorHandler errorHandler) {
        this(null, properties, messageListener, errorHandler);
    }

    /**
     * Create a {@link ServiceBusSessionProcessorClientBuilderFactory} instance with the {@link ServiceBusClientBuilder}
     * , the properties and the message processing listener.
     *
     * @param serviceBusClientBuilder the provided Service Bus client builder. If provided, the sub clients will be
     * created from this builder.
     * @param properties the processor client properties.
     * @param processingListener the message processing listener.
     * @param errorHandler the error handler.
     */
    public ServiceBusSessionProcessorClientBuilderFactory(ServiceBusClientBuilder serviceBusClientBuilder,
                                                          ServiceBusProcessorClientProperties properties,
                                                          ServiceBusMessageListener processingListener,
                                                          ServiceBusErrorHandler errorHandler) {
        super(serviceBusClientBuilder, properties);
        this.processorClientProperties = properties;
        this.messageListener = processingListener;
        this.errorHandler = errorHandler;
    }

    @Override
    protected ServiceBusClientBuilder.ServiceBusSessionProcessorClientBuilder createBuilderInstance() {
        return this.getServiceBusClientBuilder().sessionProcessor();
    }

    @Override
    protected void configureService(ServiceBusClientBuilder.ServiceBusSessionProcessorClientBuilder builder) {
        Assert.notNull(processorClientProperties.getEntityType(), "Entity type cannot be null.");
        Assert.notNull(processorClientProperties.getEntityName(), "Entity name cannot be null.");
        final PropertyMapper propertyMapper = new PropertyMapper();

        if (ServiceBusEntityType.QUEUE == processorClientProperties.getEntityType()) {
            propertyMapper.from(processorClientProperties.getEntityName()).to(builder::queueName);
        } else if (ServiceBusEntityType.TOPIC == processorClientProperties.getEntityType()) {
            propertyMapper.from(processorClientProperties.getEntityName()).to(builder::topicName);
        }

        propertyMapper.from(processorClientProperties.getSubscriptionName()).to(builder::subscriptionName);
        propertyMapper.from(processorClientProperties.getReceiveMode()).to(builder::receiveMode);
        propertyMapper.from(processorClientProperties.getSubQueue()).to(builder::subQueue);
        propertyMapper.from(processorClientProperties.getPrefetchCount()).to(builder::prefetchCount);
        propertyMapper.from(processorClientProperties.getMaxAutoLockRenewDuration()).to(builder::maxAutoLockRenewDuration);
        propertyMapper.from(processorClientProperties.getAutoComplete()).whenFalse().to(t -> builder.disableAutoComplete());
        propertyMapper.from(processorClientProperties.getMaxConcurrentCalls()).to(builder::maxConcurrentCalls);
        propertyMapper.from(processorClientProperties.getMaxConcurrentSessions()).to(builder::maxConcurrentSessions);

        propertyMapper.from(this.errorHandler).to(builder::processError);

        configureProcessorListener(builder);
    }

    private void configureProcessorListener(ServiceBusClientBuilder.ServiceBusSessionProcessorClientBuilder builder) {
        if (messageListener instanceof ServiceBusRecordMessageListener) {
            builder.processMessage(((ServiceBusRecordMessageListener) messageListener)::onMessage);
        } else {
            throw new IllegalArgumentException("A " + ServiceBusRecordMessageListener.class.getSimpleName()
                + " is required when configure record processor.");
        }
    }

}
