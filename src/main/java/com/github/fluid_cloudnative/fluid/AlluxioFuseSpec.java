/*
 * fluid
 * Python SDK for fluid
 *
 * OpenAPI spec version: v0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.fluid_cloudnative.fluid;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * AlluxioFuseSpec is a description of the Alluxio Fuse
 */
@ApiModel(description = "AlluxioFuseSpec is a description of the Alluxio Fuse")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-14T16:48:53.494+08:00")
public class AlluxioFuseSpec {
  @SerializedName("args")
  private List<String> args = null;

  @SerializedName("env")
  private Map<String, String> env = null;

  @SerializedName("global")
  private Boolean global = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imagePullPolicy")
  private String imagePullPolicy = null;

  @SerializedName("imageTag")
  private String imageTag = null;

  @SerializedName("jvmOptions")
  private List<String> jvmOptions = null;

  @SerializedName("nodeSelector")
  private Map<String, String> nodeSelector = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("resources")
  private V1ResourceRequirements resources = null;

  public AlluxioFuseSpec args(List<String> args) {
    this.args = args;
    return this;
  }

  public AlluxioFuseSpec addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Arguments that will be passed to Alluxio Fuse
   * @return args
  **/
  @ApiModelProperty(value = "Arguments that will be passed to Alluxio Fuse")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public AlluxioFuseSpec env(Map<String, String> env) {
    this.env = env;
    return this;
  }

  public AlluxioFuseSpec putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<String, String>();
    }
    this.env.put(key, envItem);
    return this;
  }

   /**
   * Environment variables that will be used by Alluxio Fuse
   * @return env
  **/
  @ApiModelProperty(value = "Environment variables that will be used by Alluxio Fuse")
  public Map<String, String> getEnv() {
    return env;
  }

  public void setEnv(Map<String, String> env) {
    this.env = env;
  }

  public AlluxioFuseSpec global(Boolean global) {
    this.global = global;
    return this;
  }

   /**
   * If the fuse client should be deployed in global mode, otherwise the affinity should be considered
   * @return global
  **/
  @ApiModelProperty(value = "If the fuse client should be deployed in global mode, otherwise the affinity should be considered")
  public Boolean isGlobal() {
    return global;
  }

  public void setGlobal(Boolean global) {
    this.global = global;
  }

  public AlluxioFuseSpec image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image for Alluxio Fuse(e.g. alluxio/alluxio-fuse)
   * @return image
  **/
  @ApiModelProperty(value = "Image for Alluxio Fuse(e.g. alluxio/alluxio-fuse)")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public AlluxioFuseSpec imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60;
   * @return imagePullPolicy
  **/
  @ApiModelProperty(value = "One of the three policies: `Always`, `IfNotPresent`, `Never`")
  public String getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  public AlluxioFuseSpec imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Image Tag for Alluxio Fuse(e.g. 2.3.0-SNAPSHOT)
   * @return imageTag
  **/
  @ApiModelProperty(value = "Image Tag for Alluxio Fuse(e.g. 2.3.0-SNAPSHOT)")
  public String getImageTag() {
    return imageTag;
  }

  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }

  public AlluxioFuseSpec jvmOptions(List<String> jvmOptions) {
    this.jvmOptions = jvmOptions;
    return this;
  }

  public AlluxioFuseSpec addJvmOptionsItem(String jvmOptionsItem) {
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
  @ApiModelProperty(value = "Options for JVM")
  public List<String> getJvmOptions() {
    return jvmOptions;
  }

  public void setJvmOptions(List<String> jvmOptions) {
    this.jvmOptions = jvmOptions;
  }

  public AlluxioFuseSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public AlluxioFuseSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
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
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the fuse client to fit on a node, this option only effect when global is enabled")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public AlluxioFuseSpec properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public AlluxioFuseSpec putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Configurable properties for Alluxio System. &lt;br&gt; Refer to &lt;a href&#x3D;\&quot;https://docs.alluxio.io/os/user/stable/en/reference/Properties-List.html\&quot;&gt;Alluxio Configuration Properties&lt;/a&gt; for more info
   * @return properties
  **/
  @ApiModelProperty(value = "Configurable properties for Alluxio System. <br> Refer to <a href=\"https://docs.alluxio.io/os/user/stable/en/reference/Properties-List.html\">Alluxio Configuration Properties</a> for more info")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public AlluxioFuseSpec resources(V1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Resources that will be requested by Alluxio Fuse. &lt;br&gt; &lt;br&gt; Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
   * @return resources
  **/
  @ApiModelProperty(value = "Resources that will be requested by Alluxio Fuse. <br> <br> Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.")
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
    AlluxioFuseSpec alluxioFuseSpec = (AlluxioFuseSpec) o;
    return Objects.equals(this.args, alluxioFuseSpec.args) &&
        Objects.equals(this.env, alluxioFuseSpec.env) &&
        Objects.equals(this.global, alluxioFuseSpec.global) &&
        Objects.equals(this.image, alluxioFuseSpec.image) &&
        Objects.equals(this.imagePullPolicy, alluxioFuseSpec.imagePullPolicy) &&
        Objects.equals(this.imageTag, alluxioFuseSpec.imageTag) &&
        Objects.equals(this.jvmOptions, alluxioFuseSpec.jvmOptions) &&
        Objects.equals(this.nodeSelector, alluxioFuseSpec.nodeSelector) &&
        Objects.equals(this.properties, alluxioFuseSpec.properties) &&
        Objects.equals(this.resources, alluxioFuseSpec.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, env, global, image, imagePullPolicy, imageTag, jvmOptions, nodeSelector, properties, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlluxioFuseSpec {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    jvmOptions: ").append(toIndentedString(jvmOptions)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

