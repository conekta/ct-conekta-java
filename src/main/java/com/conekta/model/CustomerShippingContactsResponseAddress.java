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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * CustomerShippingContactsResponseAddress
 */
@JsonPropertyOrder({
  CustomerShippingContactsResponseAddress.JSON_PROPERTY_OBJECT,
  CustomerShippingContactsResponseAddress.JSON_PROPERTY_STREET1,
  CustomerShippingContactsResponseAddress.JSON_PROPERTY_STREET2,
  CustomerShippingContactsResponseAddress.JSON_PROPERTY_POSTAL_CODE,
  CustomerShippingContactsResponseAddress.JSON_PROPERTY_CITY,
  CustomerShippingContactsResponseAddress.JSON_PROPERTY_STATE,
  CustomerShippingContactsResponseAddress.JSON_PROPERTY_COUNTRY,
  CustomerShippingContactsResponseAddress.JSON_PROPERTY_RESIDENTIAL
})
@JsonTypeName("customer_shipping_contacts_response_address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CustomerShippingContactsResponseAddress {
  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_STREET1 = "street1";
  private String street1;

  public static final String JSON_PROPERTY_STREET2 = "street2";
  private String street2;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_RESIDENTIAL = "residential";
  private Boolean residential;

  public CustomerShippingContactsResponseAddress() { 
  }

  public CustomerShippingContactsResponseAddress _object(String _object) {
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


  public CustomerShippingContactsResponseAddress street1(String street1) {
    this.street1 = street1;
    return this;
  }

   /**
   * Get street1
   * @return street1
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet1() {
    return street1;
  }


  @JsonProperty(JSON_PROPERTY_STREET1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet1(String street1) {
    this.street1 = street1;
  }


  public CustomerShippingContactsResponseAddress street2(String street2) {
    this.street2 = street2;
    return this;
  }

   /**
   * Get street2
   * @return street2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet2() {
    return street2;
  }


  @JsonProperty(JSON_PROPERTY_STREET2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet2(String street2) {
    this.street2 = street2;
  }


  public CustomerShippingContactsResponseAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public CustomerShippingContactsResponseAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public CustomerShippingContactsResponseAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public CustomerShippingContactsResponseAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public CustomerShippingContactsResponseAddress residential(Boolean residential) {
    this.residential = residential;
    return this;
  }

   /**
   * Get residential
   * @return residential
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESIDENTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResidential() {
    return residential;
  }


  @JsonProperty(JSON_PROPERTY_RESIDENTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResidential(Boolean residential) {
    this.residential = residential;
  }


  /**
   * Return true if this customer_shipping_contacts_response_address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerShippingContactsResponseAddress customerShippingContactsResponseAddress = (CustomerShippingContactsResponseAddress) o;
    return Objects.equals(this._object, customerShippingContactsResponseAddress._object) &&
        Objects.equals(this.street1, customerShippingContactsResponseAddress.street1) &&
        Objects.equals(this.street2, customerShippingContactsResponseAddress.street2) &&
        Objects.equals(this.postalCode, customerShippingContactsResponseAddress.postalCode) &&
        Objects.equals(this.city, customerShippingContactsResponseAddress.city) &&
        Objects.equals(this.state, customerShippingContactsResponseAddress.state) &&
        Objects.equals(this.country, customerShippingContactsResponseAddress.country) &&
        Objects.equals(this.residential, customerShippingContactsResponseAddress.residential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, street1, street2, postalCode, city, state, country, residential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerShippingContactsResponseAddress {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
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

