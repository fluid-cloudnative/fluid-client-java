

# VineyardSockSpec

VineyardSockSpec holds the configurations for vineyard client socket
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleanPolicy** | **String** | CleanPolicy decides when to clean Vineyard Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once th fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnRuntimeDeleted |  [optional]
**image** | **String** | Image for Vineyard Fuse Default is &#x60;vineyardcloudnative/vineyard-mount-socket&#x60; |  [optional]
**imagePullPolicy** | **String** | Image pull policy for Vineyard Fuse Default is &#x60;IfNotPresent&#x60; Available values are &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image Tag for Vineyard Fuse Default is &#x60;latest&#x60; |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]



