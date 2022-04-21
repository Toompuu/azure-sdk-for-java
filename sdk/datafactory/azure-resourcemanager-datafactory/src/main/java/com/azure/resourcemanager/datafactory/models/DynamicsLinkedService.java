// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.DynamicsLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Dynamics linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Dynamics")
@Fluent
public final class DynamicsLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DynamicsLinkedService.class);

    /*
     * Dynamics linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private DynamicsLinkedServiceTypeProperties innerTypeProperties = new DynamicsLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: Dynamics linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private DynamicsLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the deploymentType property: The deployment type of the Dynamics instance. 'Online' for Dynamics Online and
     * 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type: string (or Expression with resultType string).
     *
     * @return the deploymentType value.
     */
    public Object deploymentType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().deploymentType();
    }

    /**
     * Set the deploymentType property: The deployment type of the Dynamics instance. 'Online' for Dynamics Online and
     * 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type: string (or Expression with resultType string).
     *
     * @param deploymentType the deploymentType value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withDeploymentType(Object deploymentType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDeploymentType(deploymentType);
        return this;
    }

    /**
     * Get the hostname property: The host name of the on-premises Dynamics server. The property is required for on-prem
     * and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @return the hostname value.
     */
    public Object hostname() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().hostname();
    }

    /**
     * Set the hostname property: The host name of the on-premises Dynamics server. The property is required for on-prem
     * and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @param hostname the hostname value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withHostname(Object hostname) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the port property: The port of on-premises Dynamics server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value.
     */
    public Object port() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().port();
    }

    /**
     * Set the port property: The port of on-premises Dynamics server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withPort(Object port) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPort(port);
        return this;
    }

    /**
     * Get the serviceUri property: The URL to the Microsoft Dynamics server. The property is required for on-line and
     * not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @return the serviceUri value.
     */
    public Object serviceUri() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().serviceUri();
    }

    /**
     * Set the serviceUri property: The URL to the Microsoft Dynamics server. The property is required for on-line and
     * not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @param serviceUri the serviceUri value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withServiceUri(Object serviceUri) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServiceUri(serviceUri);
        return this;
    }

    /**
     * Get the organizationName property: The organization name of the Dynamics instance. The property is required for
     * on-prem and required for online when there are more than one Dynamics instances associated with the user. Type:
     * string (or Expression with resultType string).
     *
     * @return the organizationName value.
     */
    public Object organizationName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().organizationName();
    }

    /**
     * Set the organizationName property: The organization name of the Dynamics instance. The property is required for
     * on-prem and required for online when there are more than one Dynamics instances associated with the user. Type:
     * string (or Expression with resultType string).
     *
     * @param organizationName the organizationName value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withOrganizationName(Object organizationName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withOrganizationName(organizationName);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value.
     */
    public Object authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withAuthenticationType(Object authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: User name to access the Dynamics instance. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: User name to access the Dynamics instance. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: Password to access the Dynamics instance.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: Password to access the Dynamics instance.
     *
     * @param password the password value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @return the servicePrincipalCredentialType value.
     */
    public Object servicePrincipalCredentialType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalCredentialType();
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withServicePrincipalCredentialType(Object servicePrincipalCredentialType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalCredentialType(servicePrincipalCredentialType);
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @return the servicePrincipalCredential value.
     */
    public SecretBase servicePrincipalCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalCredential();
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalCredential(servicePrincipalCredential);
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
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().credential();
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
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
                        "Missing required property innerTypeProperties in model DynamicsLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }
}
