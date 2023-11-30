

# EFCRuntimeSpec

EFCRuntimeSpec defines the desired state of EFCRuntime
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleanCachePolicy** | [**CleanCachePolicy**](CleanCachePolicy.md) |  |  [optional]
**fuse** | [**EFCFuseSpec**](EFCFuseSpec.md) |  |  [optional]
**initFuse** | [**InitFuseSpec**](InitFuseSpec.md) |  |  [optional]
**master** | [**EFCCompTemplateSpec**](EFCCompTemplateSpec.md) |  |  [optional]
**osAdvise** | [**OSAdvise**](OSAdvise.md) |  |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**replicas** | **Integer** | The replicas of the worker, need to be specified |  [optional]
**tieredstore** | [**TieredStore**](TieredStore.md) |  |  [optional]
**worker** | [**EFCCompTemplateSpec**](EFCCompTemplateSpec.md) |  |  [optional]



