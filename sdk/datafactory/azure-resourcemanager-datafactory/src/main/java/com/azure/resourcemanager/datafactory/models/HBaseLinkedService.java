// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.HBaseLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** HBase server linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HBase")
@Fluent
public final class HBaseLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HBaseLinkedService.class);

    /*
     * HBase server linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private HBaseLinkedServiceTypeProperties innerTypeProperties = new HBaseLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: HBase server linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private HBaseLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the host property: The IP address or host name of the HBase server. (i.e. 192.168.222.160).
     *
     * @return the host value.
     */
    public Object host() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().host();
    }

    /**
     * Set the host property: The IP address or host name of the HBase server. (i.e. 192.168.222.160).
     *
     * @param host the host value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withHost(Object host) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHost(host);
        return this;
    }

    /**
     * Get the port property: The TCP port that the HBase instance uses to listen for client connections. The default
     * value is 9090.
     *
     * @return the port value.
     */
    public Object port() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().port();
    }

    /**
     * Set the port property: The TCP port that the HBase instance uses to listen for client connections. The default
     * value is 9090.
     *
     * @param port the port value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withPort(Object port) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPort(port);
        return this;
    }

    /**
     * Get the httpPath property: The partial URL corresponding to the HBase server. (i.e.
     * /gateway/sandbox/hbase/version).
     *
     * @return the httpPath value.
     */
    public Object httpPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().httpPath();
    }

    /**
     * Set the httpPath property: The partial URL corresponding to the HBase server. (i.e.
     * /gateway/sandbox/hbase/version).
     *
     * @param httpPath the httpPath value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withHttpPath(Object httpPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHttpPath(httpPath);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication mechanism to use to connect to the HBase server.
     *
     * @return the authenticationType value.
     */
    public HBaseAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication mechanism to use to connect to the HBase server.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withAuthenticationType(HBaseAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: The user name used to connect to the HBase instance.
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The user name used to connect to the HBase instance.
     *
     * @param username the username value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The password corresponding to the user name.
     *
     * @param password the password value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().enableSsl();
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @param enableSsl the enableSsl value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withEnableSsl(Object enableSsl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEnableSsl(enableSsl);
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value.
     */
    public Object trustedCertPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().trustedCertPath();
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withTrustedCertPath(Object trustedCertPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTrustedCertPath(trustedCertPath);
        return this;
    }

    /**
     * Get the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @return the allowHostnameCNMismatch value.
     */
    public Object allowHostnameCNMismatch() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().allowHostnameCNMismatch();
    }

    /**
     * Set the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @param allowHostnameCNMismatch the allowHostnameCNMismatch value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withAllowHostnameCNMismatch(Object allowHostnameCNMismatch) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAllowHostnameCNMismatch(allowHostnameCNMismatch);
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @return the allowSelfSignedServerCert value.
     */
    public Object allowSelfSignedServerCert() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().allowSelfSignedServerCert();
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAllowSelfSignedServerCert(allowSelfSignedServerCert);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the HBaseLinkedService object itself.
     */
    public HBaseLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HBaseLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model HBaseLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }
}
