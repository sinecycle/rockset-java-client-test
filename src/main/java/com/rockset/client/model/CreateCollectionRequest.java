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
import com.rockset.client.model.EventTimeInfo;
import com.rockset.client.model.FieldMappingV2;
import com.rockset.client.model.Source;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateCollectionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T00:35:16.099Z")
public class CreateCollectionRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("sources")
  private List<Source> sources = null;

  @SerializedName("retention_secs")
  private Long retentionSecs = null;

  @SerializedName("event_time_info")
  private EventTimeInfo eventTimeInfo = null;

  @SerializedName("field_mappings")
  private List<FieldMappingV2> fieldMappings = null;

  public CreateCollectionRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * unique identifer for collection, can contain alphanumeric or dash characters
   * @return name
  **/
  @ApiModelProperty(example = "global-transactions", required = true, value = "unique identifer for collection, can contain alphanumeric or dash characters")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateCollectionRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * text describing the collection
   * @return description
  **/
  @ApiModelProperty(example = "transactions from stores worldwide", value = "text describing the collection")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateCollectionRequest sources(List<Source> sources) {
    this.sources = sources;
    return this;
  }

  public CreateCollectionRequest addSourcesItem(Source sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<Source>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * list of sources from which to ingest data
   * @return sources
  **/
  @ApiModelProperty(value = "list of sources from which to ingest data")
  public List<Source> getSources() {
    return sources;
  }

  public void setSources(List<Source> sources) {
    this.sources = sources;
  }

  public CreateCollectionRequest retentionSecs(Long retentionSecs) {
    this.retentionSecs = retentionSecs;
    return this;
  }

   /**
   * number of seconds after which data is purged, based on event time
   * @return retentionSecs
  **/
  @ApiModelProperty(example = "1000000", value = "number of seconds after which data is purged, based on event time")
  public Long getRetentionSecs() {
    return retentionSecs;
  }

  public void setRetentionSecs(Long retentionSecs) {
    this.retentionSecs = retentionSecs;
  }

  public CreateCollectionRequest eventTimeInfo(EventTimeInfo eventTimeInfo) {
    this.eventTimeInfo = eventTimeInfo;
    return this;
  }

   /**
   * configuration for event data
   * @return eventTimeInfo
  **/
  @ApiModelProperty(value = "configuration for event data")
  public EventTimeInfo getEventTimeInfo() {
    return eventTimeInfo;
  }

  public void setEventTimeInfo(EventTimeInfo eventTimeInfo) {
    this.eventTimeInfo = eventTimeInfo;
  }

  public CreateCollectionRequest fieldMappings(List<FieldMappingV2> fieldMappings) {
    this.fieldMappings = fieldMappings;
    return this;
  }

  public CreateCollectionRequest addFieldMappingsItem(FieldMappingV2 fieldMappingsItem) {
    if (this.fieldMappings == null) {
      this.fieldMappings = new ArrayList<FieldMappingV2>();
    }
    this.fieldMappings.add(fieldMappingsItem);
    return this;
  }

   /**
   * list of mappings
   * @return fieldMappings
  **/
  @ApiModelProperty(value = "list of mappings")
  public List<FieldMappingV2> getFieldMappings() {
    return fieldMappings;
  }

  public void setFieldMappings(List<FieldMappingV2> fieldMappings) {
    this.fieldMappings = fieldMappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCollectionRequest createCollectionRequest = (CreateCollectionRequest) o;
    return Objects.equals(this.name, createCollectionRequest.name) &&
        Objects.equals(this.description, createCollectionRequest.description) &&
        Objects.equals(this.sources, createCollectionRequest.sources) &&
        Objects.equals(this.retentionSecs, createCollectionRequest.retentionSecs) &&
        Objects.equals(this.eventTimeInfo, createCollectionRequest.eventTimeInfo) &&
        Objects.equals(this.fieldMappings, createCollectionRequest.fieldMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, sources, retentionSecs, eventTimeInfo, fieldMappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCollectionRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    retentionSecs: ").append(toIndentedString(retentionSecs)).append("\n");
    sb.append("    eventTimeInfo: ").append(toIndentedString(eventTimeInfo)).append("\n");
    sb.append("    fieldMappings: ").append(toIndentedString(fieldMappings)).append("\n");
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

