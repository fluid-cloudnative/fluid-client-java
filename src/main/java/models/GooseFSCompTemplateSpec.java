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

/**
 * GooseFSCompTemplateSpec is a description of the GooseFS commponents
 */
@ApiModel(description = "GooseFSCompTemplateSpec is a description of the GooseFS commponents")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T11:55:35.636004+08:00[Asia/Shanghai]")
public class GooseFSCompTemplateSpec {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private Map<String, String> env = null;

  public static final String SERIALIZED_NAME_JVM_OPTIONS = "jvmOptions";
  @SerializedName(SERIALIZED_NAME_JVM_OPTIONS)
  private List<String> jvmOptions = null;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private Map<String, Integer> ports = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = null;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources = null;


  public GooseFSCompTemplateSpec annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public GooseFSCompTemplateSpec putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public GooseFSCompTemplateSpec enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled or Disabled for the components. For now, only  API Gateway is enabled or disabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enabled or Disabled for the components. For now, only  API Gateway is enabled or disabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public GooseFSCompTemplateSpec env(Map<String, String> env) {
    
    this.env = env;
    return this;
  }

  public GooseFSCompTemplateSpec putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<String, String>();
    }
    this.env.put(key, envItem);
    return this;
  }

   /**
   * Environment variables that will be used by GooseFS component. &lt;br&gt;
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Environment variables that will be used by GooseFS component. <br>")

  public Map<String, String> getEnv() {
    return env;
  }


  public void setEnv(Map<String, String> env) {
    this.env = env;
  }


  public GooseFSCompTemplateSpec jvmOptions(List<String> jvmOptions) {
    
    this.jvmOptions = jvmOptions;
    return this;
  }

  public GooseFSCompTemplateSpec addJvmOptionsItem(String jvmOptionsItem) {
    if (this.jvmOptions == null) {
      this.jvmOptions = new ArrayList<String>();
    }
    this.jvmOptions.add(jvmOptionsItem);
    return this;
  }

   /**
   * Options for JVM
   * @return jvmOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Options for JVM")

  public List<String> getJvmOptions() {
    return jvmOptions;
  }


  public void setJvmOptions(List<String> jvmOptions) {
    this.jvmOptions = jvmOptions;
  }


  public GooseFSCompTemplateSpec nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public GooseFSCompTemplateSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the master to fit on a node
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the master to fit on a node")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public GooseFSCompTemplateSpec ports(Map<String, Integer> ports) {
    
    this.ports = ports;
    return this;
  }

  public GooseFSCompTemplateSpec putPortsItem(String key, Integer portsItem) {
    if (this.ports == null) {
      this.ports = new HashMap<String, Integer>();
    }
    this.ports.put(key, portsItem);
    return this;
  }

   /**
   * Ports used by GooseFS(e.g. rpc: 19998 for master)
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ports used by GooseFS(e.g. rpc: 19998 for master)")

  public Map<String, Integer> getPorts() {
    return ports;
  }


  public void setPorts(Map<String, Integer> ports) {
    this.ports = ports;
  }


  public GooseFSCompTemplateSpec properties(Map<String, String> properties) {
    
    this.properties = properties;
    return this;
  }

  public GooseFSCompTemplateSpec putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Configurable properties for the GOOSEFS component. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://cloud.tencent.com/document/product/436/56415\&quot;&gt;GOOSEFS Configuration Properties&lt;/a&gt; for more info
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configurable properties for the GOOSEFS component. <br> Refer to <a href=\"https://cloud.tencent.com/document/product/436/56415\">GOOSEFS Configuration Properties</a> for more info")

  public Map<String, String> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  public GooseFSCompTemplateSpec replicas(Integer replicas) {
    
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


  public GooseFSCompTemplateSpec resources(V1ResourceRequirements resources) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooseFSCompTemplateSpec gooseFSCompTemplateSpec = (GooseFSCompTemplateSpec) o;
    return Objects.equals(this.annotations, gooseFSCompTemplateSpec.annotations) &&
        Objects.equals(this.enabled, gooseFSCompTemplateSpec.enabled) &&
        Objects.equals(this.env, gooseFSCompTemplateSpec.env) &&
        Objects.equals(this.jvmOptions, gooseFSCompTemplateSpec.jvmOptions) &&
        Objects.equals(this.nodeSelector, gooseFSCompTemplateSpec.nodeSelector) &&
        Objects.equals(this.ports, gooseFSCompTemplateSpec.ports) &&
        Objects.equals(this.properties, gooseFSCompTemplateSpec.properties) &&
        Objects.equals(this.replicas, gooseFSCompTemplateSpec.replicas) &&
        Objects.equals(this.resources, gooseFSCompTemplateSpec.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, enabled, env, jvmOptions, nodeSelector, ports, properties, replicas, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooseFSCompTemplateSpec {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    jvmOptions: ").append(toIndentedString(jvmOptions)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
