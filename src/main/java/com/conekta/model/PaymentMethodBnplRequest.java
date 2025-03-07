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
 * PaymentMethodBnplRequest
 */
@JsonPropertyOrder({
  PaymentMethodBnplRequest.JSON_PROPERTY_TYPE,
  PaymentMethodBnplRequest.JSON_PROPERTY_CANCEL_URL,
  PaymentMethodBnplRequest.JSON_PROPERTY_CAN_NOT_EXPIRE,
  PaymentMethodBnplRequest.JSON_PROPERTY_FAILURE_URL,
  PaymentMethodBnplRequest.JSON_PROPERTY_PRODUCT_TYPE,
  PaymentMethodBnplRequest.JSON_PROPERTY_SUCCESS_URL
})
@JsonTypeName("payment_method_bnpl_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class PaymentMethodBnplRequest {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CANCEL_URL = "cancel_url";
  private String cancelUrl;

  public static final String JSON_PROPERTY_CAN_NOT_EXPIRE = "can_not_expire";
  private Boolean canNotExpire;

  public static final String JSON_PROPERTY_FAILURE_URL = "failure_url";
  private String failureUrl;

  /**
   * Product type of the payment method, use for the payment method to know the product type
   */
  public enum ProductTypeEnum {
    KLARNA_BNPL("klarna_bnpl"),
    
    CREDITEA_BNPL("creditea_bnpl");

    private String value;

    ProductTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProductTypeEnum fromValue(String value) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRODUCT_TYPE = "product_type";
  private ProductTypeEnum productType;

  public static final String JSON_PROPERTY_SUCCESS_URL = "success_url";
  private String successUrl;

  public PaymentMethodBnplRequest() { 
  }

  public PaymentMethodBnplRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the payment method
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


  public PaymentMethodBnplRequest cancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * URL to redirect the customer after a canceled payment
   * @return cancelUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CANCEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCancelUrl() {
    return cancelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CANCEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }


  public PaymentMethodBnplRequest canNotExpire(Boolean canNotExpire) {
    this.canNotExpire = canNotExpire;
    return this;
  }

   /**
   * Indicates if the payment method can not expire
   * @return canNotExpire
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAN_NOT_EXPIRE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanNotExpire() {
    return canNotExpire;
  }


  @JsonProperty(JSON_PROPERTY_CAN_NOT_EXPIRE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanNotExpire(Boolean canNotExpire) {
    this.canNotExpire = canNotExpire;
  }


  public PaymentMethodBnplRequest failureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
    return this;
  }

   /**
   * URL to redirect the customer after a failed payment
   * @return failureUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FAILURE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFailureUrl() {
    return failureUrl;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFailureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
  }


  public PaymentMethodBnplRequest productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Product type of the payment method, use for the payment method to know the product type
   * @return productType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProductTypeEnum getProductType() {
    return productType;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }


  public PaymentMethodBnplRequest successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * URL to redirect the customer after a successful payment
   * @return successUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSuccessUrl() {
    return successUrl;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }


  /**
   * Return true if this payment_method_bnpl_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodBnplRequest paymentMethodBnplRequest = (PaymentMethodBnplRequest) o;
    return Objects.equals(this.type, paymentMethodBnplRequest.type) &&
        Objects.equals(this.cancelUrl, paymentMethodBnplRequest.cancelUrl) &&
        Objects.equals(this.canNotExpire, paymentMethodBnplRequest.canNotExpire) &&
        Objects.equals(this.failureUrl, paymentMethodBnplRequest.failureUrl) &&
        Objects.equals(this.productType, paymentMethodBnplRequest.productType) &&
        Objects.equals(this.successUrl, paymentMethodBnplRequest.successUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, cancelUrl, canNotExpire, failureUrl, productType, successUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBnplRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    canNotExpire: ").append(toIndentedString(canNotExpire)).append("\n");
    sb.append("    failureUrl: ").append(toIndentedString(failureUrl)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
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

