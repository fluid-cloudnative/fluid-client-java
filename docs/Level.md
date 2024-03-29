

# Level

Level describes configurations a tier needs. <br> Refer to <a href=\"https://docs.alluxio.io/os/user/stable/en/core-services/Caching.html#configuring-tiered-storage\">Configuring Tiered Storage</a> for more info
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**high** | **String** | Ratio of high watermark of the tier (e.g. 0.9) |  [optional]
**low** | **String** | Ratio of low watermark of the tier (e.g. 0.7) |  [optional]
**mediumtype** | **String** | Medium Type of the tier. One of the three types: &#x60;MEM&#x60;, &#x60;SSD&#x60;, &#x60;HDD&#x60; | 
**path** | **String** | File paths to be used for the tier. Multiple paths are supported. Multiple paths should be separated with comma. For example: \&quot;/mnt/cache1,/mnt/cache2\&quot;. |  [optional]
**quota** | [**str**](Quantity.md) |  |  [optional]
**quotaList** | **String** | QuotaList are quotas used to set quota on multiple paths. Quotas should be separated with comma. Quotas in this list will be set to paths with the same order in Path. For example, with Path defined with \&quot;/mnt/cache1,/mnt/cache2\&quot; and QuotaList set to \&quot;100Gi, 50Gi\&quot;, then we get 100GiB cache storage under \&quot;/mnt/cache1\&quot; and 50GiB under \&quot;/mnt/cache2\&quot;. Also note that num of quotas must be consistent with the num of paths defined in Path. |  [optional]
**volumeSource** | [**VolumeSource**](VolumeSource.md) |  |  [optional]
**volumeType** | **String** | VolumeType is the volume type of the tier. Should be one of the three types: &#x60;hostPath&#x60;, &#x60;emptyDir&#x60; and &#x60;volumeTemplate&#x60;. If not set, defaults to hostPath. |  [optional]



