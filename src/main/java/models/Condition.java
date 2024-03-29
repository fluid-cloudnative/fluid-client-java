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
import models.V1Time;

/**
 * Condition explains the transitions on phase
 */
@ApiModel(description = "Condition explains the transitions on phase")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class Condition {
  public static final String SERIALIZED_NAME_LAST_PROBE_TIME = "lastProbeTime";
  @SerializedName(SERIALIZED_NAME_LAST_PROBE_TIME)
  private datetime lastProbeTime = null;

  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private datetime lastTransitionTime = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = "";

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "";


  public Condition lastProbeTime(datetime lastProbeTime) {
    
    this.lastProbeTime = lastProbeTime;
    return this;
  }

   /**
   * Get lastProbeTime
   * @return lastProbeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public datetime getLastProbeTime() {
    return lastProbeTime;
  }


  public void setLastProbeTime(datetime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }


  public Condition lastTransitionTime(datetime lastTransitionTime) {
    
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Get lastTransitionTime
   * @return lastTransitionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public datetime getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(datetime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public Condition message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message is a human-readable message indicating details about the transition
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message is a human-readable message indicating details about the transition")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Condition reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason for the condition&#39;s last transition
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason for the condition's last transition")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public Condition status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the condition, one of &#x60;True&#x60;, &#x60;False&#x60; or &#x60;Unknown&#x60;
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the condition, one of `True`, `False` or `Unknown`")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Condition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of condition, either &#x60;Complete&#x60; or &#x60;Failed&#x60;
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of condition, either `Complete` or `Failed`")

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
    Condition condition = (Condition) o;
    return Objects.equals(this.lastProbeTime, condition.lastProbeTime) &&
        Objects.equals(this.lastTransitionTime, condition.lastTransitionTime) &&
        Objects.equals(this.message, condition.message) &&
        Objects.equals(this.reason, condition.reason) &&
        Objects.equals(this.status, condition.status) &&
        Objects.equals(this.type, condition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Condition {\n");
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

