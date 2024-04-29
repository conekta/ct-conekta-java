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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * PaymentMethodCard
 */
@JsonPropertyOrder({
  PaymentMethodCard.JSON_PROPERTY_TYPE,
  PaymentMethodCard.JSON_PROPERTY_OBJECT,
  PaymentMethodCard.JSON_PROPERTY_ACCOUNT_TYPE,
  PaymentMethodCard.JSON_PROPERTY_AUTH_CODE,
  PaymentMethodCard.JSON_PROPERTY_BRAND,
  PaymentMethodCard.JSON_PROPERTY_CONTRACT_ID,
  PaymentMethodCard.JSON_PROPERTY_COUNTRY,
  PaymentMethodCard.JSON_PROPERTY_EXP_MONTH,
  PaymentMethodCard.JSON_PROPERTY_EXP_YEAR,
  PaymentMethodCard.JSON_PROPERTY_FRAUD_INDICATORS,
  PaymentMethodCard.JSON_PROPERTY_ISSUER,
  PaymentMethodCard.JSON_PROPERTY_LAST4,
  PaymentMethodCard.JSON_PROPERTY_NAME
})
@JsonTypeName("payment_method_card")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class PaymentMethodCard {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "account_type";
  private String accountType;

  public static final String JSON_PROPERTY_AUTH_CODE = "auth_code";
  private String authCode;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_CONTRACT_ID = "contract_id";
  private String contractId;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_EXP_MONTH = "exp_month";
  private String expMonth;

  public static final String JSON_PROPERTY_EXP_YEAR = "exp_year";
  private String expYear;

  public static final String JSON_PROPERTY_FRAUD_INDICATORS = "fraud_indicators";
  private List<Object> fraudIndicators = new ArrayList<>();

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public static final String JSON_PROPERTY_LAST4 = "last4";
  private String last4;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public PaymentMethodCard() { 
  }

  public PaymentMethodCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public PaymentMethodCard _object(String _object) {
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


  public PaymentMethodCard accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public PaymentMethodCard authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * Get authCode
   * @return authCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthCode() {
    return authCode;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }


  public PaymentMethodCard brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public PaymentMethodCard contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Id sent for recurrent charges.
   * @return contractId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContractId() {
    return contractId;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractId(String contractId) {
    this.contractId = contractId;
  }


  public PaymentMethodCard country(String country) {
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


  public PaymentMethodCard expMonth(String expMonth) {
    this.expMonth = expMonth;
    return this;
  }

   /**
   * Get expMonth
   * @return expMonth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpMonth() {
    return expMonth;
  }


  @JsonProperty(JSON_PROPERTY_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpMonth(String expMonth) {
    this.expMonth = expMonth;
  }


  public PaymentMethodCard expYear(String expYear) {
    this.expYear = expYear;
    return this;
  }

   /**
   * Get expYear
   * @return expYear
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpYear() {
    return expYear;
  }


  @JsonProperty(JSON_PROPERTY_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }


  public PaymentMethodCard fraudIndicators(List<Object> fraudIndicators) {
    this.fraudIndicators = fraudIndicators;
    return this;
  }

  public PaymentMethodCard addFraudIndicatorsItem(Object fraudIndicatorsItem) {
    if (this.fraudIndicators == null) {
      this.fraudIndicators = new ArrayList<>();
    }
    this.fraudIndicators.add(fraudIndicatorsItem);
    return this;
  }

   /**
   * Get fraudIndicators
   * @return fraudIndicators
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAUD_INDICATORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getFraudIndicators() {
    return fraudIndicators;
  }


  @JsonProperty(JSON_PROPERTY_FRAUD_INDICATORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudIndicators(List<Object> fraudIndicators) {
    this.fraudIndicators = fraudIndicators;
  }


  public PaymentMethodCard issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public PaymentMethodCard last4(String last4) {
    this.last4 = last4;
    return this;
  }

   /**
   * Get last4
   * @return last4
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLast4() {
    return last4;
  }


  @JsonProperty(JSON_PROPERTY_LAST4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLast4(String last4) {
    this.last4 = last4;
  }


  public PaymentMethodCard name(String name) {
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


  /**
   * Return true if this payment_method_card object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCard paymentMethodCard = (PaymentMethodCard) o;
    return Objects.equals(this.type, paymentMethodCard.type) &&
        Objects.equals(this._object, paymentMethodCard._object) &&
        Objects.equals(this.accountType, paymentMethodCard.accountType) &&
        Objects.equals(this.authCode, paymentMethodCard.authCode) &&
        Objects.equals(this.brand, paymentMethodCard.brand) &&
        Objects.equals(this.contractId, paymentMethodCard.contractId) &&
        Objects.equals(this.country, paymentMethodCard.country) &&
        Objects.equals(this.expMonth, paymentMethodCard.expMonth) &&
        Objects.equals(this.expYear, paymentMethodCard.expYear) &&
        Objects.equals(this.fraudIndicators, paymentMethodCard.fraudIndicators) &&
        Objects.equals(this.issuer, paymentMethodCard.issuer) &&
        Objects.equals(this.last4, paymentMethodCard.last4) &&
        Objects.equals(this.name, paymentMethodCard.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _object, accountType, authCode, brand, contractId, country, expMonth, expYear, fraudIndicators, issuer, last4, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCard {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    expMonth: ").append(toIndentedString(expMonth)).append("\n");
    sb.append("    expYear: ").append(toIndentedString(expYear)).append("\n");
    sb.append("    fraudIndicators: ").append(toIndentedString(fraudIndicators)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

