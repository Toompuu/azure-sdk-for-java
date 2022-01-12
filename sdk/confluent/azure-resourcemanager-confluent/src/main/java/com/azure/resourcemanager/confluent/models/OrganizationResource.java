// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.confluent.fluent.models.OrganizationResourceInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of OrganizationResource. */
public interface OrganizationResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the createdTime property: The creation time of the resource.
     *
     * @return the createdTime value.
     */
    OffsetDateTime createdTime();

    /**
     * Gets the provisioningState property: ProvisioningState Provision states for confluent RP.
     *
     * @return the provisioningState value.
     */
    ProvisionState provisioningState();

    /**
     * Gets the organizationId property: Id of the Confluent organization.
     *
     * @return the organizationId value.
     */
    String organizationId();

    /**
     * Gets the ssoUrl property: SSO url for the Confluent organization.
     *
     * @return the ssoUrl value.
     */
    String ssoUrl();

    /**
     * Gets the offerDetail property: Confluent offer detail.
     *
     * @return the offerDetail value.
     */
    OfferDetail offerDetail();

    /**
     * Gets the userDetail property: Subscriber detail.
     *
     * @return the userDetail value.
     */
    UserDetail userDetail();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.confluent.fluent.models.OrganizationResourceInner object.
     *
     * @return the inner object.
     */
    OrganizationResourceInner innerModel();

    /** The entirety of the OrganizationResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithOfferDetail,
            DefinitionStages.WithUserDetail,
            DefinitionStages.WithCreate {
    }
    /** The OrganizationResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the OrganizationResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the OrganizationResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the OrganizationResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Resource group name.
             * @return the next definition stage.
             */
            WithOfferDetail withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the OrganizationResource definition allowing to specify offerDetail. */
        interface WithOfferDetail {
            /**
             * Specifies the offerDetail property: Confluent offer detail.
             *
             * @param offerDetail Confluent offer detail.
             * @return the next definition stage.
             */
            WithUserDetail withOfferDetail(OfferDetail offerDetail);
        }
        /** The stage of the OrganizationResource definition allowing to specify userDetail. */
        interface WithUserDetail {
            /**
             * Specifies the userDetail property: Subscriber detail.
             *
             * @param userDetail Subscriber detail.
             * @return the next definition stage.
             */
            WithCreate withUserDetail(UserDetail userDetail);
        }
        /**
         * The stage of the OrganizationResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            OrganizationResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            OrganizationResource create(Context context);
        }
        /** The stage of the OrganizationResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }
    /**
     * Begins update for the OrganizationResource resource.
     *
     * @return the stage of resource update.
     */
    OrganizationResource.Update update();

    /** The template for OrganizationResource update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        OrganizationResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        OrganizationResource apply(Context context);
    }
    /** The OrganizationResource update stages. */
    interface UpdateStages {
        /** The stage of the OrganizationResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: ARM resource tags.
             *
             * @param tags ARM resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    OrganizationResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    OrganizationResource refresh(Context context);
}
