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
import com.conekta.model.ChargeResponseChannel;
import com.conekta.model.ChargeResponsePaymentMethod;
import com.conekta.model.ChargeResponseRefunds;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * ChargesOrderResponseAllOfData
 */
@JsonPropertyOrder({
  ChargesOrderResponseAllOfData.JSON_PROPERTY_AMOUNT,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_CHANNEL,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_CREATED_AT,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_CURRENCY,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_CUSTOMER_ID,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_DESCRIPTION,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_DEVICE_FINGERPRINT,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_FAILURE_CODE,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_FAILURE_MESSAGE,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_ID,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_LIVEMODE,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_OBJECT,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_ORDER_ID,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_PAID_AT,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_PAYMENT_METHOD,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_REFERENCE_ID,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_REFUNDS,
  ChargesOrderResponseAllOfData.JSON_PROPERTY_STATUS
})
@JsonTypeName("charges_order_response_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ChargesOrderResponseAllOfData {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private Integer amount;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  @javax.annotation.Nullable
  private ChargeResponseChannel channel;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @javax.annotation.Nonnull
  private Long createdAt;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  @javax.annotation.Nullable
  private String customerId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_DEVICE_FINGERPRINT = "device_fingerprint";
  @javax.annotation.Nullable
  private String deviceFingerprint;

  public static final String JSON_PROPERTY_FAILURE_CODE = "failure_code";
  @javax.annotation.Nullable
  private String failureCode;

  public static final String JSON_PROPERTY_FAILURE_MESSAGE = "failure_message";
  @javax.annotation.Nullable
  private String failureMessage;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  @javax.annotation.Nonnull
  private Boolean livemode;

  public static final String JSON_PROPERTY_OBJECT = "object";
  @javax.annotation.Nonnull
  private String _object;

  public static final String JSON_PROPERTY_ORDER_ID = "order_id";
  @javax.annotation.Nonnull
  private String orderId;

  public static final String JSON_PROPERTY_PAID_AT = "paid_at";
  @javax.annotation.Nullable
  private Long paidAt;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  @javax.annotation.Nullable
  private ChargeResponsePaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_REFERENCE_ID = "reference_id";
  @javax.annotation.Nullable
  private String referenceId;

  public static final String JSON_PROPERTY_REFUNDS = "refunds";
  @javax.annotation.Nullable
  private ChargeResponseRefunds refunds;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public ChargesOrderResponseAllOfData() { 
  }

  public ChargesOrderResponseAllOfData amount(@javax.annotation.Nonnull Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@javax.annotation.Nonnull Integer amount) {
    this.amount = amount;
  }


  public ChargesOrderResponseAllOfData channel(@javax.annotation.Nullable ChargeResponseChannel channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeResponseChannel getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(@javax.annotation.Nullable ChargeResponseChannel channel) {
    this.channel = channel;
  }


  public ChargesOrderResponseAllOfData createdAt(@javax.annotation.Nonnull Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(@javax.annotation.Nonnull Long createdAt) {
    this.createdAt = createdAt;
  }


  public ChargesOrderResponseAllOfData currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }


  public ChargesOrderResponseAllOfData customerId(@javax.annotation.Nullable String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@javax.annotation.Nullable String customerId) {
    this.customerId = customerId;
  }


  public ChargesOrderResponseAllOfData description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public ChargesOrderResponseAllOfData deviceFingerprint(@javax.annotation.Nullable String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
    return this;
  }

  /**
   * Get deviceFingerprint
   * @return deviceFingerprint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceFingerprint() {
    return deviceFingerprint;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceFingerprint(@javax.annotation.Nullable String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
  }


  public ChargesOrderResponseAllOfData failureCode(@javax.annotation.Nullable String failureCode) {
    this.failureCode = failureCode;
    return this;
  }

  /**
   * Get failureCode
   * @return failureCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureCode() {
    return failureCode;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureCode(@javax.annotation.Nullable String failureCode) {
    this.failureCode = failureCode;
  }


  public ChargesOrderResponseAllOfData failureMessage(@javax.annotation.Nullable String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

  /**
   * Get failureMessage
   * @return failureMessage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureMessage() {
    return failureMessage;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureMessage(@javax.annotation.Nullable String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public ChargesOrderResponseAllOfData id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Charge ID
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public ChargesOrderResponseAllOfData livemode(@javax.annotation.Nonnull Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

  /**
   * Whether the charge was made in live mode or not
   * @return livemode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLivemode() {
    return livemode;
  }


  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLivemode(@javax.annotation.Nonnull Boolean livemode) {
    this.livemode = livemode;
  }


  public ChargesOrderResponseAllOfData _object(@javax.annotation.Nonnull String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(@javax.annotation.Nonnull String _object) {
    this._object = _object;
  }


  public ChargesOrderResponseAllOfData orderId(@javax.annotation.Nonnull String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order ID
   * @return orderId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderId(@javax.annotation.Nonnull String orderId) {
    this.orderId = orderId;
  }


  public ChargesOrderResponseAllOfData paidAt(@javax.annotation.Nullable Long paidAt) {
    this.paidAt = paidAt;
    return this;
  }

  /**
   * Payment date
   * @return paidAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPaidAt() {
    return paidAt;
  }


  @JsonProperty(JSON_PROPERTY_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidAt(@javax.annotation.Nullable Long paidAt) {
    this.paidAt = paidAt;
  }


  public ChargesOrderResponseAllOfData paymentMethod(@javax.annotation.Nullable ChargeResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeResponsePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(@javax.annotation.Nullable ChargeResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public ChargesOrderResponseAllOfData referenceId(@javax.annotation.Nullable String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Reference ID of the charge
   * @return referenceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceId() {
    return referenceId;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceId(@javax.annotation.Nullable String referenceId) {
    this.referenceId = referenceId;
  }


  public ChargesOrderResponseAllOfData refunds(@javax.annotation.Nullable ChargeResponseRefunds refunds) {
    this.refunds = refunds;
    return this;
  }

  /**
   * Get refunds
   * @return refunds
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeResponseRefunds getRefunds() {
    return refunds;
  }


  @JsonProperty(JSON_PROPERTY_REFUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefunds(@javax.annotation.Nullable ChargeResponseRefunds refunds) {
    this.refunds = refunds;
  }


  public ChargesOrderResponseAllOfData status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Charge status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull String status) {
    this.status = status;
  }


  /**
   * Return true if this charges_order_response_allOf_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargesOrderResponseAllOfData chargesOrderResponseAllOfData = (ChargesOrderResponseAllOfData) o;
    return Objects.equals(this.amount, chargesOrderResponseAllOfData.amount) &&
        Objects.equals(this.channel, chargesOrderResponseAllOfData.channel) &&
        Objects.equals(this.createdAt, chargesOrderResponseAllOfData.createdAt) &&
        Objects.equals(this.currency, chargesOrderResponseAllOfData.currency) &&
        Objects.equals(this.customerId, chargesOrderResponseAllOfData.customerId) &&
        Objects.equals(this.description, chargesOrderResponseAllOfData.description) &&
        Objects.equals(this.deviceFingerprint, chargesOrderResponseAllOfData.deviceFingerprint) &&
        Objects.equals(this.failureCode, chargesOrderResponseAllOfData.failureCode) &&
        Objects.equals(this.failureMessage, chargesOrderResponseAllOfData.failureMessage) &&
        Objects.equals(this.id, chargesOrderResponseAllOfData.id) &&
        Objects.equals(this.livemode, chargesOrderResponseAllOfData.livemode) &&
        Objects.equals(this._object, chargesOrderResponseAllOfData._object) &&
        Objects.equals(this.orderId, chargesOrderResponseAllOfData.orderId) &&
        Objects.equals(this.paidAt, chargesOrderResponseAllOfData.paidAt) &&
        Objects.equals(this.paymentMethod, chargesOrderResponseAllOfData.paymentMethod) &&
        Objects.equals(this.referenceId, chargesOrderResponseAllOfData.referenceId) &&
        Objects.equals(this.refunds, chargesOrderResponseAllOfData.refunds) &&
        Objects.equals(this.status, chargesOrderResponseAllOfData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, channel, createdAt, currency, customerId, description, deviceFingerprint, failureCode, failureMessage, id, livemode, _object, orderId, paidAt, paymentMethod, referenceId, refunds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargesOrderResponseAllOfData {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceFingerprint: ").append(toIndentedString(deviceFingerprint)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paidAt: ").append(toIndentedString(paidAt)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

