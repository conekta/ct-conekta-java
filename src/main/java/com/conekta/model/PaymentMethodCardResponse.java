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
 * PaymentMethodCardResponse
 */
@JsonPropertyOrder({
  PaymentMethodCardResponse.JSON_PROPERTY_TYPE,
  PaymentMethodCardResponse.JSON_PROPERTY_ID,
  PaymentMethodCardResponse.JSON_PROPERTY_OBJECT,
  PaymentMethodCardResponse.JSON_PROPERTY_CREATED_AT,
  PaymentMethodCardResponse.JSON_PROPERTY_PARENT_ID,
  PaymentMethodCardResponse.JSON_PROPERTY_LAST4,
  PaymentMethodCardResponse.JSON_PROPERTY_BIN,
  PaymentMethodCardResponse.JSON_PROPERTY_CARD_TYPE,
  PaymentMethodCardResponse.JSON_PROPERTY_EXP_MONTH,
  PaymentMethodCardResponse.JSON_PROPERTY_EXP_YEAR,
  PaymentMethodCardResponse.JSON_PROPERTY_BRAND,
  PaymentMethodCardResponse.JSON_PROPERTY_NAME,
  PaymentMethodCardResponse.JSON_PROPERTY_DEFAULT,
  PaymentMethodCardResponse.JSON_PROPERTY_VISIBLE_ON_CHECKOUT,
  PaymentMethodCardResponse.JSON_PROPERTY_PAYMENT_SOURCE_STATUS
})
@JsonTypeName("payment_method_card_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class PaymentMethodCardResponse {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

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

  public PaymentMethodCardResponse() { 
  }

  public PaymentMethodCardResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
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


  public PaymentMethodCardResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PaymentMethodCardResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(String _object) {
    this._object = _object;
  }


  public PaymentMethodCardResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public PaymentMethodCardResponse parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public PaymentMethodCardResponse last4(String last4) {
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


  public PaymentMethodCardResponse bin(String bin) {
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


  public PaymentMethodCardResponse cardType(String cardType) {
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


  public PaymentMethodCardResponse expMonth(String expMonth) {
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


  public PaymentMethodCardResponse expYear(String expYear) {
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


  public PaymentMethodCardResponse brand(String brand) {
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


  public PaymentMethodCardResponse name(String name) {
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


  public PaymentMethodCardResponse _default(Boolean _default) {
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


  public PaymentMethodCardResponse visibleOnCheckout(Boolean visibleOnCheckout) {
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


  public PaymentMethodCardResponse paymentSourceStatus(String paymentSourceStatus) {
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
   * Return true if this payment_method_card_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCardResponse paymentMethodCardResponse = (PaymentMethodCardResponse) o;
    return Objects.equals(this.type, paymentMethodCardResponse.type) &&
        Objects.equals(this.id, paymentMethodCardResponse.id) &&
        Objects.equals(this._object, paymentMethodCardResponse._object) &&
        Objects.equals(this.createdAt, paymentMethodCardResponse.createdAt) &&
        Objects.equals(this.parentId, paymentMethodCardResponse.parentId) &&
        Objects.equals(this.last4, paymentMethodCardResponse.last4) &&
        Objects.equals(this.bin, paymentMethodCardResponse.bin) &&
        Objects.equals(this.cardType, paymentMethodCardResponse.cardType) &&
        Objects.equals(this.expMonth, paymentMethodCardResponse.expMonth) &&
        Objects.equals(this.expYear, paymentMethodCardResponse.expYear) &&
        Objects.equals(this.brand, paymentMethodCardResponse.brand) &&
        Objects.equals(this.name, paymentMethodCardResponse.name) &&
        Objects.equals(this._default, paymentMethodCardResponse._default) &&
        Objects.equals(this.visibleOnCheckout, paymentMethodCardResponse.visibleOnCheckout) &&
        Objects.equals(this.paymentSourceStatus, paymentMethodCardResponse.paymentSourceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, _object, createdAt, parentId, last4, bin, cardType, expMonth, expYear, brand, name, _default, visibleOnCheckout, paymentSourceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCardResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

