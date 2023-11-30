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
import models.JobProcessor;
import models.PodMetadata;
import models.ScriptProcessor;

/**
 * Processor defines the actual processor for DataProcess. Processor can be either of a Job or a Shell script.
 */
@ApiModel(description = "Processor defines the actual processor for DataProcess. Processor can be either of a Job or a Shell script.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T14:39:14.140796+08:00[Asia/Shanghai]")
public class Processor {
  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private JobProcessor job;

  public static final String SERIALIZED_NAME_POD_METADATA = "podMetadata";
  @SerializedName(SERIALIZED_NAME_POD_METADATA)
  private PodMetadata podMetadata;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private ScriptProcessor script;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;


  public Processor job(JobProcessor job) {
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobProcessor getJob() {
    return job;
  }


  public void setJob(JobProcessor job) {
    this.job = job;
  }


  public Processor podMetadata(PodMetadata podMetadata) {
    
    this.podMetadata = podMetadata;
    return this;
  }

   /**
   * Get podMetadata
   * @return podMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PodMetadata getPodMetadata() {
    return podMetadata;
  }


  public void setPodMetadata(PodMetadata podMetadata) {
    this.podMetadata = podMetadata;
  }


  public Processor script(ScriptProcessor script) {
    
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScriptProcessor getScript() {
    return script;
  }


  public void setScript(ScriptProcessor script) {
    this.script = script;
  }


  public Processor serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName defiens the serviceAccountName of the container
   * @return serviceAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceAccountName defiens the serviceAccountName of the container")

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Processor processor = (Processor) o;
    return Objects.equals(this.job, processor.job) &&
        Objects.equals(this.podMetadata, processor.podMetadata) &&
        Objects.equals(this.script, processor.script) &&
        Objects.equals(this.serviceAccountName, processor.serviceAccountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, podMetadata, script, serviceAccountName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Processor {\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
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

