// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpTag;
import com.azure.resourcemanager.network.models.IpVersion;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.ReferencedPublicIpAddress;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Public IP prefix properties. */
@Fluent
public final class PublicIpPrefixPropertiesFormatInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpPrefixPropertiesFormatInner.class);

    /*
     * The public IP address version.
     */
    @JsonProperty(value = "publicIPAddressVersion")
    private IpVersion publicIpAddressVersion;

    /*
     * The list of tags associated with the public IP prefix.
     */
    @JsonProperty(value = "ipTags")
    private List<IpTag> ipTags;

    /*
     * The Length of the Public IP Prefix.
     */
    @JsonProperty(value = "prefixLength")
    private Integer prefixLength;

    /*
     * The allocated Prefix.
     */
    @JsonProperty(value = "ipPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String ipPrefix;

    /*
     * The list of all referenced PublicIPAddresses.
     */
    @JsonProperty(value = "publicIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReferencedPublicIpAddress> publicIpAddresses;

    /*
     * The reference to load balancer frontend IP configuration associated with
     * the public IP prefix.
     */
    @JsonProperty(value = "loadBalancerFrontendIpConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource loadBalancerFrontendIpConfiguration;

    /*
     * The customIpPrefix that this prefix is associated with.
     */
    @JsonProperty(value = "customIPPrefix")
    private SubResource customIpPrefix;

    /*
     * The resource GUID property of the public IP prefix resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the public IP prefix resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * NatGateway of Public IP Prefix.
     */
    @JsonProperty(value = "natGateway")
    private NatGatewayInner natGateway;

    /**
     * Get the publicIpAddressVersion property: The public IP address version.
     *
     * @return the publicIpAddressVersion value.
     */
    public IpVersion publicIpAddressVersion() {
        return this.publicIpAddressVersion;
    }

    /**
     * Set the publicIpAddressVersion property: The public IP address version.
     *
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the PublicIpPrefixPropertiesFormatInner object itself.
     */
    public PublicIpPrefixPropertiesFormatInner withPublicIpAddressVersion(IpVersion publicIpAddressVersion) {
        this.publicIpAddressVersion = publicIpAddressVersion;
        return this;
    }

    /**
     * Get the ipTags property: The list of tags associated with the public IP prefix.
     *
     * @return the ipTags value.
     */
    public List<IpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of tags associated with the public IP prefix.
     *
     * @param ipTags the ipTags value to set.
     * @return the PublicIpPrefixPropertiesFormatInner object itself.
     */
    public PublicIpPrefixPropertiesFormatInner withIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the prefixLength property: The Length of the Public IP Prefix.
     *
     * @return the prefixLength value.
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the prefixLength property: The Length of the Public IP Prefix.
     *
     * @param prefixLength the prefixLength value to set.
     * @return the PublicIpPrefixPropertiesFormatInner object itself.
     */
    public PublicIpPrefixPropertiesFormatInner withPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
        return this;
    }

    /**
     * Get the ipPrefix property: The allocated Prefix.
     *
     * @return the ipPrefix value.
     */
    public String ipPrefix() {
        return this.ipPrefix;
    }

    /**
     * Get the publicIpAddresses property: The list of all referenced PublicIPAddresses.
     *
     * @return the publicIpAddresses value.
     */
    public List<ReferencedPublicIpAddress> publicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * Get the loadBalancerFrontendIpConfiguration property: The reference to load balancer frontend IP configuration
     * associated with the public IP prefix.
     *
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
    }

    /**
     * Get the customIpPrefix property: The customIpPrefix that this prefix is associated with.
     *
     * @return the customIpPrefix value.
     */
    public SubResource customIpPrefix() {
        return this.customIpPrefix;
    }

    /**
     * Set the customIpPrefix property: The customIpPrefix that this prefix is associated with.
     *
     * @param customIpPrefix the customIpPrefix value to set.
     * @return the PublicIpPrefixPropertiesFormatInner object itself.
     */
    public PublicIpPrefixPropertiesFormatInner withCustomIpPrefix(SubResource customIpPrefix) {
        this.customIpPrefix = customIpPrefix;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the public IP prefix resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the public IP prefix resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the natGateway property: NatGateway of Public IP Prefix.
     *
     * @return the natGateway value.
     */
    public NatGatewayInner natGateway() {
        return this.natGateway;
    }

    /**
     * Set the natGateway property: NatGateway of Public IP Prefix.
     *
     * @param natGateway the natGateway value to set.
     * @return the PublicIpPrefixPropertiesFormatInner object itself.
     */
    public PublicIpPrefixPropertiesFormatInner withNatGateway(NatGatewayInner natGateway) {
        this.natGateway = natGateway;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipTags() != null) {
            ipTags().forEach(e -> e.validate());
        }
        if (publicIpAddresses() != null) {
            publicIpAddresses().forEach(e -> e.validate());
        }
        if (natGateway() != null) {
            natGateway().validate();
        }
    }
}
