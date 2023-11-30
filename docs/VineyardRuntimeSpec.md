

# VineyardRuntimeSpec

VineyardRuntimeSpec defines the desired state of VineyardRuntime
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disablePrometheus** | **Boolean** | Disable monitoring metrics for Vineyard Runtime Default is false |  [optional]
**fuse** | [**VineyardSockSpec**](VineyardSockSpec.md) |  |  [optional]
**master** | [**MasterSpec**](MasterSpec.md) |  |  [optional]
**tieredstore** | [**TieredStore**](TieredStore.md) |  |  [optional]
**volumes** | [**List&lt;V1Volume&gt;**](V1Volume.md) | Volumes is the list of Kubernetes volumes that can be mounted by the vineyard components (Master and Worker). Default is null. |  [optional]
**worker** | [**VineyardCompTemplateSpec**](VineyardCompTemplateSpec.md) |  |  [optional]



