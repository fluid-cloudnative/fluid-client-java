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
import from kubernetes.client import V1ResourceRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.DataToMigrate;
import models.OperationRef;
import models.PodMetadata;
import models.V1Affinity;
import models.V1Toleration;

/**
 * DataMigrateSpec defines the desired state of DataMigrate
 */
@ApiModel(description = "DataMigrateSpec defines the desired state of DataMigrate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T22:35:53.526622+08:00[Asia/Shanghai]")
public class DataMigrateSpec {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1Affinity affinity = null;

  public static final String SERIALIZED_NAME_BLOCK = "block";
  @SerializedName(SERIALIZED_NAME_BLOCK)
  private Boolean block;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private DataToMigrate from;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_IMAGE_TAG = "imageTag";
  @SerializedName(SERIALIZED_NAME_IMAGE_TAG)
  private String imageTag;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = null;

  public static final String SERIALIZED_NAME_POD_METADATA = "podMetadata";
  @SerializedName(SERIALIZED_NAME_POD_METADATA)
  private PodMetadata podMetadata;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources = null;

  public static final String SERIALIZED_NAME_RUN_AFTER = "runAfter";
  @SerializedName(SERIALIZED_NAME_RUN_AFTER)
  private OperationRef runAfter;

  public static final String SERIALIZED_NAME_RUNTIME_TYPE = "runtimeType";
  @SerializedName(SERIALIZED_NAME_RUNTIME_TYPE)
  private String runtimeType;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;

  public static final String SERIALIZED_NAME_SCHEDULER_NAME = "schedulerName";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_NAME)
  private String schedulerName;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private DataToMigrate to;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations = null;

  public static final String SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED = "ttlSecondsAfterFinished";
  @SerializedName(SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED)
  private Integer ttlSecondsAfterFinished;


  public DataMigrateSpec affinity(V1Affinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Affinity getAffinity() {
    return affinity;
  }


  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }


  public DataMigrateSpec block(Boolean block) {
    
    this.block = block;
    return this;
  }

   /**
   * if dataMigrate blocked dataset usage, default is false
   * @return block
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if dataMigrate blocked dataset usage, default is false")

  public Boolean getBlock() {
    return block;
  }


  public void setBlock(Boolean block) {
    this.block = block;
  }


  public DataMigrateSpec from(DataToMigrate from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(required = true, value = "")

  public DataToMigrate getFrom() {
    return from;
  }


  public void setFrom(DataToMigrate from) {
    this.from = from;
  }


  public DataMigrateSpec image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Image (e.g. alluxio/alluxio)
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image (e.g. alluxio/alluxio)")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public DataMigrateSpec imagePullPolicy(String imagePullPolicy) {
    
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * One of the three policies: &#x60;Always&#x60;, &#x60;IfNotPresent&#x60;, &#x60;Never&#x60;
   * @return imagePullPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One of the three policies: `Always`, `IfNotPresent`, `Never`")

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }


  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public DataMigrateSpec imageTag(String imageTag) {
    
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Image tag (e.g. 2.3.0-SNAPSHOT)
   * @return imageTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image tag (e.g. 2.3.0-SNAPSHOT)")

  public String getImageTag() {
    return imageTag;
  }


  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }


  public DataMigrateSpec nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public DataMigrateSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector defiens node selector for DataLoad pod
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector defiens node selector for DataLoad pod")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public DataMigrateSpec options(Map<String, String> options) {
    
    this.options = options;
    return this;
  }

  public DataMigrateSpec putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * options for migrate, different for each runtime
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "options for migrate, different for each runtime")

  public Map<String, String> getOptions() {
    return options;
  }


  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public DataMigrateSpec podMetadata(PodMetadata podMetadata) {
    
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


  public DataMigrateSpec policy(String policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * policy for migrate, including Once, Cron, OnEvent
   * @return policy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "policy for migrate, including Once, Cron, OnEvent")

  public String getPolicy() {
    return policy;
  }


  public void setPolicy(String policy) {
    this.policy = policy;
  }


  public DataMigrateSpec resources(V1ResourceRequirements resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ResourceRequirements getResources() {
    return resources;
  }


  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }


  public DataMigrateSpec runAfter(OperationRef runAfter) {
    
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


  public DataMigrateSpec runtimeType(String runtimeType) {
    
    this.runtimeType = runtimeType;
    return this;
  }

   /**
   * using which runtime to migrate data; if none, take dataset runtime as default
   * @return runtimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "using which runtime to migrate data; if none, take dataset runtime as default")

  public String getRuntimeType() {
    return runtimeType;
  }


  public void setRuntimeType(String runtimeType) {
    this.runtimeType = runtimeType;
  }


  public DataMigrateSpec schedule(String schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * The schedule in Cron format, only set when policy is cron, see https://en.wikipedia.org/wiki/Cron.
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The schedule in Cron format, only set when policy is cron, see https://en.wikipedia.org/wiki/Cron.")

  public String getSchedule() {
    return schedule;
  }


  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public DataMigrateSpec schedulerName(String schedulerName) {
    
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * SchedulerName sets the scheduler to be used for DataLoad pod
   * @return schedulerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SchedulerName sets the scheduler to be used for DataLoad pod")

  public String getSchedulerName() {
    return schedulerName;
  }


  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }


  public DataMigrateSpec to(DataToMigrate to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")

  public DataToMigrate getTo() {
    return to;
  }


  public void setTo(DataToMigrate to) {
    this.to = to;
  }


  public DataMigrateSpec tolerations(List<V1Toleration> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public DataMigrateSpec addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Tolerations defines tolerations for DataLoad pod
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tolerations defines tolerations for DataLoad pod")

  public List<V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  public DataMigrateSpec ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    
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
    DataMigrateSpec dataMigrateSpec = (DataMigrateSpec) o;
    return Objects.equals(this.affinity, dataMigrateSpec.affinity) &&
        Objects.equals(this.block, dataMigrateSpec.block) &&
        Objects.equals(this.from, dataMigrateSpec.from) &&
        Objects.equals(this.image, dataMigrateSpec.image) &&
        Objects.equals(this.imagePullPolicy, dataMigrateSpec.imagePullPolicy) &&
        Objects.equals(this.imageTag, dataMigrateSpec.imageTag) &&
        Objects.equals(this.nodeSelector, dataMigrateSpec.nodeSelector) &&
        Objects.equals(this.options, dataMigrateSpec.options) &&
        Objects.equals(this.podMetadata, dataMigrateSpec.podMetadata) &&
        Objects.equals(this.policy, dataMigrateSpec.policy) &&
        Objects.equals(this.resources, dataMigrateSpec.resources) &&
        Objects.equals(this.runAfter, dataMigrateSpec.runAfter) &&
        Objects.equals(this.runtimeType, dataMigrateSpec.runtimeType) &&
        Objects.equals(this.schedule, dataMigrateSpec.schedule) &&
        Objects.equals(this.schedulerName, dataMigrateSpec.schedulerName) &&
        Objects.equals(this.to, dataMigrateSpec.to) &&
        Objects.equals(this.tolerations, dataMigrateSpec.tolerations) &&
        Objects.equals(this.ttlSecondsAfterFinished, dataMigrateSpec.ttlSecondsAfterFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, block, from, image, imagePullPolicy, imageTag, nodeSelector, options, podMetadata, policy, resources, runAfter, runtimeType, schedule, schedulerName, to, tolerations, ttlSecondsAfterFinished);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataMigrateSpec {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    runAfter: ").append(toIndentedString(runAfter)).append("\n");
    sb.append("    runtimeType: ").append(toIndentedString(runtimeType)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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

