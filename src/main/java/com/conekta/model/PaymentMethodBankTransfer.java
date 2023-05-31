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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * PaymentMethodBankTransfer
 */
@JsonPropertyOrder({
  PaymentMethodBankTransfer.JSON_PROPERTY_TYPE,
  PaymentMethodBankTransfer.JSON_PROPERTY_OBJECT,
  PaymentMethodBankTransfer.JSON_PROPERTY_BANK,
  PaymentMethodBankTransfer.JSON_PROPERTY_CLABE,
  PaymentMethodBankTransfer.JSON_PROPERTY_DESCRIPTION,
  PaymentMethodBankTransfer.JSON_PROPERTY_EXECUTED_AT,
  PaymentMethodBankTransfer.JSON_PROPERTY_EXPIRES_AT,
  PaymentMethodBankTransfer.JSON_PROPERTY_ISSUING_ACCOUNT_BANK,
  PaymentMethodBankTransfer.JSON_PROPERTY_ISSUING_ACCOUNT_NUMBER,
  PaymentMethodBankTransfer.JSON_PROPERTY_ISSUING_ACCOUNT_HOLDER_NAME,
  PaymentMethodBankTransfer.JSON_PROPERTY_ISSUING_ACCOUNT_TAX_ID,
  PaymentMethodBankTransfer.JSON_PROPERTY_PAYMENT_ATTEMPTS,
  PaymentMethodBankTransfer.JSON_PROPERTY_RECEIVING_ACCOUNT_HOLDER_NAME,
  PaymentMethodBankTransfer.JSON_PROPERTY_RECEIVING_ACCOUNT_NUMBER,
  PaymentMethodBankTransfer.JSON_PROPERTY_RECEIVING_ACCOUNT_BANK,
  PaymentMethodBankTransfer.JSON_PROPERTY_RECEIVING_ACCOUNT_TAX_ID,
  PaymentMethodBankTransfer.JSON_PROPERTY_REFERENCE_NUMBER,
  PaymentMethodBankTransfer.JSON_PROPERTY_TRACKING_CODE
})
@JsonTypeName("payment_method_bank_transfer")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodBankTransfer {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_BANK = "bank";
  private String bank;

  public static final String JSON_PROPERTY_CLABE = "clabe";
  private String clabe;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXECUTED_AT = "executed_at";
  private Integer executedAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Long expiresAt;

  public static final String JSON_PROPERTY_ISSUING_ACCOUNT_BANK = "issuing_account_bank";
  private String issuingAccountBank;

  public static final String JSON_PROPERTY_ISSUING_ACCOUNT_NUMBER = "issuing_account_number";
  private String issuingAccountNumber;

  public static final String JSON_PROPERTY_ISSUING_ACCOUNT_HOLDER_NAME = "issuing_account_holder_name";
  private String issuingAccountHolderName;

  public static final String JSON_PROPERTY_ISSUING_ACCOUNT_TAX_ID = "issuing_account_tax_id";
  private String issuingAccountTaxId;

  public static final String JSON_PROPERTY_PAYMENT_ATTEMPTS = "payment_attempts";
  private List<Object> paymentAttempts = new ArrayList<>();

  public static final String JSON_PROPERTY_RECEIVING_ACCOUNT_HOLDER_NAME = "receiving_account_holder_name";
  private String receivingAccountHolderName;

  public static final String JSON_PROPERTY_RECEIVING_ACCOUNT_NUMBER = "receiving_account_number";
  private String receivingAccountNumber;

  public static final String JSON_PROPERTY_RECEIVING_ACCOUNT_BANK = "receiving_account_bank";
  private String receivingAccountBank;

  public static final String JSON_PROPERTY_RECEIVING_ACCOUNT_TAX_ID = "receiving_account_tax_id";
  private String receivingAccountTaxId;

  public static final String JSON_PROPERTY_REFERENCE_NUMBER = "reference_number";
  private String referenceNumber;

  public static final String JSON_PROPERTY_TRACKING_CODE = "tracking_code";
  private String trackingCode;

  public PaymentMethodBankTransfer() { 
  }

  public PaymentMethodBankTransfer type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
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


  public PaymentMethodBankTransfer _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @jakarta.annotation.Nonnull
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


  public PaymentMethodBankTransfer bank(String bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
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


  public PaymentMethodBankTransfer clabe(String clabe) {
    this.clabe = clabe;
    return this;
  }

   /**
   * Get clabe
   * @return clabe
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLABE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClabe() {
    return clabe;
  }


  @JsonProperty(JSON_PROPERTY_CLABE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClabe(String clabe) {
    this.clabe = clabe;
  }


  public PaymentMethodBankTransfer description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentMethodBankTransfer executedAt(Integer executedAt) {
    this.executedAt = executedAt;
    return this;
  }

   /**
   * Get executedAt
   * @return executedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExecutedAt() {
    return executedAt;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutedAt(Integer executedAt) {
    this.executedAt = executedAt;
  }


  public PaymentMethodBankTransfer expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }


  public PaymentMethodBankTransfer issuingAccountBank(String issuingAccountBank) {
    this.issuingAccountBank = issuingAccountBank;
    return this;
  }

   /**
   * Get issuingAccountBank
   * @return issuingAccountBank
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUING_ACCOUNT_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuingAccountBank() {
    return issuingAccountBank;
  }


  @JsonProperty(JSON_PROPERTY_ISSUING_ACCOUNT_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuingAccountBank(String issuingAccountBank) {
    this.issuingAccountBank = issuingAccountBank;
  }


  public PaymentMethodBankTransfer issuingAccountNumber(String issuingAccountNumber) {
    this.issuingAccountNumber = issuingAccountNumber;
    return this;
  }

   /**
   * Get issuingAccountNumber
   * @return issuingAccountNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUING_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuingAccountNumber() {
    return issuingAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ISSUING_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuingAccountNumber(String issuingAccountNumber) {
    this.issuingAccountNumber = issuingAccountNumber;
  }


  public PaymentMethodBankTransfer issuingAccountHolderName(String issuingAccountHolderName) {
    this.issuingAccountHolderName = issuingAccountHolderName;
    return this;
  }

   /**
   * Get issuingAccountHolderName
   * @return issuingAccountHolderName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUING_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuingAccountHolderName() {
    return issuingAccountHolderName;
  }


  @JsonProperty(JSON_PROPERTY_ISSUING_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuingAccountHolderName(String issuingAccountHolderName) {
    this.issuingAccountHolderName = issuingAccountHolderName;
  }


  public PaymentMethodBankTransfer issuingAccountTaxId(String issuingAccountTaxId) {
    this.issuingAccountTaxId = issuingAccountTaxId;
    return this;
  }

   /**
   * Get issuingAccountTaxId
   * @return issuingAccountTaxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUING_ACCOUNT_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuingAccountTaxId() {
    return issuingAccountTaxId;
  }


  @JsonProperty(JSON_PROPERTY_ISSUING_ACCOUNT_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuingAccountTaxId(String issuingAccountTaxId) {
    this.issuingAccountTaxId = issuingAccountTaxId;
  }


  public PaymentMethodBankTransfer paymentAttempts(List<Object> paymentAttempts) {
    this.paymentAttempts = paymentAttempts;
    return this;
  }

  public PaymentMethodBankTransfer addPaymentAttemptsItem(Object paymentAttemptsItem) {
    if (this.paymentAttempts == null) {
      this.paymentAttempts = new ArrayList<>();
    }
    this.paymentAttempts.add(paymentAttemptsItem);
    return this;
  }

   /**
   * Get paymentAttempts
   * @return paymentAttempts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getPaymentAttempts() {
    return paymentAttempts;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentAttempts(List<Object> paymentAttempts) {
    this.paymentAttempts = paymentAttempts;
  }


  public PaymentMethodBankTransfer receivingAccountHolderName(String receivingAccountHolderName) {
    this.receivingAccountHolderName = receivingAccountHolderName;
    return this;
  }

   /**
   * Get receivingAccountHolderName
   * @return receivingAccountHolderName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceivingAccountHolderName() {
    return receivingAccountHolderName;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivingAccountHolderName(String receivingAccountHolderName) {
    this.receivingAccountHolderName = receivingAccountHolderName;
  }


  public PaymentMethodBankTransfer receivingAccountNumber(String receivingAccountNumber) {
    this.receivingAccountNumber = receivingAccountNumber;
    return this;
  }

   /**
   * Get receivingAccountNumber
   * @return receivingAccountNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceivingAccountNumber() {
    return receivingAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivingAccountNumber(String receivingAccountNumber) {
    this.receivingAccountNumber = receivingAccountNumber;
  }


  public PaymentMethodBankTransfer receivingAccountBank(String receivingAccountBank) {
    this.receivingAccountBank = receivingAccountBank;
    return this;
  }

   /**
   * Get receivingAccountBank
   * @return receivingAccountBank
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceivingAccountBank() {
    return receivingAccountBank;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivingAccountBank(String receivingAccountBank) {
    this.receivingAccountBank = receivingAccountBank;
  }


  public PaymentMethodBankTransfer receivingAccountTaxId(String receivingAccountTaxId) {
    this.receivingAccountTaxId = receivingAccountTaxId;
    return this;
  }

   /**
   * Get receivingAccountTaxId
   * @return receivingAccountTaxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceivingAccountTaxId() {
    return receivingAccountTaxId;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivingAccountTaxId(String receivingAccountTaxId) {
    this.receivingAccountTaxId = receivingAccountTaxId;
  }


  public PaymentMethodBankTransfer referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceNumber() {
    return referenceNumber;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public PaymentMethodBankTransfer trackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    return this;
  }

   /**
   * Get trackingCode
   * @return trackingCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingCode() {
    return trackingCode;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }


  /**
   * Return true if this payment_method_bank_transfer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodBankTransfer paymentMethodBankTransfer = (PaymentMethodBankTransfer) o;
    return Objects.equals(this.type, paymentMethodBankTransfer.type) &&
        Objects.equals(this._object, paymentMethodBankTransfer._object) &&
        Objects.equals(this.bank, paymentMethodBankTransfer.bank) &&
        Objects.equals(this.clabe, paymentMethodBankTransfer.clabe) &&
        Objects.equals(this.description, paymentMethodBankTransfer.description) &&
        Objects.equals(this.executedAt, paymentMethodBankTransfer.executedAt) &&
        Objects.equals(this.expiresAt, paymentMethodBankTransfer.expiresAt) &&
        Objects.equals(this.issuingAccountBank, paymentMethodBankTransfer.issuingAccountBank) &&
        Objects.equals(this.issuingAccountNumber, paymentMethodBankTransfer.issuingAccountNumber) &&
        Objects.equals(this.issuingAccountHolderName, paymentMethodBankTransfer.issuingAccountHolderName) &&
        Objects.equals(this.issuingAccountTaxId, paymentMethodBankTransfer.issuingAccountTaxId) &&
        Objects.equals(this.paymentAttempts, paymentMethodBankTransfer.paymentAttempts) &&
        Objects.equals(this.receivingAccountHolderName, paymentMethodBankTransfer.receivingAccountHolderName) &&
        Objects.equals(this.receivingAccountNumber, paymentMethodBankTransfer.receivingAccountNumber) &&
        Objects.equals(this.receivingAccountBank, paymentMethodBankTransfer.receivingAccountBank) &&
        Objects.equals(this.receivingAccountTaxId, paymentMethodBankTransfer.receivingAccountTaxId) &&
        Objects.equals(this.referenceNumber, paymentMethodBankTransfer.referenceNumber) &&
        Objects.equals(this.trackingCode, paymentMethodBankTransfer.trackingCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _object, bank, clabe, description, executedAt, expiresAt, issuingAccountBank, issuingAccountNumber, issuingAccountHolderName, issuingAccountTaxId, paymentAttempts, receivingAccountHolderName, receivingAccountNumber, receivingAccountBank, receivingAccountTaxId, referenceNumber, trackingCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBankTransfer {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    clabe: ").append(toIndentedString(clabe)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    issuingAccountBank: ").append(toIndentedString(issuingAccountBank)).append("\n");
    sb.append("    issuingAccountNumber: ").append(toIndentedString(issuingAccountNumber)).append("\n");
    sb.append("    issuingAccountHolderName: ").append(toIndentedString(issuingAccountHolderName)).append("\n");
    sb.append("    issuingAccountTaxId: ").append(toIndentedString(issuingAccountTaxId)).append("\n");
    sb.append("    paymentAttempts: ").append(toIndentedString(paymentAttempts)).append("\n");
    sb.append("    receivingAccountHolderName: ").append(toIndentedString(receivingAccountHolderName)).append("\n");
    sb.append("    receivingAccountNumber: ").append(toIndentedString(receivingAccountNumber)).append("\n");
    sb.append("    receivingAccountBank: ").append(toIndentedString(receivingAccountBank)).append("\n");
    sb.append("    receivingAccountTaxId: ").append(toIndentedString(receivingAccountTaxId)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
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

