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
import com.conekta.model.FiscalEntityAddress;
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
 * Fiscal entity of the order, Currently it is a purely informative field
 */
@JsonPropertyOrder({
  OrderUpdateFiscalEntityRequest.JSON_PROPERTY_ADDRESS,
  OrderUpdateFiscalEntityRequest.JSON_PROPERTY_EMAIL,
  OrderUpdateFiscalEntityRequest.JSON_PROPERTY_NAME,
  OrderUpdateFiscalEntityRequest.JSON_PROPERTY_METADATA,
  OrderUpdateFiscalEntityRequest.JSON_PROPERTY_PHONE,
  OrderUpdateFiscalEntityRequest.JSON_PROPERTY_TAX_ID
})
@JsonTypeName("order_update_fiscal_entity_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderUpdateFiscalEntityRequest {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private FiscalEntityAddress address;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_TAX_ID = "tax_id";
  private String taxId;

  public OrderUpdateFiscalEntityRequest() { 
  }

  public OrderUpdateFiscalEntityRequest address(FiscalEntityAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FiscalEntityAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(FiscalEntityAddress address) {
    this.address = address;
  }


  public OrderUpdateFiscalEntityRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the fiscal entity
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public OrderUpdateFiscalEntityRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the fiscal entity
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public OrderUpdateFiscalEntityRequest metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderUpdateFiscalEntityRequest putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata associated with the fiscal entity
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


  public OrderUpdateFiscalEntityRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone of the fiscal entity
   * @return phone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public OrderUpdateFiscalEntityRequest taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Tax ID of the fiscal entity
   * @return taxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxId() {
    return taxId;
  }


  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  /**
   * Return true if this order_update_fiscal_entity_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderUpdateFiscalEntityRequest orderUpdateFiscalEntityRequest = (OrderUpdateFiscalEntityRequest) o;
    return Objects.equals(this.address, orderUpdateFiscalEntityRequest.address) &&
        Objects.equals(this.email, orderUpdateFiscalEntityRequest.email) &&
        Objects.equals(this.name, orderUpdateFiscalEntityRequest.name) &&
        Objects.equals(this.metadata, orderUpdateFiscalEntityRequest.metadata) &&
        Objects.equals(this.phone, orderUpdateFiscalEntityRequest.phone) &&
        Objects.equals(this.taxId, orderUpdateFiscalEntityRequest.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, name, metadata, phone, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderUpdateFiscalEntityRequest {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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

