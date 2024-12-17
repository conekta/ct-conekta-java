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
import com.conekta.model.CustomerAntifraudInfo;
import com.conekta.model.CustomerFiscalEntitiesRequest;
import com.conekta.model.CustomerPaymentMethodsRequest;
import com.conekta.model.CustomerShippingContacts;
import com.conekta.model.SubscriptionRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * a customer
 */
@JsonPropertyOrder({
  Customer.JSON_PROPERTY_ANTIFRAUD_INFO,
  Customer.JSON_PROPERTY_CORPORATE,
  Customer.JSON_PROPERTY_CUSTOM_REFERENCE,
  Customer.JSON_PROPERTY_DATE_OF_BIRTH,
  Customer.JSON_PROPERTY_EMAIL,
  Customer.JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID,
  Customer.JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID,
  Customer.JSON_PROPERTY_FISCAL_ENTITIES,
  Customer.JSON_PROPERTY_METADATA,
  Customer.JSON_PROPERTY_NAME,
  Customer.JSON_PROPERTY_NATIONAL_ID,
  Customer.JSON_PROPERTY_PAYMENT_SOURCES,
  Customer.JSON_PROPERTY_PHONE,
  Customer.JSON_PROPERTY_PLAN_ID,
  Customer.JSON_PROPERTY_SHIPPING_CONTACTS,
  Customer.JSON_PROPERTY_SUBSCRIPTION
})
@JsonTypeName("customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class Customer {
  public static final String JSON_PROPERTY_ANTIFRAUD_INFO = "antifraud_info";
  private CustomerAntifraudInfo antifraudInfo;

  public static final String JSON_PROPERTY_CORPORATE = "corporate";
  private Boolean corporate = false;

  public static final String JSON_PROPERTY_CUSTOM_REFERENCE = "custom_reference";
  private String customReference;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "date_of_birth";
  private String dateOfBirth;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID = "default_payment_source_id";
  private String defaultPaymentSourceId;

  public static final String JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID = "default_shipping_contact_id";
  private String defaultShippingContactId;

  public static final String JSON_PROPERTY_FISCAL_ENTITIES = "fiscal_entities";
  private List<CustomerFiscalEntitiesRequest> fiscalEntities = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NATIONAL_ID = "national_id";
  private String nationalId;

  public static final String JSON_PROPERTY_PAYMENT_SOURCES = "payment_sources";
  private List<CustomerPaymentMethodsRequest> paymentSources = new ArrayList<>();

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_PLAN_ID = "plan_id";
  private String planId;

  public static final String JSON_PROPERTY_SHIPPING_CONTACTS = "shipping_contacts";
  private List<CustomerShippingContacts> shippingContacts = new ArrayList<>();

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private SubscriptionRequest subscription;

  public Customer() { 
  }

  public Customer antifraudInfo(CustomerAntifraudInfo antifraudInfo) {
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

  public CustomerAntifraudInfo getAntifraudInfo() {
    return antifraudInfo;
  }


  @JsonProperty(JSON_PROPERTY_ANTIFRAUD_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntifraudInfo(CustomerAntifraudInfo antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
  }


  public Customer corporate(Boolean corporate) {
    this.corporate = corporate;
    return this;
  }

   /**
   * It is a value that allows identifying if the email is corporate or not.
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


  public Customer customReference(String customReference) {
    this.customReference = customReference;
    return this;
  }

   /**
   * It is an undefined value.
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


  public Customer dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * It is a parameter that allows to identify the date of birth of the client.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public Customer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * An email address is a series of customizable characters followed by a universal Internet symbol, the at symbol (@), the name of a host server, and a web domain ending (.mx, .com, .org, . net, etc).
   * @return email
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Customer defaultPaymentSourceId(String defaultPaymentSourceId) {
    this.defaultPaymentSourceId = defaultPaymentSourceId;
    return this;
  }

   /**
   * It is a parameter that allows to identify in the response, the Conekta ID of a payment method (payment_id)
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


  public Customer defaultShippingContactId(String defaultShippingContactId) {
    this.defaultShippingContactId = defaultShippingContactId;
    return this;
  }

   /**
   * It is a parameter that allows to identify in the response, the Conekta ID of the shipping address (shipping_contact)
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


  public Customer fiscalEntities(List<CustomerFiscalEntitiesRequest> fiscalEntities) {
    this.fiscalEntities = fiscalEntities;
    return this;
  }

  public Customer addFiscalEntitiesItem(CustomerFiscalEntitiesRequest fiscalEntitiesItem) {
    if (this.fiscalEntities == null) {
      this.fiscalEntities = new ArrayList<>();
    }
    this.fiscalEntities.add(fiscalEntitiesItem);
    return this;
  }

   /**
   * Get fiscalEntities
   * @return fiscalEntities
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomerFiscalEntitiesRequest> getFiscalEntities() {
    return fiscalEntities;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalEntities(List<CustomerFiscalEntitiesRequest> fiscalEntities) {
    this.fiscalEntities = fiscalEntities;
  }


  public Customer metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Customer putMetadataItem(String key, Object metadataItem) {
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


  public Customer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Client&#39;s name
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


  public Customer nationalId(String nationalId) {
    this.nationalId = nationalId;
    return this;
  }

   /**
   * It is a parameter that allows to identify the national identification number of the client.
   * @return nationalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NATIONAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNationalId() {
    return nationalId;
  }


  @JsonProperty(JSON_PROPERTY_NATIONAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }


  public Customer paymentSources(List<CustomerPaymentMethodsRequest> paymentSources) {
    this.paymentSources = paymentSources;
    return this;
  }

  public Customer addPaymentSourcesItem(CustomerPaymentMethodsRequest paymentSourcesItem) {
    if (this.paymentSources == null) {
      this.paymentSources = new ArrayList<>();
    }
    this.paymentSources.add(paymentSourcesItem);
    return this;
  }

   /**
   * Contains details of the payment methods that the customer has active or has used in Conekta
   * @return paymentSources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomerPaymentMethodsRequest> getPaymentSources() {
    return paymentSources;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentSources(List<CustomerPaymentMethodsRequest> paymentSources) {
    this.paymentSources = paymentSources;
  }


  public Customer phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Is the customer&#39;s phone number
   * @return phone
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Customer planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Contains the ID of a plan, which could together with name, email and phone create a client directly to a subscription
   * @return planId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanId() {
    return planId;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public Customer shippingContacts(List<CustomerShippingContacts> shippingContacts) {
    this.shippingContacts = shippingContacts;
    return this;
  }

  public Customer addShippingContactsItem(CustomerShippingContacts shippingContactsItem) {
    if (this.shippingContacts == null) {
      this.shippingContacts = new ArrayList<>();
    }
    this.shippingContacts.add(shippingContactsItem);
    return this;
  }

   /**
   * Contains the detail of the shipping addresses that the client has active or has used in Conekta
   * @return shippingContacts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomerShippingContacts> getShippingContacts() {
    return shippingContacts;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingContacts(List<CustomerShippingContacts> shippingContacts) {
    this.shippingContacts = shippingContacts;
  }


  public Customer subscription(SubscriptionRequest subscription) {
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

  public SubscriptionRequest getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscription(SubscriptionRequest subscription) {
    this.subscription = subscription;
  }


  /**
   * Return true if this customer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.antifraudInfo, customer.antifraudInfo) &&
        Objects.equals(this.corporate, customer.corporate) &&
        Objects.equals(this.customReference, customer.customReference) &&
        Objects.equals(this.dateOfBirth, customer.dateOfBirth) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.defaultPaymentSourceId, customer.defaultPaymentSourceId) &&
        Objects.equals(this.defaultShippingContactId, customer.defaultShippingContactId) &&
        Objects.equals(this.fiscalEntities, customer.fiscalEntities) &&
        Objects.equals(this.metadata, customer.metadata) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.nationalId, customer.nationalId) &&
        Objects.equals(this.paymentSources, customer.paymentSources) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.planId, customer.planId) &&
        Objects.equals(this.shippingContacts, customer.shippingContacts) &&
        Objects.equals(this.subscription, customer.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antifraudInfo, corporate, customReference, dateOfBirth, email, defaultPaymentSourceId, defaultShippingContactId, fiscalEntities, metadata, name, nationalId, paymentSources, phone, planId, shippingContacts, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    antifraudInfo: ").append(toIndentedString(antifraudInfo)).append("\n");
    sb.append("    corporate: ").append(toIndentedString(corporate)).append("\n");
    sb.append("    customReference: ").append(toIndentedString(customReference)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    defaultPaymentSourceId: ").append(toIndentedString(defaultPaymentSourceId)).append("\n");
    sb.append("    defaultShippingContactId: ").append(toIndentedString(defaultShippingContactId)).append("\n");
    sb.append("    fiscalEntities: ").append(toIndentedString(fiscalEntities)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nationalId: ").append(toIndentedString(nationalId)).append("\n");
    sb.append("    paymentSources: ").append(toIndentedString(paymentSources)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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

