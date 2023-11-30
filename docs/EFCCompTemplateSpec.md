

# EFCCompTemplateSpec

EFCCompTemplateSpec is a description of the EFC components
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disabled** | **Boolean** | Enabled or Disabled for the components. Default enable. |  [optional]
**networkMode** | **String** | Whether to use host network or not. |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the component to fit on a node. |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**ports** | **Map&lt;String, Integer&gt;** | Ports used by EFC(e.g. rpc: 19998 for master). |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for the EFC component. |  [optional]
**replicas** | **Integer** | Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**version** | [**VersionSpec**](VersionSpec.md) |  |  [optional]



