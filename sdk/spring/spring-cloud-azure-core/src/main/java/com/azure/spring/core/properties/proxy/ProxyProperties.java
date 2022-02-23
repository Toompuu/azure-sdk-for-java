// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.properties.proxy;

import com.azure.spring.core.aware.ProxyOptionsAware;

/**
 * Common proxy properties for all Azure SDKs.
 */
public class ProxyProperties implements ProxyOptionsAware.Proxy {

    private String type;
    private String hostname;
    private Integer port;
    private String authenticationType;
    private String username;
    private String password;

    @Override
    public String getType() {
        return type;
    }

    /**
     * Set proxy type.
     * @param type The proxy type.
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getHostname() {
        return hostname;
    }

    /**
     * Set proxy hostname.
     * @param hostname The hostname.
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public Integer getPort() {
        return port;
    }

    /**
     * Set port.
     * @param port The port of the host.
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Set the authentication type for the proxy.
     * @param authenticationType The authentication type.
     */
    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    @Override
    public String getUsername() {
        return username;
    }

    /**
     * Set the username used for authentication.
     * @param username The username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    /**
     * Set the password for authentication.
     * @param password The password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
