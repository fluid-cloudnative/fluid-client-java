

# GooseFSCompTemplateSpec

GooseFSCompTemplateSpec is a description of the GooseFS commponents
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **Map&lt;String, String&gt;** | Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations |  [optional]
**enabled** | **Boolean** | Enabled or Disabled for the components. For now, only  API Gateway is enabled or disabled. |  [optional]
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by GooseFS component. &lt;br&gt; |  [optional]
**jvmOptions** | **List&lt;String&gt;** | Options for JVM |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the master to fit on a node |  [optional]
**ports** | **Map&lt;String, Integer&gt;** | Ports used by GooseFS(e.g. rpc: 19998 for master) |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for the GOOSEFS component. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://cloud.tencent.com/document/product/436/56415\&quot;&gt;GOOSEFS Configuration Properties&lt;/a&gt; for more info |  [optional]
**replicas** | **Integer** | Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]



