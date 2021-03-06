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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Tieredstore is a description of the tiered store
 */
@ApiModel(description = "Tieredstore is a description of the tiered store")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-14T16:48:53.494+08:00")
public class Tieredstore {
  @SerializedName("levels")
  private List<Level> levels = null;

  public Tieredstore levels(List<Level> levels) {
    this.levels = levels;
    return this;
  }

  public Tieredstore addLevelsItem(Level levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<Level>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * configurations for multiple tiers
   * @return levels
  **/
  @ApiModelProperty(value = "configurations for multiple tiers")
  public List<Level> getLevels() {
    return levels;
  }

  public void setLevels(List<Level> levels) {
    this.levels = levels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tieredstore tieredstore = (Tieredstore) o;
    return Objects.equals(this.levels, tieredstore.levels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tieredstore {\n");
    
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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

