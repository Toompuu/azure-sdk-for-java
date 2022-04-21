// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SapHanaTableDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** SAP HANA Table properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapHanaTable")
@Fluent
public final class SapHanaTableDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SapHanaTableDataset.class);

    /*
     * SAP HANA Table properties.
     */
    @JsonProperty(value = "typeProperties")
    private SapHanaTableDatasetTypeProperties innerTypeProperties;

    /**
     * Get the innerTypeProperties property: SAP HANA Table properties.
     *
     * @return the innerTypeProperties value.
     */
    private SapHanaTableDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the schema property: The schema name of SAP HANA. Type: string (or Expression with resultType string).
     *
     * @return the schema value.
     */
    public Object schemaTypePropertiesSchema() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().schema();
    }

    /**
     * Set the schema property: The schema name of SAP HANA. Type: string (or Expression with resultType string).
     *
     * @param schema the schema value to set.
     * @return the SapHanaTableDataset object itself.
     */
    public SapHanaTableDataset withSchemaTypePropertiesSchema(Object schema) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapHanaTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withSchema(schema);
        return this;
    }

    /**
     * Get the table property: The table name of SAP HANA. Type: string (or Expression with resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().table();
    }

    /**
     * Set the table property: The table name of SAP HANA. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set.
     * @return the SapHanaTableDataset object itself.
     */
    public SapHanaTableDataset withTable(Object table) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapHanaTableDatasetTypeProperties();
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
