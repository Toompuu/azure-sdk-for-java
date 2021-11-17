// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.service.servicebus.factory;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.spring.service.core.PropertyMapper;
import com.azure.spring.service.servicebus.properties.ServiceBusConsumerDescriptor;
import com.azure.spring.service.servicebus.properties.ServiceBusEntityType;
import org.springframework.util.Assert;

import static com.azure.spring.service.servicebus.properties.ServiceBusEntityType.TOPIC;

/**
 * Service Bus client builder factory, it builds the {@link ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder}.
 */
public class ServiceBusSessionReceiverClientBuilderFactory
    extends AbstractServiceBusSubClientBuilderFactory<ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder,
    ServiceBusConsumerDescriptor> {

    private final ServiceBusConsumerDescriptor consumerProperties;

    public ServiceBusSessionReceiverClientBuilderFactory(ServiceBusConsumerDescriptor consumerDescriptor) {
        this(null, consumerDescriptor);
    }

    public ServiceBusSessionReceiverClientBuilderFactory(ServiceBusClientBuilder serviceBusClientBuilder,
                                                         ServiceBusConsumerDescriptor consumerDescriptor) {
        super(serviceBusClientBuilder, consumerDescriptor);
        this.consumerProperties = consumerDescriptor;
    }

    @Override
    protected ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder createBuilderInstance() {
        return this.serviceBusClientBuilder.sessionReceiver();
    }

    @Override
    protected void configureService(ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder builder) {
        Assert.notNull(consumerProperties.getEntityType(), "Entity type cannot be null.");
        Assert.notNull(consumerProperties.getEntityName(), "Entity name cannot be null.");
        if (TOPIC == consumerProperties.getEntityType()) {
            Assert.notNull(consumerProperties.getSubscriptionName(), "Subscription cannot be null.");
        }

        final PropertyMapper propertyMapper = new PropertyMapper();
        if (ServiceBusEntityType.QUEUE == consumerProperties.getEntityType()) {
            propertyMapper.from(consumerProperties.getEntityName()).to(builder::queueName);
        } else if (TOPIC == consumerProperties.getEntityType()) {
            propertyMapper.from(consumerProperties.getEntityName()).to(builder::topicName);
            propertyMapper.from(consumerProperties.getSubscriptionName()).to(builder::subscriptionName);
        }

        propertyMapper.from(consumerProperties.getReceiveMode()).to(builder::receiveMode);
        propertyMapper.from(consumerProperties.getSubQueue()).to(builder::subQueue);
        propertyMapper.from(consumerProperties.getPrefetchCount()).to(builder::prefetchCount);
        propertyMapper.from(consumerProperties.getMaxAutoLockRenewDuration()).to(builder::maxAutoLockRenewDuration);
        propertyMapper.from(consumerProperties.getAutoComplete()).whenFalse().to(t -> builder.disableAutoComplete());
    }

}
