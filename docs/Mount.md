
# Mount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryptOptions** | [**List&lt;EncryptOption&gt;**](EncryptOption.md) | The secret information |  [optional]
**mountPoint** | **String** | MountPoint is the mount point of source. |  [optional]
**name** | **String** | The name of mount |  [optional]
**options** | **Map&lt;String, String&gt;** | The Mount Options. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://docs.alluxio.io/os/user/stable/en/reference/Properties-List.html\&quot;&gt;Mount Options&lt;/a&gt;.  &lt;br&gt; The option has Prefix &#39;fs.&#39; And you can Learn more from &lt;a href&#x3D;\&quot;https://docs.alluxio.io/os/user/stable/en/ufs/S3.html\&quot;&gt;The Storage Integrations&lt;/a&gt; |  [optional]
**path** | **String** | The path of mount, if not set will be /{Name} |  [optional]
**readOnly** | **Boolean** | Optional: Defaults to false (read-write). |  [optional]
**shared** | **Boolean** | Optional: Defaults to false (shared). |  [optional]



