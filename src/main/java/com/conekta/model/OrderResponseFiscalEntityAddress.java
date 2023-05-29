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
 * OrderResponseFiscalEntityAddress
 */
@JsonPropertyOrder({
  OrderResponseFiscalEntityAddress.JSON_PROPERTY_STREET1,
  OrderResponseFiscalEntityAddress.JSON_PROPERTY_STREET2,
  OrderResponseFiscalEntityAddress.JSON_PROPERTY_POSTAL_CODE,
  OrderResponseFiscalEntityAddress.JSON_PROPERTY_CITY,
  OrderResponseFiscalEntityAddress.JSON_PROPERTY_STATE,
  OrderResponseFiscalEntityAddress.JSON_PROPERTY_COUNTRY,
  OrderResponseFiscalEntityAddress.JSON_PROPERTY_RESIDENTIAL,
  OrderResponseFiscalEntityAddress.JSON_PROPERTY_EXTERNAL_NUMBER,
  OrderResponseFiscalEntityAddress.JSON_PROPERTY_OBJECT
})
@JsonTypeName("order_response_fiscal_entity_address")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class OrderResponseFiscalEntityAddress {
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

  public static final String JSON_PROPERTY_EXTERNAL_NUMBER = "external_number";
  private String externalNumber;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public OrderResponseFiscalEntityAddress() { 
  }

  public OrderResponseFiscalEntityAddress street1(String street1) {
    this.street1 = street1;
    return this;
  }

   /**
   * Get street1
   * @return street1
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STREET1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStreet1() {
    return street1;
  }


  @JsonProperty(JSON_PROPERTY_STREET1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStreet1(String street1) {
    this.street1 = street1;
  }


  public OrderResponseFiscalEntityAddress street2(String street2) {
    this.street2 = street2;
    return this;
  }

   /**
   * Get street2
   * @return street2
  **/
  @jakarta.annotation.Nullable
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


  public OrderResponseFiscalEntityAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public OrderResponseFiscalEntityAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCity(String city) {
    this.city = city;
  }


  public OrderResponseFiscalEntityAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
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


  public OrderResponseFiscalEntityAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * this field follows the [ISO 3166-1 alpha-2 standard](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
   * @return country
  **/
  @jakarta.annotation.Nullable
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


  public OrderResponseFiscalEntityAddress residential(Boolean residential) {
    this.residential = residential;
    return this;
  }

   /**
   * Get residential
   * @return residential
  **/
  @jakarta.annotation.Nullable
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


  public OrderResponseFiscalEntityAddress externalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
    return this;
  }

   /**
   * Get externalNumber
   * @return externalNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalNumber() {
    return externalNumber;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
  }


  public OrderResponseFiscalEntityAddress _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
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


  /**
   * Return true if this order_response_fiscal_entity_address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponseFiscalEntityAddress orderResponseFiscalEntityAddress = (OrderResponseFiscalEntityAddress) o;
    return Objects.equals(this.street1, orderResponseFiscalEntityAddress.street1) &&
        Objects.equals(this.street2, orderResponseFiscalEntityAddress.street2) &&
        Objects.equals(this.postalCode, orderResponseFiscalEntityAddress.postalCode) &&
        Objects.equals(this.city, orderResponseFiscalEntityAddress.city) &&
        Objects.equals(this.state, orderResponseFiscalEntityAddress.state) &&
        Objects.equals(this.country, orderResponseFiscalEntityAddress.country) &&
        Objects.equals(this.residential, orderResponseFiscalEntityAddress.residential) &&
        Objects.equals(this.externalNumber, orderResponseFiscalEntityAddress.externalNumber) &&
        Objects.equals(this._object, orderResponseFiscalEntityAddress._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street1, street2, postalCode, city, state, country, residential, externalNumber, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponseFiscalEntityAddress {\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    externalNumber: ").append(toIndentedString(externalNumber)).append("\n");
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

