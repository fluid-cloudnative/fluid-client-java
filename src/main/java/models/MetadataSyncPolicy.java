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

/**
 * MetadataSyncPolicy defines policies when syncing metadata
 */
@ApiModel(description = "MetadataSyncPolicy defines policies when syncing metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T11:55:35.636004+08:00[Asia/Shanghai]")
public class MetadataSyncPolicy {
  public static final String SERIALIZED_NAME_AUTO_SYNC = "autoSync";
  @SerializedName(SERIALIZED_NAME_AUTO_SYNC)
  private Boolean autoSync;


  public MetadataSyncPolicy autoSync(Boolean autoSync) {
    
    this.autoSync = autoSync;
    return this;
  }

   /**
   * AutoSync enables automatic metadata sync when setting up a runtime. If not set, it defaults to true.
   * @return autoSync
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AutoSync enables automatic metadata sync when setting up a runtime. If not set, it defaults to true.")

  public Boolean getAutoSync() {
    return autoSync;
  }


  public void setAutoSync(Boolean autoSync) {
    this.autoSync = autoSync;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataSyncPolicy metadataSyncPolicy = (MetadataSyncPolicy) o;
    return Objects.equals(this.autoSync, metadataSyncPolicy.autoSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoSync);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataSyncPolicy {\n");
    sb.append("    autoSync: ").append(toIndentedString(autoSync)).append("\n");
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
