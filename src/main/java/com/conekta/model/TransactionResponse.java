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
 * The Transaction object represents the actions or steps of an order. Statuses can be: unprocessed, pending, available, owen, paid_out, voided, capture, capture_reversal, liquidation, liquidation_reversal, payout, payout_reversal, refund, refund_reversal, chargeback, chargeback_reversal, rounding_adjustment, won_chargeback, transferred, and transferred.
 */
@JsonPropertyOrder({
  TransactionResponse.JSON_PROPERTY_AMOUNT,
  TransactionResponse.JSON_PROPERTY_CHARGE,
  TransactionResponse.JSON_PROPERTY_CREATED_AT,
  TransactionResponse.JSON_PROPERTY_CURRENCY,
  TransactionResponse.JSON_PROPERTY_FEE,
  TransactionResponse.JSON_PROPERTY_ID,
  TransactionResponse.JSON_PROPERTY_LIVEMODE,
  TransactionResponse.JSON_PROPERTY_NET,
  TransactionResponse.JSON_PROPERTY_OBJECT,
  TransactionResponse.JSON_PROPERTY_STATUS,
  TransactionResponse.JSON_PROPERTY_TYPE
})
@JsonTypeName("transaction_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionResponse {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_CHARGE = "charge";
  private String charge;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_FEE = "fee";
  private Long fee;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_NET = "net";
  private Long net;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TransactionResponse() { 
  }

  public TransactionResponse amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transaction.
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public TransactionResponse charge(String charge) {
    this.charge = charge;
    return this;
  }

   /**
   * Randomly assigned unique order identifier associated with the charge.
   * @return charge
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCharge() {
    return charge;
  }


  @JsonProperty(JSON_PROPERTY_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCharge(String charge) {
    this.charge = charge;
  }


  public TransactionResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date and time of creation of the transaction in Unix format.
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


  public TransactionResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the transaction. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)
   * @return currency
  **/
  @jakarta.annotation.Nonnull
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


  public TransactionResponse fee(Long fee) {
    this.fee = fee;
    return this;
  }

   /**
   * The amount to be deducted for taxes and commissions.
   * @return fee
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getFee() {
    return fee;
  }


  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFee(Long fee) {
    this.fee = fee;
  }


  public TransactionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the transaction.
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


  public TransactionResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Indicates whether the transaction was created in live mode or test mode.
   * @return livemode
  **/
  @jakarta.annotation.Nonnull
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


  public TransactionResponse net(Long net) {
    this.net = net;
    return this;
  }

   /**
   * The net amount after deducting commissions and taxes.
   * @return net
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getNet() {
    return net;
  }


  @JsonProperty(JSON_PROPERTY_NET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNet(Long net) {
    this.net = net;
  }


  public TransactionResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Object name, which is transaction.
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


  public TransactionResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Code indicating transaction status.
   * @return status
  **/
  @jakarta.annotation.Nonnull
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


  public TransactionResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Transaction Type
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


  /**
   * Return true if this transaction_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return Objects.equals(this.amount, transactionResponse.amount) &&
        Objects.equals(this.charge, transactionResponse.charge) &&
        Objects.equals(this.createdAt, transactionResponse.createdAt) &&
        Objects.equals(this.currency, transactionResponse.currency) &&
        Objects.equals(this.fee, transactionResponse.fee) &&
        Objects.equals(this.id, transactionResponse.id) &&
        Objects.equals(this.livemode, transactionResponse.livemode) &&
        Objects.equals(this.net, transactionResponse.net) &&
        Objects.equals(this._object, transactionResponse._object) &&
        Objects.equals(this.status, transactionResponse.status) &&
        Objects.equals(this.type, transactionResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, charge, createdAt, currency, fee, id, livemode, net, _object, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

