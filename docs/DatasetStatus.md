

# DatasetStatus

DatasetStatus defines the observed state of Dataset
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cacheStates** | **Map&lt;String, String&gt;** | CacheStatus represents the total resources of the dataset. |  [optional]
**conditions** | [**List&lt;DatasetCondition&gt;**](DatasetCondition.md) | Conditions is an array of current observed conditions. | 
**dataBackupRef** | **String** | DataBackupRef specifies the running Backup job that targets this Dataset. This is mainly used as a lock to prevent concurrent DataBackup jobs. Deprecated, use OperationRef instead |  [optional]
**dataLoadRef** | **String** | DataLoadRef specifies the running DataLoad job that targets this Dataset. This is mainly used as a lock to prevent concurrent DataLoad jobs. Deprecated, use OperationRef instead |  [optional]
**datasetRef** | **List&lt;String&gt;** | DatasetRef specifies the datasets namespaced name mounting this Dataset. |  [optional]
**fileNum** | **String** | FileNum represents the file numbers of the dataset |  [optional]
**hcfs** | [**HCFSStatus**](HCFSStatus.md) |  |  [optional]
**mounts** | [**List&lt;Mount&gt;**](Mount.md) | the info of mount points have been mounted |  [optional]
**operationRef** | **Map&lt;String, String&gt;** | OperationRef specifies the Operation that targets this Dataset. This is mainly used as a lock to prevent concurrent same Operation jobs. |  [optional]
**phase** | **String** | Dataset Phase. One of the four phases: &#x60;Pending&#x60;, &#x60;Bound&#x60;, &#x60;NotBound&#x60; and &#x60;Failed&#x60; |  [optional]
**runtimes** | [**List&lt;Runtime&gt;**](Runtime.md) | Runtimes for supporting dataset |  [optional]
**ufsTotal** | **String** | Total in GB of dataset in the cluster |  [optional]



