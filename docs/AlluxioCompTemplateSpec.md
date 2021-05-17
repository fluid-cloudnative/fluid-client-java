
# AlluxioCompTemplateSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Enabled or Disabled for the components. For now, only  API Gateway is enabled or disabled. |  [optional]
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by Alluxio component. &lt;br&gt; |  [optional]
**jvmOptions** | **List&lt;String&gt;** | Options for JVM |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the master to fit on a node |  [optional]
**ports** | **Map&lt;String, Integer&gt;** | Ports used by Alluxio(e.g. rpc: 19998 for master) |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for the Alluxio component. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://docs.alluxio.io/os/user/stable/en/reference/Properties-List.html\&quot;&gt;Alluxio Configuration Properties&lt;/a&gt; for more info |  [optional]
**replicas** | **Integer** | Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) | Resources that will be requested by the Alluxio component. &lt;br&gt; &lt;br&gt; Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod. |  [optional]



