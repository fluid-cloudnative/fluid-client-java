

# GooseFSFuseSpec

GooseFSFuseSpec is a description of the GooseFS Fuse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **Map&lt;String, String&gt;** | Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations |  [optional]
**args** | **List&lt;String&gt;** | Arguments that will be passed to GooseFS Fuse |  [optional]
**cleanPolicy** | **String** | CleanPolicy decides when to clean GooseFS Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once th fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnRuntimeDeleted |  [optional]
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by GooseFS Fuse |  [optional]
**global** | **Boolean** | If the fuse client should be deployed in global mode, otherwise the affinity should be considered |  [optional]
**image** | **String** | Image for GooseFS Fuse(e.g. goosefs/goosefs-fuse) |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image Tag for GooseFS Fuse(e.g. v1.0.1) |  [optional]
**jvmOptions** | **List&lt;String&gt;** | Options for JVM |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for the GOOSEFS component. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://cloud.tencent.com/document/product/436/56415\&quot;&gt;GOOSEFS Configuration Properties&lt;/a&gt; for more info |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]



