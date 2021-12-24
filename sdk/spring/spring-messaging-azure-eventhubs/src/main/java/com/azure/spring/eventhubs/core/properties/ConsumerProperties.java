// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.eventhubs.core.properties;

import com.azure.spring.service.eventhubs.properties.EventHubConsumerProperties;

/**
 * An event hub consumer related properties.
 */
public class ConsumerProperties extends CommonProperties implements EventHubConsumerProperties {

    protected String consumerGroup;
    protected Integer prefetchCount;

    @Override
    public String getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * Set the custom endpoint address.
     * @param consumerGroup the custom endpoint address.
     */
    public void setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
    }

    @Override
    public Integer getPrefetchCount() {
        return prefetchCount;
    }

    /**
     * Set the prefetch count.
     * @param prefetchCount the prefetch count.
     */
    public void setPrefetchCount(Integer prefetchCount) {
        this.prefetchCount = prefetchCount;
    }

}
