

# DataBackupSpec

DataBackupSpec defines the desired state of DataBackup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupPath** | **String** | BackupPath defines the target path to save data of the DataBackup |  [optional]
**dataset** | **String** | Dataset defines the target dataset of the DataBackup |  [optional]
**runAfter** | [**OperationRef**](OperationRef.md) |  |  [optional]
**runAs** | [**User**](User.md) |  |  [optional]
**ttlSecondsAfterFinished** | **Integer** | TTLSecondsAfterFinished is the time second to clean up data operations after finished or failed |  [optional]



