

# ThinFuseSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **List&lt;String&gt;** | Arguments that will be passed to thinRuntime Fuse |  [optional]
**cleanPolicy** | **String** | CleanPolicy decides when to clean thinRuntime Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once the fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnDemand |  [optional]
**command** | **List&lt;String&gt;** | Command that will be passed to thinRuntime Fuse |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | Environment variables that will be used by thinRuntime Fuse |  [optional]
**image** | **String** | Image for thinRuntime fuse |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image for thinRuntime fuse |  [optional]
**livenessProbe** | [**V1Probe**](V1Probe.md) |  |  [optional]
**networkMode** | **String** | Whether to use hostnetwork or not |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled |  [optional]
**options** | **Map&lt;String, String&gt;** | Options configurable options of FUSE client, performance parameters usually. will be merged with Dataset.spec.mounts.options into fuse pod. |  [optional]
**ports** | [**List&lt;V1ContainerPort&gt;**](V1ContainerPort.md) | Ports used thinRuntime |  [optional]
**readinessProbe** | [**V1Probe**](V1Probe.md) |  |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into the thinruntime component&#39;s filesystem. |  [optional]



