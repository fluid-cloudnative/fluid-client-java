

# AlluxioFuseSpec

AlluxioFuseSpec is a description of the Alluxio Fuse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **List&lt;String&gt;** | Arguments that will be passed to Alluxio Fuse |  [optional]
**cleanPolicy** | **String** | CleanPolicy decides when to clean Alluxio Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once the fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnRuntimeDeleted |  [optional]
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by Alluxio Fuse |  [optional]
**global** | **Boolean** | If the fuse client should be deployed in global mode, otherwise the affinity should be considered |  [optional]
**image** | **String** | Image for Alluxio Fuse(e.g. alluxio/alluxio-fuse) |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image Tag for Alluxio Fuse(e.g. 2.3.0-SNAPSHOT) |  [optional]
**jvmOptions** | **List&lt;String&gt;** | Options for JVM |  [optional]
**networkMode** | **String** | Whether to use hostnetwork or not |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for Alluxio System. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://docs.alluxio.io/os/user/stable/en/reference/Properties-List.html\&quot;&gt;Alluxio Configuration Properties&lt;/a&gt; for more info |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into the alluxio runtime component&#39;s filesystem. |  [optional]



