

# RuntimeStatus

RuntimeStatus defines the observed state of Runtime
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiGateway** | [**APIGatewayStatus**](APIGatewayStatus.md) |  |  [optional]
**cacheAffinity** | [**V1NodeAffinity**](V1NodeAffinity.md) |  |  [optional]
**cacheStates** | **Map&lt;String, String&gt;** | CacheStatus represents the total resources of the dataset. |  [optional]
**conditions** | [**List&lt;RuntimeCondition&gt;**](RuntimeCondition.md) | Represents the latest available observations of a ddc runtime&#39;s current state. |  [optional]
**currentFuseNumberScheduled** | **Integer** | The total number of nodes that can be running the runtime Fuse pod (including nodes correctly running the runtime Fuse pod). | 
**currentMasterNumberScheduled** | **Integer** | The total number of nodes that should be running the runtime pod (including nodes correctly running the runtime master pod). | 
**currentWorkerNumberScheduled** | **Integer** | The total number of nodes that can be running the runtime worker pod (including nodes correctly running the runtime worker pod). | 
**desiredFuseNumberScheduled** | **Integer** | The total number of nodes that should be running the runtime Fuse pod (including nodes correctly running the runtime Fuse pod). | 
**desiredMasterNumberScheduled** | **Integer** | The total number of nodes that should be running the runtime pod (including nodes correctly running the runtime master pod). | 
**desiredWorkerNumberScheduled** | **Integer** | The total number of nodes that should be running the runtime worker pod (including nodes correctly running the runtime worker pod). | 
**fuseNumberAvailable** | **Integer** | The number of nodes that should be running the runtime Fuse pod and have one or more of the runtime Fuse pod running and available (ready for at least spec.minReadySeconds) |  [optional]
**fuseNumberReady** | **Integer** | The number of nodes that should be running the runtime Fuse pod and have one or more of the runtime Fuse pod running and ready. | 
**fuseNumberUnavailable** | **Integer** | The number of nodes that should be running the runtime fuse pod and have none of the runtime fuse pod running and available (ready for at least spec.minReadySeconds) |  [optional]
**fusePhase** | **String** | FusePhase is the Fuse running phase | 
**fuseReason** | **String** | Reason for the condition&#39;s last transition. |  [optional]
**masterNumberReady** | **Integer** | The number of nodes that should be running the runtime worker pod and have zero or more of the runtime master pod running and ready. | 
**masterPhase** | **String** | MasterPhase is the master running phase | 
**masterReason** | **String** | Reason for Master&#39;s condition transition |  [optional]
**mountTime** | [**datetime**](V1Time.md) |  |  [optional]
**mounts** | [**List&lt;Mount&gt;**](Mount.md) | MountPoints represents the mount points specified in the bounded dataset |  [optional]
**selector** | **String** | Selector is used for auto-scaling |  [optional]
**setupDuration** | **String** | Duration tell user how much time was spent to setup the runtime |  [optional]
**valueFile** | **String** | config map used to set configurations | 
**workerNumberAvailable** | **Integer** | The number of nodes that should be running the runtime worker pod and have one or more of the runtime worker pod running and available (ready for at least spec.minReadySeconds) |  [optional]
**workerNumberReady** | **Integer** | The number of nodes that should be running the runtime worker pod and have one or more of the runtime worker pod running and ready. | 
**workerNumberUnavailable** | **Integer** | The number of nodes that should be running the runtime worker pod and have none of the runtime worker pod running and available (ready for at least spec.minReadySeconds) |  [optional]
**workerPhase** | **String** | WorkerPhase is the worker running phase | 
**workerReason** | **String** | Reason for Worker&#39;s condition transition |  [optional]



