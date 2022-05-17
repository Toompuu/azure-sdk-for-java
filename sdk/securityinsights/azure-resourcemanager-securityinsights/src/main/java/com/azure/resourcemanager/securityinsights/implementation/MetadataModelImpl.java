// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.MetadataModelInner;
import com.azure.resourcemanager.securityinsights.models.Kind;
import com.azure.resourcemanager.securityinsights.models.MetadataAuthor;
import com.azure.resourcemanager.securityinsights.models.MetadataCategories;
import com.azure.resourcemanager.securityinsights.models.MetadataDependencies;
import com.azure.resourcemanager.securityinsights.models.MetadataModel;
import com.azure.resourcemanager.securityinsights.models.MetadataPatch;
import com.azure.resourcemanager.securityinsights.models.MetadataSource;
import com.azure.resourcemanager.securityinsights.models.MetadataSupport;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public final class MetadataModelImpl implements MetadataModel, MetadataModel.Definition, MetadataModel.Update {
    private MetadataModelInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String contentId() {
        return this.innerModel().contentId();
    }

    public String parentId() {
        return this.innerModel().parentId();
    }

    public String version() {
        return this.innerModel().version();
    }

    public Kind kind() {
        return this.innerModel().kind();
    }

    public MetadataSource source() {
        return this.innerModel().source();
    }

    public MetadataAuthor author() {
        return this.innerModel().author();
    }

    public MetadataSupport support() {
        return this.innerModel().support();
    }

    public MetadataDependencies dependencies() {
        return this.innerModel().dependencies();
    }

    public MetadataCategories categories() {
        return this.innerModel().categories();
    }

    public List<String> providers() {
        List<String> inner = this.innerModel().providers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public LocalDate firstPublishDate() {
        return this.innerModel().firstPublishDate();
    }

    public LocalDate lastPublishDate() {
        return this.innerModel().lastPublishDate();
    }

    public String customVersion() {
        return this.innerModel().customVersion();
    }

    public String contentSchemaVersion() {
        return this.innerModel().contentSchemaVersion();
    }

    public String icon() {
        return this.innerModel().icon();
    }

    public List<String> threatAnalysisTactics() {
        List<String> inner = this.innerModel().threatAnalysisTactics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> threatAnalysisTechniques() {
        List<String> inner = this.innerModel().threatAnalysisTechniques();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> previewImages() {
        List<String> inner = this.innerModel().previewImages();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> previewImagesDark() {
        List<String> inner = this.innerModel().previewImagesDark();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public MetadataModelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String metadataName;

    private MetadataPatch updateMetadataPatch;

    public MetadataModelImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public MetadataModel create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMetadatas()
                .createWithResponse(resourceGroupName, workspaceName, metadataName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public MetadataModel create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMetadatas()
                .createWithResponse(resourceGroupName, workspaceName, metadataName, this.innerModel(), context)
                .getValue();
        return this;
    }

    MetadataModelImpl(String name, com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = new MetadataModelInner();
        this.serviceManager = serviceManager;
        this.metadataName = name;
    }

    public MetadataModelImpl update() {
        this.updateMetadataPatch = new MetadataPatch();
        return this;
    }

    public MetadataModel apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMetadatas()
                .updateWithResponse(resourceGroupName, workspaceName, metadataName, updateMetadataPatch, Context.NONE)
                .getValue();
        return this;
    }

    public MetadataModel apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMetadatas()
                .updateWithResponse(resourceGroupName, workspaceName, metadataName, updateMetadataPatch, context)
                .getValue();
        return this;
    }

    MetadataModelImpl(
        MetadataModelInner innerObject,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.metadataName = Utils.getValueFromIdByName(innerObject.id(), "metadata");
    }

    public MetadataModel refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMetadatas()
                .getWithResponse(resourceGroupName, workspaceName, metadataName, Context.NONE)
                .getValue();
        return this;
    }

    public MetadataModel refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMetadatas()
                .getWithResponse(resourceGroupName, workspaceName, metadataName, context)
                .getValue();
        return this;
    }

    public MetadataModelImpl withEtag(String etag) {
        if (isInCreateMode()) {
            this.innerModel().withEtag(etag);
            return this;
        } else {
            this.updateMetadataPatch.withEtag(etag);
            return this;
        }
    }

    public MetadataModelImpl withContentId(String contentId) {
        if (isInCreateMode()) {
            this.innerModel().withContentId(contentId);
            return this;
        } else {
            this.updateMetadataPatch.withContentId(contentId);
            return this;
        }
    }

    public MetadataModelImpl withParentId(String parentId) {
        if (isInCreateMode()) {
            this.innerModel().withParentId(parentId);
            return this;
        } else {
            this.updateMetadataPatch.withParentId(parentId);
            return this;
        }
    }

    public MetadataModelImpl withVersion(String version) {
        if (isInCreateMode()) {
            this.innerModel().withVersion(version);
            return this;
        } else {
            this.updateMetadataPatch.withVersion(version);
            return this;
        }
    }

    public MetadataModelImpl withKind(Kind kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateMetadataPatch.withKind(kind);
            return this;
        }
    }

    public MetadataModelImpl withSource(MetadataSource source) {
        if (isInCreateMode()) {
            this.innerModel().withSource(source);
            return this;
        } else {
            this.updateMetadataPatch.withSource(source);
            return this;
        }
    }

    public MetadataModelImpl withAuthor(MetadataAuthor author) {
        if (isInCreateMode()) {
            this.innerModel().withAuthor(author);
            return this;
        } else {
            this.updateMetadataPatch.withAuthor(author);
            return this;
        }
    }

    public MetadataModelImpl withSupport(MetadataSupport support) {
        if (isInCreateMode()) {
            this.innerModel().withSupport(support);
            return this;
        } else {
            this.updateMetadataPatch.withSupport(support);
            return this;
        }
    }

    public MetadataModelImpl withDependencies(MetadataDependencies dependencies) {
        if (isInCreateMode()) {
            this.innerModel().withDependencies(dependencies);
            return this;
        } else {
            this.updateMetadataPatch.withDependencies(dependencies);
            return this;
        }
    }

    public MetadataModelImpl withCategories(MetadataCategories categories) {
        if (isInCreateMode()) {
            this.innerModel().withCategories(categories);
            return this;
        } else {
            this.updateMetadataPatch.withCategories(categories);
            return this;
        }
    }

    public MetadataModelImpl withProviders(List<String> providers) {
        if (isInCreateMode()) {
            this.innerModel().withProviders(providers);
            return this;
        } else {
            this.updateMetadataPatch.withProviders(providers);
            return this;
        }
    }

    public MetadataModelImpl withFirstPublishDate(LocalDate firstPublishDate) {
        if (isInCreateMode()) {
            this.innerModel().withFirstPublishDate(firstPublishDate);
            return this;
        } else {
            this.updateMetadataPatch.withFirstPublishDate(firstPublishDate);
            return this;
        }
    }

    public MetadataModelImpl withLastPublishDate(LocalDate lastPublishDate) {
        if (isInCreateMode()) {
            this.innerModel().withLastPublishDate(lastPublishDate);
            return this;
        } else {
            this.updateMetadataPatch.withLastPublishDate(lastPublishDate);
            return this;
        }
    }

    public MetadataModelImpl withCustomVersion(String customVersion) {
        if (isInCreateMode()) {
            this.innerModel().withCustomVersion(customVersion);
            return this;
        } else {
            this.updateMetadataPatch.withCustomVersion(customVersion);
            return this;
        }
    }

    public MetadataModelImpl withContentSchemaVersion(String contentSchemaVersion) {
        if (isInCreateMode()) {
            this.innerModel().withContentSchemaVersion(contentSchemaVersion);
            return this;
        } else {
            this.updateMetadataPatch.withContentSchemaVersion(contentSchemaVersion);
            return this;
        }
    }

    public MetadataModelImpl withIcon(String icon) {
        if (isInCreateMode()) {
            this.innerModel().withIcon(icon);
            return this;
        } else {
            this.updateMetadataPatch.withIcon(icon);
            return this;
        }
    }

    public MetadataModelImpl withThreatAnalysisTactics(List<String> threatAnalysisTactics) {
        if (isInCreateMode()) {
            this.innerModel().withThreatAnalysisTactics(threatAnalysisTactics);
            return this;
        } else {
            this.updateMetadataPatch.withThreatAnalysisTactics(threatAnalysisTactics);
            return this;
        }
    }

    public MetadataModelImpl withThreatAnalysisTechniques(List<String> threatAnalysisTechniques) {
        if (isInCreateMode()) {
            this.innerModel().withThreatAnalysisTechniques(threatAnalysisTechniques);
            return this;
        } else {
            this.updateMetadataPatch.withThreatAnalysisTechniques(threatAnalysisTechniques);
            return this;
        }
    }

    public MetadataModelImpl withPreviewImages(List<String> previewImages) {
        if (isInCreateMode()) {
            this.innerModel().withPreviewImages(previewImages);
            return this;
        } else {
            this.updateMetadataPatch.withPreviewImages(previewImages);
            return this;
        }
    }

    public MetadataModelImpl withPreviewImagesDark(List<String> previewImagesDark) {
        if (isInCreateMode()) {
            this.innerModel().withPreviewImagesDark(previewImagesDark);
            return this;
        } else {
            this.updateMetadataPatch.withPreviewImagesDark(previewImagesDark);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
