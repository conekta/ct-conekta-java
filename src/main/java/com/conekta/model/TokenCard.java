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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * TokenCard
 */
@JsonPropertyOrder({
  TokenCard.JSON_PROPERTY_CVC,
  TokenCard.JSON_PROPERTY_DEVICE_FINGERPRINT,
  TokenCard.JSON_PROPERTY_EXP_MONTH,
  TokenCard.JSON_PROPERTY_EXP_YEAR,
  TokenCard.JSON_PROPERTY_NAME,
  TokenCard.JSON_PROPERTY_NUMBER
})
@JsonTypeName("token_card")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class TokenCard {
  public static final String JSON_PROPERTY_CVC = "cvc";
  @javax.annotation.Nonnull
  private String cvc;

  public static final String JSON_PROPERTY_DEVICE_FINGERPRINT = "device_fingerprint";
  @javax.annotation.Nullable
  private String deviceFingerprint;

  public static final String JSON_PROPERTY_EXP_MONTH = "exp_month";
  @javax.annotation.Nonnull
  private String expMonth;

  public static final String JSON_PROPERTY_EXP_YEAR = "exp_year";
  @javax.annotation.Nonnull
  private String expYear;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_NUMBER = "number";
  @javax.annotation.Nonnull
  private String number;

  public TokenCard() { 
  }

  public TokenCard cvc(@javax.annotation.Nonnull String cvc) {
    this.cvc = cvc;
    return this;
  }

  /**
   * It is a value that allows identifying the security code of the card.
   * @return cvc
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCvc() {
    return cvc;
  }


  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCvc(@javax.annotation.Nonnull String cvc) {
    this.cvc = cvc;
  }


  public TokenCard deviceFingerprint(@javax.annotation.Nullable String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
    return this;
  }

  /**
   * It is a value that allows identifying the device fingerprint.
   * @return deviceFingerprint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceFingerprint() {
    return deviceFingerprint;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceFingerprint(@javax.annotation.Nullable String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
  }


  public TokenCard expMonth(@javax.annotation.Nonnull String expMonth) {
    this.expMonth = expMonth;
    return this;
  }

  /**
   * It is a value that allows identifying the expiration month of the card.
   * @return expMonth
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpMonth() {
    return expMonth;
  }


  @JsonProperty(JSON_PROPERTY_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpMonth(@javax.annotation.Nonnull String expMonth) {
    this.expMonth = expMonth;
  }


  public TokenCard expYear(@javax.annotation.Nonnull String expYear) {
    this.expYear = expYear;
    return this;
  }

  /**
   * It is a value that allows identifying the expiration year of the card.
   * @return expYear
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpYear() {
    return expYear;
  }


  @JsonProperty(JSON_PROPERTY_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpYear(@javax.annotation.Nonnull String expYear) {
    this.expYear = expYear;
  }


  public TokenCard name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * It is a value that allows identifying the name of the cardholder.
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public TokenCard number(@javax.annotation.Nonnull String number) {
    this.number = number;
    return this;
  }

  /**
   * It is a value that allows identifying the number of the card.
   * @return number
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumber(@javax.annotation.Nonnull String number) {
    this.number = number;
  }


  /**
   * Return true if this token_card object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCard tokenCard = (TokenCard) o;
    return Objects.equals(this.cvc, tokenCard.cvc) &&
        Objects.equals(this.deviceFingerprint, tokenCard.deviceFingerprint) &&
        Objects.equals(this.expMonth, tokenCard.expMonth) &&
        Objects.equals(this.expYear, tokenCard.expYear) &&
        Objects.equals(this.name, tokenCard.name) &&
        Objects.equals(this.number, tokenCard.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cvc, deviceFingerprint, expMonth, expYear, name, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCard {\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    deviceFingerprint: ").append(toIndentedString(deviceFingerprint)).append("\n");
    sb.append("    expMonth: ").append(toIndentedString(expMonth)).append("\n");
    sb.append("    expYear: ").append(toIndentedString(expYear)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

