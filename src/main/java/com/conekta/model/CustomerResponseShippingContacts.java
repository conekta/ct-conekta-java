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
import com.conekta.model.CustomerShippingContactsDataResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * CustomerResponseShippingContacts
 */
@JsonPropertyOrder({
  CustomerResponseShippingContacts.JSON_PROPERTY_HAS_MORE,
  CustomerResponseShippingContacts.JSON_PROPERTY_OBJECT,
  CustomerResponseShippingContacts.JSON_PROPERTY_DATA
})
@JsonTypeName("customer_response_shipping_contacts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CustomerResponseShippingContacts {
  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  @javax.annotation.Nonnull
  private Boolean hasMore;

  public static final String JSON_PROPERTY_OBJECT = "object";
  @javax.annotation.Nonnull
  private String _object;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private List<CustomerShippingContactsDataResponse> data = new ArrayList<>();

  public CustomerResponseShippingContacts() { 
  }

  public CustomerResponseShippingContacts hasMore(@javax.annotation.Nonnull Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Indicates if there are more pages to be requested
   * @return hasMore
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasMore() {
    return hasMore;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasMore(@javax.annotation.Nonnull Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public CustomerResponseShippingContacts _object(@javax.annotation.Nonnull String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Object type, in this case is list
   * @return _object
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(@javax.annotation.Nonnull String _object) {
    this._object = _object;
  }


  public CustomerResponseShippingContacts data(@javax.annotation.Nullable List<CustomerShippingContactsDataResponse> data) {
    this.data = data;
    return this;
  }

  public CustomerResponseShippingContacts addDataItem(CustomerShippingContactsDataResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomerShippingContactsDataResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(@javax.annotation.Nullable List<CustomerShippingContactsDataResponse> data) {
    this.data = data;
  }


  /**
   * Return true if this customer_response_shipping_contacts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerResponseShippingContacts customerResponseShippingContacts = (CustomerResponseShippingContacts) o;
    return Objects.equals(this.hasMore, customerResponseShippingContacts.hasMore) &&
        Objects.equals(this._object, customerResponseShippingContacts._object) &&
        Objects.equals(this.data, customerResponseShippingContacts.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, _object, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerResponseShippingContacts {\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

