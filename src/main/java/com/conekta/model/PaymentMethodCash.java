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
 * PaymentMethodCash
 */
@JsonPropertyOrder({
  PaymentMethodCash.JSON_PROPERTY_TYPE,
  PaymentMethodCash.JSON_PROPERTY_OBJECT,
  PaymentMethodCash.JSON_PROPERTY_AUTH_CODE,
  PaymentMethodCash.JSON_PROPERTY_CASHIER_ID,
  PaymentMethodCash.JSON_PROPERTY_REFERENCE,
  PaymentMethodCash.JSON_PROPERTY_BARCODE_URL,
  PaymentMethodCash.JSON_PROPERTY_EXPIRES_AT,
  PaymentMethodCash.JSON_PROPERTY_SERVICE_NAME,
  PaymentMethodCash.JSON_PROPERTY_STORE,
  PaymentMethodCash.JSON_PROPERTY_STORE_NAME
})
@JsonTypeName("payment_method_cash")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class PaymentMethodCash {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_AUTH_CODE = "auth_code";
  private Integer authCode;

  public static final String JSON_PROPERTY_CASHIER_ID = "cashier_id";
  private String cashierId;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_BARCODE_URL = "barcode_url";
  private String barcodeUrl;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Long expiresAt;

  public static final String JSON_PROPERTY_SERVICE_NAME = "service_name";
  private String serviceName;

  public static final String JSON_PROPERTY_STORE = "store";
  private String store;

  public static final String JSON_PROPERTY_STORE_NAME = "store_name";
  private String storeName;

  public PaymentMethodCash() { 
  }

  public PaymentMethodCash type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public PaymentMethodCash _object(String _object) {
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


  public PaymentMethodCash authCode(Integer authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * Get authCode
   * @return authCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAuthCode() {
    return authCode;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthCode(Integer authCode) {
    this.authCode = authCode;
  }


  public PaymentMethodCash cashierId(String cashierId) {
    this.cashierId = cashierId;
    return this;
  }

   /**
   * Get cashierId
   * @return cashierId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASHIER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCashierId() {
    return cashierId;
  }


  @JsonProperty(JSON_PROPERTY_CASHIER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashierId(String cashierId) {
    this.cashierId = cashierId;
  }


  public PaymentMethodCash reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentMethodCash barcodeUrl(String barcodeUrl) {
    this.barcodeUrl = barcodeUrl;
    return this;
  }

   /**
   * Get barcodeUrl
   * @return barcodeUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BARCODE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBarcodeUrl() {
    return barcodeUrl;
  }


  @JsonProperty(JSON_PROPERTY_BARCODE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarcodeUrl(String barcodeUrl) {
    this.barcodeUrl = barcodeUrl;
  }


  public PaymentMethodCash expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }


  public PaymentMethodCash serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceName() {
    return serviceName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public PaymentMethodCash store(String store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStore() {
    return store;
  }


  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStore(String store) {
    this.store = store;
  }


  public PaymentMethodCash storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Get storeName
   * @return storeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreName() {
    return storeName;
  }


  @JsonProperty(JSON_PROPERTY_STORE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  /**
   * Return true if this payment_method_cash object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCash paymentMethodCash = (PaymentMethodCash) o;
    return Objects.equals(this.type, paymentMethodCash.type) &&
        Objects.equals(this._object, paymentMethodCash._object) &&
        Objects.equals(this.authCode, paymentMethodCash.authCode) &&
        Objects.equals(this.cashierId, paymentMethodCash.cashierId) &&
        Objects.equals(this.reference, paymentMethodCash.reference) &&
        Objects.equals(this.barcodeUrl, paymentMethodCash.barcodeUrl) &&
        Objects.equals(this.expiresAt, paymentMethodCash.expiresAt) &&
        Objects.equals(this.serviceName, paymentMethodCash.serviceName) &&
        Objects.equals(this.store, paymentMethodCash.store) &&
        Objects.equals(this.storeName, paymentMethodCash.storeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _object, authCode, cashierId, reference, barcodeUrl, expiresAt, serviceName, store, storeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCash {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    cashierId: ").append(toIndentedString(cashierId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    barcodeUrl: ").append(toIndentedString(barcodeUrl)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
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

