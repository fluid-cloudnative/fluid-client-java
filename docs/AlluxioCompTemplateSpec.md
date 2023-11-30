

# AlluxioCompTemplateSpec

AlluxioCompTemplateSpec is a description of the Alluxio commponents
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Enabled or Disabled for the components. For now, only  API Gateway is enabled or disabled. |  [optional]
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by Alluxio component. &lt;br&gt; |  [optional]
**jvmOptions** | **List&lt;String&gt;** | Options for JVM |  [optional]
**networkMode** | **String** | Whether to use hostnetwork or not |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the master to fit on a node |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**ports** | **Map&lt;String, Integer&gt;** | Ports used by Alluxio(e.g. rpc: 19998 for master) |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for the Alluxio component. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://docs.alluxio.io/os/user/stable/en/reference/Properties-List.html\&quot;&gt;Alluxio Configuration Properties&lt;/a&gt; for more info |  [optional]
**replicas** | **Integer** | Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into the alluxio runtime component&#39;s filesystem. |  [optional]



