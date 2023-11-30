

# Processor

Processor defines the actual processor for DataProcess. Processor can be either of a Job or a Shell script.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job** | [**JobProcessor**](JobProcessor.md) |  |  [optional]
**podMetadata** | [**PodMetadata**](PodMetadata.md) |  |  [optional]
**script** | [**ScriptProcessor**](ScriptProcessor.md) |  |  [optional]
**serviceAccountName** | **String** | ServiceAccountName defiens the serviceAccountName of the container |  [optional]



