// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.security.attestation.models.CertificateModification;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result of a policy certificate modification. */
@Fluent
public final class PolicyCertificatesModificationResult {
    /*
     * Hex encoded SHA1 Hash of the binary representation certificate which was
     * added or removed
     */
    @JsonProperty(value = "x-ms-certificate-thumbprint")
    private String certificateThumbprint;

    /*
     * The result of the operation
     */
    @JsonProperty(value = "x-ms-policycertificates-result")
    private CertificateModification certificateResolution;

    /**
     * Get the certificateThumbprint property: Hex encoded SHA1 Hash of the binary representation certificate which was
     * added or removed.
     *
     * @return the certificateThumbprint value.
     */
    public String getCertificateThumbprint() {
        return this.certificateThumbprint;
    }

    /**
     * Set the certificateThumbprint property: Hex encoded SHA1 Hash of the binary representation certificate which was
     * added or removed.
     *
     * @param certificateThumbprint the certificateThumbprint value to set.
     * @return the PolicyCertificatesModificationResult object itself.
     */
    public PolicyCertificatesModificationResult setCertificateThumbprint(String certificateThumbprint) {
        this.certificateThumbprint = certificateThumbprint;
        return this;
    }

    /**
     * Get the certificateResolution property: The result of the operation.
     *
     * @return the certificateResolution value.
     */
    public CertificateModification getCertificateResolution() {
        return this.certificateResolution;
    }

    /**
     * Set the certificateResolution property: The result of the operation.
     *
     * @param certificateResolution the certificateResolution value to set.
     * @return the PolicyCertificatesModificationResult object itself.
     */
    public PolicyCertificatesModificationResult setCertificateResolution(
            CertificateModification certificateResolution) {
        this.certificateResolution = certificateResolution;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
