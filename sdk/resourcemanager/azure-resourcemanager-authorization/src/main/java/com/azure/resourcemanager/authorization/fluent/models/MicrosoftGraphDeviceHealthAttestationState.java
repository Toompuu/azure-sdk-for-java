// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** deviceHealthAttestationState. */
@Fluent
public final class MicrosoftGraphDeviceHealthAttestationState {
    /*
     * TWhen an Attestation Identity Key (AIK) is present on a device, it
     * indicates that the device has an endorsement key (EK) certificate.
     */
    @JsonProperty(value = "attestationIdentityKey")
    private String attestationIdentityKey;

    /*
     * On or Off of BitLocker Drive Encryption
     */
    @JsonProperty(value = "bitLockerStatus")
    private String bitLockerStatus;

    /*
     * The security version number of the Boot Application
     */
    @JsonProperty(value = "bootAppSecurityVersion")
    private String bootAppSecurityVersion;

    /*
     * When bootDebugging is enabled, the device is used in development and
     * testing
     */
    @JsonProperty(value = "bootDebugging")
    private String bootDebugging;

    /*
     * The security version number of the Boot Application
     */
    @JsonProperty(value = "bootManagerSecurityVersion")
    private String bootManagerSecurityVersion;

    /*
     * The version of the Boot Manager
     */
    @JsonProperty(value = "bootManagerVersion")
    private String bootManagerVersion;

    /*
     * The Boot Revision List that was loaded during initial boot on the
     * attested device
     */
    @JsonProperty(value = "bootRevisionListInfo")
    private String bootRevisionListInfo;

    /*
     * When code integrity is enabled, code execution is restricted to
     * integrity verified code
     */
    @JsonProperty(value = "codeIntegrity")
    private String codeIntegrity;

    /*
     * The version of the Boot Manager
     */
    @JsonProperty(value = "codeIntegrityCheckVersion")
    private String codeIntegrityCheckVersion;

    /*
     * The Code Integrity policy that is controlling the security of the boot
     * environment
     */
    @JsonProperty(value = "codeIntegrityPolicy")
    private String codeIntegrityPolicy;

    /*
     * The DHA report version. (Namespace version)
     */
    @JsonProperty(value = "contentNamespaceUrl")
    private String contentNamespaceUrl;

    /*
     * The HealthAttestation state schema version
     */
    @JsonProperty(value = "contentVersion")
    private String contentVersion;

    /*
     * DEP Policy defines a set of hardware and software technologies that
     * perform additional checks on memory
     */
    @JsonProperty(value = "dataExcutionPolicy")
    private String dataExcutionPolicy;

    /*
     * The DHA report version. (Namespace version)
     */
    @JsonProperty(value = "deviceHealthAttestationStatus")
    private String deviceHealthAttestationStatus;

    /*
     * ELAM provides protection for the computers in your network when they
     * start up
     */
    @JsonProperty(value = "earlyLaunchAntiMalwareDriverProtection")
    private String earlyLaunchAntiMalwareDriverProtection;

    /*
     * This attribute indicates if DHA is supported for the device
     */
    @JsonProperty(value = "healthAttestationSupportedStatus")
    private String healthAttestationSupportedStatus;

    /*
     * This attribute appears if DHA-Service detects an integrity issue
     */
    @JsonProperty(value = "healthStatusMismatchInfo")
    private String healthStatusMismatchInfo;

    /*
     * The DateTime when device was evaluated or issued to MDM
     */
    @JsonProperty(value = "issuedDateTime")
    private OffsetDateTime issuedDateTime;

    /*
     * The Timestamp of the last update.
     */
    @JsonProperty(value = "lastUpdateDateTime")
    private String lastUpdateDateTime;

    /*
     * When operatingSystemKernelDebugging is enabled, the device is used in
     * development and testing
     */
    @JsonProperty(value = "operatingSystemKernelDebugging")
    private String operatingSystemKernelDebugging;

    /*
     * The Operating System Revision List that was loaded during initial boot
     * on the attested device
     */
    @JsonProperty(value = "operatingSystemRevListInfo")
    private String operatingSystemRevListInfo;

    /*
     * The measurement that is captured in PCR[0]
     */
    @JsonProperty(value = "pcr0")
    private String pcr0;

    /*
     * Informational attribute that identifies the HASH algorithm that was used
     * by TPM
     */
    @JsonProperty(value = "pcrHashAlgorithm")
    private String pcrHashAlgorithm;

    /*
     * The number of times a PC device has hibernated or resumed
     */
    @JsonProperty(value = "resetCount")
    private Long resetCount;

    /*
     * The number of times a PC device has rebooted
     */
    @JsonProperty(value = "restartCount")
    private Long restartCount;

    /*
     * Safe mode is a troubleshooting option for Windows that starts your
     * computer in a limited state
     */
    @JsonProperty(value = "safeMode")
    private String safeMode;

    /*
     * When Secure Boot is enabled, the core components must have the correct
     * cryptographic signatures
     */
    @JsonProperty(value = "secureBoot")
    private String secureBoot;

    /*
     * Fingerprint of the Custom Secure Boot Configuration Policy
     */
    @JsonProperty(value = "secureBootConfigurationPolicyFingerPrint")
    private String secureBootConfigurationPolicyFingerPrint;

    /*
     * When test signing is allowed, the device does not enforce signature
     * validation during boot
     */
    @JsonProperty(value = "testSigning")
    private String testSigning;

    /*
     * The security version number of the Boot Application
     */
    @JsonProperty(value = "tpmVersion")
    private String tpmVersion;

    /*
     * VSM is a container that protects high value assets from a compromised
     * kernel
     */
    @JsonProperty(value = "virtualSecureMode")
    private String virtualSecureMode;

    /*
     * Operating system running with limited services that is used to prepare a
     * computer for Windows
     */
    @JsonProperty(value = "windowsPE")
    private String windowsPE;

    /*
     * deviceHealthAttestationState
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the attestationIdentityKey property: TWhen an Attestation Identity Key (AIK) is present on a device, it
     * indicates that the device has an endorsement key (EK) certificate.
     *
     * @return the attestationIdentityKey value.
     */
    public String attestationIdentityKey() {
        return this.attestationIdentityKey;
    }

    /**
     * Set the attestationIdentityKey property: TWhen an Attestation Identity Key (AIK) is present on a device, it
     * indicates that the device has an endorsement key (EK) certificate.
     *
     * @param attestationIdentityKey the attestationIdentityKey value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withAttestationIdentityKey(String attestationIdentityKey) {
        this.attestationIdentityKey = attestationIdentityKey;
        return this;
    }

    /**
     * Get the bitLockerStatus property: On or Off of BitLocker Drive Encryption.
     *
     * @return the bitLockerStatus value.
     */
    public String bitLockerStatus() {
        return this.bitLockerStatus;
    }

    /**
     * Set the bitLockerStatus property: On or Off of BitLocker Drive Encryption.
     *
     * @param bitLockerStatus the bitLockerStatus value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withBitLockerStatus(String bitLockerStatus) {
        this.bitLockerStatus = bitLockerStatus;
        return this;
    }

    /**
     * Get the bootAppSecurityVersion property: The security version number of the Boot Application.
     *
     * @return the bootAppSecurityVersion value.
     */
    public String bootAppSecurityVersion() {
        return this.bootAppSecurityVersion;
    }

    /**
     * Set the bootAppSecurityVersion property: The security version number of the Boot Application.
     *
     * @param bootAppSecurityVersion the bootAppSecurityVersion value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withBootAppSecurityVersion(String bootAppSecurityVersion) {
        this.bootAppSecurityVersion = bootAppSecurityVersion;
        return this;
    }

    /**
     * Get the bootDebugging property: When bootDebugging is enabled, the device is used in development and testing.
     *
     * @return the bootDebugging value.
     */
    public String bootDebugging() {
        return this.bootDebugging;
    }

    /**
     * Set the bootDebugging property: When bootDebugging is enabled, the device is used in development and testing.
     *
     * @param bootDebugging the bootDebugging value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withBootDebugging(String bootDebugging) {
        this.bootDebugging = bootDebugging;
        return this;
    }

    /**
     * Get the bootManagerSecurityVersion property: The security version number of the Boot Application.
     *
     * @return the bootManagerSecurityVersion value.
     */
    public String bootManagerSecurityVersion() {
        return this.bootManagerSecurityVersion;
    }

    /**
     * Set the bootManagerSecurityVersion property: The security version number of the Boot Application.
     *
     * @param bootManagerSecurityVersion the bootManagerSecurityVersion value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withBootManagerSecurityVersion(
        String bootManagerSecurityVersion) {
        this.bootManagerSecurityVersion = bootManagerSecurityVersion;
        return this;
    }

    /**
     * Get the bootManagerVersion property: The version of the Boot Manager.
     *
     * @return the bootManagerVersion value.
     */
    public String bootManagerVersion() {
        return this.bootManagerVersion;
    }

    /**
     * Set the bootManagerVersion property: The version of the Boot Manager.
     *
     * @param bootManagerVersion the bootManagerVersion value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withBootManagerVersion(String bootManagerVersion) {
        this.bootManagerVersion = bootManagerVersion;
        return this;
    }

    /**
     * Get the bootRevisionListInfo property: The Boot Revision List that was loaded during initial boot on the attested
     * device.
     *
     * @return the bootRevisionListInfo value.
     */
    public String bootRevisionListInfo() {
        return this.bootRevisionListInfo;
    }

    /**
     * Set the bootRevisionListInfo property: The Boot Revision List that was loaded during initial boot on the attested
     * device.
     *
     * @param bootRevisionListInfo the bootRevisionListInfo value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withBootRevisionListInfo(String bootRevisionListInfo) {
        this.bootRevisionListInfo = bootRevisionListInfo;
        return this;
    }

    /**
     * Get the codeIntegrity property: When code integrity is enabled, code execution is restricted to integrity
     * verified code.
     *
     * @return the codeIntegrity value.
     */
    public String codeIntegrity() {
        return this.codeIntegrity;
    }

    /**
     * Set the codeIntegrity property: When code integrity is enabled, code execution is restricted to integrity
     * verified code.
     *
     * @param codeIntegrity the codeIntegrity value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withCodeIntegrity(String codeIntegrity) {
        this.codeIntegrity = codeIntegrity;
        return this;
    }

    /**
     * Get the codeIntegrityCheckVersion property: The version of the Boot Manager.
     *
     * @return the codeIntegrityCheckVersion value.
     */
    public String codeIntegrityCheckVersion() {
        return this.codeIntegrityCheckVersion;
    }

    /**
     * Set the codeIntegrityCheckVersion property: The version of the Boot Manager.
     *
     * @param codeIntegrityCheckVersion the codeIntegrityCheckVersion value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withCodeIntegrityCheckVersion(String codeIntegrityCheckVersion) {
        this.codeIntegrityCheckVersion = codeIntegrityCheckVersion;
        return this;
    }

    /**
     * Get the codeIntegrityPolicy property: The Code Integrity policy that is controlling the security of the boot
     * environment.
     *
     * @return the codeIntegrityPolicy value.
     */
    public String codeIntegrityPolicy() {
        return this.codeIntegrityPolicy;
    }

    /**
     * Set the codeIntegrityPolicy property: The Code Integrity policy that is controlling the security of the boot
     * environment.
     *
     * @param codeIntegrityPolicy the codeIntegrityPolicy value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withCodeIntegrityPolicy(String codeIntegrityPolicy) {
        this.codeIntegrityPolicy = codeIntegrityPolicy;
        return this;
    }

    /**
     * Get the contentNamespaceUrl property: The DHA report version. (Namespace version).
     *
     * @return the contentNamespaceUrl value.
     */
    public String contentNamespaceUrl() {
        return this.contentNamespaceUrl;
    }

    /**
     * Set the contentNamespaceUrl property: The DHA report version. (Namespace version).
     *
     * @param contentNamespaceUrl the contentNamespaceUrl value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withContentNamespaceUrl(String contentNamespaceUrl) {
        this.contentNamespaceUrl = contentNamespaceUrl;
        return this;
    }

    /**
     * Get the contentVersion property: The HealthAttestation state schema version.
     *
     * @return the contentVersion value.
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Set the contentVersion property: The HealthAttestation state schema version.
     *
     * @param contentVersion the contentVersion value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
        return this;
    }

    /**
     * Get the dataExcutionPolicy property: DEP Policy defines a set of hardware and software technologies that perform
     * additional checks on memory.
     *
     * @return the dataExcutionPolicy value.
     */
    public String dataExcutionPolicy() {
        return this.dataExcutionPolicy;
    }

    /**
     * Set the dataExcutionPolicy property: DEP Policy defines a set of hardware and software technologies that perform
     * additional checks on memory.
     *
     * @param dataExcutionPolicy the dataExcutionPolicy value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withDataExcutionPolicy(String dataExcutionPolicy) {
        this.dataExcutionPolicy = dataExcutionPolicy;
        return this;
    }

    /**
     * Get the deviceHealthAttestationStatus property: The DHA report version. (Namespace version).
     *
     * @return the deviceHealthAttestationStatus value.
     */
    public String deviceHealthAttestationStatus() {
        return this.deviceHealthAttestationStatus;
    }

    /**
     * Set the deviceHealthAttestationStatus property: The DHA report version. (Namespace version).
     *
     * @param deviceHealthAttestationStatus the deviceHealthAttestationStatus value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withDeviceHealthAttestationStatus(
        String deviceHealthAttestationStatus) {
        this.deviceHealthAttestationStatus = deviceHealthAttestationStatus;
        return this;
    }

    /**
     * Get the earlyLaunchAntiMalwareDriverProtection property: ELAM provides protection for the computers in your
     * network when they start up.
     *
     * @return the earlyLaunchAntiMalwareDriverProtection value.
     */
    public String earlyLaunchAntiMalwareDriverProtection() {
        return this.earlyLaunchAntiMalwareDriverProtection;
    }

    /**
     * Set the earlyLaunchAntiMalwareDriverProtection property: ELAM provides protection for the computers in your
     * network when they start up.
     *
     * @param earlyLaunchAntiMalwareDriverProtection the earlyLaunchAntiMalwareDriverProtection value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withEarlyLaunchAntiMalwareDriverProtection(
        String earlyLaunchAntiMalwareDriverProtection) {
        this.earlyLaunchAntiMalwareDriverProtection = earlyLaunchAntiMalwareDriverProtection;
        return this;
    }

    /**
     * Get the healthAttestationSupportedStatus property: This attribute indicates if DHA is supported for the device.
     *
     * @return the healthAttestationSupportedStatus value.
     */
    public String healthAttestationSupportedStatus() {
        return this.healthAttestationSupportedStatus;
    }

    /**
     * Set the healthAttestationSupportedStatus property: This attribute indicates if DHA is supported for the device.
     *
     * @param healthAttestationSupportedStatus the healthAttestationSupportedStatus value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withHealthAttestationSupportedStatus(
        String healthAttestationSupportedStatus) {
        this.healthAttestationSupportedStatus = healthAttestationSupportedStatus;
        return this;
    }

    /**
     * Get the healthStatusMismatchInfo property: This attribute appears if DHA-Service detects an integrity issue.
     *
     * @return the healthStatusMismatchInfo value.
     */
    public String healthStatusMismatchInfo() {
        return this.healthStatusMismatchInfo;
    }

    /**
     * Set the healthStatusMismatchInfo property: This attribute appears if DHA-Service detects an integrity issue.
     *
     * @param healthStatusMismatchInfo the healthStatusMismatchInfo value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withHealthStatusMismatchInfo(String healthStatusMismatchInfo) {
        this.healthStatusMismatchInfo = healthStatusMismatchInfo;
        return this;
    }

    /**
     * Get the issuedDateTime property: The DateTime when device was evaluated or issued to MDM.
     *
     * @return the issuedDateTime value.
     */
    public OffsetDateTime issuedDateTime() {
        return this.issuedDateTime;
    }

    /**
     * Set the issuedDateTime property: The DateTime when device was evaluated or issued to MDM.
     *
     * @param issuedDateTime the issuedDateTime value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withIssuedDateTime(OffsetDateTime issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
        return this;
    }

    /**
     * Get the lastUpdateDateTime property: The Timestamp of the last update.
     *
     * @return the lastUpdateDateTime value.
     */
    public String lastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    /**
     * Set the lastUpdateDateTime property: The Timestamp of the last update.
     *
     * @param lastUpdateDateTime the lastUpdateDateTime value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * Get the operatingSystemKernelDebugging property: When operatingSystemKernelDebugging is enabled, the device is
     * used in development and testing.
     *
     * @return the operatingSystemKernelDebugging value.
     */
    public String operatingSystemKernelDebugging() {
        return this.operatingSystemKernelDebugging;
    }

    /**
     * Set the operatingSystemKernelDebugging property: When operatingSystemKernelDebugging is enabled, the device is
     * used in development and testing.
     *
     * @param operatingSystemKernelDebugging the operatingSystemKernelDebugging value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withOperatingSystemKernelDebugging(
        String operatingSystemKernelDebugging) {
        this.operatingSystemKernelDebugging = operatingSystemKernelDebugging;
        return this;
    }

    /**
     * Get the operatingSystemRevListInfo property: The Operating System Revision List that was loaded during initial
     * boot on the attested device.
     *
     * @return the operatingSystemRevListInfo value.
     */
    public String operatingSystemRevListInfo() {
        return this.operatingSystemRevListInfo;
    }

    /**
     * Set the operatingSystemRevListInfo property: The Operating System Revision List that was loaded during initial
     * boot on the attested device.
     *
     * @param operatingSystemRevListInfo the operatingSystemRevListInfo value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withOperatingSystemRevListInfo(
        String operatingSystemRevListInfo) {
        this.operatingSystemRevListInfo = operatingSystemRevListInfo;
        return this;
    }

    /**
     * Get the pcr0 property: The measurement that is captured in PCR[0].
     *
     * @return the pcr0 value.
     */
    public String pcr0() {
        return this.pcr0;
    }

    /**
     * Set the pcr0 property: The measurement that is captured in PCR[0].
     *
     * @param pcr0 the pcr0 value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withPcr0(String pcr0) {
        this.pcr0 = pcr0;
        return this;
    }

    /**
     * Get the pcrHashAlgorithm property: Informational attribute that identifies the HASH algorithm that was used by
     * TPM.
     *
     * @return the pcrHashAlgorithm value.
     */
    public String pcrHashAlgorithm() {
        return this.pcrHashAlgorithm;
    }

    /**
     * Set the pcrHashAlgorithm property: Informational attribute that identifies the HASH algorithm that was used by
     * TPM.
     *
     * @param pcrHashAlgorithm the pcrHashAlgorithm value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withPcrHashAlgorithm(String pcrHashAlgorithm) {
        this.pcrHashAlgorithm = pcrHashAlgorithm;
        return this;
    }

    /**
     * Get the resetCount property: The number of times a PC device has hibernated or resumed.
     *
     * @return the resetCount value.
     */
    public Long resetCount() {
        return this.resetCount;
    }

    /**
     * Set the resetCount property: The number of times a PC device has hibernated or resumed.
     *
     * @param resetCount the resetCount value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withResetCount(Long resetCount) {
        this.resetCount = resetCount;
        return this;
    }

    /**
     * Get the restartCount property: The number of times a PC device has rebooted.
     *
     * @return the restartCount value.
     */
    public Long restartCount() {
        return this.restartCount;
    }

    /**
     * Set the restartCount property: The number of times a PC device has rebooted.
     *
     * @param restartCount the restartCount value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withRestartCount(Long restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    /**
     * Get the safeMode property: Safe mode is a troubleshooting option for Windows that starts your computer in a
     * limited state.
     *
     * @return the safeMode value.
     */
    public String safeMode() {
        return this.safeMode;
    }

    /**
     * Set the safeMode property: Safe mode is a troubleshooting option for Windows that starts your computer in a
     * limited state.
     *
     * @param safeMode the safeMode value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withSafeMode(String safeMode) {
        this.safeMode = safeMode;
        return this;
    }

    /**
     * Get the secureBoot property: When Secure Boot is enabled, the core components must have the correct cryptographic
     * signatures.
     *
     * @return the secureBoot value.
     */
    public String secureBoot() {
        return this.secureBoot;
    }

    /**
     * Set the secureBoot property: When Secure Boot is enabled, the core components must have the correct cryptographic
     * signatures.
     *
     * @param secureBoot the secureBoot value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withSecureBoot(String secureBoot) {
        this.secureBoot = secureBoot;
        return this;
    }

    /**
     * Get the secureBootConfigurationPolicyFingerPrint property: Fingerprint of the Custom Secure Boot Configuration
     * Policy.
     *
     * @return the secureBootConfigurationPolicyFingerPrint value.
     */
    public String secureBootConfigurationPolicyFingerPrint() {
        return this.secureBootConfigurationPolicyFingerPrint;
    }

    /**
     * Set the secureBootConfigurationPolicyFingerPrint property: Fingerprint of the Custom Secure Boot Configuration
     * Policy.
     *
     * @param secureBootConfigurationPolicyFingerPrint the secureBootConfigurationPolicyFingerPrint value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withSecureBootConfigurationPolicyFingerPrint(
        String secureBootConfigurationPolicyFingerPrint) {
        this.secureBootConfigurationPolicyFingerPrint = secureBootConfigurationPolicyFingerPrint;
        return this;
    }

    /**
     * Get the testSigning property: When test signing is allowed, the device does not enforce signature validation
     * during boot.
     *
     * @return the testSigning value.
     */
    public String testSigning() {
        return this.testSigning;
    }

    /**
     * Set the testSigning property: When test signing is allowed, the device does not enforce signature validation
     * during boot.
     *
     * @param testSigning the testSigning value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withTestSigning(String testSigning) {
        this.testSigning = testSigning;
        return this;
    }

    /**
     * Get the tpmVersion property: The security version number of the Boot Application.
     *
     * @return the tpmVersion value.
     */
    public String tpmVersion() {
        return this.tpmVersion;
    }

    /**
     * Set the tpmVersion property: The security version number of the Boot Application.
     *
     * @param tpmVersion the tpmVersion value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withTpmVersion(String tpmVersion) {
        this.tpmVersion = tpmVersion;
        return this;
    }

    /**
     * Get the virtualSecureMode property: VSM is a container that protects high value assets from a compromised kernel.
     *
     * @return the virtualSecureMode value.
     */
    public String virtualSecureMode() {
        return this.virtualSecureMode;
    }

    /**
     * Set the virtualSecureMode property: VSM is a container that protects high value assets from a compromised kernel.
     *
     * @param virtualSecureMode the virtualSecureMode value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withVirtualSecureMode(String virtualSecureMode) {
        this.virtualSecureMode = virtualSecureMode;
        return this;
    }

    /**
     * Get the windowsPE property: Operating system running with limited services that is used to prepare a computer for
     * Windows.
     *
     * @return the windowsPE value.
     */
    public String windowsPE() {
        return this.windowsPE;
    }

    /**
     * Set the windowsPE property: Operating system running with limited services that is used to prepare a computer for
     * Windows.
     *
     * @param windowsPE the windowsPE value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withWindowsPE(String windowsPE) {
        this.windowsPE = windowsPE;
        return this;
    }

    /**
     * Get the additionalProperties property: deviceHealthAttestationState.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: deviceHealthAttestationState.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDeviceHealthAttestationState object itself.
     */
    public MicrosoftGraphDeviceHealthAttestationState withAdditionalProperties(
        Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
