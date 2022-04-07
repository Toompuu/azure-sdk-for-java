// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.AddressSpace;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualNetworkBgpCommunities;
import com.azure.resourcemanager.network.models.VirtualNetworkEncryption;
import com.azure.resourcemanager.network.models.VirtualNetworkPeeringLevel;
import com.azure.resourcemanager.network.models.VirtualNetworkPeeringState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the virtual network peering. */
@Fluent
public final class VirtualNetworkPeeringPropertiesFormat {
    /*
     * Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     */
    @JsonProperty(value = "allowVirtualNetworkAccess")
    private Boolean allowVirtualNetworkAccess;

    /*
     * Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     */
    @JsonProperty(value = "allowForwardedTraffic")
    private Boolean allowForwardedTraffic;

    /*
     * If gateway links can be used in remote virtual networking to link to
     * this virtual network.
     */
    @JsonProperty(value = "allowGatewayTransit")
    private Boolean allowGatewayTransit;

    /*
     * If remote gateways can be used on this virtual network. If the flag is
     * set to true, and allowGatewayTransit on remote peering is also true,
     * virtual network will use gateways of remote virtual network for transit.
     * Only one peering can have this flag set to true. This flag cannot be set
     * if virtual network already has a gateway.
     */
    @JsonProperty(value = "useRemoteGateways")
    private Boolean useRemoteGateways;

    /*
     * The reference to the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register
     * for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     */
    @JsonProperty(value = "remoteVirtualNetwork")
    private SubResource remoteVirtualNetwork;

    /*
     * The reference to the address space peered with the remote virtual
     * network.
     */
    @JsonProperty(value = "remoteAddressSpace")
    private AddressSpace remoteAddressSpace;

    /*
     * The reference to the current address space of the remote virtual
     * network.
     */
    @JsonProperty(value = "remoteVirtualNetworkAddressSpace")
    private AddressSpace remoteVirtualNetworkAddressSpace;

    /*
     * The reference to the remote virtual network's Bgp Communities.
     */
    @JsonProperty(value = "remoteBgpCommunities")
    private VirtualNetworkBgpCommunities remoteBgpCommunities;

    /*
     * The reference to the remote virtual network's encryption
     */
    @JsonProperty(value = "remoteVirtualNetworkEncryption", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkEncryption remoteVirtualNetworkEncryption;

    /*
     * The status of the virtual network peering.
     */
    @JsonProperty(value = "peeringState")
    private VirtualNetworkPeeringState peeringState;

    /*
     * The peering sync status of the virtual network peering.
     */
    @JsonProperty(value = "peeringSyncLevel")
    private VirtualNetworkPeeringLevel peeringSyncLevel;

    /*
     * The provisioning state of the virtual network peering resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * If we need to verify the provisioning state of the remote gateway.
     */
    @JsonProperty(value = "doNotVerifyRemoteGateways")
    private Boolean doNotVerifyRemoteGateways;

    /*
     * The resourceGuid property of the Virtual Network peering resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * Get the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     *
     * @return the allowVirtualNetworkAccess value.
     */
    public Boolean allowVirtualNetworkAccess() {
        return this.allowVirtualNetworkAccess;
    }

    /**
     * Set the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     *
     * @param allowVirtualNetworkAccess the allowVirtualNetworkAccess value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
        this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
        return this;
    }

    /**
     * Get the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     *
     * @return the allowForwardedTraffic value.
     */
    public Boolean allowForwardedTraffic() {
        return this.allowForwardedTraffic;
    }

    /**
     * Set the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     *
     * @param allowForwardedTraffic the allowForwardedTraffic value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withAllowForwardedTraffic(Boolean allowForwardedTraffic) {
        this.allowForwardedTraffic = allowForwardedTraffic;
        return this;
    }

    /**
     * Get the allowGatewayTransit property: If gateway links can be used in remote virtual networking to link to this
     * virtual network.
     *
     * @return the allowGatewayTransit value.
     */
    public Boolean allowGatewayTransit() {
        return this.allowGatewayTransit;
    }

    /**
     * Set the allowGatewayTransit property: If gateway links can be used in remote virtual networking to link to this
     * virtual network.
     *
     * @param allowGatewayTransit the allowGatewayTransit value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withAllowGatewayTransit(Boolean allowGatewayTransit) {
        this.allowGatewayTransit = allowGatewayTransit;
        return this;
    }

    /**
     * Get the useRemoteGateways property: If remote gateways can be used on this virtual network. If the flag is set to
     * true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual
     * network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network
     * already has a gateway.
     *
     * @return the useRemoteGateways value.
     */
    public Boolean useRemoteGateways() {
        return this.useRemoteGateways;
    }

    /**
     * Set the useRemoteGateways property: If remote gateways can be used on this virtual network. If the flag is set to
     * true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual
     * network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network
     * already has a gateway.
     *
     * @param useRemoteGateways the useRemoteGateways value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withUseRemoteGateways(Boolean useRemoteGateways) {
        this.useRemoteGateways = useRemoteGateways;
        return this;
    }

    /**
     * Get the remoteVirtualNetwork property: The reference to the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     *
     * @return the remoteVirtualNetwork value.
     */
    public SubResource remoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }

    /**
     * Set the remoteVirtualNetwork property: The reference to the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     *
     * @param remoteVirtualNetwork the remoteVirtualNetwork value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        return this;
    }

    /**
     * Get the remoteAddressSpace property: The reference to the address space peered with the remote virtual network.
     *
     * @return the remoteAddressSpace value.
     */
    public AddressSpace remoteAddressSpace() {
        return this.remoteAddressSpace;
    }

    /**
     * Set the remoteAddressSpace property: The reference to the address space peered with the remote virtual network.
     *
     * @param remoteAddressSpace the remoteAddressSpace value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withRemoteAddressSpace(AddressSpace remoteAddressSpace) {
        this.remoteAddressSpace = remoteAddressSpace;
        return this;
    }

    /**
     * Get the remoteVirtualNetworkAddressSpace property: The reference to the current address space of the remote
     * virtual network.
     *
     * @return the remoteVirtualNetworkAddressSpace value.
     */
    public AddressSpace remoteVirtualNetworkAddressSpace() {
        return this.remoteVirtualNetworkAddressSpace;
    }

    /**
     * Set the remoteVirtualNetworkAddressSpace property: The reference to the current address space of the remote
     * virtual network.
     *
     * @param remoteVirtualNetworkAddressSpace the remoteVirtualNetworkAddressSpace value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withRemoteVirtualNetworkAddressSpace(
        AddressSpace remoteVirtualNetworkAddressSpace) {
        this.remoteVirtualNetworkAddressSpace = remoteVirtualNetworkAddressSpace;
        return this;
    }

    /**
     * Get the remoteBgpCommunities property: The reference to the remote virtual network's Bgp Communities.
     *
     * @return the remoteBgpCommunities value.
     */
    public VirtualNetworkBgpCommunities remoteBgpCommunities() {
        return this.remoteBgpCommunities;
    }

    /**
     * Set the remoteBgpCommunities property: The reference to the remote virtual network's Bgp Communities.
     *
     * @param remoteBgpCommunities the remoteBgpCommunities value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withRemoteBgpCommunities(
        VirtualNetworkBgpCommunities remoteBgpCommunities) {
        this.remoteBgpCommunities = remoteBgpCommunities;
        return this;
    }

    /**
     * Get the remoteVirtualNetworkEncryption property: The reference to the remote virtual network's encryption.
     *
     * @return the remoteVirtualNetworkEncryption value.
     */
    public VirtualNetworkEncryption remoteVirtualNetworkEncryption() {
        return this.remoteVirtualNetworkEncryption;
    }

    /**
     * Get the peeringState property: The status of the virtual network peering.
     *
     * @return the peeringState value.
     */
    public VirtualNetworkPeeringState peeringState() {
        return this.peeringState;
    }

    /**
     * Set the peeringState property: The status of the virtual network peering.
     *
     * @param peeringState the peeringState value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withPeeringState(VirtualNetworkPeeringState peeringState) {
        this.peeringState = peeringState;
        return this;
    }

    /**
     * Get the peeringSyncLevel property: The peering sync status of the virtual network peering.
     *
     * @return the peeringSyncLevel value.
     */
    public VirtualNetworkPeeringLevel peeringSyncLevel() {
        return this.peeringSyncLevel;
    }

    /**
     * Set the peeringSyncLevel property: The peering sync status of the virtual network peering.
     *
     * @param peeringSyncLevel the peeringSyncLevel value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withPeeringSyncLevel(VirtualNetworkPeeringLevel peeringSyncLevel) {
        this.peeringSyncLevel = peeringSyncLevel;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network peering resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the doNotVerifyRemoteGateways property: If we need to verify the provisioning state of the remote gateway.
     *
     * @return the doNotVerifyRemoteGateways value.
     */
    public Boolean doNotVerifyRemoteGateways() {
        return this.doNotVerifyRemoteGateways;
    }

    /**
     * Set the doNotVerifyRemoteGateways property: If we need to verify the provisioning state of the remote gateway.
     *
     * @param doNotVerifyRemoteGateways the doNotVerifyRemoteGateways value to set.
     * @return the VirtualNetworkPeeringPropertiesFormat object itself.
     */
    public VirtualNetworkPeeringPropertiesFormat withDoNotVerifyRemoteGateways(Boolean doNotVerifyRemoteGateways) {
        this.doNotVerifyRemoteGateways = doNotVerifyRemoteGateways;
        return this;
    }

    /**
     * Get the resourceGuid property: The resourceGuid property of the Virtual Network peering resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (remoteAddressSpace() != null) {
            remoteAddressSpace().validate();
        }
        if (remoteVirtualNetworkAddressSpace() != null) {
            remoteVirtualNetworkAddressSpace().validate();
        }
        if (remoteBgpCommunities() != null) {
            remoteBgpCommunities().validate();
        }
        if (remoteVirtualNetworkEncryption() != null) {
            remoteVirtualNetworkEncryption().validate();
        }
    }
}
