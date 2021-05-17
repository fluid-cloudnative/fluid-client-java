
# AlluxioFuseSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **List&lt;String&gt;** | Arguments that will be passed to Alluxio Fuse |  [optional]
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by Alluxio Fuse |  [optional]
**global** | **Boolean** | If the fuse client should be deployed in global mode, otherwise the affinity should be considered |  [optional]
**image** | **String** | Image for Alluxio Fuse(e.g. alluxio/alluxio-fuse) |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image Tag for Alluxio Fuse(e.g. 2.3.0-SNAPSHOT) |  [optional]
**jvmOptions** | **List&lt;String&gt;** | Options for JVM |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for Alluxio System. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://docs.alluxio.io/os/user/stable/en/reference/Properties-List.html\&quot;&gt;Alluxio Configuration Properties&lt;/a&gt; for more info |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) | Resources that will be requested by Alluxio Fuse. &lt;br&gt; &lt;br&gt; Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod. |  [optional]



