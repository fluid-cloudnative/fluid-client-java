

# ThinRuntimeProfileSpec

ThinRuntimeProfileSpec defines the desired state of ThinRuntimeProfile
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileSystemType** | **String** | file system of thinRuntime | 
**fuse** | [**ThinFuseSpec**](ThinFuseSpec.md) |  |  [optional]
**nodePublishSecretPolicy** | **String** | NodePublishSecretPolicy describes the policy to decide which to do with node publish secret when mounting an existing persistent volume. |  [optional]
**volumes** | [**List&lt;V1Volume&gt;**](V1Volume.md) | Volumes is the list of Kubernetes volumes that can be mounted by runtime components and/or fuses. |  [optional]
**worker** | [**ThinCompTemplateSpec**](ThinCompTemplateSpec.md) |  |  [optional]



