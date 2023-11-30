

# MasterSpec

MasterSpec defines the configurations for Vineyard Master component which is also regarded as the Etcd component in Vineyard. For more info about Vineyard, refer to <a href=\"https://v6d.io/\">Vineyard</a>
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint** | [**ExternalEndpointSpec**](ExternalEndpointSpec.md) |  |  [optional]
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by Vineyard component. For Master, refer to &lt;a href&#x3D;\&quot;https://etcd.io/docs/v3.5/op-guide/configuration/\&quot;&gt;Etcd Configuration&lt;/a&gt; for more info Default is not set. |  [optional]
**image** | **String** | The image of Vineyard component. For Master, the default image is &#x60;bitnami/etcd&#x60; For Worker, the default image is &#x60;vineyardcloudnative/vineyardd&#x60; The default container registry is &#x60;docker.io&#x60;, you can change it by setting the image field |  [optional]
**imagePullPolicy** | **String** | The image pull policy of Vineyard component. Default is &#x60;IfNotPresent&#x60;. |  [optional]
**imageTag** | **String** | The image tag of Vineyard component. For Master, the default image tag is &#x60;3.5.10&#x60;. For Worker, the default image tag is &#x60;latest&#x60;. |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector to choose which nodes to launch the Vineyard component. E,g. {\&quot;disktype\&quot;: \&quot;ssd\&quot;} |  [optional]
**options** | **Map&lt;String, String&gt;** | Configurable options for Vineyard component. For Master, there is no configurable options. For Worker, support the following options.    vineyardd.reserve.memory: (Bool) where to reserve memory for vineyardd                             If set to true, the memory quota will be counted to the vineyardd rather than the application.   etcd.prefix: (String) the prefix of etcd key for vineyard objects    Default value is as follows.      vineyardd.reserve.memory: \&quot;true\&quot;     etcd.prefix: \&quot;/vineyard\&quot; |  [optional]
**ports** | **Map&lt;String, Integer&gt;** | Ports used by Vineyard component. For Master, the default client port is 2379 and peer port is 2380. For Worker, the default rpc port is 9600. |  [optional]
**replicas** | **Integer** | The replicas of Vineyard component. If not specified, defaults to 1. For worker, the replicas should not be greater than the number of nodes in the cluster |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into the vineyard runtime component&#39;s filesystem. It is useful for specifying a persistent storage. Default is not set. |  [optional]



