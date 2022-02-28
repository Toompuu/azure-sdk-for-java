// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.eventhubs.implementation.properties.merger;

import com.azure.spring.core.implementation.util.AzurePropertiesUtils;
import com.azure.spring.core.implementation.properties.PropertyMapper;
import com.azure.spring.eventhubs.core.properties.NamespaceProperties;
import com.azure.spring.eventhubs.core.properties.ProcessorProperties;
import com.azure.spring.service.implementation.core.PropertiesMerger;

/**
 * A merger used to merge a {@link ProcessorProperties} with its parent {@link NamespaceProperties}. When a property is
 * set in the child, it will be kept. For those properties not set in the child, it will use the value in the parent.
 */
public class ProcessorPropertiesParentMerger implements PropertiesMerger<ProcessorProperties, NamespaceProperties> {

    @Override
    public ProcessorProperties merge(ProcessorProperties child, NamespaceProperties parent) {
        ProcessorProperties properties = new ProcessorProperties();
        if (child == null && parent == null) {
            return properties;
        }
        if (child == null) {
            child = new ProcessorProperties();
        }
        if (parent == null) {
            parent = new NamespaceProperties();
        }

        PropertyMapper propertyMapper = new PropertyMapper();

        AzurePropertiesUtils.mergeAzureCommonProperties(parent, child, properties);

        propertyMapper.from(parent.getDomainName()).to(properties::setDomainName);
        propertyMapper.from(parent.getNamespace()).to(properties::setNamespace);
        propertyMapper.from(parent.getEventHubName()).to(properties::setEventHubName);
        propertyMapper.from(parent.getConnectionString()).to(properties::setConnectionString);
        propertyMapper.from(parent.getCustomEndpointAddress()).to(properties::setCustomEndpointAddress);

        // If a same property appears in both two objects, the value from the child will take precedence.
        ProcessorPropertiesMerger.copyProcessorPropertiesIfNotNull(child, properties);

        return properties;
    }
}
