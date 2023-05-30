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
import com.conekta.model.ChargeOrderResponsePaymentMethod;
import com.conekta.model.ChargeResponseChannel;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * ChargeOrderResponse
 */
@JsonPropertyOrder({
  ChargeOrderResponse.JSON_PROPERTY_AMOUNT,
  ChargeOrderResponse.JSON_PROPERTY_CHANNEL,
  ChargeOrderResponse.JSON_PROPERTY_CREATED_AT,
  ChargeOrderResponse.JSON_PROPERTY_CURRENCY,
  ChargeOrderResponse.JSON_PROPERTY_CUSTOMER_ID,
  ChargeOrderResponse.JSON_PROPERTY_DESCRIPTION,
  ChargeOrderResponse.JSON_PROPERTY_DEVICE_FINGERPRINT,
  ChargeOrderResponse.JSON_PROPERTY_FAILURE_CODE,
  ChargeOrderResponse.JSON_PROPERTY_FAILURE_MESSAGE,
  ChargeOrderResponse.JSON_PROPERTY_FEE,
  ChargeOrderResponse.JSON_PROPERTY_ID,
  ChargeOrderResponse.JSON_PROPERTY_LIVEMODE,
  ChargeOrderResponse.JSON_PROPERTY_MONTHLY_INSTALLMENTS,
  ChargeOrderResponse.JSON_PROPERTY_OBJECT,
  ChargeOrderResponse.JSON_PROPERTY_ORDER_ID,
  ChargeOrderResponse.JSON_PROPERTY_PAID_AT,
  ChargeOrderResponse.JSON_PROPERTY_PAYMENT_METHOD,
  ChargeOrderResponse.JSON_PROPERTY_REFERENCE_ID,
  ChargeOrderResponse.JSON_PROPERTY_REFUNDS,
  ChargeOrderResponse.JSON_PROPERTY_STATUS
})
@JsonTypeName("charge_order_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChargeOrderResponse {
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

  public static final String JSON_PROPERTY_FEE = "fee";
  private Integer fee;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_MONTHLY_INSTALLMENTS = "monthly_installments";
  private Integer monthlyInstallments;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_ORDER_ID = "order_id";
  private String orderId;

  public static final String JSON_PROPERTY_PAID_AT = "paid_at";
  private Integer paidAt;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private ChargeOrderResponsePaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_REFERENCE_ID = "reference_id";
  private String referenceId;

  public static final String JSON_PROPERTY_REFUNDS = "refunds";
  private List<Object> refunds = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public ChargeOrderResponse() { 
  }

  public ChargeOrderResponse amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nullable
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


  public ChargeOrderResponse channel(ChargeResponseChannel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @jakarta.annotation.Nullable
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


  public ChargeOrderResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public ChargeOrderResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @jakarta.annotation.Nullable
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


  public ChargeOrderResponse customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @jakarta.annotation.Nullable
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


  public ChargeOrderResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
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


  public ChargeOrderResponse deviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
    return this;
  }

   /**
   * Get deviceFingerprint
   * @return deviceFingerprint
  **/
  @jakarta.annotation.Nullable
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


  public ChargeOrderResponse failureCode(String failureCode) {
    this.failureCode = failureCode;
    return this;
  }

   /**
   * Get failureCode
   * @return failureCode
  **/
  @jakarta.annotation.Nullable
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


  public ChargeOrderResponse failureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Get failureMessage
   * @return failureMessage
  **/
  @jakarta.annotation.Nullable
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


  public ChargeOrderResponse fee(Integer fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFee() {
    return fee;
  }


  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFee(Integer fee) {
    this.fee = fee;
  }


  public ChargeOrderResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ChargeOrderResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Get livemode
   * @return livemode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLivemode() {
    return livemode;
  }


  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }


  public ChargeOrderResponse monthlyInstallments(Integer monthlyInstallments) {
    this.monthlyInstallments = monthlyInstallments;
    return this;
  }

   /**
   * Get monthlyInstallments
   * @return monthlyInstallments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTHLY_INSTALLMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonthlyInstallments() {
    return monthlyInstallments;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_INSTALLMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthlyInstallments(Integer monthlyInstallments) {
    this.monthlyInstallments = monthlyInstallments;
  }


  public ChargeOrderResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(String _object) {
    this._object = _object;
  }


  public ChargeOrderResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public ChargeOrderResponse paidAt(Integer paidAt) {
    this.paidAt = paidAt;
    return this;
  }

   /**
   * Get paidAt
   * @return paidAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaidAt() {
    return paidAt;
  }


  @JsonProperty(JSON_PROPERTY_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidAt(Integer paidAt) {
    this.paidAt = paidAt;
  }


  public ChargeOrderResponse paymentMethod(ChargeOrderResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeOrderResponsePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(ChargeOrderResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public ChargeOrderResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Reference ID of the charge
   * @return referenceId
  **/
  @jakarta.annotation.Nullable
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


  public ChargeOrderResponse refunds(List<Object> refunds) {
    this.refunds = refunds;
    return this;
  }

  public ChargeOrderResponse addRefundsItem(Object refundsItem) {
    if (this.refunds == null) {
      this.refunds = new ArrayList<>();
    }
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * Get refunds
   * @return refunds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getRefunds() {
    return refunds;
  }


  @JsonProperty(JSON_PROPERTY_REFUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefunds(List<Object> refunds) {
    this.refunds = refunds;
  }


  public ChargeOrderResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this charge_order_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeOrderResponse chargeOrderResponse = (ChargeOrderResponse) o;
    return Objects.equals(this.amount, chargeOrderResponse.amount) &&
        Objects.equals(this.channel, chargeOrderResponse.channel) &&
        Objects.equals(this.createdAt, chargeOrderResponse.createdAt) &&
        Objects.equals(this.currency, chargeOrderResponse.currency) &&
        Objects.equals(this.customerId, chargeOrderResponse.customerId) &&
        Objects.equals(this.description, chargeOrderResponse.description) &&
        Objects.equals(this.deviceFingerprint, chargeOrderResponse.deviceFingerprint) &&
        Objects.equals(this.failureCode, chargeOrderResponse.failureCode) &&
        Objects.equals(this.failureMessage, chargeOrderResponse.failureMessage) &&
        Objects.equals(this.fee, chargeOrderResponse.fee) &&
        Objects.equals(this.id, chargeOrderResponse.id) &&
        Objects.equals(this.livemode, chargeOrderResponse.livemode) &&
        Objects.equals(this.monthlyInstallments, chargeOrderResponse.monthlyInstallments) &&
        Objects.equals(this._object, chargeOrderResponse._object) &&
        Objects.equals(this.orderId, chargeOrderResponse.orderId) &&
        Objects.equals(this.paidAt, chargeOrderResponse.paidAt) &&
        Objects.equals(this.paymentMethod, chargeOrderResponse.paymentMethod) &&
        Objects.equals(this.referenceId, chargeOrderResponse.referenceId) &&
        Objects.equals(this.refunds, chargeOrderResponse.refunds) &&
        Objects.equals(this.status, chargeOrderResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, channel, createdAt, currency, customerId, description, deviceFingerprint, failureCode, failureMessage, fee, id, livemode, monthlyInstallments, _object, orderId, paidAt, paymentMethod, referenceId, refunds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeOrderResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceFingerprint: ").append(toIndentedString(deviceFingerprint)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    monthlyInstallments: ").append(toIndentedString(monthlyInstallments)).append("\n");
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

