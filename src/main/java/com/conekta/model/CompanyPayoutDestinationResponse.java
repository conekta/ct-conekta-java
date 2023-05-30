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
 * Company payout destination model
 */
@JsonPropertyOrder({
  CompanyPayoutDestinationResponse.JSON_PROPERTY_OBJECT,
  CompanyPayoutDestinationResponse.JSON_PROPERTY_CURRENCY,
  CompanyPayoutDestinationResponse.JSON_PROPERTY_ACCOUNT_HOLDER_NAME,
  CompanyPayoutDestinationResponse.JSON_PROPERTY_BANK,
  CompanyPayoutDestinationResponse.JSON_PROPERTY_TYPE,
  CompanyPayoutDestinationResponse.JSON_PROPERTY_ACCOUNT_NUMBER
})
@JsonTypeName("company_payout_destination_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T11:12:04.718851-03:00[America/Argentina/Buenos_Aires]")
public class CompanyPayoutDestinationResponse {
  /**
   * The resource&#39;s type
   */
  public enum ObjectEnum {
    PAYOUT_DESTINATION("payout_destination");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OBJECT = "object";
  private ObjectEnum _object;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_NAME = "account_holder_name";
  private String accountHolderName;

  public static final String JSON_PROPERTY_BANK = "bank";
  private String bank;

  /**
   * Type of the payout destination
   */
  public enum TypeEnum {
    BANK_ACCOUNT("bank_account");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "account_number";
  private String accountNumber;

  public CompanyPayoutDestinationResponse() { 
  }

  public CompanyPayoutDestinationResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The resource&#39;s type
   * @return _object
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ObjectEnum getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public CompanyPayoutDestinationResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * currency of the receiving account
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CompanyPayoutDestinationResponse accountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    return this;
  }

   /**
   * Name of the account holder
   * @return accountHolderName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderName() {
    return accountHolderName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }


  public CompanyPayoutDestinationResponse bank(String bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Name of the bank
   * @return bank
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBank() {
    return bank;
  }


  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBank(String bank) {
    this.bank = bank;
  }


  public CompanyPayoutDestinationResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the payout destination
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CompanyPayoutDestinationResponse accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account number of the receiving account
   * @return accountNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  /**
   * Return true if this company_payout_destination_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPayoutDestinationResponse companyPayoutDestinationResponse = (CompanyPayoutDestinationResponse) o;
    return Objects.equals(this._object, companyPayoutDestinationResponse._object) &&
        Objects.equals(this.currency, companyPayoutDestinationResponse.currency) &&
        Objects.equals(this.accountHolderName, companyPayoutDestinationResponse.accountHolderName) &&
        Objects.equals(this.bank, companyPayoutDestinationResponse.bank) &&
        Objects.equals(this.type, companyPayoutDestinationResponse.type) &&
        Objects.equals(this.accountNumber, companyPayoutDestinationResponse.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, currency, accountHolderName, bank, type, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyPayoutDestinationResponse {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

