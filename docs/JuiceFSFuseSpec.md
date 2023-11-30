

# JuiceFSFuseSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleanPolicy** | **String** | CleanPolicy decides when to clean Juicefs Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once th fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnDemand |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | Environment variables that will be used by JuiceFS Fuse |  [optional]
**global** | **Boolean** | If the fuse client should be deployed in global mode, otherwise the affinity should be considered |  [optional]
**image** | **String** | Image for JuiceFS fuse |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image for JuiceFS fuse |  [optional]
**networkMode** | **String** | Whether to use hostnetwork or not |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled |  [optional]
**options** | **Map&lt;String, String&gt;** | Options mount options that fuse pod will use |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into runtime component&#39;s filesystem. |  [optional]



