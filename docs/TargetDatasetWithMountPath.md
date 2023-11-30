

# TargetDatasetWithMountPath

TargetDataset defines which dataset will be processed by DataProcess. Under the hood, the dataset's pvc will be mounted to the given mountPath of the DataProcess's containers.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mountPath** | **String** | MountPath defines where the Dataset should be mounted in DataProcess&#39;s containers. | 
**name** | **String** | Name defines name of the target dataset | 
**namespace** | **String** | Namespace defines namespace of the target dataset |  [optional]
**subPath** | **String** | SubPath defines subpath of the target dataset to mount. |  [optional]



