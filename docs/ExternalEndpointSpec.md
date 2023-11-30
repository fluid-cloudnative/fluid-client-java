

# ExternalEndpointSpec

ExternalEndpointSpec defines the configurations for external etcd cluster
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryptOptions** | [**List&lt;EncryptOption&gt;**](EncryptOption.md) | encrypt info for accessing the external etcd cluster |  [optional]
**options** | **Map&lt;String, String&gt;** | Configurable options for External Etcd cluster. Support the following options.    etcd.prefix: (String) the prefix of etcd key for vineyard objects  Default value is as follows.    etcd.prefix: \&quot;/vineyard\&quot; |  [optional]
**uri** | **String** | URI specifies the endpoint of external Etcd cluster E,g. \&quot;etcd-svc.etcd-namespace.svc.cluster.local:2379\&quot; Default is not set and use http protocol to connect to external etcd cluster |  [optional]



