

# JindoFuseSpec

JindoFuseSpec is a description of the Jindo Fuse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **List&lt;String&gt;** | Arguments that will be passed to Jindo Fuse |  [optional]
**cleanPolicy** | **String** | CleanPolicy decides when to clean JindoFS Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once th fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnRuntimeDeleted |  [optional]
**disabled** | **Boolean** | If disable JindoFS fuse |  [optional]
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by Jindo Fuse |  [optional]
**global** | **Boolean** | If the fuse client should be deployed in global mode, otherwise the affinity should be considered |  [optional]
**image** | **String** | Image for Jindo Fuse(e.g. jindo/jindo-fuse) |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image Tag for Jindo Fuse(e.g. 2.3.0-SNAPSHOT) |  [optional]
**labels** | **Map&lt;String, String&gt;** | Labels will be added on all the JindoFS pods. DEPRECATED: this is a deprecated field. Please use PodMetadata.Labels instead. Note: this field is set to be exclusive with PodMetadata.Labels |  [optional]
**logConfig** | **Map&lt;String, String&gt;** |  |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for Jindo System. &lt;br&gt; |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | If specified, the pod&#39;s tolerations. |  [optional]



