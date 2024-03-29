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
 * Runtime describes a runtime to be used to support dataset
 */
@ApiModel(description = "Runtime describes a runtime to be used to support dataset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class Runtime {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_MASTER_REPLICAS = "masterReplicas";
  @SerializedName(SERIALIZED_NAME_MASTER_REPLICAS)
  private Integer masterReplicas;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public Runtime category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Category the runtime object belongs to (e.g. Accelerate)
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category the runtime object belongs to (e.g. Accelerate)")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public Runtime masterReplicas(Integer masterReplicas) {
    
    this.masterReplicas = masterReplicas;
    return this;
  }

   /**
   * Runtime master replicas
   * @return masterReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Runtime master replicas")

  public Integer getMasterReplicas() {
    return masterReplicas;
  }


  public void setMasterReplicas(Integer masterReplicas) {
    this.masterReplicas = masterReplicas;
  }


  public Runtime name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the runtime object
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the runtime object")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Runtime namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of the runtime object
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace of the runtime object")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public Runtime type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Runtime object&#39;s type (e.g. Alluxio)
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Runtime object's type (e.g. Alluxio)")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Runtime runtime = (Runtime) o;
    return Objects.equals(this.category, runtime.category) &&
        Objects.equals(this.masterReplicas, runtime.masterReplicas) &&
        Objects.equals(this.name, runtime.name) &&
        Objects.equals(this.namespace, runtime.namespace) &&
        Objects.equals(this.type, runtime.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, masterReplicas, name, namespace, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Runtime {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    masterReplicas: ").append(toIndentedString(masterReplicas)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

