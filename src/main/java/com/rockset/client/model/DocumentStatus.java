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
import com.rockset.client.model.ErrorModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DocumentStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-08T22:21:01.705Z")
public class DocumentStatus {
  @SerializedName("_collection")
  private String collection = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("error")
  private ErrorModel error = null;

  @SerializedName("patch_id")
  private String patchId = null;

  /**
   * Status of the document.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ADDED("ADDED"),
    
    REPLACED("REPLACED"),
    
    DELETED("DELETED"),
    
    PATCHED("PATCHED"),
    
    ERROR("ERROR");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public DocumentStatus collection(String collection) {
    this.collection = collection;
    return this;
  }

   /**
   * Collection name.
   * @return collection
  **/

@JsonProperty("_collection")
@ApiModelProperty(example = "customers", value = "Collection name.")
  public String getCollection() {
    return collection;
  }

  public void setCollection(String collection) {
    this.collection = collection;
  }

  public DocumentStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique document ID.
   * @return id
  **/

@JsonProperty("_id")
@ApiModelProperty(example = "2cd61e3b", value = "Unique document ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DocumentStatus error(ErrorModel error) {
    this.error = error;
    return this;
  }

   /**
   * Error message, if any.
   * @return error
  **/

@JsonProperty("error")
@ApiModelProperty(value = "Error message, if any.")
  public ErrorModel getError() {
    return error;
  }

  public void setError(ErrorModel error) {
    this.error = error;
  }

  public DocumentStatus patchId(String patchId) {
    this.patchId = patchId;
    return this;
  }

   /**
   * Unique id used to represent each patch request.
   * @return patchId
  **/

@JsonProperty("patch_id")
@ApiModelProperty(example = "486gsg8", value = "Unique id used to represent each patch request.")
  public String getPatchId() {
    return patchId;
  }

  public void setPatchId(String patchId) {
    this.patchId = patchId;
  }

  public DocumentStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the document.
   * @return status
  **/

@JsonProperty("status")
@ApiModelProperty(example = "ADDED", value = "Status of the document.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentStatus documentStatus = (DocumentStatus) o;
    return Objects.equals(this.collection, documentStatus.collection) &&
        Objects.equals(this.id, documentStatus.id) &&
        Objects.equals(this.error, documentStatus.error) &&
        Objects.equals(this.patchId, documentStatus.patchId) &&
        Objects.equals(this.status, documentStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, id, error, patchId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentStatus {\n");
    
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    patchId: ").append(toIndentedString(patchId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

