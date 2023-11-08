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
 * Method used to make the transfer.
 */
@JsonPropertyOrder({
  TransferMethodResponse.JSON_PROPERTY_ACCOUNT_HOLDER,
  TransferMethodResponse.JSON_PROPERTY_ACCOUNT_NUMBER,
  TransferMethodResponse.JSON_PROPERTY_BANK,
  TransferMethodResponse.JSON_PROPERTY_CREATED_AT,
  TransferMethodResponse.JSON_PROPERTY_ID,
  TransferMethodResponse.JSON_PROPERTY_OBJECT,
  TransferMethodResponse.JSON_PROPERTY_PAYEE_ID,
  TransferMethodResponse.JSON_PROPERTY_TYPE
})
@JsonTypeName("transfer_method_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransferMethodResponse {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER = "account_holder";
  private String accountHolder;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "account_number";
  private String accountNumber;

  public static final String JSON_PROPERTY_BANK = "bank";
  private String bank;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_PAYEE_ID = "payee_id";
  private String payeeId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TransferMethodResponse() { 
  }

  public TransferMethodResponse accountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

   /**
   * Name of the account holder.
   * @return accountHolder
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolder() {
    return accountHolder;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }


  public TransferMethodResponse accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account number of the bank account.
   * @return accountNumber
  **/
  @javax.annotation.Nullable
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


  public TransferMethodResponse bank(String bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Name of the bank.
   * @return bank
  **/
  @javax.annotation.Nullable
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


  public TransferMethodResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date and time of creation of the transfer.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public TransferMethodResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the transfer.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public TransferMethodResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Object name, which is bank_transfer_payout_method.
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


  public TransferMethodResponse payeeId(String payeeId) {
    this.payeeId = payeeId;
    return this;
  }

   /**
   * Unique identifier of the payee.
   * @return payeeId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayeeId() {
    return payeeId;
  }


  @JsonProperty(JSON_PROPERTY_PAYEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayeeId(String payeeId) {
    this.payeeId = payeeId;
  }


  public TransferMethodResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the payee.
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


  /**
   * Return true if this transfer_method_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferMethodResponse transferMethodResponse = (TransferMethodResponse) o;
    return Objects.equals(this.accountHolder, transferMethodResponse.accountHolder) &&
        Objects.equals(this.accountNumber, transferMethodResponse.accountNumber) &&
        Objects.equals(this.bank, transferMethodResponse.bank) &&
        Objects.equals(this.createdAt, transferMethodResponse.createdAt) &&
        Objects.equals(this.id, transferMethodResponse.id) &&
        Objects.equals(this._object, transferMethodResponse._object) &&
        Objects.equals(this.payeeId, transferMethodResponse.payeeId) &&
        Objects.equals(this.type, transferMethodResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, accountNumber, bank, createdAt, id, _object, payeeId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferMethodResponse {\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    payeeId: ").append(toIndentedString(payeeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

