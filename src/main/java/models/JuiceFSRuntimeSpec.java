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
import models.CleanCachePolicy;
import models.InitUsersSpec;
import models.JuiceFSCompTemplateSpec;
import models.JuiceFSFuseSpec;
import models.PodMetadata;
import models.TieredStore;
import models.User;
import models.V1Volume;
import models.VersionSpec;

/**
 * JuiceFSRuntimeSpec defines the desired state of JuiceFSRuntime
 */
@ApiModel(description = "JuiceFSRuntimeSpec defines the desired state of JuiceFSRuntime")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class JuiceFSRuntimeSpec {
  public static final String SERIALIZED_NAME_CLEAN_CACHE_POLICY = "cleanCachePolicy";
  @SerializedName(SERIALIZED_NAME_CLEAN_CACHE_POLICY)
  private CleanCachePolicy cleanCachePolicy;

  public static final String SERIALIZED_NAME_CONFIGS = "configs";
  @SerializedName(SERIALIZED_NAME_CONFIGS)
  private List<String> configs = null;

  public static final String SERIALIZED_NAME_DISABLE_PROMETHEUS = "disablePrometheus";
  @SerializedName(SERIALIZED_NAME_DISABLE_PROMETHEUS)
  private Boolean disablePrometheus;

  public static final String SERIALIZED_NAME_FUSE = "fuse";
  @SerializedName(SERIALIZED_NAME_FUSE)
  private JuiceFSFuseSpec fuse;

  public static final String SERIALIZED_NAME_INIT_USERS = "initUsers";
  @SerializedName(SERIALIZED_NAME_INIT_USERS)
  private InitUsersSpec initUsers;

  public static final String SERIALIZED_NAME_JOB_WORKER = "jobWorker";
  @SerializedName(SERIALIZED_NAME_JOB_WORKER)
  private JuiceFSCompTemplateSpec jobWorker;

  public static final String SERIALIZED_NAME_JUICEFS_VERSION = "juicefsVersion";
  @SerializedName(SERIALIZED_NAME_JUICEFS_VERSION)
  private VersionSpec juicefsVersion;

  public static final String SERIALIZED_NAME_MASTER = "master";
  @SerializedName(SERIALIZED_NAME_MASTER)
  private JuiceFSCompTemplateSpec master;

  public static final String SERIALIZED_NAME_POD_METADATA = "podMetadata";
  @SerializedName(SERIALIZED_NAME_POD_METADATA)
  private PodMetadata podMetadata;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RUN_AS = "runAs";
  @SerializedName(SERIALIZED_NAME_RUN_AS)
  private User runAs;

  public static final String SERIALIZED_NAME_TIEREDSTORE = "tieredstore";
  @SerializedName(SERIALIZED_NAME_TIEREDSTORE)
  private TieredStore tieredstore;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1Volume> volumes = null;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  private JuiceFSCompTemplateSpec worker;


  public JuiceFSRuntimeSpec cleanCachePolicy(CleanCachePolicy cleanCachePolicy) {
    
    this.cleanCachePolicy = cleanCachePolicy;
    return this;
  }

   /**
   * Get cleanCachePolicy
   * @return cleanCachePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CleanCachePolicy getCleanCachePolicy() {
    return cleanCachePolicy;
  }


  public void setCleanCachePolicy(CleanCachePolicy cleanCachePolicy) {
    this.cleanCachePolicy = cleanCachePolicy;
  }


  public JuiceFSRuntimeSpec configs(List<String> configs) {
    
    this.configs = configs;
    return this;
  }

  public JuiceFSRuntimeSpec addConfigsItem(String configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<String>();
    }
    this.configs.add(configsItem);
    return this;
  }

   /**
   * Configs of JuiceFS
   * @return configs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configs of JuiceFS")

  public List<String> getConfigs() {
    return configs;
  }


  public void setConfigs(List<String> configs) {
    this.configs = configs;
  }


  public JuiceFSRuntimeSpec disablePrometheus(Boolean disablePrometheus) {
    
    this.disablePrometheus = disablePrometheus;
    return this;
  }

   /**
   * Disable monitoring for JuiceFS Runtime Prometheus is enabled by default
   * @return disablePrometheus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disable monitoring for JuiceFS Runtime Prometheus is enabled by default")

  public Boolean getDisablePrometheus() {
    return disablePrometheus;
  }


  public void setDisablePrometheus(Boolean disablePrometheus) {
    this.disablePrometheus = disablePrometheus;
  }


  public JuiceFSRuntimeSpec fuse(JuiceFSFuseSpec fuse) {
    
    this.fuse = fuse;
    return this;
  }

   /**
   * Get fuse
   * @return fuse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JuiceFSFuseSpec getFuse() {
    return fuse;
  }


  public void setFuse(JuiceFSFuseSpec fuse) {
    this.fuse = fuse;
  }


  public JuiceFSRuntimeSpec initUsers(InitUsersSpec initUsers) {
    
    this.initUsers = initUsers;
    return this;
  }

   /**
   * Get initUsers
   * @return initUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InitUsersSpec getInitUsers() {
    return initUsers;
  }


  public void setInitUsers(InitUsersSpec initUsers) {
    this.initUsers = initUsers;
  }


  public JuiceFSRuntimeSpec jobWorker(JuiceFSCompTemplateSpec jobWorker) {
    
    this.jobWorker = jobWorker;
    return this;
  }

   /**
   * Get jobWorker
   * @return jobWorker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JuiceFSCompTemplateSpec getJobWorker() {
    return jobWorker;
  }


  public void setJobWorker(JuiceFSCompTemplateSpec jobWorker) {
    this.jobWorker = jobWorker;
  }


  public JuiceFSRuntimeSpec juicefsVersion(VersionSpec juicefsVersion) {
    
    this.juicefsVersion = juicefsVersion;
    return this;
  }

   /**
   * Get juicefsVersion
   * @return juicefsVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VersionSpec getJuicefsVersion() {
    return juicefsVersion;
  }


  public void setJuicefsVersion(VersionSpec juicefsVersion) {
    this.juicefsVersion = juicefsVersion;
  }


  public JuiceFSRuntimeSpec master(JuiceFSCompTemplateSpec master) {
    
    this.master = master;
    return this;
  }

   /**
   * Get master
   * @return master
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JuiceFSCompTemplateSpec getMaster() {
    return master;
  }


  public void setMaster(JuiceFSCompTemplateSpec master) {
    this.master = master;
  }


  public JuiceFSRuntimeSpec podMetadata(PodMetadata podMetadata) {
    
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


  public JuiceFSRuntimeSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * The replicas of the worker, need to be specified
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The replicas of the worker, need to be specified")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public JuiceFSRuntimeSpec runAs(User runAs) {
    
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


  public JuiceFSRuntimeSpec tieredstore(TieredStore tieredstore) {
    
    this.tieredstore = tieredstore;
    return this;
  }

   /**
   * Get tieredstore
   * @return tieredstore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TieredStore getTieredstore() {
    return tieredstore;
  }


  public void setTieredstore(TieredStore tieredstore) {
    this.tieredstore = tieredstore;
  }


  public JuiceFSRuntimeSpec volumes(List<V1Volume> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public JuiceFSRuntimeSpec addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Volumes is the list of Kubernetes volumes that can be mounted by the alluxio runtime components and/or fuses.
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volumes is the list of Kubernetes volumes that can be mounted by the alluxio runtime components and/or fuses.")

  public List<V1Volume> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }


  public JuiceFSRuntimeSpec worker(JuiceFSCompTemplateSpec worker) {
    
    this.worker = worker;
    return this;
  }

   /**
   * Get worker
   * @return worker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JuiceFSCompTemplateSpec getWorker() {
    return worker;
  }


  public void setWorker(JuiceFSCompTemplateSpec worker) {
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
    JuiceFSRuntimeSpec juiceFSRuntimeSpec = (JuiceFSRuntimeSpec) o;
    return Objects.equals(this.cleanCachePolicy, juiceFSRuntimeSpec.cleanCachePolicy) &&
        Objects.equals(this.configs, juiceFSRuntimeSpec.configs) &&
        Objects.equals(this.disablePrometheus, juiceFSRuntimeSpec.disablePrometheus) &&
        Objects.equals(this.fuse, juiceFSRuntimeSpec.fuse) &&
        Objects.equals(this.initUsers, juiceFSRuntimeSpec.initUsers) &&
        Objects.equals(this.jobWorker, juiceFSRuntimeSpec.jobWorker) &&
        Objects.equals(this.juicefsVersion, juiceFSRuntimeSpec.juicefsVersion) &&
        Objects.equals(this.master, juiceFSRuntimeSpec.master) &&
        Objects.equals(this.podMetadata, juiceFSRuntimeSpec.podMetadata) &&
        Objects.equals(this.replicas, juiceFSRuntimeSpec.replicas) &&
        Objects.equals(this.runAs, juiceFSRuntimeSpec.runAs) &&
        Objects.equals(this.tieredstore, juiceFSRuntimeSpec.tieredstore) &&
        Objects.equals(this.volumes, juiceFSRuntimeSpec.volumes) &&
        Objects.equals(this.worker, juiceFSRuntimeSpec.worker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanCachePolicy, configs, disablePrometheus, fuse, initUsers, jobWorker, juicefsVersion, master, podMetadata, replicas, runAs, tieredstore, volumes, worker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JuiceFSRuntimeSpec {\n");
    sb.append("    cleanCachePolicy: ").append(toIndentedString(cleanCachePolicy)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    disablePrometheus: ").append(toIndentedString(disablePrometheus)).append("\n");
    sb.append("    fuse: ").append(toIndentedString(fuse)).append("\n");
    sb.append("    initUsers: ").append(toIndentedString(initUsers)).append("\n");
    sb.append("    jobWorker: ").append(toIndentedString(jobWorker)).append("\n");
    sb.append("    juicefsVersion: ").append(toIndentedString(juicefsVersion)).append("\n");
    sb.append("    master: ").append(toIndentedString(master)).append("\n");
    sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    runAs: ").append(toIndentedString(runAs)).append("\n");
    sb.append("    tieredstore: ").append(toIndentedString(tieredstore)).append("\n");
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

