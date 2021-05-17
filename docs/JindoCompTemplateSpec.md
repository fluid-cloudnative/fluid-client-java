
# JindoCompTemplateSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by Jindo component. &lt;br&gt; |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the master to fit on a node |  [optional]
**ports** | **Map&lt;String, Integer&gt;** |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for the Jindo component. &lt;br&gt; |  [optional]
**replicas** | **Integer** | Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) | Resources that will be requested by the Jindo component. &lt;br&gt; &lt;br&gt; Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod. |  [optional]



