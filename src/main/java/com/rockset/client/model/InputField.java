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
 * InputField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-15T19:57:30.680Z")
public class InputField {
  @SerializedName("field_name")
  private String fieldName = null;

  /**
   * Define the behaviour if fieldName is missing or is null.
   */
  @JsonAdapter(IfMissingEnum.Adapter.class)
  public enum IfMissingEnum {
    SKIP("SKIP"),
    
    PASS("PASS");

    private String value;

    IfMissingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static IfMissingEnum fromValue(String text) {
      for (IfMissingEnum b : IfMissingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IfMissingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IfMissingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IfMissingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IfMissingEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("if_missing")
  private IfMissingEnum ifMissing = null;

  @SerializedName("is_drop")
  private Boolean isDrop = null;

  @SerializedName("param")
  private String param = null;

  public InputField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * The name of a field, parsed as a SQL qualified name.
   * @return fieldName
  **/

@JsonProperty("field_name")
@ApiModelProperty(example = "address.city.zipcode", value = "The name of a field, parsed as a SQL qualified name.")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public InputField ifMissing(IfMissingEnum ifMissing) {
    this.ifMissing = ifMissing;
    return this;
  }

   /**
   * Define the behaviour if fieldName is missing or is null.
   * @return ifMissing
  **/

@JsonProperty("if_missing")
@ApiModelProperty(example = "SKIP", value = "Define the behaviour if fieldName is missing or is null.")
  public IfMissingEnum getIfMissing() {
    return ifMissing;
  }

  public void setIfMissing(IfMissingEnum ifMissing) {
    this.ifMissing = ifMissing;
  }

  public InputField isDrop(Boolean isDrop) {
    this.isDrop = isDrop;
    return this;
  }

   /**
   * If true, then drop fieldName from the document.
   * @return isDrop
  **/

@JsonProperty("is_drop")
@ApiModelProperty(example = "true", value = "If true, then drop fieldName from the document.")
  public Boolean isIsDrop() {
    return isDrop;
  }

  public void setIsDrop(Boolean isDrop) {
    this.isDrop = isDrop;
  }

  public InputField param(String param) {
    this.param = param;
    return this;
  }

   /**
   * Sql parameter name.
   * @return param
  **/

@JsonProperty("param")
@ApiModelProperty(example = "zip", value = "Sql parameter name.")
  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputField inputField = (InputField) o;
    return Objects.equals(this.fieldName, inputField.fieldName) &&
        Objects.equals(this.ifMissing, inputField.ifMissing) &&
        Objects.equals(this.isDrop, inputField.isDrop) &&
        Objects.equals(this.param, inputField.param);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, ifMissing, isDrop, param);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputField {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    ifMissing: ").append(toIndentedString(ifMissing)).append("\n");
    sb.append("    isDrop: ").append(toIndentedString(isDrop)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

