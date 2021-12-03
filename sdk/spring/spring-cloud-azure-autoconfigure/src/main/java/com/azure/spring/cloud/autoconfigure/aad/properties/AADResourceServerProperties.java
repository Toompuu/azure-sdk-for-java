// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.aad.properties;

import com.azure.spring.cloud.autoconfigure.aad.implementation.constants.AADTokenClaim;
import com.azure.spring.cloud.autoconfigure.aad.implementation.constants.AuthorityPrefix;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Configuration properties for Azure Active Directory B2C.
 */
public class AADResourceServerProperties implements InitializingBean {

    public static final String PREFIX = "spring.cloud.azure.active-directory.resource-server";

    /**
     * Default claim to authority prefix map
     */
    public static final Map<String, String> DEFAULT_CLAIM_TO_AUTHORITY_PREFIX_MAP;

    static {
        Map<String, String> claimAuthorityMap = new HashMap<>();
        claimAuthorityMap.put(AADTokenClaim.SCP, AuthorityPrefix.SCOPE);
        claimAuthorityMap.put(AADTokenClaim.ROLES, AuthorityPrefix.APP_ROLE);
        DEFAULT_CLAIM_TO_AUTHORITY_PREFIX_MAP = Collections.unmodifiableMap(claimAuthorityMap);
    }

    /**
     * <pre>
     * Configure which claim in access token be returned in AuthenticatedPrincipal#getName.
     * Default value is "sub".
     *
     * Example:
     * If use the default value, and the access_token's "sub" scope value is "testValue",
     * then AuthenticatedPrincipal#getName will return "testValue".
     * </pre>
     * @see org.springframework.security.core.AuthenticatedPrincipal#getName
     */
    private String principalClaimName;
    /**
     * <pre>
     * Configure which claim will be used to build GrantedAuthority, and prefix of the GrantedAuthority's string value.
     * Default value is: "scp" -> "SCOPE_", "roles" -> "APPROLE_".
     *
     * Example:
     * If use the default value, and the access_token's "scp" scope value is "testValue",
     * then GrantedAuthority with "SCOPE_testValue" will be created..
     * </pre>
     * @see org.springframework.security.core.GrantedAuthority
     */
    private Map<String, String> claimToAuthorityPrefixMap;

    /**
     * Gets the principal claim name.
     *
     * @return the principal claim name
     */
    public String getPrincipalClaimName() {
        return principalClaimName;
    }

    /**
     * Sets the principal claim name.
     *
     * @param principalClaimName the principal claim name
     */
    public void setPrincipalClaimName(String principalClaimName) {
        this.principalClaimName = principalClaimName;
    }

    /**
     * Gets the claim to authority prefix map.
     *
     * @return the claim to authority prefix map
     */
    public Map<String, String> getClaimToAuthorityPrefixMap() {
        return claimToAuthorityPrefixMap;
    }

    /**
     * Sets the claim to authority prefix map.
     *
     * @param claimToAuthorityPrefixMap the claim to authority prefix map
     */
    public void setClaimToAuthorityPrefixMap(Map<String, String> claimToAuthorityPrefixMap) {
        this.claimToAuthorityPrefixMap = claimToAuthorityPrefixMap;
    }

    @Override
    public void afterPropertiesSet() {
        if (!StringUtils.hasText(principalClaimName)) {
            principalClaimName = AADTokenClaim.SUB;
        }
        if (claimToAuthorityPrefixMap == null || claimToAuthorityPrefixMap.isEmpty()) {
            claimToAuthorityPrefixMap = DEFAULT_CLAIM_TO_AUTHORITY_PREFIX_MAP;
        }
    }

}
