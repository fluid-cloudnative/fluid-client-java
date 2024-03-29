/*
 * fluid
 * client for fluid
 *
 * The version of the OpenAPI document: v0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import from kubernetes.client import V1ResourceRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.ExternalEndpointSpec;
import models.V1VolumeMount;

/**
 * MasterSpec defines the configurations for Vineyard Master component which is also regarded as the Etcd component in Vineyard. For more info about Vineyard, refer to &lt;a href&#x3D;\&quot;https://v6d.io/\&quot;&gt;Vineyard&lt;/a&gt;
 */
@ApiModel(description = "MasterSpec defines the configurations for Vineyard Master component which is also regarded as the Etcd component in Vineyard. For more info about Vineyard, refer to <a href=\"https://v6d.io/\">Vineyard</a>")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class MasterSpec {
  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private ExternalEndpointSpec endpoint;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private Map<String, String> env = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_IMAGE_TAG = "imageTag";
  @SerializedName(SERIALIZED_NAME_IMAGE_TAG)
  private String imageTag;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = null;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private Map<String, Integer> ports = null;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources = null;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1VolumeMount> volumeMounts = null;


  public MasterSpec endpoint(ExternalEndpointSpec endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalEndpointSpec getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(ExternalEndpointSpec endpoint) {
    this.endpoint = endpoint;
  }


  public MasterSpec env(Map<String, String> env) {
    
    this.env = env;
    return this;
  }

  public MasterSpec putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<String, String>();
    }
    this.env.put(key, envItem);
    return this;
  }

   /**
   * Environment variables that will be used by Vineyard component. For Master, refer to &lt;a href&#x3D;\&quot;https://etcd.io/docs/v3.5/op-guide/configuration/\&quot;&gt;Etcd Configuration&lt;/a&gt; for more info Default is not set.
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Environment variables that will be used by Vineyard component. For Master, refer to <a href=\"https://etcd.io/docs/v3.5/op-guide/configuration/\">Etcd Configuration</a> for more info Default is not set.")

  public Map<String, String> getEnv() {
    return env;
  }


  public void setEnv(Map<String, String> env) {
    this.env = env;
  }


  public MasterSpec image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * The image of Vineyard component. For Master, the default image is &#x60;bitnami/etcd&#x60; For Worker, the default image is &#x60;vineyardcloudnative/vineyardd&#x60; The default container registry is &#x60;docker.io&#x60;, you can change it by setting the image field
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The image of Vineyard component. For Master, the default image is `bitnami/etcd` For Worker, the default image is `vineyardcloudnative/vineyardd` The default container registry is `docker.io`, you can change it by setting the image field")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public MasterSpec imagePullPolicy(String imagePullPolicy) {
    
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * The image pull policy of Vineyard component. Default is &#x60;IfNotPresent&#x60;.
   * @return imagePullPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The image pull policy of Vineyard component. Default is `IfNotPresent`.")

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }


  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public MasterSpec imageTag(String imageTag) {
    
    this.imageTag = imageTag;
    return this;
  }

   /**
   * The image tag of Vineyard component. For Master, the default image tag is &#x60;3.5.10&#x60;. For Worker, the default image tag is &#x60;latest&#x60;.
   * @return imageTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The image tag of Vineyard component. For Master, the default image tag is `3.5.10`. For Worker, the default image tag is `latest`.")

  public String getImageTag() {
    return imageTag;
  }


  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }


  public MasterSpec nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public MasterSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector to choose which nodes to launch the Vineyard component. E,g. {\&quot;disktype\&quot;: \&quot;ssd\&quot;}
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector to choose which nodes to launch the Vineyard component. E,g. {\"disktype\": \"ssd\"}")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public MasterSpec options(Map<String, String> options) {
    
    this.options = options;
    return this;
  }

  public MasterSpec putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Configurable options for Vineyard component. For Master, there is no configurable options. For Worker, support the following options.    vineyardd.reserve.memory: (Bool) where to reserve memory for vineyardd                             If set to true, the memory quota will be counted to the vineyardd rather than the application.   etcd.prefix: (String) the prefix of etcd key for vineyard objects    Default value is as follows.      vineyardd.reserve.memory: \&quot;true\&quot;     etcd.prefix: \&quot;/vineyard\&quot;
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configurable options for Vineyard component. For Master, there is no configurable options. For Worker, support the following options.    vineyardd.reserve.memory: (Bool) where to reserve memory for vineyardd                             If set to true, the memory quota will be counted to the vineyardd rather than the application.   etcd.prefix: (String) the prefix of etcd key for vineyard objects    Default value is as follows.      vineyardd.reserve.memory: \"true\"     etcd.prefix: \"/vineyard\"")

  public Map<String, String> getOptions() {
    return options;
  }


  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public MasterSpec ports(Map<String, Integer> ports) {
    
    this.ports = ports;
    return this;
  }

  public MasterSpec putPortsItem(String key, Integer portsItem) {
    if (this.ports == null) {
      this.ports = new HashMap<String, Integer>();
    }
    this.ports.put(key, portsItem);
    return this;
  }

   /**
   * Ports used by Vineyard component. For Master, the default client port is 2379 and peer port is 2380. For Worker, the default rpc port is 9600.
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ports used by Vineyard component. For Master, the default client port is 2379 and peer port is 2380. For Worker, the default rpc port is 9600.")

  public Map<String, Integer> getPorts() {
    return ports;
  }


  public void setPorts(Map<String, Integer> ports) {
    this.ports = ports;
  }


  public MasterSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * The replicas of Vineyard component. If not specified, defaults to 1. For worker, the replicas should not be greater than the number of nodes in the cluster
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The replicas of Vineyard component. If not specified, defaults to 1. For worker, the replicas should not be greater than the number of nodes in the cluster")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public MasterSpec resources(V1ResourceRequirements resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ResourceRequirements getResources() {
    return resources;
  }


  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }


  public MasterSpec volumeMounts(List<V1VolumeMount> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public MasterSpec addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<V1VolumeMount>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into the vineyard runtime component&#39;s filesystem. It is useful for specifying a persistent storage. Default is not set.
   * @return volumeMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VolumeMounts specifies the volumes listed in \".spec.volumes\" to mount into the vineyard runtime component's filesystem. It is useful for specifying a persistent storage. Default is not set.")

  public List<V1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterSpec masterSpec = (MasterSpec) o;
    return Objects.equals(this.endpoint, masterSpec.endpoint) &&
        Objects.equals(this.env, masterSpec.env) &&
        Objects.equals(this.image, masterSpec.image) &&
        Objects.equals(this.imagePullPolicy, masterSpec.imagePullPolicy) &&
        Objects.equals(this.imageTag, masterSpec.imageTag) &&
        Objects.equals(this.nodeSelector, masterSpec.nodeSelector) &&
        Objects.equals(this.options, masterSpec.options) &&
        Objects.equals(this.ports, masterSpec.ports) &&
        Objects.equals(this.replicas, masterSpec.replicas) &&
        Objects.equals(this.resources, masterSpec.resources) &&
        Objects.equals(this.volumeMounts, masterSpec.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, env, image, imagePullPolicy, imageTag, nodeSelector, options, ports, replicas, resources, volumeMounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterSpec {\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

