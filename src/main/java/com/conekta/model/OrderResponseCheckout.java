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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * OrderResponseCheckout
 */
@JsonPropertyOrder({
  OrderResponseCheckout.JSON_PROPERTY_ALLOWED_PAYMENT_METHODS,
  OrderResponseCheckout.JSON_PROPERTY_CAN_NOT_EXPIRE,
  OrderResponseCheckout.JSON_PROPERTY_EMAILS_SENT,
  OrderResponseCheckout.JSON_PROPERTY_EXCLUDE_CARD_NETWORKS,
  OrderResponseCheckout.JSON_PROPERTY_EXPIRES_AT,
  OrderResponseCheckout.JSON_PROPERTY_FAILURE_URL,
  OrderResponseCheckout.JSON_PROPERTY_FORCE3DS_FLOW,
  OrderResponseCheckout.JSON_PROPERTY_ID,
  OrderResponseCheckout.JSON_PROPERTY_IS_REDIRECT_ON_FAILURE,
  OrderResponseCheckout.JSON_PROPERTY_LIVEMODE,
  OrderResponseCheckout.JSON_PROPERTY_MAX_FAILED_RETRIES,
  OrderResponseCheckout.JSON_PROPERTY_METADATA,
  OrderResponseCheckout.JSON_PROPERTY_MONTHLY_INSTALLMENTS_ENABLED,
  OrderResponseCheckout.JSON_PROPERTY_MONTHLY_INSTALLMENTS_OPTIONS,
  OrderResponseCheckout.JSON_PROPERTY_NAME,
  OrderResponseCheckout.JSON_PROPERTY_NEEDS_SHIPPING_CONTACT,
  OrderResponseCheckout.JSON_PROPERTY_OBJECT,
  OrderResponseCheckout.JSON_PROPERTY_ON_DEMAND_ENABLED,
  OrderResponseCheckout.JSON_PROPERTY_PAID_PAYMENTS_COUNT,
  OrderResponseCheckout.JSON_PROPERTY_RECURRENT,
  OrderResponseCheckout.JSON_PROPERTY_REDIRECTION_TIME,
  OrderResponseCheckout.JSON_PROPERTY_SLUG,
  OrderResponseCheckout.JSON_PROPERTY_SMS_SENT,
  OrderResponseCheckout.JSON_PROPERTY_SUCCESS_URL,
  OrderResponseCheckout.JSON_PROPERTY_STARTS_AT,
  OrderResponseCheckout.JSON_PROPERTY_STATUS,
  OrderResponseCheckout.JSON_PROPERTY_TYPE,
  OrderResponseCheckout.JSON_PROPERTY_URL
})
@JsonTypeName("order_response_checkout")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class OrderResponseCheckout {
  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHODS = "allowed_payment_methods";
  private List<String> allowedPaymentMethods = new ArrayList<>();

  public static final String JSON_PROPERTY_CAN_NOT_EXPIRE = "can_not_expire";
  private Boolean canNotExpire;

  public static final String JSON_PROPERTY_EMAILS_SENT = "emails_sent";
  private Integer emailsSent;

  public static final String JSON_PROPERTY_EXCLUDE_CARD_NETWORKS = "exclude_card_networks";
  private List<Object> excludeCardNetworks = new ArrayList<>();

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Long expiresAt;

  public static final String JSON_PROPERTY_FAILURE_URL = "failure_url";
  private String failureUrl;

  public static final String JSON_PROPERTY_FORCE3DS_FLOW = "force_3ds_flow";
  private Boolean force3dsFlow;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_REDIRECT_ON_FAILURE = "is_redirect_on_failure";
  private Boolean isRedirectOnFailure;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_MAX_FAILED_RETRIES = "max_failed_retries";
  private Integer maxFailedRetries;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_MONTHLY_INSTALLMENTS_ENABLED = "monthly_installments_enabled";
  private Boolean monthlyInstallmentsEnabled;

  public static final String JSON_PROPERTY_MONTHLY_INSTALLMENTS_OPTIONS = "monthly_installments_options";
  private List<Integer> monthlyInstallmentsOptions = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NEEDS_SHIPPING_CONTACT = "needs_shipping_contact";
  private Boolean needsShippingContact;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_ON_DEMAND_ENABLED = "on_demand_enabled";
  private Boolean onDemandEnabled;

  public static final String JSON_PROPERTY_PAID_PAYMENTS_COUNT = "paid_payments_count";
  private Integer paidPaymentsCount;

  public static final String JSON_PROPERTY_RECURRENT = "recurrent";
  private Boolean recurrent;

  public static final String JSON_PROPERTY_REDIRECTION_TIME = "redirection_time";
  private Integer redirectionTime;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_SMS_SENT = "sms_sent";
  private Integer smsSent;

  public static final String JSON_PROPERTY_SUCCESS_URL = "success_url";
  private String successUrl;

  public static final String JSON_PROPERTY_STARTS_AT = "starts_at";
  private Integer startsAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public OrderResponseCheckout() { 
  }

  public OrderResponseCheckout allowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
    return this;
  }

  public OrderResponseCheckout addAllowedPaymentMethodsItem(String allowedPaymentMethodsItem) {
    if (this.allowedPaymentMethods == null) {
      this.allowedPaymentMethods = new ArrayList<>();
    }
    this.allowedPaymentMethods.add(allowedPaymentMethodsItem);
    return this;
  }

   /**
   * Are the payment methods available for this link
   * @return allowedPaymentMethods
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }


  public OrderResponseCheckout canNotExpire(Boolean canNotExpire) {
    this.canNotExpire = canNotExpire;
    return this;
  }

   /**
   * Get canNotExpire
   * @return canNotExpire
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_NOT_EXPIRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanNotExpire() {
    return canNotExpire;
  }


  @JsonProperty(JSON_PROPERTY_CAN_NOT_EXPIRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanNotExpire(Boolean canNotExpire) {
    this.canNotExpire = canNotExpire;
  }


  public OrderResponseCheckout emailsSent(Integer emailsSent) {
    this.emailsSent = emailsSent;
    return this;
  }

   /**
   * Get emailsSent
   * @return emailsSent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEmailsSent() {
    return emailsSent;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailsSent(Integer emailsSent) {
    this.emailsSent = emailsSent;
  }


  public OrderResponseCheckout excludeCardNetworks(List<Object> excludeCardNetworks) {
    this.excludeCardNetworks = excludeCardNetworks;
    return this;
  }

  public OrderResponseCheckout addExcludeCardNetworksItem(Object excludeCardNetworksItem) {
    if (this.excludeCardNetworks == null) {
      this.excludeCardNetworks = new ArrayList<>();
    }
    this.excludeCardNetworks.add(excludeCardNetworksItem);
    return this;
  }

   /**
   * Get excludeCardNetworks
   * @return excludeCardNetworks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_CARD_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getExcludeCardNetworks() {
    return excludeCardNetworks;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_CARD_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeCardNetworks(List<Object> excludeCardNetworks) {
    this.excludeCardNetworks = excludeCardNetworks;
  }


  public OrderResponseCheckout expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
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


  public OrderResponseCheckout failureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
    return this;
  }

   /**
   * Get failureUrl
   * @return failureUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureUrl() {
    return failureUrl;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
  }


  public OrderResponseCheckout force3dsFlow(Boolean force3dsFlow) {
    this.force3dsFlow = force3dsFlow;
    return this;
  }

   /**
   * Get force3dsFlow
   * @return force3dsFlow
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCE3DS_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForce3dsFlow() {
    return force3dsFlow;
  }


  @JsonProperty(JSON_PROPERTY_FORCE3DS_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForce3dsFlow(Boolean force3dsFlow) {
    this.force3dsFlow = force3dsFlow;
  }


  public OrderResponseCheckout id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public OrderResponseCheckout isRedirectOnFailure(Boolean isRedirectOnFailure) {
    this.isRedirectOnFailure = isRedirectOnFailure;
    return this;
  }

   /**
   * Get isRedirectOnFailure
   * @return isRedirectOnFailure
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REDIRECT_ON_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRedirectOnFailure() {
    return isRedirectOnFailure;
  }


  @JsonProperty(JSON_PROPERTY_IS_REDIRECT_ON_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRedirectOnFailure(Boolean isRedirectOnFailure) {
    this.isRedirectOnFailure = isRedirectOnFailure;
  }


  public OrderResponseCheckout livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Get livemode
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


  public OrderResponseCheckout maxFailedRetries(Integer maxFailedRetries) {
    this.maxFailedRetries = maxFailedRetries;
    return this;
  }

   /**
   * Number of retries allowed before the checkout is marked as failed
   * @return maxFailedRetries
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_FAILED_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxFailedRetries() {
    return maxFailedRetries;
  }


  @JsonProperty(JSON_PROPERTY_MAX_FAILED_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxFailedRetries(Integer maxFailedRetries) {
    this.maxFailedRetries = maxFailedRetries;
  }


  public OrderResponseCheckout metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderResponseCheckout putMetadataItem(String key, Object metadataItem) {
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


  public OrderResponseCheckout monthlyInstallmentsEnabled(Boolean monthlyInstallmentsEnabled) {
    this.monthlyInstallmentsEnabled = monthlyInstallmentsEnabled;
    return this;
  }

   /**
   * Get monthlyInstallmentsEnabled
   * @return monthlyInstallmentsEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTHLY_INSTALLMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMonthlyInstallmentsEnabled() {
    return monthlyInstallmentsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_INSTALLMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthlyInstallmentsEnabled(Boolean monthlyInstallmentsEnabled) {
    this.monthlyInstallmentsEnabled = monthlyInstallmentsEnabled;
  }


  public OrderResponseCheckout monthlyInstallmentsOptions(List<Integer> monthlyInstallmentsOptions) {
    this.monthlyInstallmentsOptions = monthlyInstallmentsOptions;
    return this;
  }

  public OrderResponseCheckout addMonthlyInstallmentsOptionsItem(Integer monthlyInstallmentsOptionsItem) {
    if (this.monthlyInstallmentsOptions == null) {
      this.monthlyInstallmentsOptions = new ArrayList<>();
    }
    this.monthlyInstallmentsOptions.add(monthlyInstallmentsOptionsItem);
    return this;
  }

   /**
   * Get monthlyInstallmentsOptions
   * @return monthlyInstallmentsOptions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTHLY_INSTALLMENTS_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getMonthlyInstallmentsOptions() {
    return monthlyInstallmentsOptions;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_INSTALLMENTS_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthlyInstallmentsOptions(List<Integer> monthlyInstallmentsOptions) {
    this.monthlyInstallmentsOptions = monthlyInstallmentsOptions;
  }


  public OrderResponseCheckout name(String name) {
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


  public OrderResponseCheckout needsShippingContact(Boolean needsShippingContact) {
    this.needsShippingContact = needsShippingContact;
    return this;
  }

   /**
   * Get needsShippingContact
   * @return needsShippingContact
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEEDS_SHIPPING_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNeedsShippingContact() {
    return needsShippingContact;
  }


  @JsonProperty(JSON_PROPERTY_NEEDS_SHIPPING_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeedsShippingContact(Boolean needsShippingContact) {
    this.needsShippingContact = needsShippingContact;
  }


  public OrderResponseCheckout _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
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


  public OrderResponseCheckout onDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
    return this;
  }

   /**
   * Get onDemandEnabled
   * @return onDemandEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_DEMAND_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnDemandEnabled() {
    return onDemandEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ON_DEMAND_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
  }


  public OrderResponseCheckout paidPaymentsCount(Integer paidPaymentsCount) {
    this.paidPaymentsCount = paidPaymentsCount;
    return this;
  }

   /**
   * Get paidPaymentsCount
   * @return paidPaymentsCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID_PAYMENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaidPaymentsCount() {
    return paidPaymentsCount;
  }


  @JsonProperty(JSON_PROPERTY_PAID_PAYMENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidPaymentsCount(Integer paidPaymentsCount) {
    this.paidPaymentsCount = paidPaymentsCount;
  }


  public OrderResponseCheckout recurrent(Boolean recurrent) {
    this.recurrent = recurrent;
    return this;
  }

   /**
   * Get recurrent
   * @return recurrent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRecurrent() {
    return recurrent;
  }


  @JsonProperty(JSON_PROPERTY_RECURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurrent(Boolean recurrent) {
    this.recurrent = recurrent;
  }


  public OrderResponseCheckout redirectionTime(Integer redirectionTime) {
    this.redirectionTime = redirectionTime;
    return this;
  }

   /**
   * number of seconds to wait before redirecting to the success_url
   * @return redirectionTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRedirectionTime() {
    return redirectionTime;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectionTime(Integer redirectionTime) {
    this.redirectionTime = redirectionTime;
  }


  public OrderResponseCheckout slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlug(String slug) {
    this.slug = slug;
  }


  public OrderResponseCheckout smsSent(Integer smsSent) {
    this.smsSent = smsSent;
    return this;
  }

   /**
   * Get smsSent
   * @return smsSent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMS_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSmsSent() {
    return smsSent;
  }


  @JsonProperty(JSON_PROPERTY_SMS_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsSent(Integer smsSent) {
    this.smsSent = smsSent;
  }


  public OrderResponseCheckout successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * Get successUrl
   * @return successUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuccessUrl() {
    return successUrl;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }


  public OrderResponseCheckout startsAt(Integer startsAt) {
    this.startsAt = startsAt;
    return this;
  }

   /**
   * Get startsAt
   * @return startsAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartsAt() {
    return startsAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartsAt(Integer startsAt) {
    this.startsAt = startsAt;
  }


  public OrderResponseCheckout status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
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


  public OrderResponseCheckout type(String type) {
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


  public OrderResponseCheckout url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this order_response_checkout object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponseCheckout orderResponseCheckout = (OrderResponseCheckout) o;
    return Objects.equals(this.allowedPaymentMethods, orderResponseCheckout.allowedPaymentMethods) &&
        Objects.equals(this.canNotExpire, orderResponseCheckout.canNotExpire) &&
        Objects.equals(this.emailsSent, orderResponseCheckout.emailsSent) &&
        Objects.equals(this.excludeCardNetworks, orderResponseCheckout.excludeCardNetworks) &&
        Objects.equals(this.expiresAt, orderResponseCheckout.expiresAt) &&
        Objects.equals(this.failureUrl, orderResponseCheckout.failureUrl) &&
        Objects.equals(this.force3dsFlow, orderResponseCheckout.force3dsFlow) &&
        Objects.equals(this.id, orderResponseCheckout.id) &&
        Objects.equals(this.isRedirectOnFailure, orderResponseCheckout.isRedirectOnFailure) &&
        Objects.equals(this.livemode, orderResponseCheckout.livemode) &&
        Objects.equals(this.maxFailedRetries, orderResponseCheckout.maxFailedRetries) &&
        Objects.equals(this.metadata, orderResponseCheckout.metadata) &&
        Objects.equals(this.monthlyInstallmentsEnabled, orderResponseCheckout.monthlyInstallmentsEnabled) &&
        Objects.equals(this.monthlyInstallmentsOptions, orderResponseCheckout.monthlyInstallmentsOptions) &&
        Objects.equals(this.name, orderResponseCheckout.name) &&
        Objects.equals(this.needsShippingContact, orderResponseCheckout.needsShippingContact) &&
        Objects.equals(this._object, orderResponseCheckout._object) &&
        Objects.equals(this.onDemandEnabled, orderResponseCheckout.onDemandEnabled) &&
        Objects.equals(this.paidPaymentsCount, orderResponseCheckout.paidPaymentsCount) &&
        Objects.equals(this.recurrent, orderResponseCheckout.recurrent) &&
        Objects.equals(this.redirectionTime, orderResponseCheckout.redirectionTime) &&
        Objects.equals(this.slug, orderResponseCheckout.slug) &&
        Objects.equals(this.smsSent, orderResponseCheckout.smsSent) &&
        Objects.equals(this.successUrl, orderResponseCheckout.successUrl) &&
        Objects.equals(this.startsAt, orderResponseCheckout.startsAt) &&
        Objects.equals(this.status, orderResponseCheckout.status) &&
        Objects.equals(this.type, orderResponseCheckout.type) &&
        Objects.equals(this.url, orderResponseCheckout.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethods, canNotExpire, emailsSent, excludeCardNetworks, expiresAt, failureUrl, force3dsFlow, id, isRedirectOnFailure, livemode, maxFailedRetries, metadata, monthlyInstallmentsEnabled, monthlyInstallmentsOptions, name, needsShippingContact, _object, onDemandEnabled, paidPaymentsCount, recurrent, redirectionTime, slug, smsSent, successUrl, startsAt, status, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponseCheckout {\n");
    sb.append("    allowedPaymentMethods: ").append(toIndentedString(allowedPaymentMethods)).append("\n");
    sb.append("    canNotExpire: ").append(toIndentedString(canNotExpire)).append("\n");
    sb.append("    emailsSent: ").append(toIndentedString(emailsSent)).append("\n");
    sb.append("    excludeCardNetworks: ").append(toIndentedString(excludeCardNetworks)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    failureUrl: ").append(toIndentedString(failureUrl)).append("\n");
    sb.append("    force3dsFlow: ").append(toIndentedString(force3dsFlow)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRedirectOnFailure: ").append(toIndentedString(isRedirectOnFailure)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    maxFailedRetries: ").append(toIndentedString(maxFailedRetries)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    monthlyInstallmentsEnabled: ").append(toIndentedString(monthlyInstallmentsEnabled)).append("\n");
    sb.append("    monthlyInstallmentsOptions: ").append(toIndentedString(monthlyInstallmentsOptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needsShippingContact: ").append(toIndentedString(needsShippingContact)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    onDemandEnabled: ").append(toIndentedString(onDemandEnabled)).append("\n");
    sb.append("    paidPaymentsCount: ").append(toIndentedString(paidPaymentsCount)).append("\n");
    sb.append("    recurrent: ").append(toIndentedString(recurrent)).append("\n");
    sb.append("    redirectionTime: ").append(toIndentedString(redirectionTime)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    smsSent: ").append(toIndentedString(smsSent)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

