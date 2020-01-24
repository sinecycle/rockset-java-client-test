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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusKafkaPartition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-21T23:08:54.250Z")
public class StatusKafkaPartition {
  @SerializedName("partition_number")
  private Integer partitionNumber = null;

  @SerializedName("num_documents_processed")
  private Long numDocumentsProcessed = null;

  public StatusKafkaPartition partitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
    return this;
  }

   /**
   * The number of this partition
   * @return partitionNumber
  **/

@JsonProperty("partition_number")
@ApiModelProperty(example = "123", value = "The number of this partition")
  public Integer getPartitionNumber() {
    return partitionNumber;
  }

  public void setPartitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
  }

  public StatusKafkaPartition numDocumentsProcessed(Long numDocumentsProcessed) {
    this.numDocumentsProcessed = numDocumentsProcessed;
    return this;
  }

   /**
   * Number of documents consumed by this partition
   * @return numDocumentsProcessed
  **/

@JsonProperty("num_documents_processed")
@ApiModelProperty(example = "1337", value = "Number of documents consumed by this partition")
  public Long getNumDocumentsProcessed() {
    return numDocumentsProcessed;
  }

  public void setNumDocumentsProcessed(Long numDocumentsProcessed) {
    this.numDocumentsProcessed = numDocumentsProcessed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusKafkaPartition statusKafkaPartition = (StatusKafkaPartition) o;
    return Objects.equals(this.partitionNumber, statusKafkaPartition.partitionNumber) &&
        Objects.equals(this.numDocumentsProcessed, statusKafkaPartition.numDocumentsProcessed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partitionNumber, numDocumentsProcessed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusKafkaPartition {\n");
    
    sb.append("    partitionNumber: ").append(toIndentedString(partitionNumber)).append("\n");
    sb.append("    numDocumentsProcessed: ").append(toIndentedString(numDocumentsProcessed)).append("\n");
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
