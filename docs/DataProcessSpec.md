

# DataProcessSpec

DataProcessSpec defines the desired state of DataProcess
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataset** | [**TargetDatasetWithMountPath**](TargetDatasetWithMountPath.md) |  | 
**processor** | [**Processor**](Processor.md) |  | 
**runAfter** | [**OperationRef**](OperationRef.md) |  |  [optional]
**ttlSecondsAfterFinished** | **Integer** | TTLSecondsAfterFinished is the time second to clean up data operations after finished or failed |  [optional]



