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
import com.conekta.model.CheckoutOrderTemplateCustomerInfo;
import com.conekta.model.Product;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * It maintains the attributes with which the order will be created when receiving a new payment.
 */
@JsonPropertyOrder({
  CheckoutOrderTemplate.JSON_PROPERTY_CURRENCY,
  CheckoutOrderTemplate.JSON_PROPERTY_CUSTOMER_INFO,
  CheckoutOrderTemplate.JSON_PROPERTY_LINE_ITEMS,
  CheckoutOrderTemplate.JSON_PROPERTY_METADATA
})
@JsonTypeName("checkout_order_template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CheckoutOrderTemplate {
  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public static final String JSON_PROPERTY_CUSTOMER_INFO = "customer_info";
  @javax.annotation.Nullable
  private CheckoutOrderTemplateCustomerInfo customerInfo;

  public static final String JSON_PROPERTY_LINE_ITEMS = "line_items";
  @javax.annotation.Nonnull
  private List<Product> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable
  private Map<String, Object> metadata = new HashMap<>();

  public CheckoutOrderTemplate() { 
  }

  public CheckoutOrderTemplate currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * It is the currency in which the order will be created. It must be a valid ISO 4217 currency code.
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


  public CheckoutOrderTemplate customerInfo(@javax.annotation.Nullable CheckoutOrderTemplateCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

  /**
   * Get customerInfo
   * @return customerInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CheckoutOrderTemplateCustomerInfo getCustomerInfo() {
    return customerInfo;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerInfo(@javax.annotation.Nullable CheckoutOrderTemplateCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }


  public CheckoutOrderTemplate lineItems(@javax.annotation.Nonnull List<Product> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CheckoutOrderTemplate addLineItemsItem(Product lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * They are the products to buy. Each contains the \&quot;unit price\&quot; and \&quot;quantity\&quot; parameters that are used to calculate the total amount of the order.
   * @return lineItems
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Product> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLineItems(@javax.annotation.Nonnull List<Product> lineItems) {
    this.lineItems = lineItems;
  }


  public CheckoutOrderTemplate metadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CheckoutOrderTemplate putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * It is a set of key-value pairs that you can attach to the order. It can be used to store additional information about the order in a structured format.
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  /**
   * Return true if this checkout_order_template object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutOrderTemplate checkoutOrderTemplate = (CheckoutOrderTemplate) o;
    return Objects.equals(this.currency, checkoutOrderTemplate.currency) &&
        Objects.equals(this.customerInfo, checkoutOrderTemplate.customerInfo) &&
        Objects.equals(this.lineItems, checkoutOrderTemplate.lineItems) &&
        Objects.equals(this.metadata, checkoutOrderTemplate.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, customerInfo, lineItems, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutOrderTemplate {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

