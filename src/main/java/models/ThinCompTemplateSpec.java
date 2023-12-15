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
import models.V1ContainerPort;
import models.V1EnvVar;
import models.V1Probe;
import models.V1VolumeMount;

/**
 * ThinCompTemplateSpec is a description of the thinRuntime components
 */
@ApiModel(description = "ThinCompTemplateSpec is a description of the thinRuntime components")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class ThinCompTemplateSpec {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1EnvVar> env = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_IMAGE_TAG = "imageTag";
  @SerializedName(SERIALIZED_NAME_IMAGE_TAG)
  private String imageTag;

  public static final String SERIALIZED_NAME_LIVENESS_PROBE = "livenessProbe";
  @SerializedName(SERIALIZED_NAME_LIVENESS_PROBE)
  private V1Probe livenessProbe = null;

  public static final String SERIALIZED_NAME_NETWORK_MODE = "networkMode";
  @SerializedName(SERIALIZED_NAME_NETWORK_MODE)
  private String networkMode;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1ContainerPort> ports = null;

  public static final String SERIALIZED_NAME_READINESS_PROBE = "readinessProbe";
  @SerializedName(SERIALIZED_NAME_READINESS_PROBE)
  private V1Probe readinessProbe = null;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources = null;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1VolumeMount> volumeMounts = null;


  public ThinCompTemplateSpec enabled(Boolean enabled) {
    
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


  public ThinCompTemplateSpec env(List<V1EnvVar> env) {
    
    this.env = env;
    return this;
  }

  public ThinCompTemplateSpec addEnvItem(V1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<V1EnvVar>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Environment variables that will be used by thinRuntime component.
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Environment variables that will be used by thinRuntime component.")

  public List<V1EnvVar> getEnv() {
    return env;
  }


  public void setEnv(List<V1EnvVar> env) {
    this.env = env;
  }


  public ThinCompTemplateSpec image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Image for thinRuntime fuse
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image for thinRuntime fuse")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public ThinCompTemplateSpec imagePullPolicy(String imagePullPolicy) {
    
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60;
   * @return imagePullPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One of the three policies: `Always`, `IfNotPresent`, `Never`")

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }


  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public ThinCompTemplateSpec imageTag(String imageTag) {
    
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Image for thinRuntime fuse
   * @return imageTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image for thinRuntime fuse")

  public String getImageTag() {
    return imageTag;
  }


  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }


  public ThinCompTemplateSpec livenessProbe(V1Probe livenessProbe) {
    
    this.livenessProbe = livenessProbe;
    return this;
  }

   /**
   * Get livenessProbe
   * @return livenessProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Probe getLivenessProbe() {
    return livenessProbe;
  }


  public void setLivenessProbe(V1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }


  public ThinCompTemplateSpec networkMode(String networkMode) {
    
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


  public ThinCompTemplateSpec nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public ThinCompTemplateSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
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


  public ThinCompTemplateSpec ports(List<V1ContainerPort> ports) {
    
    this.ports = ports;
    return this;
  }

  public ThinCompTemplateSpec addPortsItem(V1ContainerPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1ContainerPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Ports used thinRuntime
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ports used thinRuntime")

  public List<V1ContainerPort> getPorts() {
    return ports;
  }


  public void setPorts(List<V1ContainerPort> ports) {
    this.ports = ports;
  }


  public ThinCompTemplateSpec readinessProbe(V1Probe readinessProbe) {
    
    this.readinessProbe = readinessProbe;
    return this;
  }

   /**
   * Get readinessProbe
   * @return readinessProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Probe getReadinessProbe() {
    return readinessProbe;
  }


  public void setReadinessProbe(V1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }


  public ThinCompTemplateSpec replicas(Integer replicas) {
    
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


  public ThinCompTemplateSpec resources(V1ResourceRequirements resources) {
    
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


  public ThinCompTemplateSpec volumeMounts(List<V1VolumeMount> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public ThinCompTemplateSpec addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
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
    ThinCompTemplateSpec thinCompTemplateSpec = (ThinCompTemplateSpec) o;
    return Objects.equals(this.enabled, thinCompTemplateSpec.enabled) &&
        Objects.equals(this.env, thinCompTemplateSpec.env) &&
        Objects.equals(this.image, thinCompTemplateSpec.image) &&
        Objects.equals(this.imagePullPolicy, thinCompTemplateSpec.imagePullPolicy) &&
        Objects.equals(this.imageTag, thinCompTemplateSpec.imageTag) &&
        Objects.equals(this.livenessProbe, thinCompTemplateSpec.livenessProbe) &&
        Objects.equals(this.networkMode, thinCompTemplateSpec.networkMode) &&
        Objects.equals(this.nodeSelector, thinCompTemplateSpec.nodeSelector) &&
        Objects.equals(this.ports, thinCompTemplateSpec.ports) &&
        Objects.equals(this.readinessProbe, thinCompTemplateSpec.readinessProbe) &&
        Objects.equals(this.replicas, thinCompTemplateSpec.replicas) &&
        Objects.equals(this.resources, thinCompTemplateSpec.resources) &&
        Objects.equals(this.volumeMounts, thinCompTemplateSpec.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, env, image, imagePullPolicy, imageTag, livenessProbe, networkMode, nodeSelector, ports, readinessProbe, replicas, resources, volumeMounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinCompTemplateSpec {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    networkMode: ").append(toIndentedString(networkMode)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
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

