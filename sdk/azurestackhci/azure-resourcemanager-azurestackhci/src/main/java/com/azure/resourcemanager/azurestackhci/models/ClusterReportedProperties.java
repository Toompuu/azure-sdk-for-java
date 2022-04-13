// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties reported by cluster agent. */
@Fluent
public final class ClusterReportedProperties {
    /*
     * Name of the on-prem cluster connected to this resource.
     */
    @JsonProperty(value = "clusterName", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterName;

    /*
     * Unique id generated by the on-prem cluster.
     */
    @JsonProperty(value = "clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /*
     * Version of the cluster software.
     */
    @JsonProperty(value = "clusterVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterVersion;

    /*
     * List of nodes reported by the cluster.
     */
    @JsonProperty(value = "nodes", access = JsonProperty.Access.WRITE_ONLY)
    private List<ClusterNode> nodes;

    /*
     * Last time the cluster reported the data.
     */
    @JsonProperty(value = "lastUpdated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdated;

    /*
     * IMDS attestation status of the cluster.
     */
    @JsonProperty(value = "imdsAttestation", access = JsonProperty.Access.WRITE_ONLY)
    private ImdsAttestation imdsAttestation;

    /*
     * Level of diagnostic data emitted by the cluster.
     */
    @JsonProperty(value = "diagnosticLevel")
    private DiagnosticLevel diagnosticLevel;

    /**
     * Get the clusterName property: Name of the on-prem cluster connected to this resource.
     *
     * @return the clusterName value.
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Get the clusterId property: Unique id generated by the on-prem cluster.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the clusterVersion property: Version of the cluster software.
     *
     * @return the clusterVersion value.
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Get the nodes property: List of nodes reported by the cluster.
     *
     * @return the nodes value.
     */
    public List<ClusterNode> nodes() {
        return this.nodes;
    }

    /**
     * Get the lastUpdated property: Last time the cluster reported the data.
     *
     * @return the lastUpdated value.
     */
    public OffsetDateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Get the imdsAttestation property: IMDS attestation status of the cluster.
     *
     * @return the imdsAttestation value.
     */
    public ImdsAttestation imdsAttestation() {
        return this.imdsAttestation;
    }

    /**
     * Get the diagnosticLevel property: Level of diagnostic data emitted by the cluster.
     *
     * @return the diagnosticLevel value.
     */
    public DiagnosticLevel diagnosticLevel() {
        return this.diagnosticLevel;
    }

    /**
     * Set the diagnosticLevel property: Level of diagnostic data emitted by the cluster.
     *
     * @param diagnosticLevel the diagnosticLevel value to set.
     * @return the ClusterReportedProperties object itself.
     */
    public ClusterReportedProperties withDiagnosticLevel(DiagnosticLevel diagnosticLevel) {
        this.diagnosticLevel = diagnosticLevel;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodes() != null) {
            nodes().forEach(e -> e.validate());
        }
    }
}
