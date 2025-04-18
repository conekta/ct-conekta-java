/*
 * Conekta API
 * Conekta sdk
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: engineering@conekta.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.conekta.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * a plan
 */
@JsonPropertyOrder({
  PlanUpdateRequest.JSON_PROPERTY_AMOUNT,
  PlanUpdateRequest.JSON_PROPERTY_CURRENCY,
  PlanUpdateRequest.JSON_PROPERTY_EXPIRY_COUNT,
  PlanUpdateRequest.JSON_PROPERTY_NAME
})
@JsonTypeName("plan_update_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class PlanUpdateRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_EXPIRY_COUNT = "expiry_count";
  private Integer expiryCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public PlanUpdateRequest() { 
  }

  public PlanUpdateRequest amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount in cents that will be charged on the interval specified.
   * minimum: 1
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public PlanUpdateRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * ISO 4217 for currencies, for the Mexican peso it is MXN/USD
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PlanUpdateRequest expiryCount(Integer expiryCount) {
    this.expiryCount = expiryCount;
    return this;
  }

   /**
   * Number of repetitions of the frequency NUMBER OF CHARGES TO BE MADE, considering the interval and frequency, this evolves over time, but is subject to the expiration count.
   * @return expiryCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiryCount() {
    return expiryCount;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryCount(Integer expiryCount) {
    this.expiryCount = expiryCount;
  }


  public PlanUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the plan.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this plan_update_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanUpdateRequest planUpdateRequest = (PlanUpdateRequest) o;
    return Objects.equals(this.amount, planUpdateRequest.amount) &&
        Objects.equals(this.currency, planUpdateRequest.currency) &&
        Objects.equals(this.expiryCount, planUpdateRequest.expiryCount) &&
        Objects.equals(this.name, planUpdateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, expiryCount, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanUpdateRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    expiryCount: ").append(toIndentedString(expiryCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

