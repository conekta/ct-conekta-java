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
import com.conekta.model.CustomerAddress;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * CustomerUpdateFiscalEntitiesRequest
 */
@JsonPropertyOrder({
  CustomerUpdateFiscalEntitiesRequest.JSON_PROPERTY_ADDRESS,
  CustomerUpdateFiscalEntitiesRequest.JSON_PROPERTY_TAX_ID,
  CustomerUpdateFiscalEntitiesRequest.JSON_PROPERTY_EMAIL,
  CustomerUpdateFiscalEntitiesRequest.JSON_PROPERTY_PHONE,
  CustomerUpdateFiscalEntitiesRequest.JSON_PROPERTY_METADATA,
  CustomerUpdateFiscalEntitiesRequest.JSON_PROPERTY_COMPANY_NAME
})
@JsonTypeName("customer_update_fiscal_entities_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CustomerUpdateFiscalEntitiesRequest {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable
  private CustomerAddress address;

  public static final String JSON_PROPERTY_TAX_ID = "tax_id";
  @javax.annotation.Nullable
  private String taxId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private String email;

  public static final String JSON_PROPERTY_PHONE = "phone";
  @javax.annotation.Nullable
  private String phone;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_COMPANY_NAME = "company_name";
  @javax.annotation.Nullable
  private String companyName;

  public CustomerUpdateFiscalEntitiesRequest() { 
  }

  public CustomerUpdateFiscalEntitiesRequest address(@javax.annotation.Nullable CustomerAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(@javax.annotation.Nullable CustomerAddress address) {
    this.address = address;
  }


  public CustomerUpdateFiscalEntitiesRequest taxId(@javax.annotation.Nullable String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Get taxId
   * @return taxId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxId() {
    return taxId;
  }


  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(@javax.annotation.Nullable String taxId) {
    this.taxId = taxId;
  }


  public CustomerUpdateFiscalEntitiesRequest email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public CustomerUpdateFiscalEntitiesRequest phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public CustomerUpdateFiscalEntitiesRequest metadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CustomerUpdateFiscalEntitiesRequest putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public CustomerUpdateFiscalEntitiesRequest companyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
  }


  /**
   * Return true if this customer_update_fiscal_entities_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUpdateFiscalEntitiesRequest customerUpdateFiscalEntitiesRequest = (CustomerUpdateFiscalEntitiesRequest) o;
    return Objects.equals(this.address, customerUpdateFiscalEntitiesRequest.address) &&
        Objects.equals(this.taxId, customerUpdateFiscalEntitiesRequest.taxId) &&
        Objects.equals(this.email, customerUpdateFiscalEntitiesRequest.email) &&
        Objects.equals(this.phone, customerUpdateFiscalEntitiesRequest.phone) &&
        Objects.equals(this.metadata, customerUpdateFiscalEntitiesRequest.metadata) &&
        Objects.equals(this.companyName, customerUpdateFiscalEntitiesRequest.companyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, taxId, email, phone, metadata, companyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateFiscalEntitiesRequest {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

