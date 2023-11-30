

# EFCFuseSpec

EFCFuseSpec is a description of the EFC Fuse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleanPolicy** | **String** | CleanPolicy decides when to clean EFC Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once th fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnRuntimeDeleted |  [optional]
**networkMode** | **String** | Whether to use hostnetwork or not |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for EFC fuse |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**version** | [**VersionSpec**](VersionSpec.md) |  |  [optional]



