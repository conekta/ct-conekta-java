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
import com.conekta.model.CustomerAntifraudInfoResponse;
import com.conekta.model.CustomerFiscalEntitiesResponse;
import com.conekta.model.CustomerPaymentMethodsResponse;
import com.conekta.model.CustomerResponseShippingContacts;
import com.conekta.model.SubscriptionResponse;
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
 * customer response
 */
@JsonPropertyOrder({
  CustomerResponse.JSON_PROPERTY_ANTIFRAUD_INFO,
  CustomerResponse.JSON_PROPERTY_CORPORATE,
  CustomerResponse.JSON_PROPERTY_CREATED_AT,
  CustomerResponse.JSON_PROPERTY_CUSTOM_REFERENCE,
  CustomerResponse.JSON_PROPERTY_DEFAULT_FISCAL_ENTITY_ID,
  CustomerResponse.JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID,
  CustomerResponse.JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID,
  CustomerResponse.JSON_PROPERTY_EMAIL,
  CustomerResponse.JSON_PROPERTY_FISCAL_ENTITIES,
  CustomerResponse.JSON_PROPERTY_ID,
  CustomerResponse.JSON_PROPERTY_LIVEMODE,
  CustomerResponse.JSON_PROPERTY_NAME,
  CustomerResponse.JSON_PROPERTY_METADATA,
  CustomerResponse.JSON_PROPERTY_OBJECT,
  CustomerResponse.JSON_PROPERTY_PAYMENT_SOURCES,
  CustomerResponse.JSON_PROPERTY_PHONE,
  CustomerResponse.JSON_PROPERTY_SHIPPING_CONTACTS,
  CustomerResponse.JSON_PROPERTY_SUBSCRIPTION
})
@JsonTypeName("customer_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerResponse {
  public static final String JSON_PROPERTY_ANTIFRAUD_INFO = "antifraud_info";
  private CustomerAntifraudInfoResponse antifraudInfo;

  public static final String JSON_PROPERTY_CORPORATE = "corporate";
  private Boolean corporate;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CUSTOM_REFERENCE = "custom_reference";
  private String customReference;

  public static final String JSON_PROPERTY_DEFAULT_FISCAL_ENTITY_ID = "default_fiscal_entity_id";
  private String defaultFiscalEntityId;

  public static final String JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID = "default_shipping_contact_id";
  private String defaultShippingContactId;

  public static final String JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID = "default_payment_source_id";
  private String defaultPaymentSourceId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FISCAL_ENTITIES = "fiscal_entities";
  private CustomerFiscalEntitiesResponse fiscalEntities;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_PAYMENT_SOURCES = "payment_sources";
  private CustomerPaymentMethodsResponse paymentSources;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_SHIPPING_CONTACTS = "shipping_contacts";
  private CustomerResponseShippingContacts shippingContacts;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private SubscriptionResponse subscription;

  public CustomerResponse() { 
  }

  public CustomerResponse antifraudInfo(CustomerAntifraudInfoResponse antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
    return this;
  }

   /**
   * Get antifraudInfo
   * @return antifraudInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTIFRAUD_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerAntifraudInfoResponse getAntifraudInfo() {
    return antifraudInfo;
  }


  @JsonProperty(JSON_PROPERTY_ANTIFRAUD_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntifraudInfo(CustomerAntifraudInfoResponse antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
  }


  public CustomerResponse corporate(Boolean corporate) {
    this.corporate = corporate;
    return this;
  }

   /**
   * true if the customer is a company
   * @return corporate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORPORATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCorporate() {
    return corporate;
  }


  @JsonProperty(JSON_PROPERTY_CORPORATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }


  public CustomerResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date of the object
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public CustomerResponse customReference(String customReference) {
    this.customReference = customReference;
    return this;
  }

   /**
   * Custom reference
   * @return customReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomReference() {
    return customReference;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomReference(String customReference) {
    this.customReference = customReference;
  }


  public CustomerResponse defaultFiscalEntityId(String defaultFiscalEntityId) {
    this.defaultFiscalEntityId = defaultFiscalEntityId;
    return this;
  }

   /**
   * Get defaultFiscalEntityId
   * @return defaultFiscalEntityId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_FISCAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultFiscalEntityId() {
    return defaultFiscalEntityId;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_FISCAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultFiscalEntityId(String defaultFiscalEntityId) {
    this.defaultFiscalEntityId = defaultFiscalEntityId;
  }


  public CustomerResponse defaultShippingContactId(String defaultShippingContactId) {
    this.defaultShippingContactId = defaultShippingContactId;
    return this;
  }

   /**
   * Get defaultShippingContactId
   * @return defaultShippingContactId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultShippingContactId() {
    return defaultShippingContactId;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultShippingContactId(String defaultShippingContactId) {
    this.defaultShippingContactId = defaultShippingContactId;
  }


  public CustomerResponse defaultPaymentSourceId(String defaultPaymentSourceId) {
    this.defaultPaymentSourceId = defaultPaymentSourceId;
    return this;
  }

   /**
   * Get defaultPaymentSourceId
   * @return defaultPaymentSourceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultPaymentSourceId() {
    return defaultPaymentSourceId;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultPaymentSourceId(String defaultPaymentSourceId) {
    this.defaultPaymentSourceId = defaultPaymentSourceId;
  }


  public CustomerResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerResponse fiscalEntities(CustomerFiscalEntitiesResponse fiscalEntities) {
    this.fiscalEntities = fiscalEntities;
    return this;
  }

   /**
   * Get fiscalEntities
   * @return fiscalEntities
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerFiscalEntitiesResponse getFiscalEntities() {
    return fiscalEntities;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalEntities(CustomerFiscalEntitiesResponse fiscalEntities) {
    this.fiscalEntities = fiscalEntities;
  }


  public CustomerResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Customer&#39;s ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public CustomerResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * true if the object exists in live mode or the value false if the object exists in test mode
   * @return livemode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLivemode() {
    return livemode;
  }


  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }


  public CustomerResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Customer&#39;s name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CustomerResponse metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CustomerResponse putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public CustomerResponse _object(String _object) {
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


  public CustomerResponse paymentSources(CustomerPaymentMethodsResponse paymentSources) {
    this.paymentSources = paymentSources;
    return this;
  }

   /**
   * Get paymentSources
   * @return paymentSources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerPaymentMethodsResponse getPaymentSources() {
    return paymentSources;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentSources(CustomerPaymentMethodsResponse paymentSources) {
    this.paymentSources = paymentSources;
  }


  public CustomerResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Customer&#39;s phone number
   * @return phone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public CustomerResponse shippingContacts(CustomerResponseShippingContacts shippingContacts) {
    this.shippingContacts = shippingContacts;
    return this;
  }

   /**
   * Get shippingContacts
   * @return shippingContacts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerResponseShippingContacts getShippingContacts() {
    return shippingContacts;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingContacts(CustomerResponseShippingContacts shippingContacts) {
    this.shippingContacts = shippingContacts;
  }


  public CustomerResponse subscription(SubscriptionResponse subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionResponse getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscription(SubscriptionResponse subscription) {
    this.subscription = subscription;
  }


  /**
   * Return true if this customer_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerResponse customerResponse = (CustomerResponse) o;
    return Objects.equals(this.antifraudInfo, customerResponse.antifraudInfo) &&
        Objects.equals(this.corporate, customerResponse.corporate) &&
        Objects.equals(this.createdAt, customerResponse.createdAt) &&
        Objects.equals(this.customReference, customerResponse.customReference) &&
        Objects.equals(this.defaultFiscalEntityId, customerResponse.defaultFiscalEntityId) &&
        Objects.equals(this.defaultShippingContactId, customerResponse.defaultShippingContactId) &&
        Objects.equals(this.defaultPaymentSourceId, customerResponse.defaultPaymentSourceId) &&
        Objects.equals(this.email, customerResponse.email) &&
        Objects.equals(this.fiscalEntities, customerResponse.fiscalEntities) &&
        Objects.equals(this.id, customerResponse.id) &&
        Objects.equals(this.livemode, customerResponse.livemode) &&
        Objects.equals(this.name, customerResponse.name) &&
        Objects.equals(this.metadata, customerResponse.metadata) &&
        Objects.equals(this._object, customerResponse._object) &&
        Objects.equals(this.paymentSources, customerResponse.paymentSources) &&
        Objects.equals(this.phone, customerResponse.phone) &&
        Objects.equals(this.shippingContacts, customerResponse.shippingContacts) &&
        Objects.equals(this.subscription, customerResponse.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antifraudInfo, corporate, createdAt, customReference, defaultFiscalEntityId, defaultShippingContactId, defaultPaymentSourceId, email, fiscalEntities, id, livemode, name, metadata, _object, paymentSources, phone, shippingContacts, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerResponse {\n");
    sb.append("    antifraudInfo: ").append(toIndentedString(antifraudInfo)).append("\n");
    sb.append("    corporate: ").append(toIndentedString(corporate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customReference: ").append(toIndentedString(customReference)).append("\n");
    sb.append("    defaultFiscalEntityId: ").append(toIndentedString(defaultFiscalEntityId)).append("\n");
    sb.append("    defaultShippingContactId: ").append(toIndentedString(defaultShippingContactId)).append("\n");
    sb.append("    defaultPaymentSourceId: ").append(toIndentedString(defaultPaymentSourceId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fiscalEntities: ").append(toIndentedString(fiscalEntities)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    paymentSources: ").append(toIndentedString(paymentSources)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    shippingContacts: ").append(toIndentedString(shippingContacts)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

