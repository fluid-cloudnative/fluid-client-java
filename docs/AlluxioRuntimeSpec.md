
# AlluxioRuntimeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alluxioVersion** | [**VersionSpec**](VersionSpec.md) | The version information that instructs fluid to orchestrate a particular version of Alluxio. |  [optional]
**apiGateway** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) | Desired state for Alluxio API Gateway |  [optional]
**data** | [**Data**](Data.md) | Management strategies for the dataset to which the runtime is bound |  [optional]
**disablePrometheus** | **Boolean** | Disable monitoring for Alluxio Runtime Promethous is enabled by default |  [optional]
**fuse** | [**AlluxioFuseSpec**](AlluxioFuseSpec.md) | Desired state for Alluxio Fuse |  [optional]
**hadoopConfig** | **String** | Name of the configMap used to support HDFS configurations when using HDFS as Alluxio&#39;s UFS. The configMap must be in the same namespace with the AlluxioRuntime. The configMap should contain user-specific HDFS conf files in it. For now, only \&quot;hdfs-site.xml\&quot; and \&quot;core-site.xml\&quot; are supported. It must take the filename of the conf file as the key and content of the file as the value. |  [optional]
**initUsers** | [**InitUsersSpec**](InitUsersSpec.md) | The spec of init users |  [optional]
**jobMaster** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) | Desired state for Alluxio job master |  [optional]
**jobWorker** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) | Desired state for Alluxio job Worker |  [optional]
**jvmOptions** | **List&lt;String&gt;** | Options for JVM |  [optional]
**master** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) | Desired state for Alluxio master |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for Alluxio system. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://docs.alluxio.io/os/user/stable/en/reference/Properties-List.html\&quot;&gt;Alluxio Configuration Properties&lt;/a&gt; for more info |  [optional]
**replicas** | **Integer** | The replicas of the worker, need to be specified |  [optional]
**runAs** | [**User**](User.md) | Manage the user to run Alluxio Runtime |  [optional]
**tieredstore** | [**Tieredstore**](Tieredstore.md) | Tiered storage used by Alluxio |  [optional]
**worker** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) | Desired state for Alluxio worker |  [optional]



