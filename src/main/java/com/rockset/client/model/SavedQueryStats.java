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

/** SavedQueryStats */
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.JavaClientCodegen",
    date = "2020-01-24T17:41:10.748Z")
public class SavedQueryStats {
  @SerializedName("last_executed")
  private String lastExecuted = null;

  @SerializedName("last_executed_by")
  private String lastExecutedBy = null;

  @SerializedName("last_execution_error")
  private String lastExecutionError = null;

  @SerializedName("last_execution_error_message")
  private String lastExecutionErrorMessage = null;

  public SavedQueryStats lastExecuted(String lastExecuted) {
    this.lastExecuted = lastExecuted;
    return this;
  }

  /**
   * ISO-8601 date
   *
   * @return lastExecuted
   */
  @JsonProperty("last_executed")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date")
  public String getLastExecuted() {
    return lastExecuted;
  }

  public void setLastExecuted(String lastExecuted) {
    this.lastExecuted = lastExecuted;
  }

  public SavedQueryStats lastExecutedBy(String lastExecutedBy) {
    this.lastExecutedBy = lastExecutedBy;
    return this;
  }

  /**
   * user who last executed saved query
   *
   * @return lastExecutedBy
   */
  @JsonProperty("last_executed_by")
  @ApiModelProperty(example = "...@rockset.com", value = "user who last executed saved query")
  public String getLastExecutedBy() {
    return lastExecutedBy;
  }

  public void setLastExecutedBy(String lastExecutedBy) {
    this.lastExecutedBy = lastExecutedBy;
  }

  public SavedQueryStats lastExecutionError(String lastExecutionError) {
    this.lastExecutionError = lastExecutionError;
    return this;
  }

  /**
   * ISO-8601 date of last execution failure
   *
   * @return lastExecutionError
   */
  @JsonProperty("last_execution_error")
  @ApiModelProperty(
      example = "2001-08-28T00:23:41Z",
      value = "ISO-8601 date of last execution failure")
  public String getLastExecutionError() {
    return lastExecutionError;
  }

  public void setLastExecutionError(String lastExecutionError) {
    this.lastExecutionError = lastExecutionError;
  }

  public SavedQueryStats lastExecutionErrorMessage(String lastExecutionErrorMessage) {
    this.lastExecutionErrorMessage = lastExecutionErrorMessage;
    return this;
  }

  /**
   * error message associated with last failed query execution
   *
   * @return lastExecutionErrorMessage
   */
  @JsonProperty("last_execution_error_message")
  @ApiModelProperty(
      example = "[error message]",
      value = "error message associated with last failed query execution")
  public String getLastExecutionErrorMessage() {
    return lastExecutionErrorMessage;
  }

  public void setLastExecutionErrorMessage(String lastExecutionErrorMessage) {
    this.lastExecutionErrorMessage = lastExecutionErrorMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedQueryStats savedQueryStats = (SavedQueryStats) o;
    return Objects.equals(this.lastExecuted, savedQueryStats.lastExecuted)
        && Objects.equals(this.lastExecutedBy, savedQueryStats.lastExecutedBy)
        && Objects.equals(this.lastExecutionError, savedQueryStats.lastExecutionError)
        && Objects.equals(
            this.lastExecutionErrorMessage, savedQueryStats.lastExecutionErrorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lastExecuted, lastExecutedBy, lastExecutionError, lastExecutionErrorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedQueryStats {\n");

    sb.append("    lastExecuted: ").append(toIndentedString(lastExecuted)).append("\n");
    sb.append("    lastExecutedBy: ").append(toIndentedString(lastExecutedBy)).append("\n");
    sb.append("    lastExecutionError: ").append(toIndentedString(lastExecutionError)).append("\n");
    sb.append("    lastExecutionErrorMessage: ")
        .append(toIndentedString(lastExecutionErrorMessage))
        .append("\n");
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
