

# DataMigrateSpec

DataMigrateSpec defines the desired state of DataMigrate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affinity** | [**V1Affinity**](V1Affinity.md) |  |  [optional]
**block** | **Boolean** | if dataMigrate blocked dataset usage, default is false |  [optional]
**from** | [**DataToMigrate**](DataToMigrate.md) |  | 
**image** | **String** | Image (e.g. alluxio/alluxio) |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image tag (e.g. 2.3.0-SNAPSHOT) |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector defiens node selector for DataLoad pod |  [optional]
**options** | **Map&lt;String, String&gt;** | options for migrate, different for each runtime |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**policy** | **String** | policy for migrate, including Once, Cron, OnEvent |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**runAfter** | [**OperationRef**](OperationRef.md) |  |  [optional]
**runtimeType** | **String** | using which runtime to migrate data; if none, take dataset runtime as default |  [optional]
**schedule** | **String** | The schedule in Cron format, only set when policy is cron, see https://en.wikipedia.org/wiki/Cron. |  [optional]
**schedulerName** | **String** | SchedulerName sets the scheduler to be used for DataLoad pod |  [optional]
**to** | [**DataToMigrate**](DataToMigrate.md) |  | 
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | Tolerations defines tolerations for DataLoad pod |  [optional]
**ttlSecondsAfterFinished** | **Integer** | TTLSecondsAfterFinished is the time second to clean up data operations after finished or failed |  [optional]



