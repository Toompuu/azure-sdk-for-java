// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.policy;

import com.azure.core.implementation.util.ObjectsUtil;
import com.azure.core.util.Configuration;
import com.azure.core.util.ConfigurationProperty;
import com.azure.core.util.ConfigurationDoc;
import com.azure.core.util.logging.ClientLogger;

import java.time.Duration;
import java.util.Objects;

/**
 * A fixed-delay implementation of {@link RetryStrategy} that has a fixed delay duration between each retry attempt.
 */
public class FixedDelay implements RetryStrategy {
    private static final ClientLogger LOGGER = new ClientLogger(FixedDelay.class);

    @ConfigurationDoc(description = "Max retry count.")
    private final static ConfigurationProperty<Integer> MAX_RETRIES_PROPERTY = ConfigurationProperty.integerPropertyBuilder("http.retry.fixed.max-retries")
        .global(true)
        .required(true)
        .build();

    @ConfigurationDoc(description = "retry delay.")
    private final static ConfigurationProperty<Duration> RETRY_DELAY_PROPERTY = ConfigurationProperty.durationPropertyBuilder("http.retry.fixed.delay")
        .global(true)
        .required(true)
        .build();

    private final int maxRetries;
    private final Duration delay;

    /**
     * Creates an instance of {@link FixedDelay}.
     *
     * @param maxRetries The max number of retry attempts that can be made.
     * @param delay The fixed delay duration between retry attempts.
     */
    public FixedDelay(int maxRetries, Duration delay) {
        if (maxRetries < 0) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("Max retries cannot be less than 0."));
        }
        this.maxRetries = maxRetries;
        this.delay = Objects.requireNonNull(delay, "'delay' cannot be null.");
    }

    /**
     * Creates an instance of {@link FixedDelay}.
     *
     * @param fixedDelayOptions The {@link FixedDelayOptions}.
     */
    public FixedDelay(FixedDelayOptions fixedDelayOptions) {
        this(
            ObjectsUtil.requireNonNullElse(
                Objects.requireNonNull(fixedDelayOptions, "'fixedDelayOptions' cannot be null.").getMaxRetries(),
                1),
            Objects.requireNonNull(fixedDelayOptions, "'fixedDelayOptions' cannot be null.").getDelay()
        );
    }

    @Override
    public int getMaxRetries() {
        return maxRetries;
    }

    @Override
    public Duration calculateRetryDelay(int retryAttempts) {
        return delay;
    }

    static RetryStrategy fromConfiguration(Configuration configuration ) {
        return new FixedDelay(configuration.get(MAX_RETRIES_PROPERTY), configuration.get(RETRY_DELAY_PROPERTY));
    }
}
