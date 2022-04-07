// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSqlDWTableDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Azure SQL Data Warehouse dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureSqlDWTable")
@Fluent
public final class AzureSqlDWTableDataset extends Dataset {
    /*
     * Azure SQL Data Warehouse dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private AzureSqlDWTableDatasetTypeProperties innerTypeProperties;

    /**
     * Get the innerTypeProperties property: Azure SQL Data Warehouse dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private AzureSqlDWTableDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDWTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDWTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDWTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDWTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDWTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDWTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDWTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @return the tableName value.
     */
    public Object tableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tableName();
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @param tableName the tableName value to set.
     * @return the AzureSqlDWTableDataset object itself.
     */
    public AzureSqlDWTableDataset withTableName(Object tableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSqlDWTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTableName(tableName);
        return this;
    }

    /**
     * Get the schema property: The schema name of the Azure SQL Data Warehouse. Type: string (or Expression with
     * resultType string).
     *
     * @return the schema value.
     */
    public Object schemaTypePropertiesSchema() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().schema();
    }

    /**
     * Set the schema property: The schema name of the Azure SQL Data Warehouse. Type: string (or Expression with
     * resultType string).
     *
     * @param schema the schema value to set.
     * @return the AzureSqlDWTableDataset object itself.
     */
    public AzureSqlDWTableDataset withSchemaTypePropertiesSchema(Object schema) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSqlDWTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withSchema(schema);
        return this;
    }

    /**
     * Get the table property: The table name of the Azure SQL Data Warehouse. Type: string (or Expression with
     * resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().table();
    }

    /**
     * Set the table property: The table name of the Azure SQL Data Warehouse. Type: string (or Expression with
     * resultType string).
     *
     * @param table the table value to set.
     * @return the AzureSqlDWTableDataset object itself.
     */
    public AzureSqlDWTableDataset withTable(Object table) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSqlDWTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTable(table);
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
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
