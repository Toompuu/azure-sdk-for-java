// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.service.eventhubs;

import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.messaging.eventhubs.EventHubConsumerClient;
import com.azure.spring.service.AzureServiceClientBuilderFactoryTestBase;
import com.azure.spring.service.eventhubs.factory.EventHubClientBuilderFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class EventHubClientBuilderFactoryTest extends AzureServiceClientBuilderFactoryTestBase<EventHubClientBuilder,
    TestAzureEventHubProperties, EventHubClientBuilderFactory> {

    @Override
    protected TestAzureEventHubProperties createMinimalServiceProperties() {
        TestAzureEventHubProperties testAzureEventHubProperties = new TestAzureEventHubProperties();
        return testAzureEventHubProperties;
    }

    @Test
    void testRetryOptionsConfigured() {
        ArrayList<String> list = new ArrayList<>();

        TestAzureEventHubProperties properties = createMinimalServiceProperties();
        final EventHubClientBuilderFactoryExt builderFactory = new EventHubClientBuilderFactoryExt(properties);
        final EventHubClientBuilder builder = builderFactory.build();
        final EventHubConsumerClient client = builder.buildConsumerClient();
        verify(builder, times(1)).retry(any(AmqpRetryOptions.class));
    }

    static class EventHubClientBuilderFactoryExt extends EventHubClientBuilderFactory {

        EventHubClientBuilderFactoryExt(TestAzureEventHubProperties properties) {
            super(properties);
        }

        @Override
        public EventHubClientBuilder createBuilderInstance() {
            return mock(EventHubClientBuilder.class);
        }
    }
}
