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
 * DataRestoreLocation describes the spec restore location of  Dataset
 */
@ApiModel(description = "DataRestoreLocation describes the spec restore location of  Dataset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T14:39:14.140796+08:00[Asia/Shanghai]")
public class DataRestoreLocation {
  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public DataRestoreLocation nodeName(String nodeName) {
    
    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName describes the nodeName of restore if Path is  in the form of local://subpath
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeName describes the nodeName of restore if Path is  in the form of local://subpath")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public DataRestoreLocation path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path describes the path of restore, in the form of  local://subpath or pvc://&lt;pvcName&gt;/subpath
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path describes the path of restore, in the form of  local://subpath or pvc://<pvcName>/subpath")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataRestoreLocation dataRestoreLocation = (DataRestoreLocation) o;
    return Objects.equals(this.nodeName, dataRestoreLocation.nodeName) &&
        Objects.equals(this.path, dataRestoreLocation.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeName, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataRestoreLocation {\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

