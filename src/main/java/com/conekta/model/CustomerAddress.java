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
 * CustomerAddress
 */
@JsonPropertyOrder({
  CustomerAddress.JSON_PROPERTY_STREET1,
  CustomerAddress.JSON_PROPERTY_STREET2,
  CustomerAddress.JSON_PROPERTY_POSTAL_CODE,
  CustomerAddress.JSON_PROPERTY_CITY,
  CustomerAddress.JSON_PROPERTY_STATE,
  CustomerAddress.JSON_PROPERTY_COUNTRY,
  CustomerAddress.JSON_PROPERTY_RESIDENTIAL,
  CustomerAddress.JSON_PROPERTY_EXTERNAL_NUMBER
})
@JsonTypeName("customer_address")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T11:12:04.718851-03:00[America/Argentina/Buenos_Aires]")
public class CustomerAddress {
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

  public CustomerAddress() { 
  }

  public CustomerAddress street1(String street1) {
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


  public CustomerAddress street2(String street2) {
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


  public CustomerAddress postalCode(String postalCode) {
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


  public CustomerAddress city(String city) {
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


  public CustomerAddress state(String state) {
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


  public CustomerAddress country(String country) {
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


  public CustomerAddress residential(Boolean residential) {
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


  public CustomerAddress externalNumber(String externalNumber) {
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


  /**
   * Return true if this customer_address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAddress customerAddress = (CustomerAddress) o;
    return Objects.equals(this.street1, customerAddress.street1) &&
        Objects.equals(this.street2, customerAddress.street2) &&
        Objects.equals(this.postalCode, customerAddress.postalCode) &&
        Objects.equals(this.city, customerAddress.city) &&
        Objects.equals(this.state, customerAddress.state) &&
        Objects.equals(this.country, customerAddress.country) &&
        Objects.equals(this.residential, customerAddress.residential) &&
        Objects.equals(this.externalNumber, customerAddress.externalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street1, street2, postalCode, city, state, country, residential, externalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAddress {\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    externalNumber: ").append(toIndentedString(externalNumber)).append("\n");
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

