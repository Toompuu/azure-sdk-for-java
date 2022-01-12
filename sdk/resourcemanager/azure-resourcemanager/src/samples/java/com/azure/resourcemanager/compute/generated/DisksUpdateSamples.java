// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.DiskUpdate;
import com.azure.resourcemanager.compute.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.models.SupportedCapabilities;

/** Samples for Disks Update. */
public final class DisksUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-04-01/examples/UpdateAManagedDiskToDisableBursting.json
     */
    /**
     * Sample code: Update a managed disk to disable bursting.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskToDisableBursting(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDisks()
            .update("myResourceGroup", "myDisk", new DiskUpdate().withBurstingEnabled(false), Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-04-01/examples/UpdateAManagedDiskToAddPurchasePlan.json
     */
    /**
     * Sample code: Update a managed disk to add purchase plan.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskToAddPurchasePlan(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDisks()
            .update(
                "myResourceGroup",
                "myDisk",
                new DiskUpdate()
                    .withPurchasePlan(
                        new PurchasePlanAutoGenerated()
                            .withName("myPurchasePlanName")
                            .withPublisher("myPurchasePlanPublisher")
                            .withProduct("myPurchasePlanProduct")
                            .withPromotionCode("myPurchasePlanPromotionCode")),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-04-01/examples/UpdateAManagedDiskToChangeTier.json
     */
    /**
     * Sample code: Update a managed disk to change tier.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskToChangeTier(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDisks()
            .update("myResourceGroup", "myDisk", new DiskUpdate().withTier("P30"), Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-04-01/examples/CreateOrUpdateABurstingEnabledManagedDisk.json
     */
    /**
     * Sample code: Create or update a bursting enabled managed disk.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateABurstingEnabledManagedDisk(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDisks()
            .update(
                "myResourceGroup",
                "myDisk",
                new DiskUpdate().withDiskSizeGB(1024).withBurstingEnabled(true),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-04-01/examples/UpdateAManagedDiskToAddSupportsHibernation.json
     */
    /**
     * Sample code: Update a managed disk to add supportsHibernation.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskToAddSupportsHibernation(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDisks()
            .update("myResourceGroup", "myDisk", new DiskUpdate().withSupportsHibernation(true), Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-04-01/examples/UpdateAManagedDiskToRemoveDiskAccess.json
     */
    /**
     * Sample code: Update managed disk to remove disk access resource association.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateManagedDiskToRemoveDiskAccessResourceAssociation(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDisks()
            .update(
                "myResourceGroup",
                "myDisk",
                new DiskUpdate().withNetworkAccessPolicy(NetworkAccessPolicy.ALLOW_ALL),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-04-01/examples/UpdateAManagedDiskToAddAcceleratedNetworking.json
     */
    /**
     * Sample code: Update a managed disk to add accelerated networking.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskToAddAcceleratedNetworking(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDisks()
            .update(
                "myResourceGroup",
                "myDisk",
                new DiskUpdate().withSupportedCapabilities(new SupportedCapabilities().withAcceleratedNetwork(false)),
                Context.NONE);
    }
}
