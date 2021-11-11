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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ExecuteQueryLambdaRequest */
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.JavaClientCodegen",
    date = "2021-02-26T17:46:04.637Z")
public class ExecuteQueryLambdaRequest {
  @SerializedName("parameters")
  private List<QueryParameter> parameters = null;

  @SerializedName("default_row_limit")
  private Integer defaultRowLimit = null;

  @SerializedName("generate_warnings")
  private Boolean generateWarnings = null;

  public ExecuteQueryLambdaRequest parameters(List<QueryParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ExecuteQueryLambdaRequest addParametersItem(QueryParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<QueryParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * list of named parameters
   *
   * @return parameters
   */
  @JsonProperty("parameters")
  @ApiModelProperty(value = "list of named parameters")
  public List<QueryParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<QueryParameter> parameters) {
    this.parameters = parameters;
  }

  public ExecuteQueryLambdaRequest defaultRowLimit(Integer defaultRowLimit) {
    this.defaultRowLimit = defaultRowLimit;
    return this;
  }

  /**
   * Row limit to use if no limit specified in the SQL query text
   *
   * @return defaultRowLimit
   */
  @JsonProperty("default_row_limit")
  @ApiModelProperty(value = "Row limit to use if no limit specified in the SQL query text")
  public Integer getDefaultRowLimit() {
    return defaultRowLimit;
  }

  public void setDefaultRowLimit(Integer defaultRowLimit) {
    this.defaultRowLimit = defaultRowLimit;
  }

  public ExecuteQueryLambdaRequest generateWarnings(Boolean generateWarnings) {
    this.generateWarnings = generateWarnings;
    return this;
  }

  /**
   * Whether to generate warnings
   *
   * @return generateWarnings
   */
  @JsonProperty("generate_warnings")
  @ApiModelProperty(value = "Whether to generate warnings")
  public Boolean isGenerateWarnings() {
    return generateWarnings;
  }

  public void setGenerateWarnings(Boolean generateWarnings) {
    this.generateWarnings = generateWarnings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteQueryLambdaRequest executeQueryLambdaRequest = (ExecuteQueryLambdaRequest) o;
    return Objects.equals(this.parameters, executeQueryLambdaRequest.parameters)
        && Objects.equals(this.defaultRowLimit, executeQueryLambdaRequest.defaultRowLimit)
        && Objects.equals(this.generateWarnings, executeQueryLambdaRequest.generateWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, defaultRowLimit, generateWarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteQueryLambdaRequest {\n");

    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    defaultRowLimit: ").append(toIndentedString(defaultRowLimit)).append("\n");
    sb.append("    generateWarnings: ").append(toIndentedString(generateWarnings)).append("\n");
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
