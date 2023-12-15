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
 * WaitingStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class WaitingStatus {
  public static final String SERIALIZED_NAME_OPERATION_COMPLETE = "operationComplete";
  @SerializedName(SERIALIZED_NAME_OPERATION_COMPLETE)
  private Boolean operationComplete;


  public WaitingStatus operationComplete(Boolean operationComplete) {
    
    this.operationComplete = operationComplete;
    return this;
  }

   /**
   * OperationComplete indicates if the preceding operation is complete
   * @return operationComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OperationComplete indicates if the preceding operation is complete")

  public Boolean getOperationComplete() {
    return operationComplete;
  }


  public void setOperationComplete(Boolean operationComplete) {
    this.operationComplete = operationComplete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaitingStatus waitingStatus = (WaitingStatus) o;
    return Objects.equals(this.operationComplete, waitingStatus.operationComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationComplete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaitingStatus {\n");
    sb.append("    operationComplete: ").append(toIndentedString(operationComplete)).append("\n");
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

