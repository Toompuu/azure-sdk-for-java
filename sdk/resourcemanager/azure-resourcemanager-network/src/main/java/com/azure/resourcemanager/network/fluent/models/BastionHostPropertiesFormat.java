// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.BastionHostIpConfiguration;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the Bastion Host. */
@Fluent
public final class BastionHostPropertiesFormat {
    /*
     * IP configuration of the Bastion Host resource.
     */
    @JsonProperty(value = "ipConfigurations")
    private List<BastionHostIpConfiguration> ipConfigurations;

    /*
     * FQDN for the endpoint on which bastion host is accessible.
     */
    @JsonProperty(value = "dnsName")
    private String dnsName;

    /*
     * The provisioning state of the bastion host resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The scale units for the Bastion Host resource.
     */
    @JsonProperty(value = "scaleUnits")
    private Integer scaleUnits;

    /*
     * Enable/Disable Copy/Paste feature of the Bastion Host resource.
     */
    @JsonProperty(value = "disableCopyPaste")
    private Boolean disableCopyPaste;

    /*
     * Enable/Disable File Copy feature of the Bastion Host resource.
     */
    @JsonProperty(value = "enableFileCopy")
    private Boolean enableFileCopy;

    /*
     * Enable/Disable IP Connect feature of the Bastion Host resource.
     */
    @JsonProperty(value = "enableIpConnect")
    private Boolean enableIpConnect;

    /*
     * Enable/Disable Shareable Link of the Bastion Host resource.
     */
    @JsonProperty(value = "enableShareableLink")
    private Boolean enableShareableLink;

    /*
     * Enable/Disable Tunneling feature of the Bastion Host resource.
     */
    @JsonProperty(value = "enableTunneling")
    private Boolean enableTunneling;

    /**
     * Get the ipConfigurations property: IP configuration of the Bastion Host resource.
     *
     * @return the ipConfigurations value.
     */
    public List<BastionHostIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: IP configuration of the Bastion Host resource.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the BastionHostPropertiesFormat object itself.
     */
    public BastionHostPropertiesFormat withIpConfigurations(List<BastionHostIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     *
     * @return the dnsName value.
     */
    public String dnsName() {
        return this.dnsName;
    }

    /**
     * Set the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     *
     * @param dnsName the dnsName value to set.
     * @return the BastionHostPropertiesFormat object itself.
     */
    public BastionHostPropertiesFormat withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the bastion host resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the scaleUnits property: The scale units for the Bastion Host resource.
     *
     * @return the scaleUnits value.
     */
    public Integer scaleUnits() {
        return this.scaleUnits;
    }

    /**
     * Set the scaleUnits property: The scale units for the Bastion Host resource.
     *
     * @param scaleUnits the scaleUnits value to set.
     * @return the BastionHostPropertiesFormat object itself.
     */
    public BastionHostPropertiesFormat withScaleUnits(Integer scaleUnits) {
        this.scaleUnits = scaleUnits;
        return this;
    }

    /**
     * Get the disableCopyPaste property: Enable/Disable Copy/Paste feature of the Bastion Host resource.
     *
     * @return the disableCopyPaste value.
     */
    public Boolean disableCopyPaste() {
        return this.disableCopyPaste;
    }

    /**
     * Set the disableCopyPaste property: Enable/Disable Copy/Paste feature of the Bastion Host resource.
     *
     * @param disableCopyPaste the disableCopyPaste value to set.
     * @return the BastionHostPropertiesFormat object itself.
     */
    public BastionHostPropertiesFormat withDisableCopyPaste(Boolean disableCopyPaste) {
        this.disableCopyPaste = disableCopyPaste;
        return this;
    }

    /**
     * Get the enableFileCopy property: Enable/Disable File Copy feature of the Bastion Host resource.
     *
     * @return the enableFileCopy value.
     */
    public Boolean enableFileCopy() {
        return this.enableFileCopy;
    }

    /**
     * Set the enableFileCopy property: Enable/Disable File Copy feature of the Bastion Host resource.
     *
     * @param enableFileCopy the enableFileCopy value to set.
     * @return the BastionHostPropertiesFormat object itself.
     */
    public BastionHostPropertiesFormat withEnableFileCopy(Boolean enableFileCopy) {
        this.enableFileCopy = enableFileCopy;
        return this;
    }

    /**
     * Get the enableIpConnect property: Enable/Disable IP Connect feature of the Bastion Host resource.
     *
     * @return the enableIpConnect value.
     */
    public Boolean enableIpConnect() {
        return this.enableIpConnect;
    }

    /**
     * Set the enableIpConnect property: Enable/Disable IP Connect feature of the Bastion Host resource.
     *
     * @param enableIpConnect the enableIpConnect value to set.
     * @return the BastionHostPropertiesFormat object itself.
     */
    public BastionHostPropertiesFormat withEnableIpConnect(Boolean enableIpConnect) {
        this.enableIpConnect = enableIpConnect;
        return this;
    }

    /**
     * Get the enableShareableLink property: Enable/Disable Shareable Link of the Bastion Host resource.
     *
     * @return the enableShareableLink value.
     */
    public Boolean enableShareableLink() {
        return this.enableShareableLink;
    }

    /**
     * Set the enableShareableLink property: Enable/Disable Shareable Link of the Bastion Host resource.
     *
     * @param enableShareableLink the enableShareableLink value to set.
     * @return the BastionHostPropertiesFormat object itself.
     */
    public BastionHostPropertiesFormat withEnableShareableLink(Boolean enableShareableLink) {
        this.enableShareableLink = enableShareableLink;
        return this;
    }

    /**
     * Get the enableTunneling property: Enable/Disable Tunneling feature of the Bastion Host resource.
     *
     * @return the enableTunneling value.
     */
    public Boolean enableTunneling() {
        return this.enableTunneling;
    }

    /**
     * Set the enableTunneling property: Enable/Disable Tunneling feature of the Bastion Host resource.
     *
     * @param enableTunneling the enableTunneling value to set.
     * @return the BastionHostPropertiesFormat object itself.
     */
    public BastionHostPropertiesFormat withEnableTunneling(Boolean enableTunneling) {
        this.enableTunneling = enableTunneling;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
