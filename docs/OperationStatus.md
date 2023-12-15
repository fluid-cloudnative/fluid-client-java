

# OperationStatus

OperationStatus defines the observed state of operation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;Condition&gt;**](Condition.md) | Conditions consists of transition information on operation&#39;s Phase | 
**duration** | **String** | Duration tell user how much time was spent to operation | 
**infos** | **Map&lt;String, String&gt;** | Infos operation customized name-value |  [optional]
**lastScheduleTime** | [**datetime**](V1Time.md) |  |  [optional]
**lastSuccessfulTime** | [**datetime**](V1Time.md) |  |  [optional]
**phase** | **String** | Phase describes current phase of operation | 
**waitingFor** | [**WaitingStatus**](WaitingStatus.md) |  |  [optional]



