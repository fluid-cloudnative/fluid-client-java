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
import models.V1Toleration;

/**
 * JindoFuseSpec is a description of the Jindo Fuse
 */
@ApiModel(description = "JindoFuseSpec is a description of the Jindo Fuse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T14:39:14.140796+08:00[Asia/Shanghai]")
public class JindoFuseSpec {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_CLEAN_POLICY = "cleanPolicy";
  @SerializedName(SERIALIZED_NAME_CLEAN_POLICY)
  private String cleanPolicy;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private Map<String, String> env = null;

  public static final String SERIALIZED_NAME_GLOBAL = "global";
  @SerializedName(SERIALIZED_NAME_GLOBAL)
  private Boolean global;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_IMAGE_TAG = "imageTag";
  @SerializedName(SERIALIZED_NAME_IMAGE_TAG)
  private String imageTag;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_LOG_CONFIG = "logConfig";
  @SerializedName(SERIALIZED_NAME_LOG_CONFIG)
  private Map<String, String> logConfig = null;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_POD_METADATA = "podMetadata";
  @SerializedName(SERIALIZED_NAME_POD_METADATA)
  private PodMetadata podMetadata;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = null;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources = null;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations = null;


  public JindoFuseSpec args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public JindoFuseSpec addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Arguments that will be passed to Jindo Fuse
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arguments that will be passed to Jindo Fuse")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public JindoFuseSpec cleanPolicy(String cleanPolicy) {
    
    this.cleanPolicy = cleanPolicy;
    return this;
  }

   /**
   * CleanPolicy decides when to clean JindoFS Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once th fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnRuntimeDeleted
   * @return cleanPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CleanPolicy decides when to clean JindoFS Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once th fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnRuntimeDeleted")

  public String getCleanPolicy() {
    return cleanPolicy;
  }


  public void setCleanPolicy(String cleanPolicy) {
    this.cleanPolicy = cleanPolicy;
  }


  public JindoFuseSpec disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * If disable JindoFS fuse
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If disable JindoFS fuse")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public JindoFuseSpec env(Map<String, String> env) {
    
    this.env = env;
    return this;
  }

  public JindoFuseSpec putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<String, String>();
    }
    this.env.put(key, envItem);
    return this;
  }

   /**
   * Environment variables that will be used by Jindo Fuse
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Environment variables that will be used by Jindo Fuse")

  public Map<String, String> getEnv() {
    return env;
  }


  public void setEnv(Map<String, String> env) {
    this.env = env;
  }


  public JindoFuseSpec global(Boolean global) {
    
    this.global = global;
    return this;
  }

   /**
   * If the fuse client should be deployed in global mode, otherwise the affinity should be considered
   * @return global
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the fuse client should be deployed in global mode, otherwise the affinity should be considered")

  public Boolean getGlobal() {
    return global;
  }


  public void setGlobal(Boolean global) {
    this.global = global;
  }


  public JindoFuseSpec image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Image for Jindo Fuse(e.g. jindo/jindo-fuse)
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image for Jindo Fuse(e.g. jindo/jindo-fuse)")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public JindoFuseSpec imagePullPolicy(String imagePullPolicy) {
    
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


  public JindoFuseSpec imageTag(String imageTag) {
    
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Image Tag for Jindo Fuse(e.g. 2.3.0-SNAPSHOT)
   * @return imageTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image Tag for Jindo Fuse(e.g. 2.3.0-SNAPSHOT)")

  public String getImageTag() {
    return imageTag;
  }


  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }


  public JindoFuseSpec labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public JindoFuseSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Labels will be added on all the JindoFS pods. DEPRECATED: this is a deprecated field. Please use PodMetadata.Labels instead. Note: this field is set to be exclusive with PodMetadata.Labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Labels will be added on all the JindoFS pods. DEPRECATED: this is a deprecated field. Please use PodMetadata.Labels instead. Note: this field is set to be exclusive with PodMetadata.Labels")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public JindoFuseSpec logConfig(Map<String, String> logConfig) {
    
    this.logConfig = logConfig;
    return this;
  }

  public JindoFuseSpec putLogConfigItem(String key, String logConfigItem) {
    if (this.logConfig == null) {
      this.logConfig = new HashMap<String, String>();
    }
    this.logConfig.put(key, logConfigItem);
    return this;
  }

   /**
   * Get logConfig
   * @return logConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLogConfig() {
    return logConfig;
  }


  public void setLogConfig(Map<String, String> logConfig) {
    this.logConfig = logConfig;
  }


  public JindoFuseSpec nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public JindoFuseSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public JindoFuseSpec podMetadata(PodMetadata podMetadata) {
    
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


  public JindoFuseSpec properties(Map<String, String> properties) {
    
    this.properties = properties;
    return this;
  }

  public JindoFuseSpec putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Configurable properties for Jindo System. &lt;br&gt;
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configurable properties for Jindo System. <br>")

  public Map<String, String> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  public JindoFuseSpec resources(V1ResourceRequirements resources) {
    
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


  public JindoFuseSpec tolerations(List<V1Toleration> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public JindoFuseSpec addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * If specified, the pod&#39;s tolerations.
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the pod's tolerations.")

  public List<V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JindoFuseSpec jindoFuseSpec = (JindoFuseSpec) o;
    return Objects.equals(this.args, jindoFuseSpec.args) &&
        Objects.equals(this.cleanPolicy, jindoFuseSpec.cleanPolicy) &&
        Objects.equals(this.disabled, jindoFuseSpec.disabled) &&
        Objects.equals(this.env, jindoFuseSpec.env) &&
        Objects.equals(this.global, jindoFuseSpec.global) &&
        Objects.equals(this.image, jindoFuseSpec.image) &&
        Objects.equals(this.imagePullPolicy, jindoFuseSpec.imagePullPolicy) &&
        Objects.equals(this.imageTag, jindoFuseSpec.imageTag) &&
        Objects.equals(this.labels, jindoFuseSpec.labels) &&
        Objects.equals(this.logConfig, jindoFuseSpec.logConfig) &&
        Objects.equals(this.nodeSelector, jindoFuseSpec.nodeSelector) &&
        Objects.equals(this.podMetadata, jindoFuseSpec.podMetadata) &&
        Objects.equals(this.properties, jindoFuseSpec.properties) &&
        Objects.equals(this.resources, jindoFuseSpec.resources) &&
        Objects.equals(this.tolerations, jindoFuseSpec.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, cleanPolicy, disabled, env, global, image, imagePullPolicy, imageTag, labels, logConfig, nodeSelector, podMetadata, properties, resources, tolerations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JindoFuseSpec {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    cleanPolicy: ").append(toIndentedString(cleanPolicy)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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

