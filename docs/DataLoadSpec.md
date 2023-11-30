

# DataLoadSpec

DataLoadSpec defines the desired state of DataLoad
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affinity** | [**V1Affinity**](V1Affinity.md) |  |  [optional]
**dataset** | [**TargetDataset**](TargetDataset.md) |  |  [optional]
**loadMetadata** | **Boolean** | LoadMetadata specifies if the dataload job should load metadata |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector defiens node selector for DataLoad pod |  [optional]
**options** | **Map&lt;String, String&gt;** | Options specifies the extra dataload properties for runtime |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**policy** | **String** | including Once, Cron, OnEvent |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**runAfter** | [**OperationRef**](OperationRef.md) |  |  [optional]
**schedule** | **String** | The schedule in Cron format, only set when policy is cron, see https://en.wikipedia.org/wiki/Cron. |  [optional]
**schedulerName** | **String** | SchedulerName sets the scheduler to be used for DataLoad pod |  [optional]
**target** | [**List&lt;TargetPath&gt;**](TargetPath.md) | Target defines target paths that needs to be loaded |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | Tolerations defines tolerations for DataLoad pod |  [optional]
**ttlSecondsAfterFinished** | **Integer** | TTLSecondsAfterFinished is the time second to clean up data operations after finished or failed |  [optional]



