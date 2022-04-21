// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity AmazonRdsForOracle source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonRdsForOracleSource")
@Fluent
public final class AmazonRdsForOracleSource extends CopySource {
    /*
     * AmazonRdsForOracle reader query. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "oracleReaderQuery")
    private Object oracleReaderQuery;

    /*
     * Query timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "queryTimeout")
    private Object queryTimeout;

    /*
     * The partition mechanism that will be used for AmazonRdsForOracle read in
     * parallel. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionOption")
    private Object partitionOption;

    /*
     * The settings that will be leveraged for AmazonRdsForOracle source
     * partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private AmazonRdsForOraclePartitionSettings partitionSettings;

    /*
     * Specifies the additional columns to be added to source data. Type: array
     * of objects(AdditionalColumns) (or Expression with resultType array of
     * objects).
     */
    @JsonProperty(value = "additionalColumns")
    private Object additionalColumns;

    /**
     * Get the oracleReaderQuery property: AmazonRdsForOracle reader query. Type: string (or Expression with resultType
     * string).
     *
     * @return the oracleReaderQuery value.
     */
    public Object getOracleReaderQuery() {
        return this.oracleReaderQuery;
    }

    /**
     * Set the oracleReaderQuery property: AmazonRdsForOracle reader query. Type: string (or Expression with resultType
     * string).
     *
     * @param oracleReaderQuery the oracleReaderQuery value to set.
     * @return the AmazonRdsForOracleSource object itself.
     */
    public AmazonRdsForOracleSource setOracleReaderQuery(Object oracleReaderQuery) {
        this.oracleReaderQuery = oracleReaderQuery;
        return this;
    }

    /**
     * Get the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the queryTimeout value.
     */
    public Object getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param queryTimeout the queryTimeout value to set.
     * @return the AmazonRdsForOracleSource object itself.
     */
    public AmazonRdsForOracleSource setQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for AmazonRdsForOracle read in
     * parallel. Type: string (or Expression with resultType string).
     *
     * @return the partitionOption value.
     */
    public Object getPartitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for AmazonRdsForOracle read in
     * parallel. Type: string (or Expression with resultType string).
     *
     * @param partitionOption the partitionOption value to set.
     * @return the AmazonRdsForOracleSource object itself.
     */
    public AmazonRdsForOracleSource setPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for AmazonRdsForOracle source
     * partitioning.
     *
     * @return the partitionSettings value.
     */
    public AmazonRdsForOraclePartitionSettings getPartitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for AmazonRdsForOracle source
     * partitioning.
     *
     * @param partitionSettings the partitionSettings value to set.
     * @return the AmazonRdsForOracleSource object itself.
     */
    public AmazonRdsForOracleSource setPartitionSettings(AmazonRdsForOraclePartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value.
     */
    public Object getAdditionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set.
     * @return the AmazonRdsForOracleSource object itself.
     */
    public AmazonRdsForOracleSource setAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }
}
