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
import models.PodMetadata;
import models.V1ContainerPort;
import models.V1EnvVar;
import models.V1VolumeMount;

/**
 * JuiceFSCompTemplateSpec is a description of the JuiceFS components
 */
@ApiModel(description = "JuiceFSCompTemplateSpec is a description of the JuiceFS components")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T14:39:14.140796+08:00[Asia/Shanghai]")
public class JuiceFSCompTemplateSpec {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1EnvVar> env = null;

  public static final String SERIALIZED_NAME_NETWORK_MODE = "networkMode";
  @SerializedName(SERIALIZED_NAME_NETWORK_MODE)
  private String networkMode;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = null;

  public static final String SERIALIZED_NAME_POD_METADATA = "podMetadata";
  @SerializedName(SERIALIZED_NAME_POD_METADATA)
  private PodMetadata podMetadata;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1ContainerPort> ports = null;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources = null;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1VolumeMount> volumeMounts = null;


  public JuiceFSCompTemplateSpec enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled or Disabled for the components.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enabled or Disabled for the components.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public JuiceFSCompTemplateSpec env(List<V1EnvVar> env) {
    
    this.env = env;
    return this;
  }

  public JuiceFSCompTemplateSpec addEnvItem(V1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<V1EnvVar>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Environment variables that will be used by JuiceFS component.
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Environment variables that will be used by JuiceFS component.")

  public List<V1EnvVar> getEnv() {
    return env;
  }


  public void setEnv(List<V1EnvVar> env) {
    this.env = env;
  }


  public JuiceFSCompTemplateSpec networkMode(String networkMode) {
    
    this.networkMode = networkMode;
    return this;
  }

   /**
   * Whether to use hostnetwork or not
   * @return networkMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to use hostnetwork or not")

  public String getNetworkMode() {
    return networkMode;
  }


  public void setNetworkMode(String networkMode) {
    this.networkMode = networkMode;
  }


  public JuiceFSCompTemplateSpec nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public JuiceFSCompTemplateSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public JuiceFSCompTemplateSpec options(Map<String, String> options) {
    
    this.options = options;
    return this;
  }

  public JuiceFSCompTemplateSpec putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Options")

  public Map<String, String> getOptions() {
    return options;
  }


  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public JuiceFSCompTemplateSpec podMetadata(PodMetadata podMetadata) {
    
    this.podMetadata = podMetadata;
    return this;
  }

   /**
   * Get podMetadata
   * @return podMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PodMetadata getPodMetadata() {
    return podMetadata;
  }


  public void setPodMetadata(PodMetadata podMetadata) {
    this.podMetadata = podMetadata;
  }


  public JuiceFSCompTemplateSpec ports(List<V1ContainerPort> ports) {
    
    this.ports = ports;
    return this;
  }

  public JuiceFSCompTemplateSpec addPortsItem(V1ContainerPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1ContainerPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Ports used by JuiceFS
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ports used by JuiceFS")

  public List<V1ContainerPort> getPorts() {
    return ports;
  }


  public void setPorts(List<V1ContainerPort> ports) {
    this.ports = ports;
  }


  public JuiceFSCompTemplateSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replicas is the desired number of replicas of the given template. If unspecified, defaults to 1. replicas is the min replicas of dataset in the cluster")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public JuiceFSCompTemplateSpec resources(V1ResourceRequirements resources) {
    
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


  public JuiceFSCompTemplateSpec volumeMounts(List<V1VolumeMount> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public JuiceFSCompTemplateSpec addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<V1VolumeMount>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * VolumeMounts specifies the volumes listed in \&quot;.spec.volumes\&quot; to mount into runtime component&#39;s filesystem.
   * @return volumeMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VolumeMounts specifies the volumes listed in \".spec.volumes\" to mount into runtime component's filesystem.")

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
    JuiceFSCompTemplateSpec juiceFSCompTemplateSpec = (JuiceFSCompTemplateSpec) o;
    return Objects.equals(this.enabled, juiceFSCompTemplateSpec.enabled) &&
        Objects.equals(this.env, juiceFSCompTemplateSpec.env) &&
        Objects.equals(this.networkMode, juiceFSCompTemplateSpec.networkMode) &&
        Objects.equals(this.nodeSelector, juiceFSCompTemplateSpec.nodeSelector) &&
        Objects.equals(this.options, juiceFSCompTemplateSpec.options) &&
        Objects.equals(this.podMetadata, juiceFSCompTemplateSpec.podMetadata) &&
        Objects.equals(this.ports, juiceFSCompTemplateSpec.ports) &&
        Objects.equals(this.replicas, juiceFSCompTemplateSpec.replicas) &&
        Objects.equals(this.resources, juiceFSCompTemplateSpec.resources) &&
        Objects.equals(this.volumeMounts, juiceFSCompTemplateSpec.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, env, networkMode, nodeSelector, options, podMetadata, ports, replicas, resources, volumeMounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JuiceFSCompTemplateSpec {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    networkMode: ").append(toIndentedString(networkMode)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
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

