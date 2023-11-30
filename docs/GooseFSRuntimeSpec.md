

# GooseFSRuntimeSpec

GooseFSRuntimeSpec defines the desired state of GooseFSRuntime
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiGateway** | [**GooseFSCompTemplateSpec**](GooseFSCompTemplateSpec.md) |  |  [optional]
**cleanCachePolicy** | [**CleanCachePolicy**](CleanCachePolicy.md) |  |  [optional]
**data** | [**Data**](Data.md) |  |  [optional]
**disablePrometheus** | **Boolean** | Disable monitoring for GooseFS Runtime Prometheus is enabled by default |  [optional]
**fuse** | [**GooseFSFuseSpec**](GooseFSFuseSpec.md) |  |  [optional]
**goosefsVersion** | [**VersionSpec**](VersionSpec.md) |  |  [optional]
**hadoopConfig** | **String** | Name of the configMap used to support HDFS configurations when using HDFS as GooseFS&#39;s UFS. The configMap must be in the same namespace with the GooseFSRuntime. The configMap should contain user-specific HDFS conf files in it. For now, only \&quot;hdfs-site.xml\&quot; and \&quot;core-site.xml\&quot; are supported. It must take the filename of the conf file as the key and content of the file as the value. |  [optional]
**initUsers** | [**InitUsersSpec**](InitUsersSpec.md) |  |  [optional]
**jobMaster** | [**GooseFSCompTemplateSpec**](GooseFSCompTemplateSpec.md) |  |  [optional]
**jobWorker** | [**GooseFSCompTemplateSpec**](GooseFSCompTemplateSpec.md) |  |  [optional]
**jvmOptions** | **List&lt;String&gt;** | Options for JVM |  [optional]
**master** | [**GooseFSCompTemplateSpec**](GooseFSCompTemplateSpec.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for the GOOSEFS component. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://cloud.tencent.com/document/product/436/56415\&quot;&gt;GOOSEFS Configuration Properties&lt;/a&gt; for more info |  [optional]
**replicas** | **Integer** | The replicas of the worker, need to be specified |  [optional]
**runAs** | [**User**](User.md) |  |  [optional]
**tieredstore** | [**TieredStore**](TieredStore.md) |  |  [optional]
**worker** | [**GooseFSCompTemplateSpec**](GooseFSCompTemplateSpec.md) |  |  [optional]



