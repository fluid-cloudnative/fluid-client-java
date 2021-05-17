
# InitUsersSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**env** | **Map&lt;String, String&gt;** | Environment variables that will be used by initialize the users for runtime |  [optional]
**image** | **String** | Image for initialize the users for runtime(e.g. alluxio/alluxio-User init) |  [optional]
**imagePullPolicy** | **String** | One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60; |  [optional]
**imageTag** | **String** | Image Tag for initialize the users for runtime(e.g. 2.3.0-SNAPSHOT) |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) | Resources that will be requested by initialize the users for runtime. &lt;br&gt; &lt;br&gt; Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod. |  [optional]



