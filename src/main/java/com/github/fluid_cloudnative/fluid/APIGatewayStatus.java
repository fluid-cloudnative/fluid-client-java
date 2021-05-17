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
 * API Gateway
 */
@ApiModel(description = "API Gateway")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-14T16:48:53.494+08:00")
public class APIGatewayStatus {
  @SerializedName("endpoint")
  private String endpoint = null;

  public APIGatewayStatus endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Endpoint for accessing
   * @return endpoint
  **/
  @ApiModelProperty(value = "Endpoint for accessing")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIGatewayStatus aPIGatewayStatus = (APIGatewayStatus) o;
    return Objects.equals(this.endpoint, aPIGatewayStatus.endpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIGatewayStatus {\n");
    
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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

