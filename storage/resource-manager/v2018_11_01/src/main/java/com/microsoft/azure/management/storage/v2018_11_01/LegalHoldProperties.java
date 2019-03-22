/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LegalHold property of a blob container.
 */
public class LegalHoldProperties {
    /**
     * The hasLegalHold public property is set to true by SRP if there are at
     * least one existing tag. The hasLegalHold public property is set to false
     * by SRP if all existing legal hold tags are cleared out. There can be a
     * maximum of 1000 blob containers with hasLegalHold=true for a given
     * account.
     */
    @JsonProperty(value = "hasLegalHold", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasLegalHold;

    /**
     * The list of LegalHold tags of a blob container.
     */
    @JsonProperty(value = "tags")
    private List<TagProperty> tags;

    /**
     * Get the hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     *
     * @return the hasLegalHold value
     */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }

    /**
     * Get the list of LegalHold tags of a blob container.
     *
     * @return the tags value
     */
    public List<TagProperty> tags() {
        return this.tags;
    }

    /**
     * Set the list of LegalHold tags of a blob container.
     *
     * @param tags the tags value to set
     * @return the LegalHoldProperties object itself.
     */
    public LegalHoldProperties withTags(List<TagProperty> tags) {
        this.tags = tags;
        return this;
    }

}
