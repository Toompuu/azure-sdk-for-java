// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkbookInner;
import com.azure.resourcemanager.applicationinsights.models.Kind;
import com.azure.resourcemanager.applicationinsights.models.SharedTypeKind;
import com.azure.resourcemanager.applicationinsights.models.Workbook;
import com.azure.resourcemanager.applicationinsights.models.WorkbookResourceIdentity;
import com.azure.resourcemanager.applicationinsights.models.WorkbookUpdateParameters;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WorkbookImpl implements Workbook, Workbook.Definition, Workbook.Update {
    private WorkbookInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public WorkbookResourceIdentity identity() {
        return this.innerModel().identity();
    }

    public Kind kind() {
        return this.innerModel().kind();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String serializedData() {
        return this.innerModel().serializedData();
    }

    public String version() {
        return this.innerModel().version();
    }

    public OffsetDateTime timeModified() {
        return this.innerModel().timeModified();
    }

    public String category() {
        return this.innerModel().category();
    }

    public List<String> tagsPropertiesTags() {
        List<String> inner = this.innerModel().tagsPropertiesTags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String userId() {
        return this.innerModel().userId();
    }

    public String sourceId() {
        return this.innerModel().sourceId();
    }

    public String storageUri() {
        return this.innerModel().storageUri();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String revision() {
        return this.innerModel().revision();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public WorkbookInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String createSourceId;

    private String updateSourceId;

    private WorkbookUpdateParameters updateWorkbookUpdateParameters;

    public WorkbookImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Workbook create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbooks()
                .createOrUpdateWithResponse(
                    resourceGroupName, resourceName, this.innerModel(), createSourceId, Context.NONE)
                .getValue();
        return this;
    }

    public Workbook create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbooks()
                .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), createSourceId, context)
                .getValue();
        return this;
    }

    WorkbookImpl(String name, com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerObject = new WorkbookInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
        this.createSourceId = null;
    }

    public WorkbookImpl update() {
        this.updateSourceId = null;
        this.updateWorkbookUpdateParameters = new WorkbookUpdateParameters();
        return this;
    }

    public Workbook apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbooks()
                .updateWithResponse(
                    resourceGroupName, resourceName, updateSourceId, updateWorkbookUpdateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Workbook apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbooks()
                .updateWithResponse(
                    resourceGroupName, resourceName, updateSourceId, updateWorkbookUpdateParameters, context)
                .getValue();
        return this;
    }

    WorkbookImpl(
        WorkbookInner innerObject,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "workbooks");
    }

    public Workbook refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbooks()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public Workbook refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbooks()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public WorkbookImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WorkbookImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WorkbookImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateWorkbookUpdateParameters.withTags(tags);
            return this;
        }
    }

    public WorkbookImpl withIdentity(WorkbookResourceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public WorkbookImpl withKind(Kind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public WorkbookImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public WorkbookImpl withDisplayName(String displayName) {
        if (isInCreateMode()) {
            this.innerModel().withDisplayName(displayName);
            return this;
        } else {
            this.updateWorkbookUpdateParameters.withDisplayName(displayName);
            return this;
        }
    }

    public WorkbookImpl withSerializedData(String serializedData) {
        if (isInCreateMode()) {
            this.innerModel().withSerializedData(serializedData);
            return this;
        } else {
            this.updateWorkbookUpdateParameters.withSerializedData(serializedData);
            return this;
        }
    }

    public WorkbookImpl withVersion(String version) {
        this.innerModel().withVersion(version);
        return this;
    }

    public WorkbookImpl withCategory(String category) {
        if (isInCreateMode()) {
            this.innerModel().withCategory(category);
            return this;
        } else {
            this.updateWorkbookUpdateParameters.withCategory(category);
            return this;
        }
    }

    public WorkbookImpl withTagsPropertiesTags(List<String> tagsPropertiesTags) {
        if (isInCreateMode()) {
            this.innerModel().withTagsPropertiesTags(tagsPropertiesTags);
            return this;
        } else {
            this.updateWorkbookUpdateParameters.withTagsPropertiesTags(tagsPropertiesTags);
            return this;
        }
    }

    public WorkbookImpl withSourceId(String sourceId) {
        if (isInCreateMode()) {
            this.innerModel().withSourceId(sourceId);
            return this;
        } else {
            this.updateSourceId = sourceId;
            return this;
        }
    }

    public WorkbookImpl withStorageUri(String storageUri) {
        this.innerModel().withStorageUri(storageUri);
        return this;
    }

    public WorkbookImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateWorkbookUpdateParameters.withDescription(description);
            return this;
        }
    }

    public WorkbookImpl withSourceIdParameter(String sourceId) {
        this.createSourceId = sourceId;
        return this;
    }

    public WorkbookImpl withKind(SharedTypeKind kind) {
        this.updateWorkbookUpdateParameters.withKind(kind);
        return this;
    }

    public WorkbookImpl withRevision(String revision) {
        this.updateWorkbookUpdateParameters.withRevision(revision);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
