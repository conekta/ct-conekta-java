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
import com.conekta.model.ChargeRequest;
import com.conekta.model.CheckoutRequest;
import com.conekta.model.CustomerShippingContacts;
import com.conekta.model.OrderDiscountLinesRequest;
import com.conekta.model.OrderRequestCustomerInfo;
import com.conekta.model.OrderTaxRequest;
import com.conekta.model.Product;
import com.conekta.model.ShippingRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * a order
 */
@JsonPropertyOrder({
  OrderRequest.JSON_PROPERTY_CHARGES,
  OrderRequest.JSON_PROPERTY_CHECKOUT,
  OrderRequest.JSON_PROPERTY_CURRENCY,
  OrderRequest.JSON_PROPERTY_CUSTOMER_INFO,
  OrderRequest.JSON_PROPERTY_DISCOUNT_LINES,
  OrderRequest.JSON_PROPERTY_LINE_ITEMS,
  OrderRequest.JSON_PROPERTY_METADATA,
  OrderRequest.JSON_PROPERTY_NEEDS_SHIPPING_CONTACT,
  OrderRequest.JSON_PROPERTY_PRE_AUTHORIZE,
  OrderRequest.JSON_PROPERTY_SHIPPING_CONTACT,
  OrderRequest.JSON_PROPERTY_SHIPPING_LINES,
  OrderRequest.JSON_PROPERTY_TAX_LINES
})
@JsonTypeName("order_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T11:12:04.718851-03:00[America/Argentina/Buenos_Aires]")
public class OrderRequest {
  public static final String JSON_PROPERTY_CHARGES = "charges";
  private List<ChargeRequest> charges = new ArrayList<>();

  public static final String JSON_PROPERTY_CHECKOUT = "checkout";
  private CheckoutRequest checkout;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_CUSTOMER_INFO = "customer_info";
  private OrderRequestCustomerInfo customerInfo;

  public static final String JSON_PROPERTY_DISCOUNT_LINES = "discount_lines";
  private List<OrderDiscountLinesRequest> discountLines = new ArrayList<>();

  public static final String JSON_PROPERTY_LINE_ITEMS = "line_items";
  private List<Product> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_NEEDS_SHIPPING_CONTACT = "needs_shipping_contact";
  private Boolean needsShippingContact;

  public static final String JSON_PROPERTY_PRE_AUTHORIZE = "pre_authorize";
  private Boolean preAuthorize = false;

  public static final String JSON_PROPERTY_SHIPPING_CONTACT = "shipping_contact";
  private CustomerShippingContacts shippingContact;

  public static final String JSON_PROPERTY_SHIPPING_LINES = "shipping_lines";
  private List<ShippingRequest> shippingLines = new ArrayList<>();

  public static final String JSON_PROPERTY_TAX_LINES = "tax_lines";
  private List<OrderTaxRequest> taxLines = new ArrayList<>();

  public OrderRequest() { 
  }

  public OrderRequest charges(List<ChargeRequest> charges) {
    this.charges = charges;
    return this;
  }

  public OrderRequest addChargesItem(ChargeRequest chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

   /**
   * List of [charges](https://developers.conekta.com/v2.1.0/reference/orderscreatecharge) that are applied to the order
   * @return charges
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChargeRequest> getCharges() {
    return charges;
  }


  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharges(List<ChargeRequest> charges) {
    this.charges = charges;
  }


  public OrderRequest checkout(CheckoutRequest checkout) {
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

  public CheckoutRequest getCheckout() {
    return checkout;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckout(CheckoutRequest checkout) {
    this.checkout = checkout;
  }


  public OrderRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)
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


  public OrderRequest customerInfo(OrderRequestCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

   /**
   * Get customerInfo
   * @return customerInfo
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CUSTOMER_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderRequestCustomerInfo getCustomerInfo() {
    return customerInfo;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomerInfo(OrderRequestCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }


  public OrderRequest discountLines(List<OrderDiscountLinesRequest> discountLines) {
    this.discountLines = discountLines;
    return this;
  }

  public OrderRequest addDiscountLinesItem(OrderDiscountLinesRequest discountLinesItem) {
    if (this.discountLines == null) {
      this.discountLines = new ArrayList<>();
    }
    this.discountLines.add(discountLinesItem);
    return this;
  }

   /**
   * List of [discounts](https://developers.conekta.com/v2.1.0/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount.
   * @return discountLines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOUNT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderDiscountLinesRequest> getDiscountLines() {
    return discountLines;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscountLines(List<OrderDiscountLinesRequest> discountLines) {
    this.discountLines = discountLines;
  }


  public OrderRequest lineItems(List<Product> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public OrderRequest addLineItemsItem(Product lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * List of [products](https://developers.conekta.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product.
   * @return lineItems
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Product> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLineItems(List<Product> lineItems) {
    this.lineItems = lineItems;
  }


  public OrderRequest metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderRequest putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
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


  public OrderRequest needsShippingContact(Boolean needsShippingContact) {
    this.needsShippingContact = needsShippingContact;
    return this;
  }

   /**
   * Allows you to fill out the shipping information at checkout
   * @return needsShippingContact
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEEDS_SHIPPING_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNeedsShippingContact() {
    return needsShippingContact;
  }


  @JsonProperty(JSON_PROPERTY_NEEDS_SHIPPING_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeedsShippingContact(Boolean needsShippingContact) {
    this.needsShippingContact = needsShippingContact;
  }


  public OrderRequest preAuthorize(Boolean preAuthorize) {
    this.preAuthorize = preAuthorize;
    return this;
  }

   /**
   * Indicates whether the order charges must be preauthorized
   * @return preAuthorize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_AUTHORIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreAuthorize() {
    return preAuthorize;
  }


  @JsonProperty(JSON_PROPERTY_PRE_AUTHORIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreAuthorize(Boolean preAuthorize) {
    this.preAuthorize = preAuthorize;
  }


  public OrderRequest shippingContact(CustomerShippingContacts shippingContact) {
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

  public CustomerShippingContacts getShippingContact() {
    return shippingContact;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingContact(CustomerShippingContacts shippingContact) {
    this.shippingContact = shippingContact;
  }


  public OrderRequest shippingLines(List<ShippingRequest> shippingLines) {
    this.shippingLines = shippingLines;
    return this;
  }

  public OrderRequest addShippingLinesItem(ShippingRequest shippingLinesItem) {
    if (this.shippingLines == null) {
      this.shippingLines = new ArrayList<>();
    }
    this.shippingLines.add(shippingLinesItem);
    return this;
  }

   /**
   * List of [shipping costs](https://developers.conekta.com/v2.1.0/reference/orderscreateshipping). If the online store offers digital products.
   * @return shippingLines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ShippingRequest> getShippingLines() {
    return shippingLines;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingLines(List<ShippingRequest> shippingLines) {
    this.shippingLines = shippingLines;
  }


  public OrderRequest taxLines(List<OrderTaxRequest> taxLines) {
    this.taxLines = taxLines;
    return this;
  }

  public OrderRequest addTaxLinesItem(OrderTaxRequest taxLinesItem) {
    if (this.taxLines == null) {
      this.taxLines = new ArrayList<>();
    }
    this.taxLines.add(taxLinesItem);
    return this;
  }

   /**
   * List of [taxes](https://developers.conekta.com/v2.1.0/reference/orderscreatetaxes) that are applied to the order.
   * @return taxLines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderTaxRequest> getTaxLines() {
    return taxLines;
  }


  @JsonProperty(JSON_PROPERTY_TAX_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxLines(List<OrderTaxRequest> taxLines) {
    this.taxLines = taxLines;
  }


  /**
   * Return true if this order_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRequest orderRequest = (OrderRequest) o;
    return Objects.equals(this.charges, orderRequest.charges) &&
        Objects.equals(this.checkout, orderRequest.checkout) &&
        Objects.equals(this.currency, orderRequest.currency) &&
        Objects.equals(this.customerInfo, orderRequest.customerInfo) &&
        Objects.equals(this.discountLines, orderRequest.discountLines) &&
        Objects.equals(this.lineItems, orderRequest.lineItems) &&
        Objects.equals(this.metadata, orderRequest.metadata) &&
        Objects.equals(this.needsShippingContact, orderRequest.needsShippingContact) &&
        Objects.equals(this.preAuthorize, orderRequest.preAuthorize) &&
        Objects.equals(this.shippingContact, orderRequest.shippingContact) &&
        Objects.equals(this.shippingLines, orderRequest.shippingLines) &&
        Objects.equals(this.taxLines, orderRequest.taxLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charges, checkout, currency, customerInfo, discountLines, lineItems, metadata, needsShippingContact, preAuthorize, shippingContact, shippingLines, taxLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRequest {\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    discountLines: ").append(toIndentedString(discountLines)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    needsShippingContact: ").append(toIndentedString(needsShippingContact)).append("\n");
    sb.append("    preAuthorize: ").append(toIndentedString(preAuthorize)).append("\n");
    sb.append("    shippingContact: ").append(toIndentedString(shippingContact)).append("\n");
    sb.append("    shippingLines: ").append(toIndentedString(shippingLines)).append("\n");
    sb.append("    taxLines: ").append(toIndentedString(taxLines)).append("\n");
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

