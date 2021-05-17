
# JindoRuntimeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fuse** | [**JindoFuseSpec**](JindoFuseSpec.md) | Desired state for Jindo Fuse |  [optional]
**hadoopConfig** | **String** | Name of the configMap used to support HDFS configurations when using HDFS as Jindo&#39;s UFS. The configMap must be in the same namespace with the JindoRuntime. The configMap should contain user-specific HDFS conf files in it. For now, only \&quot;hdfs-site.xml\&quot; and \&quot;core-site.xml\&quot; are supported. It must take the filename of the conf file as the key and content of the file as the value. |  [optional]
**jindoVersion** | [**VersionSpec**](VersionSpec.md) | The version information that instructs fluid to orchestrate a particular version of Jindo. |  [optional]
**master** | [**JindoCompTemplateSpec**](JindoCompTemplateSpec.md) | Desired state for Jindo master |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for Jindo system. &lt;br&gt; |  [optional]
**replicas** | **Integer** | The replicas of the worker, need to be specified |  [optional]
**runAs** | [**User**](User.md) | Manage the user to run Jindo Runtime |  [optional]
**secret** | **String** |  |  [optional]
**tieredstore** | [**Tieredstore**](Tieredstore.md) | Tiered storage used by Jindo |  [optional]
**user** | **String** |  |  [optional]
**worker** | [**JindoCompTemplateSpec**](JindoCompTemplateSpec.md) | Desired state for Jindo worker |  [optional]



