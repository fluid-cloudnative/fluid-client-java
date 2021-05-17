
# DatasetSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** | AccessModes contains all ways the volume backing the PVC can be mounted |  [optional]
**dataRestoreLocation** | [**DataRestoreLocation**](DataRestoreLocation.md) | DataRestoreLocation is the location to load data of dataset  been backuped |  [optional]
**mounts** | [**List&lt;Mount&gt;**](Mount.md) | Mount Points to be mounted on Alluxio. |  [optional]
**nodeAffinity** | [**CacheableNodeAffinity**](CacheableNodeAffinity.md) | NodeAffinity defines constraints that limit what nodes this dataset can be cached to. This field influences the scheduling of pods that use the cached dataset. |  [optional]
**owner** | [**User**](User.md) | The owner of the dataset |  [optional]
**placement** | **String** | Manage switch for opening Multiple datasets single node deployment or not |  [optional]
**runtimes** | [**List&lt;Runtime&gt;**](Runtime.md) | Runtimes for supporting dataset (e.g. AlluxioRuntime) |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | If specified, the pod&#39;s tolerations. |  [optional]



