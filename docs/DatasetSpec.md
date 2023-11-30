

# DatasetSpec

DatasetSpec defines the desired state of Dataset
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** | AccessModes contains all ways the volume backing the PVC can be mounted |  [optional]
**dataRestoreLocation** | [**DataRestoreLocation**](DataRestoreLocation.md) |  |  [optional]
**mounts** | [**List&lt;Mount&gt;**](Mount.md) | Mount Points to be mounted on Alluxio. | 
**nodeAffinity** | [**CacheableNodeAffinity**](CacheableNodeAffinity.md) |  |  [optional]
**owner** | [**User**](User.md) |  |  [optional]
**placement** | **String** | Manage switch for opening Multiple datasets single node deployment or not |  [optional]
**runtimes** | [**List&lt;Runtime&gt;**](Runtime.md) | Runtimes for supporting dataset (e.g. AlluxioRuntime) |  [optional]
**sharedEncryptOptions** | [**List&lt;EncryptOption&gt;**](EncryptOption.md) | SharedEncryptOptions is the encryptOption to all mount |  [optional]
**sharedOptions** | **Map&lt;String, String&gt;** | SharedOptions is the options to all mount |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | If specified, the pod&#39;s tolerations. |  [optional]



