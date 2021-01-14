/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SqlPoolBlobAuditingPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SqlPoolBlobAuditingPolicies.
 */
public interface SqlPoolBlobAuditingPolicies extends SupportsCreating<SqlPoolBlobAuditingPolicy.DefinitionStages.Blank>, HasInner<SqlPoolBlobAuditingPoliciesInner> {
    /**
     * Get a SQL pool's blob auditing policy.
     * Get a SQL pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlPoolBlobAuditingPolicy> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Lists auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlPoolBlobAuditingPolicy> listBySqlPoolAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName);

}
