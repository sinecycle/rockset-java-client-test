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

/** ExecuteSavedQueryParameter */
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.JavaClientCodegen",
    date = "2020-01-24T17:41:10.748Z")
public class ExecuteSavedQueryParameter {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private Object value = null;

  public ExecuteSavedQueryParameter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of the field
   *
   * @return name
   */
  @JsonProperty("name")
  @ApiModelProperty(example = "id", required = true, value = "name of the field")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExecuteSavedQueryParameter value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * literal value of the field
   *
   * @return value
   */
  @JsonProperty("value")
  @ApiModelProperty(example = "\"85beb391\"", required = true, value = "literal value of the field")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteSavedQueryParameter executeSavedQueryParameter = (ExecuteSavedQueryParameter) o;
    return Objects.equals(this.name, executeSavedQueryParameter.name)
        && Objects.equals(this.value, executeSavedQueryParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteSavedQueryParameter {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
