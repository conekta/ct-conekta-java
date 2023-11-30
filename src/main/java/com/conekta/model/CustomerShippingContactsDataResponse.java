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
import com.conekta.model.CustomerShippingContactsAddress;
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
 * CustomerShippingContactsDataResponse
 */
@JsonPropertyOrder({
  CustomerShippingContactsDataResponse.JSON_PROPERTY_PHONE,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_RECEIVER,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_BETWEEN_STREETS,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_ADDRESS,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_PARENT_ID,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_DEFAULT,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_DELETED,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_METADATA,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_ID,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_OBJECT,
  CustomerShippingContactsDataResponse.JSON_PROPERTY_CREATED_AT
})
@JsonTypeName("customer_shipping_contacts_data_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerShippingContactsDataResponse {
  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_RECEIVER = "receiver";
  private String receiver;

  public static final String JSON_PROPERTY_BETWEEN_STREETS = "between_streets";
  private String betweenStreets;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private CustomerShippingContactsAddress address;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public CustomerShippingContactsDataResponse() { 
  }

  public CustomerShippingContactsDataResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone contact
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


  public CustomerShippingContactsDataResponse receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Name of the person who will receive the order
   * @return receiver
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceiver() {
    return receiver;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }


  public CustomerShippingContactsDataResponse betweenStreets(String betweenStreets) {
    this.betweenStreets = betweenStreets;
    return this;
  }

   /**
   * The street names between which the order will be delivered.
   * @return betweenStreets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BETWEEN_STREETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBetweenStreets() {
    return betweenStreets;
  }


  @JsonProperty(JSON_PROPERTY_BETWEEN_STREETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBetweenStreets(String betweenStreets) {
    this.betweenStreets = betweenStreets;
  }


  public CustomerShippingContactsDataResponse address(CustomerShippingContactsAddress address) {
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

  public CustomerShippingContactsAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(CustomerShippingContactsAddress address) {
    this.address = address;
  }


  public CustomerShippingContactsDataResponse parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public CustomerShippingContactsDataResponse _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefault() {
    return _default;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public CustomerShippingContactsDataResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public CustomerShippingContactsDataResponse metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CustomerShippingContactsDataResponse putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata associated with the shipping contact
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


  public CustomerShippingContactsDataResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public CustomerShippingContactsDataResponse _object(String _object) {
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


  public CustomerShippingContactsDataResponse createdAt(Long createdAt) {
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


  /**
   * Return true if this customer_shipping_contacts_data_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerShippingContactsDataResponse customerShippingContactsDataResponse = (CustomerShippingContactsDataResponse) o;
    return Objects.equals(this.phone, customerShippingContactsDataResponse.phone) &&
        Objects.equals(this.receiver, customerShippingContactsDataResponse.receiver) &&
        Objects.equals(this.betweenStreets, customerShippingContactsDataResponse.betweenStreets) &&
        Objects.equals(this.address, customerShippingContactsDataResponse.address) &&
        Objects.equals(this.parentId, customerShippingContactsDataResponse.parentId) &&
        Objects.equals(this._default, customerShippingContactsDataResponse._default) &&
        Objects.equals(this.deleted, customerShippingContactsDataResponse.deleted) &&
        Objects.equals(this.metadata, customerShippingContactsDataResponse.metadata) &&
        Objects.equals(this.id, customerShippingContactsDataResponse.id) &&
        Objects.equals(this._object, customerShippingContactsDataResponse._object) &&
        Objects.equals(this.createdAt, customerShippingContactsDataResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, receiver, betweenStreets, address, parentId, _default, deleted, metadata, id, _object, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerShippingContactsDataResponse {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    betweenStreets: ").append(toIndentedString(betweenStreets)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

