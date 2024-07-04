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
 * PaymentMethodCardRequest
 */
@JsonPropertyOrder({
  PaymentMethodCardRequest.JSON_PROPERTY_TYPE,
  PaymentMethodCardRequest.JSON_PROPERTY_CVC,
  PaymentMethodCardRequest.JSON_PROPERTY_EXP_MONTH,
  PaymentMethodCardRequest.JSON_PROPERTY_EXP_YEAR,
  PaymentMethodCardRequest.JSON_PROPERTY_NAME,
  PaymentMethodCardRequest.JSON_PROPERTY_NUMBER
})
@JsonTypeName("payment_method_card_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class PaymentMethodCardRequest {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CVC = "cvc";
  private String cvc;

  public static final String JSON_PROPERTY_EXP_MONTH = "exp_month";
  private String expMonth;

  public static final String JSON_PROPERTY_EXP_YEAR = "exp_year";
  private String expYear;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public PaymentMethodCardRequest() { 
  }

  public PaymentMethodCardRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of payment method
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public PaymentMethodCardRequest cvc(String cvc) {
    this.cvc = cvc;
    return this;
  }

   /**
   * Card security code
   * @return cvc
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCvc() {
    return cvc;
  }


  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCvc(String cvc) {
    this.cvc = cvc;
  }


  public PaymentMethodCardRequest expMonth(String expMonth) {
    this.expMonth = expMonth;
    return this;
  }

   /**
   * Card expiration month
   * @return expMonth
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpMonth() {
    return expMonth;
  }


  @JsonProperty(JSON_PROPERTY_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpMonth(String expMonth) {
    this.expMonth = expMonth;
  }


  public PaymentMethodCardRequest expYear(String expYear) {
    this.expYear = expYear;
    return this;
  }

   /**
   * Card expiration year
   * @return expYear
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpYear() {
    return expYear;
  }


  @JsonProperty(JSON_PROPERTY_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }


  public PaymentMethodCardRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cardholder name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public PaymentMethodCardRequest number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Card number
   * @return number
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumber(String number) {
    this.number = number;
  }


  /**
   * Return true if this payment_method_card_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCardRequest paymentMethodCardRequest = (PaymentMethodCardRequest) o;
    return Objects.equals(this.type, paymentMethodCardRequest.type) &&
        Objects.equals(this.cvc, paymentMethodCardRequest.cvc) &&
        Objects.equals(this.expMonth, paymentMethodCardRequest.expMonth) &&
        Objects.equals(this.expYear, paymentMethodCardRequest.expYear) &&
        Objects.equals(this.name, paymentMethodCardRequest.name) &&
        Objects.equals(this.number, paymentMethodCardRequest.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, cvc, expMonth, expYear, name, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCardRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    expMonth: ").append(toIndentedString(expMonth)).append("\n");
    sb.append("    expYear: ").append(toIndentedString(expYear)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

