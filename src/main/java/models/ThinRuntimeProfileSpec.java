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
import java.util.List;
import models.ThinCompTemplateSpec;
import models.ThinFuseSpec;
import models.V1Volume;

/**
 * ThinRuntimeProfileSpec defines the desired state of ThinRuntimeProfile
 */
@ApiModel(description = "ThinRuntimeProfileSpec defines the desired state of ThinRuntimeProfile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class ThinRuntimeProfileSpec {
  public static final String SERIALIZED_NAME_FILE_SYSTEM_TYPE = "fileSystemType";
  @SerializedName(SERIALIZED_NAME_FILE_SYSTEM_TYPE)
  private String fileSystemType = "";

  public static final String SERIALIZED_NAME_FUSE = "fuse";
  @SerializedName(SERIALIZED_NAME_FUSE)
  private ThinFuseSpec fuse;

  public static final String SERIALIZED_NAME_NODE_PUBLISH_SECRET_POLICY = "nodePublishSecretPolicy";
  @SerializedName(SERIALIZED_NAME_NODE_PUBLISH_SECRET_POLICY)
  private String nodePublishSecretPolicy;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1Volume> volumes = null;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  private ThinCompTemplateSpec worker;


  public ThinRuntimeProfileSpec fileSystemType(String fileSystemType) {
    
    this.fileSystemType = fileSystemType;
    return this;
  }

   /**
   * file system of thinRuntime
   * @return fileSystemType
  **/
  @ApiModelProperty(required = true, value = "file system of thinRuntime")

  public String getFileSystemType() {
    return fileSystemType;
  }


  public void setFileSystemType(String fileSystemType) {
    this.fileSystemType = fileSystemType;
  }


  public ThinRuntimeProfileSpec fuse(ThinFuseSpec fuse) {
    
    this.fuse = fuse;
    return this;
  }

   /**
   * Get fuse
   * @return fuse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThinFuseSpec getFuse() {
    return fuse;
  }


  public void setFuse(ThinFuseSpec fuse) {
    this.fuse = fuse;
  }


  public ThinRuntimeProfileSpec nodePublishSecretPolicy(String nodePublishSecretPolicy) {
    
    this.nodePublishSecretPolicy = nodePublishSecretPolicy;
    return this;
  }

   /**
   * NodePublishSecretPolicy describes the policy to decide which to do with node publish secret when mounting an existing persistent volume.
   * @return nodePublishSecretPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodePublishSecretPolicy describes the policy to decide which to do with node publish secret when mounting an existing persistent volume.")

  public String getNodePublishSecretPolicy() {
    return nodePublishSecretPolicy;
  }


  public void setNodePublishSecretPolicy(String nodePublishSecretPolicy) {
    this.nodePublishSecretPolicy = nodePublishSecretPolicy;
  }


  public ThinRuntimeProfileSpec volumes(List<V1Volume> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public ThinRuntimeProfileSpec addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Volumes is the list of Kubernetes volumes that can be mounted by runtime components and/or fuses.
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volumes is the list of Kubernetes volumes that can be mounted by runtime components and/or fuses.")

  public List<V1Volume> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }


  public ThinRuntimeProfileSpec worker(ThinCompTemplateSpec worker) {
    
    this.worker = worker;
    return this;
  }

   /**
   * Get worker
   * @return worker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThinCompTemplateSpec getWorker() {
    return worker;
  }


  public void setWorker(ThinCompTemplateSpec worker) {
    this.worker = worker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThinRuntimeProfileSpec thinRuntimeProfileSpec = (ThinRuntimeProfileSpec) o;
    return Objects.equals(this.fileSystemType, thinRuntimeProfileSpec.fileSystemType) &&
        Objects.equals(this.fuse, thinRuntimeProfileSpec.fuse) &&
        Objects.equals(this.nodePublishSecretPolicy, thinRuntimeProfileSpec.nodePublishSecretPolicy) &&
        Objects.equals(this.volumes, thinRuntimeProfileSpec.volumes) &&
        Objects.equals(this.worker, thinRuntimeProfileSpec.worker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemType, fuse, nodePublishSecretPolicy, volumes, worker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThinRuntimeProfileSpec {\n");
    sb.append("    fileSystemType: ").append(toIndentedString(fileSystemType)).append("\n");
    sb.append("    fuse: ").append(toIndentedString(fuse)).append("\n");
    sb.append("    nodePublishSecretPolicy: ").append(toIndentedString(nodePublishSecretPolicy)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
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

