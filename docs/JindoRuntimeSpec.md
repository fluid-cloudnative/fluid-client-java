

# JindoRuntimeSpec

JindoRuntimeSpec defines the desired state of JindoRuntime
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleanCachePolicy** | [**CleanCachePolicy**](CleanCachePolicy.md) |  |  [optional]
**fuse** | [**JindoFuseSpec**](JindoFuseSpec.md) |  |  [optional]
**hadoopConfig** | **String** | Name of the configMap used to support HDFS configurations when using HDFS as Jindo&#39;s UFS. The configMap must be in the same namespace with the JindoRuntime. The configMap should contain user-specific HDFS conf files in it. For now, only \&quot;hdfs-site.xml\&quot; and \&quot;core-site.xml\&quot; are supported. It must take the filename of the conf file as the key and content of the file as the value. |  [optional]
**jindoVersion** | [**VersionSpec**](VersionSpec.md) |  |  [optional]
**labels** | **Map&lt;String, String&gt;** | Labels will be added on all the JindoFS pods. DEPRECATED: this is a deprecated field. Please use PodMetadata.Labels instead. Note: this field is set to be exclusive with PodMetadata.Labels |  [optional]
**logConfig** | **Map&lt;String, String&gt;** |  |  [optional]
**master** | [**JindoCompTemplateSpec**](JindoCompTemplateSpec.md) |  |  [optional]
**networkmode** | **String** | Whether to use hostnetwork or not |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for Jindo system. &lt;br&gt; |  [optional]
**replicas** | **Integer** | The replicas of the worker, need to be specified |  [optional]
**runAs** | [**User**](User.md) |  |  [optional]
**secret** | **String** |  |  [optional]
**tieredstore** | [**TieredStore**](TieredStore.md) |  |  [optional]
**user** | **String** |  |  [optional]
**volumes** | [**List&lt;V1Volume&gt;**](V1Volume.md) | Volumes is the list of Kubernetes volumes that can be mounted by the jindo runtime components and/or fuses. |  [optional]
**worker** | [**JindoCompTemplateSpec**](JindoCompTemplateSpec.md) |  |  [optional]



