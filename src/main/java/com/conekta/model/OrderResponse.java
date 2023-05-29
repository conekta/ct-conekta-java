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
import com.conekta.model.ChargeResponseChannel;
import com.conekta.model.OrderResponseCharges;
import com.conekta.model.OrderResponseCheckout;
import com.conekta.model.OrderResponseCustomerInfo;
import com.conekta.model.OrderResponseDiscountLines;
import com.conekta.model.OrderResponseFiscalEntity;
import com.conekta.model.OrderResponseProducts;
import com.conekta.model.OrderResponseShippingContact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * order response
 */
@JsonPropertyOrder({
  OrderResponse.JSON_PROPERTY_AMOUNT,
  OrderResponse.JSON_PROPERTY_AMOUNT_REFUNDED,
  OrderResponse.JSON_PROPERTY_CHANNEL,
  OrderResponse.JSON_PROPERTY_CHARGES,
  OrderResponse.JSON_PROPERTY_CHECKOUT,
  OrderResponse.JSON_PROPERTY_CREATED_AT,
  OrderResponse.JSON_PROPERTY_CURRENCY,
  OrderResponse.JSON_PROPERTY_CUSTOMER_INFO,
  OrderResponse.JSON_PROPERTY_DISCOUNT_LINES,
  OrderResponse.JSON_PROPERTY_FISCAL_ENTITY,
  OrderResponse.JSON_PROPERTY_ID,
  OrderResponse.JSON_PROPERTY_IS_REFUNDABLE,
  OrderResponse.JSON_PROPERTY_LINE_ITEMS,
  OrderResponse.JSON_PROPERTY_LIVEMODE,
  OrderResponse.JSON_PROPERTY_METADATA,
  OrderResponse.JSON_PROPERTY_OBJECT,
  OrderResponse.JSON_PROPERTY_PAYMENT_STATUS,
  OrderResponse.JSON_PROPERTY_SHIPPING_CONTACT,
  OrderResponse.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("order_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class OrderResponse {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_AMOUNT_REFUNDED = "amount_refunded";
  private Integer amountRefunded;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private ChargeResponseChannel channel;

  public static final String JSON_PROPERTY_CHARGES = "charges";
  private OrderResponseCharges charges;

  public static final String JSON_PROPERTY_CHECKOUT = "checkout";
  private OrderResponseCheckout checkout;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_CUSTOMER_INFO = "customer_info";
  private OrderResponseCustomerInfo customerInfo;

  public static final String JSON_PROPERTY_DISCOUNT_LINES = "discount_lines";
  private OrderResponseDiscountLines discountLines;

  public static final String JSON_PROPERTY_FISCAL_ENTITY = "fiscal_entity";
  private OrderResponseFiscalEntity fiscalEntity;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_REFUNDABLE = "is_refundable";
  private Boolean isRefundable;

  public static final String JSON_PROPERTY_LINE_ITEMS = "line_items";
  private OrderResponseProducts lineItems;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_PAYMENT_STATUS = "payment_status";
  private String paymentStatus;

  public static final String JSON_PROPERTY_SHIPPING_CONTACT = "shipping_contact";
  private OrderResponseShippingContact shippingContact;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public OrderResponse() { 
  }

  public OrderResponse amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total amount to be collected in cents
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


  public OrderResponse amountRefunded(Integer amountRefunded) {
    this.amountRefunded = amountRefunded;
    return this;
  }

   /**
   * The total amount refunded in cents
   * @return amountRefunded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_REFUNDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmountRefunded() {
    return amountRefunded;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_REFUNDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountRefunded(Integer amountRefunded) {
    this.amountRefunded = amountRefunded;
  }


  public OrderResponse channel(ChargeResponseChannel channel) {
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


  public OrderResponse charges(OrderResponseCharges charges) {
    this.charges = charges;
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderResponseCharges getCharges() {
    return charges;
  }


  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharges(OrderResponseCharges charges) {
    this.charges = charges;
  }


  public OrderResponse checkout(OrderResponseCheckout checkout) {
    this.checkout = checkout;
    return this;
  }

   /**
   * Get checkout
   * @return checkout
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderResponseCheckout getCheckout() {
    return checkout;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckout(OrderResponseCheckout checkout) {
    this.checkout = checkout;
  }


  public OrderResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which the object was created in seconds since the Unix epoch
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


  public OrderResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter ISO 4217 currency code. The currency of the order.
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


  public OrderResponse customerInfo(OrderResponseCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

   /**
   * Get customerInfo
   * @return customerInfo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderResponseCustomerInfo getCustomerInfo() {
    return customerInfo;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerInfo(OrderResponseCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }


  public OrderResponse discountLines(OrderResponseDiscountLines discountLines) {
    this.discountLines = discountLines;
    return this;
  }

   /**
   * Get discountLines
   * @return discountLines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOUNT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderResponseDiscountLines getDiscountLines() {
    return discountLines;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscountLines(OrderResponseDiscountLines discountLines) {
    this.discountLines = discountLines;
  }


  public OrderResponse fiscalEntity(OrderResponseFiscalEntity fiscalEntity) {
    this.fiscalEntity = fiscalEntity;
    return this;
  }

   /**
   * Get fiscalEntity
   * @return fiscalEntity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderResponseFiscalEntity getFiscalEntity() {
    return fiscalEntity;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalEntity(OrderResponseFiscalEntity fiscalEntity) {
    this.fiscalEntity = fiscalEntity;
  }


  public OrderResponse id(String id) {
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


  public OrderResponse isRefundable(Boolean isRefundable) {
    this.isRefundable = isRefundable;
    return this;
  }

   /**
   * Get isRefundable
   * @return isRefundable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REFUNDABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRefundable() {
    return isRefundable;
  }


  @JsonProperty(JSON_PROPERTY_IS_REFUNDABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRefundable(Boolean isRefundable) {
    this.isRefundable = isRefundable;
  }


  public OrderResponse lineItems(OrderResponseProducts lineItems) {
    this.lineItems = lineItems;
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderResponseProducts getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItems(OrderResponseProducts lineItems) {
    this.lineItems = lineItems;
  }


  public OrderResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Whether the object exists in live mode or test mode
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


  public OrderResponse metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderResponse putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public OrderResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * String representing the object’s type. Objects of the same type share the same value.
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


  public OrderResponse paymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * The payment status of the order.
   * @return paymentStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentStatus() {
    return paymentStatus;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public OrderResponse shippingContact(OrderResponseShippingContact shippingContact) {
    this.shippingContact = shippingContact;
    return this;
  }

   /**
   * Get shippingContact
   * @return shippingContact
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderResponseShippingContact getShippingContact() {
    return shippingContact;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingContact(OrderResponseShippingContact shippingContact) {
    this.shippingContact = shippingContact;
  }


  public OrderResponse updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time at which the object was last updated in seconds since the Unix epoch
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this order_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponse orderResponse = (OrderResponse) o;
    return Objects.equals(this.amount, orderResponse.amount) &&
        Objects.equals(this.amountRefunded, orderResponse.amountRefunded) &&
        Objects.equals(this.channel, orderResponse.channel) &&
        Objects.equals(this.charges, orderResponse.charges) &&
        Objects.equals(this.checkout, orderResponse.checkout) &&
        Objects.equals(this.createdAt, orderResponse.createdAt) &&
        Objects.equals(this.currency, orderResponse.currency) &&
        Objects.equals(this.customerInfo, orderResponse.customerInfo) &&
        Objects.equals(this.discountLines, orderResponse.discountLines) &&
        Objects.equals(this.fiscalEntity, orderResponse.fiscalEntity) &&
        Objects.equals(this.id, orderResponse.id) &&
        Objects.equals(this.isRefundable, orderResponse.isRefundable) &&
        Objects.equals(this.lineItems, orderResponse.lineItems) &&
        Objects.equals(this.livemode, orderResponse.livemode) &&
        Objects.equals(this.metadata, orderResponse.metadata) &&
        Objects.equals(this._object, orderResponse._object) &&
        Objects.equals(this.paymentStatus, orderResponse.paymentStatus) &&
        Objects.equals(this.shippingContact, orderResponse.shippingContact) &&
        Objects.equals(this.updatedAt, orderResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountRefunded, channel, charges, checkout, createdAt, currency, customerInfo, discountLines, fiscalEntity, id, isRefundable, lineItems, livemode, metadata, _object, paymentStatus, shippingContact, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountRefunded: ").append(toIndentedString(amountRefunded)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    discountLines: ").append(toIndentedString(discountLines)).append("\n");
    sb.append("    fiscalEntity: ").append(toIndentedString(fiscalEntity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRefundable: ").append(toIndentedString(isRefundable)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    shippingContact: ").append(toIndentedString(shippingContact)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

