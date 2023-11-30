

# ScriptProcessor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **List&lt;String&gt;** | Entrypoint command for ScriptProcessor. |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | List of environment variables to set in the container. |  [optional]
**image** | **String** | Image (e.g. alluxio/alluxio) |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image tag (e.g. 2.3.0-SNAPSHOT) |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**restartPolicy** | **String** | RestartPolicy specifies the processor job&#39;s restart policy. Only \&quot;Never\&quot;, \&quot;OnFailure\&quot; is allowed. |  [optional]
**source** | **String** | Script source for ScriptProcessor | 
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | Pod volumes to mount into the container&#39;s filesystem. |  [optional]
**volumes** | [**List&lt;V1Volume&gt;**](V1Volume.md) | List of volumes that can be mounted by containers belonging to the pod. |  [optional]



