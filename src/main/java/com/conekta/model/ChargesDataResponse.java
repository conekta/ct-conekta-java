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
 * ChargesDataResponse
 */
@JsonPropertyOrder({
  ChargesDataResponse.JSON_PROPERTY_AMOUNT,
  ChargesDataResponse.JSON_PROPERTY_CHANNEL,
  ChargesDataResponse.JSON_PROPERTY_CREATED_AT,
  ChargesDataResponse.JSON_PROPERTY_CURRENCY,
  ChargesDataResponse.JSON_PROPERTY_CUSTOMER_ID,
  ChargesDataResponse.JSON_PROPERTY_DESCRIPTION,
  ChargesDataResponse.JSON_PROPERTY_DEVICE_FINGERPRINT,
  ChargesDataResponse.JSON_PROPERTY_FAILURE_CODE,
  ChargesDataResponse.JSON_PROPERTY_FAILURE_MESSAGE,
  ChargesDataResponse.JSON_PROPERTY_ID,
  ChargesDataResponse.JSON_PROPERTY_LIVEMODE,
  ChargesDataResponse.JSON_PROPERTY_OBJECT,
  ChargesDataResponse.JSON_PROPERTY_ORDER_ID,
  ChargesDataResponse.JSON_PROPERTY_PAID_AT,
  ChargesDataResponse.JSON_PROPERTY_PAYMENT_METHOD,
  ChargesDataResponse.JSON_PROPERTY_REFERENCE_ID,
  ChargesDataResponse.JSON_PROPERTY_REFUNDS,
  ChargesDataResponse.JSON_PROPERTY_STATUS
})
@JsonTypeName("charges_data_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ChargesDataResponse {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private ChargeResponseChannel channel;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private String customerId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DEVICE_FINGERPRINT = "device_fingerprint";
  private String deviceFingerprint;

  public static final String JSON_PROPERTY_FAILURE_CODE = "failure_code";
  private String failureCode;

  public static final String JSON_PROPERTY_FAILURE_MESSAGE = "failure_message";
  private String failureMessage;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_ORDER_ID = "order_id";
  private String orderId;

  public static final String JSON_PROPERTY_PAID_AT = "paid_at";
  private Long paidAt;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private ChargeResponsePaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_REFERENCE_ID = "reference_id";
  private String referenceId;

  public static final String JSON_PROPERTY_REFUNDS = "refunds";
  private ChargeResponseRefunds refunds;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public ChargesDataResponse() { 
  }

  public ChargesDataResponse amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ChargesDataResponse channel(ChargeResponseChannel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeResponseChannel getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(ChargeResponseChannel channel) {
    this.channel = channel;
  }


  public ChargesDataResponse createdAt(Long createdAt) {
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


  public ChargesDataResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public ChargesDataResponse customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ChargesDataResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ChargesDataResponse deviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
    return this;
  }

   /**
   * Get deviceFingerprint
   * @return deviceFingerprint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceFingerprint() {
    return deviceFingerprint;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
  }


  public ChargesDataResponse failureCode(String failureCode) {
    this.failureCode = failureCode;
    return this;
  }

   /**
   * Get failureCode
   * @return failureCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureCode() {
    return failureCode;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }


  public ChargesDataResponse failureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Get failureMessage
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureMessage() {
    return failureMessage;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public ChargesDataResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Charge ID
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


  public ChargesDataResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Whether the charge was made in live mode or not
   * @return livemode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLivemode() {
    return livemode;
  }


  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }


  public ChargesDataResponse _object(String _object) {
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


  public ChargesDataResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order ID
   * @return orderId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public ChargesDataResponse paidAt(Long paidAt) {
    this.paidAt = paidAt;
    return this;
  }

   /**
   * Payment date
   * @return paidAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPaidAt() {
    return paidAt;
  }


  @JsonProperty(JSON_PROPERTY_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidAt(Long paidAt) {
    this.paidAt = paidAt;
  }


  public ChargesDataResponse paymentMethod(ChargeResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeResponsePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(ChargeResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public ChargesDataResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Reference ID of the charge
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceId() {
    return referenceId;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public ChargesDataResponse refunds(ChargeResponseRefunds refunds) {
    this.refunds = refunds;
    return this;
  }

   /**
   * Get refunds
   * @return refunds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeResponseRefunds getRefunds() {
    return refunds;
  }


  @JsonProperty(JSON_PROPERTY_REFUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefunds(ChargeResponseRefunds refunds) {
    this.refunds = refunds;
  }


  public ChargesDataResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Charge status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this charges_data_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargesDataResponse chargesDataResponse = (ChargesDataResponse) o;
    return Objects.equals(this.amount, chargesDataResponse.amount) &&
        Objects.equals(this.channel, chargesDataResponse.channel) &&
        Objects.equals(this.createdAt, chargesDataResponse.createdAt) &&
        Objects.equals(this.currency, chargesDataResponse.currency) &&
        Objects.equals(this.customerId, chargesDataResponse.customerId) &&
        Objects.equals(this.description, chargesDataResponse.description) &&
        Objects.equals(this.deviceFingerprint, chargesDataResponse.deviceFingerprint) &&
        Objects.equals(this.failureCode, chargesDataResponse.failureCode) &&
        Objects.equals(this.failureMessage, chargesDataResponse.failureMessage) &&
        Objects.equals(this.id, chargesDataResponse.id) &&
        Objects.equals(this.livemode, chargesDataResponse.livemode) &&
        Objects.equals(this._object, chargesDataResponse._object) &&
        Objects.equals(this.orderId, chargesDataResponse.orderId) &&
        Objects.equals(this.paidAt, chargesDataResponse.paidAt) &&
        Objects.equals(this.paymentMethod, chargesDataResponse.paymentMethod) &&
        Objects.equals(this.referenceId, chargesDataResponse.referenceId) &&
        Objects.equals(this.refunds, chargesDataResponse.refunds) &&
        Objects.equals(this.status, chargesDataResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, channel, createdAt, currency, customerId, description, deviceFingerprint, failureCode, failureMessage, id, livemode, _object, orderId, paidAt, paymentMethod, referenceId, refunds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargesDataResponse {\n");
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

