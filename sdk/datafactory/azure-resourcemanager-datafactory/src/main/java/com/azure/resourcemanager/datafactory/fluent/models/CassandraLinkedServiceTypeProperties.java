// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cassandra linked service properties. */
@Fluent
public final class CassandraLinkedServiceTypeProperties {
    /*
     * Host name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "host", required = true)
    private Object host;

    /*
     * AuthenticationType to be used for connection. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "authenticationType")
    private Object authenticationType;

    /*
     * The port for the connection. Type: integer (or Expression with
     * resultType integer).
     */
    @JsonProperty(value = "port")
    private Object port;

    /*
     * Username for authentication. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * Password for authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the host property: Host name for connection. Type: string (or Expression with resultType string).
     *
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: Host name for connection. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set.
     * @return the CassandraLinkedServiceTypeProperties object itself.
     */
    public CassandraLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the authenticationType property: AuthenticationType to be used for connection. Type: string (or Expression
     * with resultType string).
     *
     * @return the authenticationType value.
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: AuthenticationType to be used for connection. Type: string (or Expression
     * with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the CassandraLinkedServiceTypeProperties object itself.
     */
    public CassandraLinkedServiceTypeProperties withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the port property: The port for the connection. Type: integer (or Expression with resultType integer).
     *
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The port for the connection. Type: integer (or Expression with resultType integer).
     *
     * @param port the port value to set.
     * @return the CassandraLinkedServiceTypeProperties object itself.
     */
    public CassandraLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the CassandraLinkedServiceTypeProperties object itself.
     */
    public CassandraLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password for authentication.
     *
     * @param password the password value to set.
     * @return the CassandraLinkedServiceTypeProperties object itself.
     */
    public CassandraLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the CassandraLinkedServiceTypeProperties object itself.
     */
    public CassandraLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property host in model CassandraLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CassandraLinkedServiceTypeProperties.class);
}
