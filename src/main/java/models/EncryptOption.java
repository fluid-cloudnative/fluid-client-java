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
import models.EncryptOptionSource;

/**
 * EncryptOption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T11:55:35.636004+08:00[Asia/Shanghai]")
public class EncryptOption {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE_FROM = "valueFrom";
  @SerializedName(SERIALIZED_NAME_VALUE_FROM)
  private EncryptOptionSource valueFrom;


  public EncryptOption name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of encryptOption
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of encryptOption")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EncryptOption valueFrom(EncryptOptionSource valueFrom) {
    
    this.valueFrom = valueFrom;
    return this;
  }

   /**
   * Get valueFrom
   * @return valueFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EncryptOptionSource getValueFrom() {
    return valueFrom;
  }


  public void setValueFrom(EncryptOptionSource valueFrom) {
    this.valueFrom = valueFrom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptOption encryptOption = (EncryptOption) o;
    return Objects.equals(this.name, encryptOption.name) &&
        Objects.equals(this.valueFrom, encryptOption.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, valueFrom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptOption {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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
