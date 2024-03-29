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
import models.DatasetToMigrate;
import models.ExternalStorage;

/**
 * DataToMigrate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class DataToMigrate {
  public static final String SERIALIZED_NAME_DATASET = "dataset";
  @SerializedName(SERIALIZED_NAME_DATASET)
  private DatasetToMigrate dataset;

  public static final String SERIALIZED_NAME_EXTERNAL_STORAGE = "externalStorage";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_STORAGE)
  private ExternalStorage externalStorage;


  public DataToMigrate dataset(DatasetToMigrate dataset) {
    
    this.dataset = dataset;
    return this;
  }

   /**
   * Get dataset
   * @return dataset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatasetToMigrate getDataset() {
    return dataset;
  }


  public void setDataset(DatasetToMigrate dataset) {
    this.dataset = dataset;
  }


  public DataToMigrate externalStorage(ExternalStorage externalStorage) {
    
    this.externalStorage = externalStorage;
    return this;
  }

   /**
   * Get externalStorage
   * @return externalStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalStorage getExternalStorage() {
    return externalStorage;
  }


  public void setExternalStorage(ExternalStorage externalStorage) {
    this.externalStorage = externalStorage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataToMigrate dataToMigrate = (DataToMigrate) o;
    return Objects.equals(this.dataset, dataToMigrate.dataset) &&
        Objects.equals(this.externalStorage, dataToMigrate.externalStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, externalStorage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataToMigrate {\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    externalStorage: ").append(toIndentedString(externalStorage)).append("\n");
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

