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
import com.rockset.client.model.QueryParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryRequestSql
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T00:35:16.099Z")
public class QueryRequestSql {
  @SerializedName("query")
  private String query = null;

  @SerializedName("parameters")
  private List<QueryParameter> parameters = null;

  public QueryRequestSql query(String query) {
    this.query = query;
    return this;
  }

   /**
   * SQL query as a string
   * @return query
  **/
  @ApiModelProperty(example = "SELECT count(*) FROM foo", required = true, value = "SQL query as a string")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public QueryRequestSql parameters(List<QueryParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public QueryRequestSql addParametersItem(QueryParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<QueryParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * list of named parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "list of named parameters")
  public List<QueryParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<QueryParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRequestSql queryRequestSql = (QueryRequestSql) o;
    return Objects.equals(this.query, queryRequestSql.query) &&
        Objects.equals(this.parameters, queryRequestSql.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRequestSql {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

