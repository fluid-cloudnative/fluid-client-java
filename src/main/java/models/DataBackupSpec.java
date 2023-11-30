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
import models.OperationRef;
import models.User;

/**
 * DataBackupSpec defines the desired state of DataBackup
 */
@ApiModel(description = "DataBackupSpec defines the desired state of DataBackup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T14:39:14.140796+08:00[Asia/Shanghai]")
public class DataBackupSpec {
  public static final String SERIALIZED_NAME_BACKUP_PATH = "backupPath";
  @SerializedName(SERIALIZED_NAME_BACKUP_PATH)
  private String backupPath;

  public static final String SERIALIZED_NAME_DATASET = "dataset";
  @SerializedName(SERIALIZED_NAME_DATASET)
  private String dataset;

  public static final String SERIALIZED_NAME_RUN_AFTER = "runAfter";
  @SerializedName(SERIALIZED_NAME_RUN_AFTER)
  private OperationRef runAfter;

  public static final String SERIALIZED_NAME_RUN_AS = "runAs";
  @SerializedName(SERIALIZED_NAME_RUN_AS)
  private User runAs;

  public static final String SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED = "ttlSecondsAfterFinished";
  @SerializedName(SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED)
  private Integer ttlSecondsAfterFinished;


  public DataBackupSpec backupPath(String backupPath) {
    
    this.backupPath = backupPath;
    return this;
  }

   /**
   * BackupPath defines the target path to save data of the DataBackup
   * @return backupPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BackupPath defines the target path to save data of the DataBackup")

  public String getBackupPath() {
    return backupPath;
  }


  public void setBackupPath(String backupPath) {
    this.backupPath = backupPath;
  }


  public DataBackupSpec dataset(String dataset) {
    
    this.dataset = dataset;
    return this;
  }

   /**
   * Dataset defines the target dataset of the DataBackup
   * @return dataset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dataset defines the target dataset of the DataBackup")

  public String getDataset() {
    return dataset;
  }


  public void setDataset(String dataset) {
    this.dataset = dataset;
  }


  public DataBackupSpec runAfter(OperationRef runAfter) {
    
    this.runAfter = runAfter;
    return this;
  }

   /**
   * Get runAfter
   * @return runAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OperationRef getRunAfter() {
    return runAfter;
  }


  public void setRunAfter(OperationRef runAfter) {
    this.runAfter = runAfter;
  }


  public DataBackupSpec runAs(User runAs) {
    
    this.runAs = runAs;
    return this;
  }

   /**
   * Get runAs
   * @return runAs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getRunAs() {
    return runAs;
  }


  public void setRunAs(User runAs) {
    this.runAs = runAs;
  }


  public DataBackupSpec ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return this;
  }

   /**
   * TTLSecondsAfterFinished is the time second to clean up data operations after finished or failed
   * @return ttlSecondsAfterFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TTLSecondsAfterFinished is the time second to clean up data operations after finished or failed")

  public Integer getTtlSecondsAfterFinished() {
    return ttlSecondsAfterFinished;
  }


  public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataBackupSpec dataBackupSpec = (DataBackupSpec) o;
    return Objects.equals(this.backupPath, dataBackupSpec.backupPath) &&
        Objects.equals(this.dataset, dataBackupSpec.dataset) &&
        Objects.equals(this.runAfter, dataBackupSpec.runAfter) &&
        Objects.equals(this.runAs, dataBackupSpec.runAs) &&
        Objects.equals(this.ttlSecondsAfterFinished, dataBackupSpec.ttlSecondsAfterFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPath, dataset, runAfter, runAs, ttlSecondsAfterFinished);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataBackupSpec {\n");
    sb.append("    backupPath: ").append(toIndentedString(backupPath)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    runAfter: ").append(toIndentedString(runAfter)).append("\n");
    sb.append("    runAs: ").append(toIndentedString(runAs)).append("\n");
    sb.append("    ttlSecondsAfterFinished: ").append(toIndentedString(ttlSecondsAfterFinished)).append("\n");
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

