/*
 * Conekta API
 * Conekta sdk
 *
 * The version of the OpenAPI document: 2.2.0
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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * create new taxes for an existing order
 */
@JsonPropertyOrder({
  UpdateOrderTaxRequest.JSON_PROPERTY_AMOUNT,
  UpdateOrderTaxRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateOrderTaxRequest.JSON_PROPERTY_METADATA
})
@JsonTypeName("update_order_tax_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class UpdateOrderTaxRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public UpdateOrderTaxRequest() { 
  }

  public UpdateOrderTaxRequest amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount to be collected for tax in cents
   * minimum: 0
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public UpdateOrderTaxRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description or tax&#39;s name
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


  public UpdateOrderTaxRequest metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateOrderTaxRequest putMetadataItem(String key, Object metadataItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  /**
   * Return true if this update_order_tax_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderTaxRequest updateOrderTaxRequest = (UpdateOrderTaxRequest) o;
    return Objects.equals(this.amount, updateOrderTaxRequest.amount) &&
        Objects.equals(this.description, updateOrderTaxRequest.description) &&
        Objects.equals(this.metadata, updateOrderTaxRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderTaxRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

