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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Condition;
import models.V1Time;
import models.WaitingStatus;

/**
 * OperationStatus defines the observed state of operation
 */
@ApiModel(description = "OperationStatus defines the observed state of operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class OperationStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<Condition> conditions = new ArrayList<Condition>();

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration = "";

  public static final String SERIALIZED_NAME_INFOS = "infos";
  @SerializedName(SERIALIZED_NAME_INFOS)
  private Map<String, String> infos = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULE_TIME = "lastScheduleTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULE_TIME)
  private datetime lastScheduleTime = null;

  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_TIME = "lastSuccessfulTime";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_TIME)
  private datetime lastSuccessfulTime = null;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase = "";

  public static final String SERIALIZED_NAME_WAITING_FOR = "waitingFor";
  @SerializedName(SERIALIZED_NAME_WAITING_FOR)
  private WaitingStatus waitingFor;


  public OperationStatus conditions(List<Condition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public OperationStatus addConditionsItem(Condition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions consists of transition information on operation&#39;s Phase
   * @return conditions
  **/
  @ApiModelProperty(required = true, value = "Conditions consists of transition information on operation's Phase")

  public List<Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<Condition> conditions) {
    this.conditions = conditions;
  }


  public OperationStatus duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration tell user how much time was spent to operation
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "Duration tell user how much time was spent to operation")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public OperationStatus infos(Map<String, String> infos) {
    
    this.infos = infos;
    return this;
  }

  public OperationStatus putInfosItem(String key, String infosItem) {
    if (this.infos == null) {
      this.infos = new HashMap<String, String>();
    }
    this.infos.put(key, infosItem);
    return this;
  }

   /**
   * Infos operation customized name-value
   * @return infos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Infos operation customized name-value")

  public Map<String, String> getInfos() {
    return infos;
  }


  public void setInfos(Map<String, String> infos) {
    this.infos = infos;
  }


  public OperationStatus lastScheduleTime(datetime lastScheduleTime) {
    
    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

   /**
   * Get lastScheduleTime
   * @return lastScheduleTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public datetime getLastScheduleTime() {
    return lastScheduleTime;
  }


  public void setLastScheduleTime(datetime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
  }


  public OperationStatus lastSuccessfulTime(datetime lastSuccessfulTime) {
    
    this.lastSuccessfulTime = lastSuccessfulTime;
    return this;
  }

   /**
   * Get lastSuccessfulTime
   * @return lastSuccessfulTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public datetime getLastSuccessfulTime() {
    return lastSuccessfulTime;
  }


  public void setLastSuccessfulTime(datetime lastSuccessfulTime) {
    this.lastSuccessfulTime = lastSuccessfulTime;
  }


  public OperationStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Phase describes current phase of operation
   * @return phase
  **/
  @ApiModelProperty(required = true, value = "Phase describes current phase of operation")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public OperationStatus waitingFor(WaitingStatus waitingFor) {
    
    this.waitingFor = waitingFor;
    return this;
  }

   /**
   * Get waitingFor
   * @return waitingFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WaitingStatus getWaitingFor() {
    return waitingFor;
  }


  public void setWaitingFor(WaitingStatus waitingFor) {
    this.waitingFor = waitingFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationStatus operationStatus = (OperationStatus) o;
    return Objects.equals(this.conditions, operationStatus.conditions) &&
        Objects.equals(this.duration, operationStatus.duration) &&
        Objects.equals(this.infos, operationStatus.infos) &&
        Objects.equals(this.lastScheduleTime, operationStatus.lastScheduleTime) &&
        Objects.equals(this.lastSuccessfulTime, operationStatus.lastSuccessfulTime) &&
        Objects.equals(this.phase, operationStatus.phase) &&
        Objects.equals(this.waitingFor, operationStatus.waitingFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, duration, infos, lastScheduleTime, lastSuccessfulTime, phase, waitingFor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
    sb.append("    lastSuccessfulTime: ").append(toIndentedString(lastSuccessfulTime)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    waitingFor: ").append(toIndentedString(waitingFor)).append("\n");
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

