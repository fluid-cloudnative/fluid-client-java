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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import models.CleanCachePolicy;
import models.MetadataSyncPolicy;

/**
 * RuntimeManagement defines suggestions for runtime controllers to manage the runtime
 */
@ApiModel(description = "RuntimeManagement defines suggestions for runtime controllers to manage the runtime")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class RuntimeManagement {
  public static final String SERIALIZED_NAME_CLEAN_CACHE_POLICY = "cleanCachePolicy";
  @SerializedName(SERIALIZED_NAME_CLEAN_CACHE_POLICY)
  private CleanCachePolicy cleanCachePolicy;

  public static final String SERIALIZED_NAME_METADATA_SYNC_POLICY = "metadataSyncPolicy";
  @SerializedName(SERIALIZED_NAME_METADATA_SYNC_POLICY)
  private MetadataSyncPolicy metadataSyncPolicy;


  public RuntimeManagement cleanCachePolicy(CleanCachePolicy cleanCachePolicy) {
    
    this.cleanCachePolicy = cleanCachePolicy;
    return this;
  }

   /**
   * Get cleanCachePolicy
   * @return cleanCachePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CleanCachePolicy getCleanCachePolicy() {
    return cleanCachePolicy;
  }


  public void setCleanCachePolicy(CleanCachePolicy cleanCachePolicy) {
    this.cleanCachePolicy = cleanCachePolicy;
  }


  public RuntimeManagement metadataSyncPolicy(MetadataSyncPolicy metadataSyncPolicy) {
    
    this.metadataSyncPolicy = metadataSyncPolicy;
    return this;
  }

   /**
   * Get metadataSyncPolicy
   * @return metadataSyncPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetadataSyncPolicy getMetadataSyncPolicy() {
    return metadataSyncPolicy;
  }


  public void setMetadataSyncPolicy(MetadataSyncPolicy metadataSyncPolicy) {
    this.metadataSyncPolicy = metadataSyncPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeManagement runtimeManagement = (RuntimeManagement) o;
    return Objects.equals(this.cleanCachePolicy, runtimeManagement.cleanCachePolicy) &&
        Objects.equals(this.metadataSyncPolicy, runtimeManagement.metadataSyncPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanCachePolicy, metadataSyncPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeManagement {\n");
    sb.append("    cleanCachePolicy: ").append(toIndentedString(cleanCachePolicy)).append("\n");
    sb.append("    metadataSyncPolicy: ").append(toIndentedString(metadataSyncPolicy)).append("\n");
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

