// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.apimanagement.models.BackendCredentialsContract;
import com.azure.resourcemanager.apimanagement.models.BackendProperties;
import com.azure.resourcemanager.apimanagement.models.BackendProtocol;
import com.azure.resourcemanager.apimanagement.models.BackendProxyContract;
import com.azure.resourcemanager.apimanagement.models.BackendTlsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Backend details. */
@Fluent
public final class BackendContractInner extends ProxyResource {
    /*
     * Backend entity contract properties.
     */
    @JsonProperty(value = "properties")
    private BackendContractProperties innerProperties;

    /**
     * Get the innerProperties property: Backend entity contract properties.
     *
     * @return the innerProperties value.
     */
    private BackendContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the url property: Runtime Url of the Backend.
     *
     * @return the url value.
     */
    public String url() {
        return this.innerProperties() == null ? null : this.innerProperties().url();
    }

    /**
     * Set the url property: Runtime Url of the Backend.
     *
     * @param url the url value to set.
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withUrl(String url) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendContractProperties();
        }
        this.innerProperties().withUrl(url);
        return this;
    }

    /**
     * Get the protocol property: Backend communication protocol.
     *
     * @return the protocol value.
     */
    public BackendProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: Backend communication protocol.
     *
     * @param protocol the protocol value to set.
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withProtocol(BackendProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendContractProperties();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the title property: Backend Title.
     *
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: Backend Title.
     *
     * @param title the title value to set.
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendContractProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the description property: Backend Description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Backend Description.
     *
     * @param description the description value to set.
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the resourceId property: Management Uri of the Resource in External System. This url can be the Arm Resource
     * Id of Logic Apps, Function Apps or API Apps.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: Management Uri of the Resource in External System. This url can be the Arm Resource
     * Id of Logic Apps, Function Apps or API Apps.
     *
     * @param resourceId the resourceId value to set.
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendContractProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the properties property: Backend Properties contract.
     *
     * @return the properties value.
     */
    public BackendProperties properties() {
        return this.innerProperties() == null ? null : this.innerProperties().properties();
    }

    /**
     * Set the properties property: Backend Properties contract.
     *
     * @param properties the properties value to set.
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withProperties(BackendProperties properties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendContractProperties();
        }
        this.innerProperties().withProperties(properties);
        return this;
    }

    /**
     * Get the credentials property: Backend Credentials Contract Properties.
     *
     * @return the credentials value.
     */
    public BackendCredentialsContract credentials() {
        return this.innerProperties() == null ? null : this.innerProperties().credentials();
    }

    /**
     * Set the credentials property: Backend Credentials Contract Properties.
     *
     * @param credentials the credentials value to set.
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withCredentials(BackendCredentialsContract credentials) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendContractProperties();
        }
        this.innerProperties().withCredentials(credentials);
        return this;
    }

    /**
     * Get the proxy property: Backend Proxy Contract Properties.
     *
     * @return the proxy value.
     */
    public BackendProxyContract proxy() {
        return this.innerProperties() == null ? null : this.innerProperties().proxy();
    }

    /**
     * Set the proxy property: Backend Proxy Contract Properties.
     *
     * @param proxy the proxy value to set.
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withProxy(BackendProxyContract proxy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendContractProperties();
        }
        this.innerProperties().withProxy(proxy);
        return this;
    }

    /**
     * Get the tls property: Backend TLS Properties.
     *
     * @return the tls value.
     */
    public BackendTlsProperties tls() {
        return this.innerProperties() == null ? null : this.innerProperties().tls();
    }

    /**
     * Set the tls property: Backend TLS Properties.
     *
     * @param tls the tls value to set.
     * @return the BackendContractInner object itself.
     */
    public BackendContractInner withTls(BackendTlsProperties tls) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendContractProperties();
        }
        this.innerProperties().withTls(tls);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
