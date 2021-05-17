
# Condition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastProbeTime** | [**V1Time**](V1Time.md) | LastProbeTime describes last time this condition was updated. |  [optional]
**lastTransitionTime** | [**V1Time**](V1Time.md) | LastTransitionTime describes last time the condition transitioned from one status to another. |  [optional]
**message** | **String** | Message is a human-readable message indicating details about the transition |  [optional]
**reason** | **String** | Reason for the condition&#39;s last transition |  [optional]
**status** | **String** | Status of the condition, one of &#x60;True&#x60;, &#x60;False&#x60; or &#x60;Unknown&#x60; | 
**type** | **String** | Type of condition, either &#x60;Complete&#x60; or &#x60;Failed&#x60; | 



