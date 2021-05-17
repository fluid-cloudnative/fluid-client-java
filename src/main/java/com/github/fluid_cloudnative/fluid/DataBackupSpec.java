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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * DataBackupSpec defines the desired state of DataBackup
 */
@ApiModel(description = "DataBackupSpec defines the desired state of DataBackup")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-14T16:48:53.494+08:00")
public class DataBackupSpec {
  @SerializedName("backupPath")
  private String backupPath = null;

  @SerializedName("dataset")
  private String dataset = null;

  @SerializedName("runAs")
  private User runAs = null;

  public DataBackupSpec backupPath(String backupPath) {
    this.backupPath = backupPath;
    return this;
  }

   /**
   * BackupPath defines the target path to save data of the DataBackup
   * @return backupPath
  **/
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
  @ApiModelProperty(value = "Dataset defines the target dataset of the DataBackup")
  public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public DataBackupSpec runAs(User runAs) {
    this.runAs = runAs;
    return this;
  }

   /**
   * Manage the user to run Alluxio DataBackup
   * @return runAs
  **/
  @ApiModelProperty(value = "Manage the user to run Alluxio DataBackup")
  public User getRunAs() {
    return runAs;
  }

  public void setRunAs(User runAs) {
    this.runAs = runAs;
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
        Objects.equals(this.runAs, dataBackupSpec.runAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPath, dataset, runAs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataBackupSpec {\n");
    
    sb.append("    backupPath: ").append(toIndentedString(backupPath)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    runAs: ").append(toIndentedString(runAs)).append("\n");
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

