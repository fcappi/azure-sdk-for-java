/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.Build;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.BuildType;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.GitCommitTrigger;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.ImageUpdateTrigger;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.ImageDescriptor;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.PlatformProperties;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.BuildStatus;

class BuildImpl extends CreatableUpdatableImpl<Build, BuildInner, BuildImpl> implements Build, Build.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String buildId;
    private Boolean uisArchiveEnabled;

    BuildImpl(String name, ContainerRegistryManager manager) {
        super(name, new BuildInner());
        this.manager = manager;
        // Set resource name
        this.buildId = name;
        //
    }

    BuildImpl(BuildInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.buildId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.buildId = IdParsingUtils.getValueFromIdByName(inner.id(), "builds");
        //
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Build> createResourceAsync() {
        BuildsInner client = this.manager().inner().builds();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<Build> updateResourceAsync() {
        BuildsInner client = this.manager().inner().builds();
        return client.updateAsync(this.resourceGroupName, this.registryName, this.buildId, this.uisArchiveEnabled)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BuildInner> getInnerAsync() {
        BuildsInner client = this.manager().inner().builds();
        return client.getAsync(this.resourceGroupName, this.registryName, this.buildId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String buildId() {
        return this.inner().buildId();
    }

    @Override
    public String buildTask() {
        return this.inner().buildTask();
    }

    @Override
    public BuildType buildType() {
        return this.inner().buildType();
    }

    @Override
    public DateTime createTime() {
        return this.inner().createTime();
    }

    @Override
    public DateTime finishTime() {
        return this.inner().finishTime();
    }

    @Override
    public GitCommitTrigger gitCommitTrigger() {
        return this.inner().gitCommitTrigger();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ImageUpdateTrigger imageUpdateTrigger() {
        return this.inner().imageUpdateTrigger();
    }

    @Override
    public Boolean isArchiveEnabled() {
        return this.inner().isArchiveEnabled();
    }

    @Override
    public DateTime lastUpdatedTime() {
        return this.inner().lastUpdatedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<ImageDescriptor> outputImages() {
        return this.inner().outputImages();
    }

    @Override
    public PlatformProperties platform() {
        return this.inner().platform();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public BuildStatus status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public BuildImpl withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.uisArchiveEnabled = isArchiveEnabled;
        return this;
    }

}