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

/** IpAllowlist */
@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.JavaClientCodegen",
    date = "2021-02-26T17:46:04.637Z")
public class IpAllowlist {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("creator_email")
  private String creatorEmail = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("created_at")
  private String createdAt = null;

  public IpAllowlist name(String name) {
    this.name = name;
    return this;
  }

  /**
   * IP Allowlist policy name
   *
   * @return name
   */
  @JsonProperty("name")
  @ApiModelProperty(example = "Office", required = true, value = "IP Allowlist policy name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IpAllowlist description(String description) {
    this.description = description;
    return this;
  }

  /**
   * optional description
   *
   * @return description
   */
  @JsonProperty("description")
  @ApiModelProperty(example = "Office IP address", value = "optional description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IpAllowlist creatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
    return this;
  }

  /**
   * email of the creator
   *
   * @return creatorEmail
   */
  @JsonProperty("creator_email")
  @ApiModelProperty(example = "xyz@rockset.com", value = "email of the creator")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  public IpAllowlist ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * individual IP address or range of IP addresses in CIDR notation
   *
   * @return ipAddress
   */
  @JsonProperty("ip_address")
  @ApiModelProperty(
      example = "82.217.192.0/18",
      required = true,
      value = "individual IP address or range of IP addresses in CIDR notation")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public IpAllowlist createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * ISO-8601 date
   *
   * @return createdAt
   */
  @JsonProperty("created_at")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAllowlist ipAllowlist = (IpAllowlist) o;
    return Objects.equals(this.name, ipAllowlist.name)
        && Objects.equals(this.description, ipAllowlist.description)
        && Objects.equals(this.creatorEmail, ipAllowlist.creatorEmail)
        && Objects.equals(this.ipAddress, ipAllowlist.ipAddress)
        && Objects.equals(this.createdAt, ipAllowlist.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, creatorEmail, ipAddress, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAllowlist {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
