

# ThinCompTemplateSpec

ThinCompTemplateSpec is a description of the thinRuntime components
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Enabled or Disabled for the components. |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | Environment variables that will be used by thinRuntime component. |  [optional]
**image** | **String** | Image for thinRuntime fuse |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image for thinRuntime fuse |  [optional]
**livenessProbe** | [**V1Probe**](V1Probe.md) |  |  [optional]
**networkMode** | **String** | Whether to use hostnetwork or not |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector |  [optional]
**ports** | [**List&lt;V1ContainerPort&gt;**](V1ContainerPort.md) | Ports used thinRuntime |  [optional]
**readinessProbe** | [**V1Probe**](V1Probe.md) |  |  [optional]
**replicas** | **Integer** | Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into runtime component&#39;s filesystem. |  [optional]



