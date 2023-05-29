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
 * use for card responses
 */
@JsonPropertyOrder({
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_LAST4,
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_BIN,
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_CARD_TYPE,
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_EXP_MONTH,
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_EXP_YEAR,
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_BRAND,
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_NAME,
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_DEFAULT,
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_VISIBLE_ON_CHECKOUT,
  PaymentMethodCardResponseAllOf.JSON_PROPERTY_PAYMENT_SOURCE_STATUS
})
@JsonTypeName("payment_method_card_response_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class PaymentMethodCardResponseAllOf {
  public static final String JSON_PROPERTY_LAST4 = "last4";
  private String last4;

  public static final String JSON_PROPERTY_BIN = "bin";
  private String bin;

  public static final String JSON_PROPERTY_CARD_TYPE = "card_type";
  private String cardType;

  public static final String JSON_PROPERTY_EXP_MONTH = "exp_month";
  private String expMonth;

  public static final String JSON_PROPERTY_EXP_YEAR = "exp_year";
  private String expYear;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_VISIBLE_ON_CHECKOUT = "visible_on_checkout";
  private Boolean visibleOnCheckout;

  public static final String JSON_PROPERTY_PAYMENT_SOURCE_STATUS = "payment_source_status";
  private String paymentSourceStatus;

  public PaymentMethodCardResponseAllOf() { 
  }

  public PaymentMethodCardResponseAllOf last4(String last4) {
    this.last4 = last4;
    return this;
  }

   /**
   * Get last4
   * @return last4
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLast4() {
    return last4;
  }


  @JsonProperty(JSON_PROPERTY_LAST4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLast4(String last4) {
    this.last4 = last4;
  }


  public PaymentMethodCardResponseAllOf bin(String bin) {
    this.bin = bin;
    return this;
  }

   /**
   * Get bin
   * @return bin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBin() {
    return bin;
  }


  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBin(String bin) {
    this.bin = bin;
  }


  public PaymentMethodCardResponseAllOf cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardType() {
    return cardType;
  }


  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public PaymentMethodCardResponseAllOf expMonth(String expMonth) {
    this.expMonth = expMonth;
    return this;
  }

   /**
   * Get expMonth
   * @return expMonth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpMonth() {
    return expMonth;
  }


  @JsonProperty(JSON_PROPERTY_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpMonth(String expMonth) {
    this.expMonth = expMonth;
  }


  public PaymentMethodCardResponseAllOf expYear(String expYear) {
    this.expYear = expYear;
    return this;
  }

   /**
   * Get expYear
   * @return expYear
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpYear() {
    return expYear;
  }


  @JsonProperty(JSON_PROPERTY_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }


  public PaymentMethodCardResponseAllOf brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public PaymentMethodCardResponseAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
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


  public PaymentMethodCardResponseAllOf _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefault() {
    return _default;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public PaymentMethodCardResponseAllOf visibleOnCheckout(Boolean visibleOnCheckout) {
    this.visibleOnCheckout = visibleOnCheckout;
    return this;
  }

   /**
   * Get visibleOnCheckout
   * @return visibleOnCheckout
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_ON_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisibleOnCheckout() {
    return visibleOnCheckout;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ON_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleOnCheckout(Boolean visibleOnCheckout) {
    this.visibleOnCheckout = visibleOnCheckout;
  }


  public PaymentMethodCardResponseAllOf paymentSourceStatus(String paymentSourceStatus) {
    this.paymentSourceStatus = paymentSourceStatus;
    return this;
  }

   /**
   * Get paymentSourceStatus
   * @return paymentSourceStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_SOURCE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentSourceStatus() {
    return paymentSourceStatus;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_SOURCE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentSourceStatus(String paymentSourceStatus) {
    this.paymentSourceStatus = paymentSourceStatus;
  }


  /**
   * Return true if this payment_method_card_response_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCardResponseAllOf paymentMethodCardResponseAllOf = (PaymentMethodCardResponseAllOf) o;
    return Objects.equals(this.last4, paymentMethodCardResponseAllOf.last4) &&
        Objects.equals(this.bin, paymentMethodCardResponseAllOf.bin) &&
        Objects.equals(this.cardType, paymentMethodCardResponseAllOf.cardType) &&
        Objects.equals(this.expMonth, paymentMethodCardResponseAllOf.expMonth) &&
        Objects.equals(this.expYear, paymentMethodCardResponseAllOf.expYear) &&
        Objects.equals(this.brand, paymentMethodCardResponseAllOf.brand) &&
        Objects.equals(this.name, paymentMethodCardResponseAllOf.name) &&
        Objects.equals(this._default, paymentMethodCardResponseAllOf._default) &&
        Objects.equals(this.visibleOnCheckout, paymentMethodCardResponseAllOf.visibleOnCheckout) &&
        Objects.equals(this.paymentSourceStatus, paymentMethodCardResponseAllOf.paymentSourceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last4, bin, cardType, expMonth, expYear, brand, name, _default, visibleOnCheckout, paymentSourceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCardResponseAllOf {\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    expMonth: ").append(toIndentedString(expMonth)).append("\n");
    sb.append("    expYear: ").append(toIndentedString(expYear)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    visibleOnCheckout: ").append(toIndentedString(visibleOnCheckout)).append("\n");
    sb.append("    paymentSourceStatus: ").append(toIndentedString(paymentSourceStatus)).append("\n");
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

