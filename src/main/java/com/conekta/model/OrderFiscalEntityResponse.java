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
import com.conekta.model.OrderFiscalEntityAddressResponse;
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
  OrderFiscalEntityResponse.JSON_PROPERTY_ADDRESS,
  OrderFiscalEntityResponse.JSON_PROPERTY_EMAIL,
  OrderFiscalEntityResponse.JSON_PROPERTY_METADATA,
  OrderFiscalEntityResponse.JSON_PROPERTY_NAME,
  OrderFiscalEntityResponse.JSON_PROPERTY_TAX_ID,
  OrderFiscalEntityResponse.JSON_PROPERTY_ID,
  OrderFiscalEntityResponse.JSON_PROPERTY_CREATED_AT,
  OrderFiscalEntityResponse.JSON_PROPERTY_OBJECT,
  OrderFiscalEntityResponse.JSON_PROPERTY_PHONE
})
@JsonTypeName("order_fiscal_entity_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderFiscalEntityResponse {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private OrderFiscalEntityAddressResponse address;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAX_ID = "tax_id";
  private String taxId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public OrderFiscalEntityResponse() { 
  }

  public OrderFiscalEntityResponse address(OrderFiscalEntityAddressResponse address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderFiscalEntityAddressResponse getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(OrderFiscalEntityAddressResponse address) {
    this.address = address;
  }


  public OrderFiscalEntityResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the fiscal entity
   * @return email
  **/
  @javax.annotation.Nullable
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


  public OrderFiscalEntityResponse metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderFiscalEntityResponse putMetadataItem(String key, Object metadataItem) {
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
  @javax.annotation.Nullable
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


  public OrderFiscalEntityResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the fiscal entity
   * @return name
  **/
  @javax.annotation.Nullable
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


  public OrderFiscalEntityResponse taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Tax ID of the fiscal entity
   * @return taxId
  **/
  @javax.annotation.Nullable
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


  public OrderFiscalEntityResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the fiscal entity
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


  public OrderFiscalEntityResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which the object was created in seconds since the Unix epoch
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


  public OrderFiscalEntityResponse _object(String _object) {
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


  public OrderFiscalEntityResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone of the fiscal entity
   * @return phone
  **/
  @javax.annotation.Nullable
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


  /**
   * Return true if this order_fiscal_entity_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFiscalEntityResponse orderFiscalEntityResponse = (OrderFiscalEntityResponse) o;
    return Objects.equals(this.address, orderFiscalEntityResponse.address) &&
        Objects.equals(this.email, orderFiscalEntityResponse.email) &&
        Objects.equals(this.metadata, orderFiscalEntityResponse.metadata) &&
        Objects.equals(this.name, orderFiscalEntityResponse.name) &&
        Objects.equals(this.taxId, orderFiscalEntityResponse.taxId) &&
        Objects.equals(this.id, orderFiscalEntityResponse.id) &&
        Objects.equals(this.createdAt, orderFiscalEntityResponse.createdAt) &&
        Objects.equals(this._object, orderFiscalEntityResponse._object) &&
        Objects.equals(this.phone, orderFiscalEntityResponse.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, metadata, name, taxId, id, createdAt, _object, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFiscalEntityResponse {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

