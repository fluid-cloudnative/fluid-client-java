

# AlluxioRuntimeSpec

AlluxioRuntimeSpec defines the desired state of AlluxioRuntime
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alluxioVersion** | [**VersionSpec**](VersionSpec.md) |  |  [optional]
**apiGateway** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) |  |  [optional]
**data** | [**Data**](Data.md) |  |  [optional]
**disablePrometheus** | **Boolean** | Disable monitoring for Alluxio Runtime Prometheus is enabled by default |  [optional]
**fuse** | [**AlluxioFuseSpec**](AlluxioFuseSpec.md) |  |  [optional]
**hadoopConfig** | **String** | Name of the configMap used to support HDFS configurations when using HDFS as Alluxio&#39;s UFS. The configMap must be in the same namespace with the AlluxioRuntime. The configMap should contain user-specific HDFS conf files in it. For now, only \&quot;hdfs-site.xml\&quot; and \&quot;core-site.xml\&quot; are supported. It must take the filename of the conf file as the key and content of the file as the value. |  [optional]
**initUsers** | [**InitUsersSpec**](InitUsersSpec.md) |  |  [optional]
**jobMaster** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) |  |  [optional]
**jobWorker** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) |  |  [optional]
**jvmOptions** | **List&lt;String&gt;** | Options for JVM |  [optional]
**management** | [**RuntimeManagement**](RuntimeManagement.md) |  |  [optional]
**master** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) |  |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for Alluxio system. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://docs.alluxio.io/os/user/stable/en/reference/Properties-List.html\&quot;&gt;Alluxio Configuration Properties&lt;/a&gt; for more info |  [optional]
**replicas** | **Integer** | The replicas of the worker, need to be specified |  [optional]
**runAs** | [**User**](User.md) |  |  [optional]
**tieredstore** | [**TieredStore**](TieredStore.md) |  |  [optional]
**volumes** | [**List&lt;V1Volume&gt;**](V1Volume.md) | Volumes is the list of Kubernetes volumes that can be mounted by the alluxio runtime components and/or fuses. |  [optional]
**worker** | [**AlluxioCompTemplateSpec**](AlluxioCompTemplateSpec.md) |  |  [optional]



