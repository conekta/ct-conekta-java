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
 * OrderCustomerInfoResponse
 */
@JsonPropertyOrder({
  OrderCustomerInfoResponse.JSON_PROPERTY_CUSTOMER_CUSTOM_REFERENCE,
  OrderCustomerInfoResponse.JSON_PROPERTY_NAME,
  OrderCustomerInfoResponse.JSON_PROPERTY_EMAIL,
  OrderCustomerInfoResponse.JSON_PROPERTY_PHONE,
  OrderCustomerInfoResponse.JSON_PROPERTY_CORPORATE,
  OrderCustomerInfoResponse.JSON_PROPERTY_OBJECT
})
@JsonTypeName("order_customer_info_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderCustomerInfoResponse {
  public static final String JSON_PROPERTY_CUSTOMER_CUSTOM_REFERENCE = "customer_custom_reference";
  private String customerCustomReference;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_CORPORATE = "corporate";
  private Boolean corporate = false;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public OrderCustomerInfoResponse() { 
  }

  public OrderCustomerInfoResponse customerCustomReference(String customerCustomReference) {
    this.customerCustomReference = customerCustomReference;
    return this;
  }

   /**
   * Custom reference
   * @return customerCustomReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_CUSTOM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerCustomReference() {
    return customerCustomReference;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_CUSTOM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerCustomReference(String customerCustomReference) {
    this.customerCustomReference = customerCustomReference;
  }


  public OrderCustomerInfoResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
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


  public OrderCustomerInfoResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
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


  public OrderCustomerInfoResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
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


  public OrderCustomerInfoResponse corporate(Boolean corporate) {
    this.corporate = corporate;
    return this;
  }

   /**
   * Get corporate
   * @return corporate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORPORATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCorporate() {
    return corporate;
  }


  @JsonProperty(JSON_PROPERTY_CORPORATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }


  public OrderCustomerInfoResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
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


  /**
   * Return true if this order_customer_info_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCustomerInfoResponse orderCustomerInfoResponse = (OrderCustomerInfoResponse) o;
    return Objects.equals(this.customerCustomReference, orderCustomerInfoResponse.customerCustomReference) &&
        Objects.equals(this.name, orderCustomerInfoResponse.name) &&
        Objects.equals(this.email, orderCustomerInfoResponse.email) &&
        Objects.equals(this.phone, orderCustomerInfoResponse.phone) &&
        Objects.equals(this.corporate, orderCustomerInfoResponse.corporate) &&
        Objects.equals(this._object, orderCustomerInfoResponse._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCustomReference, name, email, phone, corporate, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCustomerInfoResponse {\n");
    sb.append("    customerCustomReference: ").append(toIndentedString(customerCustomReference)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    corporate: ").append(toIndentedString(corporate)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

