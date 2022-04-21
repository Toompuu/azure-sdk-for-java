// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.AccountEntityProperties;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;
import java.util.UUID;

/** Represents an account entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Account")
@Fluent
public final class AccountEntity extends EntityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccountEntity.class);

    /*
     * Account entity properties
     */
    @JsonProperty(value = "properties")
    private AccountEntityProperties innerProperties;

    /**
     * Get the innerProperties property: Account entity properties.
     *
     * @return the innerProperties value.
     */
    private AccountEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the aadTenantId property: The Azure Active Directory tenant id.
     *
     * @return the aadTenantId value.
     */
    public String aadTenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().aadTenantId();
    }

    /**
     * Get the aadUserId property: The Azure Active Directory user id.
     *
     * @return the aadUserId value.
     */
    public String aadUserId() {
        return this.innerProperties() == null ? null : this.innerProperties().aadUserId();
    }

    /**
     * Get the accountName property: The name of the account. This field should hold only the name without any domain
     * added to it, i.e. administrator.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.innerProperties() == null ? null : this.innerProperties().accountName();
    }

    /**
     * Get the displayName property: The display name of the account.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the hostEntityId property: The Host entity id that contains the account in case it is a local account (not
     * domain joined).
     *
     * @return the hostEntityId value.
     */
    public String hostEntityId() {
        return this.innerProperties() == null ? null : this.innerProperties().hostEntityId();
    }

    /**
     * Get the isDomainJoined property: Determines whether this is a domain account.
     *
     * @return the isDomainJoined value.
     */
    public Boolean isDomainJoined() {
        return this.innerProperties() == null ? null : this.innerProperties().isDomainJoined();
    }

    /**
     * Get the ntDomain property: The NetBIOS domain name as it appears in the alert format domain/username. Examples:
     * NT AUTHORITY.
     *
     * @return the ntDomain value.
     */
    public String ntDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().ntDomain();
    }

    /**
     * Get the objectGuid property: The objectGUID attribute is a single-value attribute that is the unique identifier
     * for the object, assigned by active directory.
     *
     * @return the objectGuid value.
     */
    public UUID objectGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().objectGuid();
    }

    /**
     * Get the puid property: The Azure Active Directory Passport User ID.
     *
     * @return the puid value.
     */
    public String puid() {
        return this.innerProperties() == null ? null : this.innerProperties().puid();
    }

    /**
     * Get the sid property: The account security identifier, e.g. S-1-5-18.
     *
     * @return the sid value.
     */
    public String sid() {
        return this.innerProperties() == null ? null : this.innerProperties().sid();
    }

    /**
     * Get the upnSuffix property: The user principal name suffix for the account, in some cases it is also the domain
     * name. Examples: contoso.com.
     *
     * @return the upnSuffix value.
     */
    public String upnSuffix() {
        return this.innerProperties() == null ? null : this.innerProperties().upnSuffix();
    }

    /**
     * Get the dnsDomain property: The fully qualified domain DNS name.
     *
     * @return the dnsDomain value.
     */
    public String dnsDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsDomain();
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
