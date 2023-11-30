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
import models.EncryptOption;

/**
 * ExternalEndpointSpec defines the configurations for external etcd cluster
 */
@ApiModel(description = "ExternalEndpointSpec defines the configurations for external etcd cluster")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T11:55:35.636004+08:00[Asia/Shanghai]")
public class ExternalEndpointSpec {
  public static final String SERIALIZED_NAME_ENCRYPT_OPTIONS = "encryptOptions";
  @SerializedName(SERIALIZED_NAME_ENCRYPT_OPTIONS)
  private List<EncryptOption> encryptOptions = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = null;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri = "";


  public ExternalEndpointSpec encryptOptions(List<EncryptOption> encryptOptions) {
    
    this.encryptOptions = encryptOptions;
    return this;
  }

  public ExternalEndpointSpec addEncryptOptionsItem(EncryptOption encryptOptionsItem) {
    if (this.encryptOptions == null) {
      this.encryptOptions = new ArrayList<EncryptOption>();
    }
    this.encryptOptions.add(encryptOptionsItem);
    return this;
  }

   /**
   * encrypt info for accessing the external etcd cluster
   * @return encryptOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "encrypt info for accessing the external etcd cluster")

  public List<EncryptOption> getEncryptOptions() {
    return encryptOptions;
  }


  public void setEncryptOptions(List<EncryptOption> encryptOptions) {
    this.encryptOptions = encryptOptions;
  }


  public ExternalEndpointSpec options(Map<String, String> options) {
    
    this.options = options;
    return this;
  }

  public ExternalEndpointSpec putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Configurable options for External Etcd cluster. Support the following options.    etcd.prefix: (String) the prefix of etcd key for vineyard objects  Default value is as follows.    etcd.prefix: \&quot;/vineyard\&quot;
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configurable options for External Etcd cluster. Support the following options.    etcd.prefix: (String) the prefix of etcd key for vineyard objects  Default value is as follows.    etcd.prefix: \"/vineyard\"")

  public Map<String, String> getOptions() {
    return options;
  }


  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public ExternalEndpointSpec uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URI specifies the endpoint of external Etcd cluster E,g. \&quot;etcd-svc.etcd-namespace.svc.cluster.local:2379\&quot; Default is not set and use http protocol to connect to external etcd cluster
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI specifies the endpoint of external Etcd cluster E,g. \"etcd-svc.etcd-namespace.svc.cluster.local:2379\" Default is not set and use http protocol to connect to external etcd cluster")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalEndpointSpec externalEndpointSpec = (ExternalEndpointSpec) o;
    return Objects.equals(this.encryptOptions, externalEndpointSpec.encryptOptions) &&
        Objects.equals(this.options, externalEndpointSpec.options) &&
        Objects.equals(this.uri, externalEndpointSpec.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptOptions, options, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalEndpointSpec {\n");
    sb.append("    encryptOptions: ").append(toIndentedString(encryptOptions)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
