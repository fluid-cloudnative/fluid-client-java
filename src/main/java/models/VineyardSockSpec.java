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

/**
 * VineyardSockSpec holds the configurations for vineyard client socket
 */
@ApiModel(description = "VineyardSockSpec holds the configurations for vineyard client socket")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class VineyardSockSpec {
  public static final String SERIALIZED_NAME_CLEAN_POLICY = "cleanPolicy";
  @SerializedName(SERIALIZED_NAME_CLEAN_POLICY)
  private String cleanPolicy;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_IMAGE_TAG = "imageTag";
  @SerializedName(SERIALIZED_NAME_IMAGE_TAG)
  private String imageTag;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources = null;


  public VineyardSockSpec cleanPolicy(String cleanPolicy) {
    
    this.cleanPolicy = cleanPolicy;
    return this;
  }

   /**
   * CleanPolicy decides when to clean Vineyard Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once th fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnRuntimeDeleted
   * @return cleanPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CleanPolicy decides when to clean Vineyard Fuse pods. Currently Fluid supports two policies: OnDemand and OnRuntimeDeleted OnDemand cleans fuse pod once th fuse pod on some node is not needed OnRuntimeDeleted cleans fuse pod only when the cache runtime is deleted Defaults to OnRuntimeDeleted")

  public String getCleanPolicy() {
    return cleanPolicy;
  }


  public void setCleanPolicy(String cleanPolicy) {
    this.cleanPolicy = cleanPolicy;
  }


  public VineyardSockSpec image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Image for Vineyard Fuse Default is &#x60;vineyardcloudnative/vineyard-mount-socket&#x60;
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image for Vineyard Fuse Default is `vineyardcloudnative/vineyard-mount-socket`")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public VineyardSockSpec imagePullPolicy(String imagePullPolicy) {
    
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * Image pull policy for Vineyard Fuse Default is &#x60;IfNotPresent&#x60; Available values are &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60;
   * @return imagePullPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image pull policy for Vineyard Fuse Default is `IfNotPresent` Available values are `Always`, `IfNotPresent`, `Never`")

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }


  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public VineyardSockSpec imageTag(String imageTag) {
    
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Image Tag for Vineyard Fuse Default is &#x60;latest&#x60;
   * @return imageTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image Tag for Vineyard Fuse Default is `latest`")

  public String getImageTag() {
    return imageTag;
  }


  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }


  public VineyardSockSpec resources(V1ResourceRequirements resources) {
    
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
    VineyardSockSpec vineyardSockSpec = (VineyardSockSpec) o;
    return Objects.equals(this.cleanPolicy, vineyardSockSpec.cleanPolicy) &&
        Objects.equals(this.image, vineyardSockSpec.image) &&
        Objects.equals(this.imagePullPolicy, vineyardSockSpec.imagePullPolicy) &&
        Objects.equals(this.imageTag, vineyardSockSpec.imageTag) &&
        Objects.equals(this.resources, vineyardSockSpec.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanPolicy, image, imagePullPolicy, imageTag, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VineyardSockSpec {\n");
    sb.append("    cleanPolicy: ").append(toIndentedString(cleanPolicy)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
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

