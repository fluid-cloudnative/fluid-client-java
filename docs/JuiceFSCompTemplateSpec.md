

# JuiceFSCompTemplateSpec

JuiceFSCompTemplateSpec is a description of the JuiceFS components
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Enabled or Disabled for the components. |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | Environment variables that will be used by JuiceFS component. |  [optional]
**networkMode** | **String** | Whether to use hostnetwork or not |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector |  [optional]
**options** | **Map&lt;String, String&gt;** | Options |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**ports** | [**List&lt;V1ContainerPort&gt;**](V1ContainerPort.md) | Ports used by JuiceFS |  [optional]
**replicas** | **Integer** | Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into runtime component&#39;s filesystem. |  [optional]



