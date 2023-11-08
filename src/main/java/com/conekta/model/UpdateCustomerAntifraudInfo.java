/*
 * Conekta API
 * Conekta sdk
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: engineering@conekta.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.conekta.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * UpdateCustomerAntifraudInfo
 */
@JsonPropertyOrder({
  UpdateCustomerAntifraudInfo.JSON_PROPERTY_ACCOUNT_CREATED_AT,
  UpdateCustomerAntifraudInfo.JSON_PROPERTY_FIRST_PAID_AT
})
@JsonTypeName("update_customer_antifraud_info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCustomerAntifraudInfo {
  public static final String JSON_PROPERTY_ACCOUNT_CREATED_AT = "account_created_at";
  private Long accountCreatedAt;

  public static final String JSON_PROPERTY_FIRST_PAID_AT = "first_paid_at";
  private Integer firstPaidAt;

  public UpdateCustomerAntifraudInfo() { 
  }

  public UpdateCustomerAntifraudInfo accountCreatedAt(Long accountCreatedAt) {
    this.accountCreatedAt = accountCreatedAt;
    return this;
  }

   /**
   * Get accountCreatedAt
   * @return accountCreatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountCreatedAt() {
    return accountCreatedAt;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountCreatedAt(Long accountCreatedAt) {
    this.accountCreatedAt = accountCreatedAt;
  }


  public UpdateCustomerAntifraudInfo firstPaidAt(Integer firstPaidAt) {
    this.firstPaidAt = firstPaidAt;
    return this;
  }

   /**
   * Get firstPaidAt
   * @return firstPaidAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFirstPaidAt() {
    return firstPaidAt;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstPaidAt(Integer firstPaidAt) {
    this.firstPaidAt = firstPaidAt;
  }


  /**
   * Return true if this update_customer_antifraud_info object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerAntifraudInfo updateCustomerAntifraudInfo = (UpdateCustomerAntifraudInfo) o;
    return Objects.equals(this.accountCreatedAt, updateCustomerAntifraudInfo.accountCreatedAt) &&
        Objects.equals(this.firstPaidAt, updateCustomerAntifraudInfo.firstPaidAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCreatedAt, firstPaidAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerAntifraudInfo {\n");
    sb.append("    accountCreatedAt: ").append(toIndentedString(accountCreatedAt)).append("\n");
    sb.append("    firstPaidAt: ").append(toIndentedString(firstPaidAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

