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
 * CustomerAntifraudInfoResponse
 */
@JsonPropertyOrder({
  CustomerAntifraudInfoResponse.JSON_PROPERTY_FIRST_PAID_AT,
  CustomerAntifraudInfoResponse.JSON_PROPERTY_ACCOUNT_CREATED_AT
})
@JsonTypeName("customer_antifraud_info_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T11:12:04.718851-03:00[America/Argentina/Buenos_Aires]")
public class CustomerAntifraudInfoResponse {
  public static final String JSON_PROPERTY_FIRST_PAID_AT = "first_paid_at";
  private Integer firstPaidAt;

  public static final String JSON_PROPERTY_ACCOUNT_CREATED_AT = "account_created_at";
  private Long accountCreatedAt;

  public CustomerAntifraudInfoResponse() { 
  }

  public CustomerAntifraudInfoResponse firstPaidAt(Integer firstPaidAt) {
    this.firstPaidAt = firstPaidAt;
    return this;
  }

   /**
   * Get firstPaidAt
   * @return firstPaidAt
  **/
  @jakarta.annotation.Nullable
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


  public CustomerAntifraudInfoResponse accountCreatedAt(Long accountCreatedAt) {
    this.accountCreatedAt = accountCreatedAt;
    return this;
  }

   /**
   * Get accountCreatedAt
   * @return accountCreatedAt
  **/
  @jakarta.annotation.Nullable
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


  /**
   * Return true if this customer_antifraud_info_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAntifraudInfoResponse customerAntifraudInfoResponse = (CustomerAntifraudInfoResponse) o;
    return Objects.equals(this.firstPaidAt, customerAntifraudInfoResponse.firstPaidAt) &&
        Objects.equals(this.accountCreatedAt, customerAntifraudInfoResponse.accountCreatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstPaidAt, accountCreatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAntifraudInfoResponse {\n");
    sb.append("    firstPaidAt: ").append(toIndentedString(firstPaidAt)).append("\n");
    sb.append("    accountCreatedAt: ").append(toIndentedString(accountCreatedAt)).append("\n");
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

