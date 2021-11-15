// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.resourcemanager;

import com.azure.resourcemanager.AzureResourceManager;
import com.azure.spring.cloud.autoconfigure.properties.AzureGlobalProperties;
import com.azure.spring.cloud.autoconfigure.storage.queue.properties.AzureStorageQueueProperties;
import com.azure.spring.cloud.resourcemanager.connectionstring.StorageQueueArmConnectionStringProvider;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class AzureStorageQueueResourceManagerAutoConfigurationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
        .withConfiguration(AutoConfigurations.of(AzureStorageQueueResourceManagerAutoConfiguration.class));

    @Test
    void testStorageQueueResourceManagerDisabled() {
        this.contextRunner
            .withPropertyValues(AzureStorageQueueProperties.PREFIX + "enabled=false")
            .run(context -> assertThat(context).doesNotHaveBean(StorageQueueArmConnectionStringProvider.class));
    }

    @Test
    void testAzureServiceBusResourceManagerAutoConfigurationBeans() {
        this.contextRunner
            .withUserConfiguration(AzureResourceManagerAutoConfiguration.class)
            .withBean(AzureResourceManager.class, () -> mock(AzureResourceManager.class))
            .withBean(AzureStorageQueueProperties.class, AzureStorageQueueProperties::new)
            .withBean(AzureGlobalProperties.class, AzureGlobalProperties::new)
            .withPropertyValues(AzureStorageQueueProperties.PREFIX + ".account-name=test-account")
            .run(context -> assertThat(context).hasSingleBean(StorageQueueArmConnectionStringProvider.class));
    }
}
