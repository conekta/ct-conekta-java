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
import com.conekta.model.TransferMethodResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * A transfer represents the action of sending an amount to a business bank account including the status, amount and method used to make the transfer.
 */
@JsonPropertyOrder({
  TransfersResponse.JSON_PROPERTY_AMOUNT,
  TransfersResponse.JSON_PROPERTY_CREATED_AT,
  TransfersResponse.JSON_PROPERTY_CURRENCY,
  TransfersResponse.JSON_PROPERTY_ID,
  TransfersResponse.JSON_PROPERTY_LIVEMODE,
  TransfersResponse.JSON_PROPERTY_METHOD,
  TransfersResponse.JSON_PROPERTY_OBJECT,
  TransfersResponse.JSON_PROPERTY_STATEMENT_DESCRIPTION,
  TransfersResponse.JSON_PROPERTY_STATEMENT_REFERENCE,
  TransfersResponse.JSON_PROPERTY_STATUS
})
@JsonTypeName("transfers_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransfersResponse {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_METHOD = "method";
  private TransferMethodResponse method;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTION = "statement_description";
  private String statementDescription;

  public static final String JSON_PROPERTY_STATEMENT_REFERENCE = "statement_reference";
  private String statementReference;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public TransfersResponse() { 
  }

  public TransfersResponse amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount in cents of the transfer.
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public TransfersResponse createdAt(Long createdAt) {
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


  public TransfersResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the transfer. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)
   * @return currency
  **/
  @javax.annotation.Nullable
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


  public TransfersResponse id(String id) {
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


  public TransfersResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Indicates whether the transfer was created in live mode or test mode.
   * @return livemode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLivemode() {
    return livemode;
  }


  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }


  public TransfersResponse method(TransferMethodResponse method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransferMethodResponse getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(TransferMethodResponse method) {
    this.method = method;
  }


  public TransfersResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Object name, which is transfer.
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


  public TransfersResponse statementDescription(String statementDescription) {
    this.statementDescription = statementDescription;
    return this;
  }

   /**
   * Description of the transfer.
   * @return statementDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatementDescription() {
    return statementDescription;
  }


  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatementDescription(String statementDescription) {
    this.statementDescription = statementDescription;
  }


  public TransfersResponse statementReference(String statementReference) {
    this.statementReference = statementReference;
    return this;
  }

   /**
   * Reference number of the transfer.
   * @return statementReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATEMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatementReference() {
    return statementReference;
  }


  @JsonProperty(JSON_PROPERTY_STATEMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }


  public TransfersResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Code indicating transfer status.
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this transfers_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransfersResponse transfersResponse = (TransfersResponse) o;
    return Objects.equals(this.amount, transfersResponse.amount) &&
        Objects.equals(this.createdAt, transfersResponse.createdAt) &&
        Objects.equals(this.currency, transfersResponse.currency) &&
        Objects.equals(this.id, transfersResponse.id) &&
        Objects.equals(this.livemode, transfersResponse.livemode) &&
        Objects.equals(this.method, transfersResponse.method) &&
        Objects.equals(this._object, transfersResponse._object) &&
        Objects.equals(this.statementDescription, transfersResponse.statementDescription) &&
        Objects.equals(this.statementReference, transfersResponse.statementReference) &&
        Objects.equals(this.status, transfersResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdAt, currency, id, livemode, method, _object, statementDescription, statementReference, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransfersResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

