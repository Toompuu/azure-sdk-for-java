// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The on-premises SQL Server dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlServerTable")
@JsonFlatten
@Fluent
public class SqlServerTableDataset extends Dataset {
    /*
     * This property will be retired. Please consider using schema + table
     * properties instead.
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /*
     * The schema name of the SQL Server dataset. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object schemaTypePropertiesSchema;

    /*
     * The table name of the SQL Server dataset. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @param tableName the tableName value to set.
     * @return the SqlServerTableDataset object itself.
     */
    public SqlServerTableDataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the schemaTypePropertiesSchema property: The schema name of the SQL Server dataset. Type: string (or
     * Expression with resultType string).
     *
     * @return the schemaTypePropertiesSchema value.
     */
    public Object getSchemaTypePropertiesSchema() {
        return this.schemaTypePropertiesSchema;
    }

    /**
     * Set the schemaTypePropertiesSchema property: The schema name of the SQL Server dataset. Type: string (or
     * Expression with resultType string).
     *
     * @param schemaTypePropertiesSchema the schemaTypePropertiesSchema value to set.
     * @return the SqlServerTableDataset object itself.
     */
    public SqlServerTableDataset setSchemaTypePropertiesSchema(Object schemaTypePropertiesSchema) {
        this.schemaTypePropertiesSchema = schemaTypePropertiesSchema;
        return this;
    }

    /**
     * Get the table property: The table name of the SQL Server dataset. Type: string (or Expression with resultType
     * string).
     *
     * @return the table value.
     */
    public Object getTable() {
        return this.table;
    }

    /**
     * Set the table property: The table name of the SQL Server dataset. Type: string (or Expression with resultType
     * string).
     *
     * @param table the table value to set.
     * @return the SqlServerTableDataset object itself.
     */
    public SqlServerTableDataset setTable(Object table) {
        this.table = table;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerTableDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerTableDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerTableDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerTableDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerTableDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerTableDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerTableDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
