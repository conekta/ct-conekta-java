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
import com.conekta.model.PaymentMethodCashResponseAllOfAgreements;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * PaymentMethodCashResponse
 */
@JsonPropertyOrder({
  PaymentMethodCashResponse.JSON_PROPERTY_TYPE,
  PaymentMethodCashResponse.JSON_PROPERTY_ID,
  PaymentMethodCashResponse.JSON_PROPERTY_OBJECT,
  PaymentMethodCashResponse.JSON_PROPERTY_CREATED_AT,
  PaymentMethodCashResponse.JSON_PROPERTY_PARENT_ID,
  PaymentMethodCashResponse.JSON_PROPERTY_AGREEMENTS,
  PaymentMethodCashResponse.JSON_PROPERTY_REFERENCE,
  PaymentMethodCashResponse.JSON_PROPERTY_BARCODE,
  PaymentMethodCashResponse.JSON_PROPERTY_BARCODE_URL,
  PaymentMethodCashResponse.JSON_PROPERTY_EXPIRES_AT,
  PaymentMethodCashResponse.JSON_PROPERTY_PROVIDER
})
@JsonTypeName("payment_method_cash_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class PaymentMethodCashResponse {
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

  public static final String JSON_PROPERTY_AGREEMENTS = "agreements";
  private List<PaymentMethodCashResponseAllOfAgreements> agreements = new ArrayList<>();

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

  public PaymentMethodCashResponse() { 
  }

  public PaymentMethodCashResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
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


  public PaymentMethodCashResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
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


  public PaymentMethodCashResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
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


  public PaymentMethodCashResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
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


  public PaymentMethodCashResponse parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
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


  public PaymentMethodCashResponse agreements(List<PaymentMethodCashResponseAllOfAgreements> agreements) {
    this.agreements = agreements;
    return this;
  }

  public PaymentMethodCashResponse addAgreementsItem(PaymentMethodCashResponseAllOfAgreements agreementsItem) {
    if (this.agreements == null) {
      this.agreements = new ArrayList<>();
    }
    this.agreements.add(agreementsItem);
    return this;
  }

   /**
   * Get agreements
   * @return agreements
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGREEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentMethodCashResponseAllOfAgreements> getAgreements() {
    return agreements;
  }


  @JsonProperty(JSON_PROPERTY_AGREEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgreements(List<PaymentMethodCashResponseAllOfAgreements> agreements) {
    this.agreements = agreements;
  }


  public PaymentMethodCashResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
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


  public PaymentMethodCashResponse barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * Get barcode
   * @return barcode
  **/
  @javax.annotation.Nullable
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


  public PaymentMethodCashResponse barcodeUrl(String barcodeUrl) {
    this.barcodeUrl = barcodeUrl;
    return this;
  }

   /**
   * URL to the barcode image, reference is the same as barcode
   * @return barcodeUrl
  **/
  @javax.annotation.Nullable
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


  public PaymentMethodCashResponse expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
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


  public PaymentMethodCashResponse provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
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
   * Return true if this payment_method_cash_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCashResponse paymentMethodCashResponse = (PaymentMethodCashResponse) o;
    return Objects.equals(this.type, paymentMethodCashResponse.type) &&
        Objects.equals(this.id, paymentMethodCashResponse.id) &&
        Objects.equals(this._object, paymentMethodCashResponse._object) &&
        Objects.equals(this.createdAt, paymentMethodCashResponse.createdAt) &&
        Objects.equals(this.parentId, paymentMethodCashResponse.parentId) &&
        Objects.equals(this.agreements, paymentMethodCashResponse.agreements) &&
        Objects.equals(this.reference, paymentMethodCashResponse.reference) &&
        Objects.equals(this.barcode, paymentMethodCashResponse.barcode) &&
        Objects.equals(this.barcodeUrl, paymentMethodCashResponse.barcodeUrl) &&
        Objects.equals(this.expiresAt, paymentMethodCashResponse.expiresAt) &&
        Objects.equals(this.provider, paymentMethodCashResponse.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, _object, createdAt, parentId, agreements, reference, barcode, barcodeUrl, expiresAt, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCashResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    agreements: ").append(toIndentedString(agreements)).append("\n");
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

