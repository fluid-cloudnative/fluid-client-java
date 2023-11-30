

# JuiceFSRuntimeSpec

JuiceFSRuntimeSpec defines the desired state of JuiceFSRuntime
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleanCachePolicy** | [**CleanCachePolicy**](CleanCachePolicy.md) |  |  [optional]
**configs** | **List&lt;String&gt;** | Configs of JuiceFS |  [optional]
**disablePrometheus** | **Boolean** | Disable monitoring for JuiceFS Runtime Prometheus is enabled by default |  [optional]
**fuse** | [**JuiceFSFuseSpec**](JuiceFSFuseSpec.md) |  |  [optional]
**initUsers** | [**InitUsersSpec**](InitUsersSpec.md) |  |  [optional]
**jobWorker** | [**JuiceFSCompTemplateSpec**](JuiceFSCompTemplateSpec.md) |  |  [optional]
**juicefsVersion** | [**VersionSpec**](VersionSpec.md) |  |  [optional]
**master** | [**JuiceFSCompTemplateSpec**](JuiceFSCompTemplateSpec.md) |  |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**replicas** | **Integer** | The replicas of the worker, need to be specified |  [optional]
**runAs** | [**User**](User.md) |  |  [optional]
**tieredstore** | [**TieredStore**](TieredStore.md) |  |  [optional]
**volumes** | [**List&lt;V1Volume&gt;**](V1Volume.md) | Volumes is the list of Kubernetes volumes that can be mounted by the alluxio runtime components and/or fuses. |  [optional]
**worker** | [**JuiceFSCompTemplateSpec**](JuiceFSCompTemplateSpec.md) |  |  [optional]



