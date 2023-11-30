

# ThinRuntimeSpec

ThinRuntimeSpec defines the desired state of ThinRuntime
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disablePrometheus** | **Boolean** | Disable monitoring for Runtime Prometheus is enabled by default |  [optional]
**fuse** | [**ThinFuseSpec**](ThinFuseSpec.md) |  |  [optional]
**profileName** | **String** | The specific runtime profile name, empty value is used for handling datasets which mount another dataset |  [optional]
**replicas** | **Integer** | The replicas of the worker, need to be specified |  [optional]
**runAs** | [**User**](User.md) |  |  [optional]
**tieredstore** | [**TieredStore**](TieredStore.md) |  |  [optional]
**volumes** | [**List&lt;V1Volume&gt;**](V1Volume.md) | Volumes is the list of Kubernetes volumes that can be mounted by runtime components and/or fuses. |  [optional]
**worker** | [**ThinCompTemplateSpec**](ThinCompTemplateSpec.md) |  |  [optional]



