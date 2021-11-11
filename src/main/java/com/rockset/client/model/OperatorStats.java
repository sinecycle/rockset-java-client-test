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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OperatorStats */
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.JavaClientCodegen",
    date = "2020-03-04T00:00:49.700Z")
public class OperatorStats {
  @SerializedName("worker")
  private String worker = null;

  @SerializedName("fragment")
  private Long fragment = null;

  @SerializedName("task")
  private String task = null;

  @SerializedName("operator_id")
  private Long operatorId = null;

  @SerializedName("operator_name")
  private String operatorName = null;

  @SerializedName("start_time_us")
  private Long startTimeUs = null;

  @SerializedName("end_time_us")
  private Long endTimeUs = null;

  @SerializedName("max_memory")
  private Long maxMemory = null;

  @SerializedName("input_bytes")
  private Long inputBytes = null;

  @SerializedName("input_rows")
  private Long inputRows = null;

  @SerializedName("output_bytes")
  private Long outputBytes = null;

  @SerializedName("output_rows")
  private Long outputRows = null;

  @SerializedName("processing_time_us")
  private Long processingTimeUs = null;

  public OperatorStats worker(String worker) {
    this.worker = worker;
    return this;
  }

  /**
   * The id of the worker this operator ran on
   *
   * @return worker
   */
  @JsonProperty("worker")
  @ApiModelProperty(example = "aggregator", value = "The id of the worker this operator ran on")
  public String getWorker() {
    return worker;
  }

  public void setWorker(String worker) {
    this.worker = worker;
  }

  public OperatorStats fragment(Long fragment) {
    this.fragment = fragment;
    return this;
  }

  /**
   * The id of the fragment this operator belonged to
   *
   * @return fragment
   */
  @JsonProperty("fragment")
  @ApiModelProperty(example = "13", value = "The id of the fragment this operator belonged to")
  public Long getFragment() {
    return fragment;
  }

  public void setFragment(Long fragment) {
    this.fragment = fragment;
  }

  public OperatorStats task(String task) {
    this.task = task;
    return this;
  }

  /**
   * The id of the task this operator belonged to
   *
   * @return task
   */
  @JsonProperty("task")
  @ApiModelProperty(example = "2", value = "The id of the task this operator belonged to")
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public OperatorStats operatorId(Long operatorId) {
    this.operatorId = operatorId;
    return this;
  }

  /**
   * The id of this operator in the task
   *
   * @return operatorId
   */
  @JsonProperty("operator_id")
  @ApiModelProperty(example = "3", value = "The id of this operator in the task")
  public Long getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Long operatorId) {
    this.operatorId = operatorId;
  }

  public OperatorStats operatorName(String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

  /**
   * The class name of this operator
   *
   * @return operatorName
   */
  @JsonProperty("operator_name")
  @ApiModelProperty(example = "ColumnScan", value = "The class name of this operator")
  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }

  public OperatorStats startTimeUs(Long startTimeUs) {
    this.startTimeUs = startTimeUs;
    return this;
  }

  /**
   * Microseconds since UNIX epoch of the first time data was received from any of this
   * operator&#39;s inputs
   *
   * @return startTimeUs
   */
  @JsonProperty("start_time_us")
  @ApiModelProperty(
      example = "1579631642603344",
      value =
          "Microseconds since UNIX epoch of the first time data was received from any of this operator's inputs")
  public Long getStartTimeUs() {
    return startTimeUs;
  }

  public void setStartTimeUs(Long startTimeUs) {
    this.startTimeUs = startTimeUs;
  }

  public OperatorStats endTimeUs(Long endTimeUs) {
    this.endTimeUs = endTimeUs;
    return this;
  }

  /**
   * Microseconds since UNIX epoch of the last time data was sent to any of this operator&#39;s
   * outputs
   *
   * @return endTimeUs
   */
  @JsonProperty("end_time_us")
  @ApiModelProperty(
      example = "1579631642603346",
      value =
          "Microseconds since UNIX epoch of the last time data was sent to any of this operator's outputs")
  public Long getEndTimeUs() {
    return endTimeUs;
  }

  public void setEndTimeUs(Long endTimeUs) {
    this.endTimeUs = endTimeUs;
  }

  public OperatorStats maxMemory(Long maxMemory) {
    this.maxMemory = maxMemory;
    return this;
  }

  /**
   * Maximum memory used by this operator during execution
   *
   * @return maxMemory
   */
  @JsonProperty("max_memory")
  @ApiModelProperty(
      example = "14928",
      value = "Maximum memory used by this operator during execution")
  public Long getMaxMemory() {
    return maxMemory;
  }

  public void setMaxMemory(Long maxMemory) {
    this.maxMemory = maxMemory;
  }

  public OperatorStats inputBytes(Long inputBytes) {
    this.inputBytes = inputBytes;
    return this;
  }

  /**
   * Total bytes received across all inputs
   *
   * @return inputBytes
   */
  @JsonProperty("input_bytes")
  @ApiModelProperty(example = "48004800", value = "Total bytes received across all inputs")
  public Long getInputBytes() {
    return inputBytes;
  }

  public void setInputBytes(Long inputBytes) {
    this.inputBytes = inputBytes;
  }

  public OperatorStats inputRows(Long inputRows) {
    this.inputRows = inputRows;
    return this;
  }

  /**
   * Total rows received across all inputs
   *
   * @return inputRows
   */
  @JsonProperty("input_rows")
  @ApiModelProperty(example = "1000100", value = "Total rows received across all inputs")
  public Long getInputRows() {
    return inputRows;
  }

  public void setInputRows(Long inputRows) {
    this.inputRows = inputRows;
  }

  public OperatorStats outputBytes(Long outputBytes) {
    this.outputBytes = outputBytes;
    return this;
  }

  /**
   * Total bytes sent across all outputs
   *
   * @return outputBytes
   */
  @JsonProperty("output_bytes")
  @ApiModelProperty(example = "1600", value = "Total bytes sent across all outputs")
  public Long getOutputBytes() {
    return outputBytes;
  }

  public void setOutputBytes(Long outputBytes) {
    this.outputBytes = outputBytes;
  }

  public OperatorStats outputRows(Long outputRows) {
    this.outputRows = outputRows;
    return this;
  }

  /**
   * Total rows sent across all outputs
   *
   * @return outputRows
   */
  @JsonProperty("output_rows")
  @ApiModelProperty(example = "100", value = "Total rows sent across all outputs")
  public Long getOutputRows() {
    return outputRows;
  }

  public void setOutputRows(Long outputRows) {
    this.outputRows = outputRows;
  }

  public OperatorStats processingTimeUs(Long processingTimeUs) {
    this.processingTimeUs = processingTimeUs;
    return this;
  }

  /**
   * Total time in microseconds spent doing useful work
   *
   * @return processingTimeUs
   */
  @JsonProperty("processing_time_us")
  @ApiModelProperty(example = "2500", value = "Total time in microseconds spent doing useful work")
  public Long getProcessingTimeUs() {
    return processingTimeUs;
  }

  public void setProcessingTimeUs(Long processingTimeUs) {
    this.processingTimeUs = processingTimeUs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatorStats operatorStats = (OperatorStats) o;
    return Objects.equals(this.worker, operatorStats.worker)
        && Objects.equals(this.fragment, operatorStats.fragment)
        && Objects.equals(this.task, operatorStats.task)
        && Objects.equals(this.operatorId, operatorStats.operatorId)
        && Objects.equals(this.operatorName, operatorStats.operatorName)
        && Objects.equals(this.startTimeUs, operatorStats.startTimeUs)
        && Objects.equals(this.endTimeUs, operatorStats.endTimeUs)
        && Objects.equals(this.maxMemory, operatorStats.maxMemory)
        && Objects.equals(this.inputBytes, operatorStats.inputBytes)
        && Objects.equals(this.inputRows, operatorStats.inputRows)
        && Objects.equals(this.outputBytes, operatorStats.outputBytes)
        && Objects.equals(this.outputRows, operatorStats.outputRows)
        && Objects.equals(this.processingTimeUs, operatorStats.processingTimeUs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        worker,
        fragment,
        task,
        operatorId,
        operatorName,
        startTimeUs,
        endTimeUs,
        maxMemory,
        inputBytes,
        inputRows,
        outputBytes,
        outputRows,
        processingTimeUs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatorStats {\n");

    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    startTimeUs: ").append(toIndentedString(startTimeUs)).append("\n");
    sb.append("    endTimeUs: ").append(toIndentedString(endTimeUs)).append("\n");
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
    sb.append("    inputBytes: ").append(toIndentedString(inputBytes)).append("\n");
    sb.append("    inputRows: ").append(toIndentedString(inputRows)).append("\n");
    sb.append("    outputBytes: ").append(toIndentedString(outputBytes)).append("\n");
    sb.append("    outputRows: ").append(toIndentedString(outputRows)).append("\n");
    sb.append("    processingTimeUs: ").append(toIndentedString(processingTimeUs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
