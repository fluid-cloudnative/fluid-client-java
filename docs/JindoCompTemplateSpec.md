

# JindoCompTemplateSpec

JindoCompTemplateSpec is a description of the Jindo commponents
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disabled** | **Boolean** | If disable JindoFS master or worker |  [optional]
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by Jindo component. &lt;br&gt; |  [optional]
**labels** | **Map&lt;String, String&gt;** | Labels will be added on JindoFS Master or Worker pods. DEPRECATED: This is a deprecated field. Please use PodMetadata instead. Note: this field is set to be exclusive with PodMetadata.Labels |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the master to fit on a node |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**ports** | **Map&lt;String, Integer&gt;** |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | Configurable properties for the Jindo component. &lt;br&gt; |  [optional]
**replicas** | **Integer** | Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | If specified, the pod&#39;s tolerations. |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into the jindo runtime component&#39;s filesystem. |  [optional]



