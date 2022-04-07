// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Operation request/response representation details. */
@Fluent
public final class RepresentationContract {
    /*
     * Specifies a registered or custom content type for this representation,
     * e.g. application/xml.
     */
    @JsonProperty(value = "contentType", required = true)
    private String contentType;

    /*
     * Schema identifier. Applicable only if 'contentType' value is neither
     * 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     */
    @JsonProperty(value = "schemaId")
    private String schemaId;

    /*
     * Type name defined by the schema. Applicable only if 'contentType' value
     * is neither 'application/x-www-form-urlencoded' nor
     * 'multipart/form-data'.
     */
    @JsonProperty(value = "typeName")
    private String typeName;

    /*
     * Collection of form parameters. Required if 'contentType' value is either
     * 'application/x-www-form-urlencoded' or 'multipart/form-data'..
     */
    @JsonProperty(value = "formParameters")
    private List<ParameterContract> formParameters;

    /*
     * Exampled defined for the representation.
     */
    @JsonProperty(value = "examples")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ParameterExampleContract> examples;

    /**
     * Get the contentType property: Specifies a registered or custom content type for this representation, e.g.
     * application/xml.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Specifies a registered or custom content type for this representation, e.g.
     * application/xml.
     *
     * @param contentType the contentType value to set.
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the schemaId property: Schema identifier. Applicable only if 'contentType' value is neither
     * 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     *
     * @return the schemaId value.
     */
    public String schemaId() {
        return this.schemaId;
    }

    /**
     * Set the schemaId property: Schema identifier. Applicable only if 'contentType' value is neither
     * 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     *
     * @param schemaId the schemaId value to set.
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
     * Get the typeName property: Type name defined by the schema. Applicable only if 'contentType' value is neither
     * 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     *
     * @return the typeName value.
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: Type name defined by the schema. Applicable only if 'contentType' value is neither
     * 'application/x-www-form-urlencoded' nor 'multipart/form-data'.
     *
     * @param typeName the typeName value to set.
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the formParameters property: Collection of form parameters. Required if 'contentType' value is either
     * 'application/x-www-form-urlencoded' or 'multipart/form-data'..
     *
     * @return the formParameters value.
     */
    public List<ParameterContract> formParameters() {
        return this.formParameters;
    }

    /**
     * Set the formParameters property: Collection of form parameters. Required if 'contentType' value is either
     * 'application/x-www-form-urlencoded' or 'multipart/form-data'..
     *
     * @param formParameters the formParameters value to set.
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withFormParameters(List<ParameterContract> formParameters) {
        this.formParameters = formParameters;
        return this;
    }

    /**
     * Get the examples property: Exampled defined for the representation.
     *
     * @return the examples value.
     */
    public Map<String, ParameterExampleContract> examples() {
        return this.examples;
    }

    /**
     * Set the examples property: Exampled defined for the representation.
     *
     * @param examples the examples value to set.
     * @return the RepresentationContract object itself.
     */
    public RepresentationContract withExamples(Map<String, ParameterExampleContract> examples) {
        this.examples = examples;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contentType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contentType in model RepresentationContract"));
        }
        if (formParameters() != null) {
            formParameters().forEach(e -> e.validate());
        }
        if (examples() != null) {
            examples()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RepresentationContract.class);
}
