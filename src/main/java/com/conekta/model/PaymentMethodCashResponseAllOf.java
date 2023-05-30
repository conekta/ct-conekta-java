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
 * use for cash responses
 */
@JsonPropertyOrder({
  PaymentMethodCashResponseAllOf.JSON_PROPERTY_REFERENCE,
  PaymentMethodCashResponseAllOf.JSON_PROPERTY_BARCODE,
  PaymentMethodCashResponseAllOf.JSON_PROPERTY_BARCODE_URL,
  PaymentMethodCashResponseAllOf.JSON_PROPERTY_EXPIRES_AT,
  PaymentMethodCashResponseAllOf.JSON_PROPERTY_PROVIDER
})
@JsonTypeName("payment_method_cash_response_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodCashResponseAllOf {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_BARCODE = "barcode";
  private String barcode;

  public static final String JSON_PROPERTY_BARCODE_URL = "barcode_url";
  private String barcodeUrl;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Long expiresAt;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public PaymentMethodCashResponseAllOf() { 
  }

  public PaymentMethodCashResponseAllOf reference(String reference) {
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


  public PaymentMethodCashResponseAllOf barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * Get barcode
   * @return barcode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BARCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBarcode() {
    return barcode;
  }


  @JsonProperty(JSON_PROPERTY_BARCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }


  public PaymentMethodCashResponseAllOf barcodeUrl(String barcodeUrl) {
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


  public PaymentMethodCashResponseAllOf expiresAt(Long expiresAt) {
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


  public PaymentMethodCashResponseAllOf provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvider(String provider) {
    this.provider = provider;
  }


  /**
   * Return true if this payment_method_cash_response_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCashResponseAllOf paymentMethodCashResponseAllOf = (PaymentMethodCashResponseAllOf) o;
    return Objects.equals(this.reference, paymentMethodCashResponseAllOf.reference) &&
        Objects.equals(this.barcode, paymentMethodCashResponseAllOf.barcode) &&
        Objects.equals(this.barcodeUrl, paymentMethodCashResponseAllOf.barcodeUrl) &&
        Objects.equals(this.expiresAt, paymentMethodCashResponseAllOf.expiresAt) &&
        Objects.equals(this.provider, paymentMethodCashResponseAllOf.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, barcode, barcodeUrl, expiresAt, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCashResponseAllOf {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    barcodeUrl: ").append(toIndentedString(barcodeUrl)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

