/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.Usage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.UsageName;

class UsageImpl extends WrapperImpl<UsageInner> implements Usage {
    private final CdnManager manager;
    UsageImpl(UsageInner inner, CdnManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public long currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public long limit() {
        return this.inner().limit();
    }

    @Override
    public UsageName name() {
        return this.inner().name();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
