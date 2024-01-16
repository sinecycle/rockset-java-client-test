/*
 * REST API
 * Rockset's REST API allows for creating and managing all resources in Rockset. Each supported endpoint is documented below.  All requests must be authorized with a Rockset API key, which can be created in the [Rockset console](https://console.rockset.com). The API key must be provided as `ApiKey <api_key>` in the `Authorization` request header. For example: ``` Authorization: ApiKey aB35kDjg93J5nsf4GjwMeErAVd832F7ad4vhsW1S02kfZiab42sTsfW5Sxt25asT ```  All endpoints are only accessible via https.  Build something awesome!
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rockset.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.rockset.client.model.PatchOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-15T19:57:30.680Z")
public class PatchDocument {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("patch")
  private List<PatchOperation> patch = new ArrayList<PatchOperation>();

  public PatchDocument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the document to be patched.
   * @return id
  **/

@JsonProperty("_id")
@ApiModelProperty(example = "ca2d6832-1bfd-f88f-0620-d2aa27a5d86c", required = true, value = "Unique ID of the document to be patched.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PatchDocument patch(List<PatchOperation> patch) {
    this.patch = patch;
    return this;
  }

  public PatchDocument addPatchItem(PatchOperation patchItem) {
    this.patch.add(patchItem);
    return this;
  }

   /**
   * List of patch operations.
   * @return patch
  **/

@JsonProperty("patch")
@ApiModelProperty(required = true, value = "List of patch operations.")
  public List<PatchOperation> getPatch() {
    return patch;
  }

  public void setPatch(List<PatchOperation> patch) {
    this.patch = patch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchDocument patchDocument = (PatchDocument) o;
    return Objects.equals(this.id, patchDocument.id) &&
        Objects.equals(this.patch, patchDocument.patch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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

