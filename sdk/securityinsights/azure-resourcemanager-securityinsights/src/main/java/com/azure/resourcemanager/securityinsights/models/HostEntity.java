// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.azure.resourcemanager.securityinsights.fluent.models.HostEntityProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Represents a host entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Host")
@Fluent
public final class HostEntity extends EntityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostEntity.class);

    /*
     * Host entity properties
     */
    @JsonProperty(value = "properties")
    private HostEntityProperties innerProperties;

    /**
     * Get the innerProperties property: Host entity properties.
     *
     * @return the innerProperties value.
     */
    private HostEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the azureId property: The azure resource id of the VM.
     *
     * @return the azureId value.
     */
    public String azureId() {
        return this.innerProperties() == null ? null : this.innerProperties().azureId();
    }

    /**
     * Get the dnsDomain property: The DNS domain that this host belongs to. Should contain the compete DNS suffix for
     * the domain.
     *
     * @return the dnsDomain value.
     */
    public String dnsDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsDomain();
    }

    /**
     * Get the hostname property: The hostname without the domain suffix.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the isDomainJoined property: Determines whether this host belongs to a domain.
     *
     * @return the isDomainJoined value.
     */
    public Boolean isDomainJoined() {
        return this.innerProperties() == null ? null : this.innerProperties().isDomainJoined();
    }

    /**
     * Get the netBiosName property: The host name (pre-windows2000).
     *
     * @return the netBiosName value.
     */
    public String netBiosName() {
        return this.innerProperties() == null ? null : this.innerProperties().netBiosName();
    }

    /**
     * Get the ntDomain property: The NT domain that this host belongs to.
     *
     * @return the ntDomain value.
     */
    public String ntDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().ntDomain();
    }

    /**
     * Get the omsAgentId property: The OMS agent id, if the host has OMS agent installed.
     *
     * @return the omsAgentId value.
     */
    public String omsAgentId() {
        return this.innerProperties() == null ? null : this.innerProperties().omsAgentId();
    }

    /**
     * Get the osFamily property: The operating system type.
     *
     * @return the osFamily value.
     */
    public OSFamily osFamily() {
        return this.innerProperties() == null ? null : this.innerProperties().osFamily();
    }

    /**
     * Set the osFamily property: The operating system type.
     *
     * @param osFamily the osFamily value to set.
     * @return the HostEntity object itself.
     */
    public HostEntity withOsFamily(OSFamily osFamily) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostEntityProperties();
        }
        this.innerProperties().withOsFamily(osFamily);
        return this;
    }

    /**
     * Get the osVersion property: A free text representation of the operating system. This field is meant to hold
     * specific versions the are more fine grained than OSFamily or future values not supported by OSFamily enumeration.
     *
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().osVersion();
    }

    /**
     * Get the additionalData property: A bag of custom fields that should be part of the entity and will be presented
     * to the user.
     *
     * @return the additionalData value.
     */
    public Map<String, Object> additionalData() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalData();
    }

    /**
     * Get the friendlyName property: The graph item display name which is a short humanly readable description of the
     * graph item instance. This property is optional and might be system generated.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
