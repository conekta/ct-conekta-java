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
 * TokenResponseCheckout
 * @deprecated
 */
@Deprecated
@JsonPropertyOrder({
  TokenResponseCheckout.JSON_PROPERTY_ALLOWED_PAYMENT_METHODS,
  TokenResponseCheckout.JSON_PROPERTY_CAN_NOT_EXPIRE,
  TokenResponseCheckout.JSON_PROPERTY_EMAILS_SENT,
  TokenResponseCheckout.JSON_PROPERTY_EXCLUDE_CARD_NETWORKS,
  TokenResponseCheckout.JSON_PROPERTY_EXPIRES_AT,
  TokenResponseCheckout.JSON_PROPERTY_FAILURE_URL,
  TokenResponseCheckout.JSON_PROPERTY_FORCE3DS_FLOW,
  TokenResponseCheckout.JSON_PROPERTY_ID,
  TokenResponseCheckout.JSON_PROPERTY_LIVEMODE,
  TokenResponseCheckout.JSON_PROPERTY_METADATA,
  TokenResponseCheckout.JSON_PROPERTY_MONTHLY_INSTALLMENTS_ENABLED,
  TokenResponseCheckout.JSON_PROPERTY_MONTHLY_INSTALLMENTS_OPTIONS,
  TokenResponseCheckout.JSON_PROPERTY_NAME,
  TokenResponseCheckout.JSON_PROPERTY_NEEDS_SHIPPING_CONTACT,
  TokenResponseCheckout.JSON_PROPERTY_OBJECT,
  TokenResponseCheckout.JSON_PROPERTY_ON_DEMAND_ENABLED,
  TokenResponseCheckout.JSON_PROPERTY_PAID_PAYMENTS_COUNT,
  TokenResponseCheckout.JSON_PROPERTY_RECURRENT,
  TokenResponseCheckout.JSON_PROPERTY_SMS_SENT,
  TokenResponseCheckout.JSON_PROPERTY_STARTS_AT,
  TokenResponseCheckout.JSON_PROPERTY_STATUS,
  TokenResponseCheckout.JSON_PROPERTY_SUCCESS_URL,
  TokenResponseCheckout.JSON_PROPERTY_TYPE
})
@JsonTypeName("token_response_checkout")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TokenResponseCheckout {
  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHODS = "allowed_payment_methods";
  private List<String> allowedPaymentMethods;

  public static final String JSON_PROPERTY_CAN_NOT_EXPIRE = "can_not_expire";
  private Boolean canNotExpire;

  public static final String JSON_PROPERTY_EMAILS_SENT = "emails_sent";
  private Integer emailsSent;

  public static final String JSON_PROPERTY_EXCLUDE_CARD_NETWORKS = "exclude_card_networks";
  private List<String> excludeCardNetworks;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Long expiresAt;

  public static final String JSON_PROPERTY_FAILURE_URL = "failure_url";
  private String failureUrl;

  public static final String JSON_PROPERTY_FORCE3DS_FLOW = "force_3ds_flow";
  private Boolean force3dsFlow;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_MONTHLY_INSTALLMENTS_ENABLED = "monthly_installments_enabled";
  private Boolean monthlyInstallmentsEnabled;

  public static final String JSON_PROPERTY_MONTHLY_INSTALLMENTS_OPTIONS = "monthly_installments_options";
  private List<Integer> monthlyInstallmentsOptions;

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

  public static final String JSON_PROPERTY_SMS_SENT = "sms_sent";
  private Integer smsSent;

  public static final String JSON_PROPERTY_STARTS_AT = "starts_at";
  private Long startsAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SUCCESS_URL = "success_url";
  private String successUrl;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TokenResponseCheckout() { 
  }

  public TokenResponseCheckout allowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
    return this;
  }

  public TokenResponseCheckout addAllowedPaymentMethodsItem(String allowedPaymentMethodsItem) {
    if (this.allowedPaymentMethods == null) {
      this.allowedPaymentMethods = new ArrayList<>();
    }
    this.allowedPaymentMethods.add(allowedPaymentMethodsItem);
    return this;
  }

   /**
   * Get allowedPaymentMethods
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


  public TokenResponseCheckout canNotExpire(Boolean canNotExpire) {
    this.canNotExpire = canNotExpire;
    return this;
  }

   /**
   * Indicates if the checkout can not expire.
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


  public TokenResponseCheckout emailsSent(Integer emailsSent) {
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


  public TokenResponseCheckout excludeCardNetworks(List<String> excludeCardNetworks) {
    this.excludeCardNetworks = excludeCardNetworks;
    return this;
  }

  public TokenResponseCheckout addExcludeCardNetworksItem(String excludeCardNetworksItem) {
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

  public List<String> getExcludeCardNetworks() {
    return excludeCardNetworks;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_CARD_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeCardNetworks(List<String> excludeCardNetworks) {
    this.excludeCardNetworks = excludeCardNetworks;
  }


  public TokenResponseCheckout expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Date and time when the checkout expires.
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


  public TokenResponseCheckout failureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
    return this;
  }

   /**
   * URL to redirect the customer to if the payment process fails.
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


  public TokenResponseCheckout force3dsFlow(Boolean force3dsFlow) {
    this.force3dsFlow = force3dsFlow;
    return this;
  }

   /**
   * Indicates if the checkout forces the 3DS flow.
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


  public TokenResponseCheckout id(String id) {
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


  public TokenResponseCheckout livemode(Boolean livemode) {
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


  public TokenResponseCheckout metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public TokenResponseCheckout putMetadataItem(String key, Object metadataItem) {
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


  public TokenResponseCheckout monthlyInstallmentsEnabled(Boolean monthlyInstallmentsEnabled) {
    this.monthlyInstallmentsEnabled = monthlyInstallmentsEnabled;
    return this;
  }

   /**
   * Indicates if the checkout allows monthly installments.
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


  public TokenResponseCheckout monthlyInstallmentsOptions(List<Integer> monthlyInstallmentsOptions) {
    this.monthlyInstallmentsOptions = monthlyInstallmentsOptions;
    return this;
  }

  public TokenResponseCheckout addMonthlyInstallmentsOptionsItem(Integer monthlyInstallmentsOptionsItem) {
    if (this.monthlyInstallmentsOptions == null) {
      this.monthlyInstallmentsOptions = new ArrayList<>();
    }
    this.monthlyInstallmentsOptions.add(monthlyInstallmentsOptionsItem);
    return this;
  }

   /**
   * List of monthly installments options.
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


  public TokenResponseCheckout name(String name) {
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


  public TokenResponseCheckout needsShippingContact(Boolean needsShippingContact) {
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


  public TokenResponseCheckout _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Indicates the type of object, in this case checkout.
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


  public TokenResponseCheckout onDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
    return this;
  }

   /**
   * Indicates if the checkout allows on demand payments.
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


  public TokenResponseCheckout paidPaymentsCount(Integer paidPaymentsCount) {
    this.paidPaymentsCount = paidPaymentsCount;
    return this;
  }

   /**
   * Number of payments that have been paid.
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


  public TokenResponseCheckout recurrent(Boolean recurrent) {
    this.recurrent = recurrent;
    return this;
  }

   /**
   * Indicates if the checkout is recurrent.
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


  public TokenResponseCheckout smsSent(Integer smsSent) {
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


  public TokenResponseCheckout startsAt(Long startsAt) {
    this.startsAt = startsAt;
    return this;
  }

   /**
   * Date and time when the checkout starts.
   * @return startsAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartsAt() {
    return startsAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartsAt(Long startsAt) {
    this.startsAt = startsAt;
  }


  public TokenResponseCheckout status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the checkout.
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


  public TokenResponseCheckout successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * URL to redirect the customer to after the payment process is completed.
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


  public TokenResponseCheckout type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of checkout.
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
   * Return true if this token_response_checkout object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenResponseCheckout tokenResponseCheckout = (TokenResponseCheckout) o;
    return Objects.equals(this.allowedPaymentMethods, tokenResponseCheckout.allowedPaymentMethods) &&
        Objects.equals(this.canNotExpire, tokenResponseCheckout.canNotExpire) &&
        Objects.equals(this.emailsSent, tokenResponseCheckout.emailsSent) &&
        Objects.equals(this.excludeCardNetworks, tokenResponseCheckout.excludeCardNetworks) &&
        Objects.equals(this.expiresAt, tokenResponseCheckout.expiresAt) &&
        Objects.equals(this.failureUrl, tokenResponseCheckout.failureUrl) &&
        Objects.equals(this.force3dsFlow, tokenResponseCheckout.force3dsFlow) &&
        Objects.equals(this.id, tokenResponseCheckout.id) &&
        Objects.equals(this.livemode, tokenResponseCheckout.livemode) &&
        Objects.equals(this.metadata, tokenResponseCheckout.metadata) &&
        Objects.equals(this.monthlyInstallmentsEnabled, tokenResponseCheckout.monthlyInstallmentsEnabled) &&
        Objects.equals(this.monthlyInstallmentsOptions, tokenResponseCheckout.monthlyInstallmentsOptions) &&
        Objects.equals(this.name, tokenResponseCheckout.name) &&
        Objects.equals(this.needsShippingContact, tokenResponseCheckout.needsShippingContact) &&
        Objects.equals(this._object, tokenResponseCheckout._object) &&
        Objects.equals(this.onDemandEnabled, tokenResponseCheckout.onDemandEnabled) &&
        Objects.equals(this.paidPaymentsCount, tokenResponseCheckout.paidPaymentsCount) &&
        Objects.equals(this.recurrent, tokenResponseCheckout.recurrent) &&
        Objects.equals(this.smsSent, tokenResponseCheckout.smsSent) &&
        Objects.equals(this.startsAt, tokenResponseCheckout.startsAt) &&
        Objects.equals(this.status, tokenResponseCheckout.status) &&
        Objects.equals(this.successUrl, tokenResponseCheckout.successUrl) &&
        Objects.equals(this.type, tokenResponseCheckout.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethods, canNotExpire, emailsSent, excludeCardNetworks, expiresAt, failureUrl, force3dsFlow, id, livemode, metadata, monthlyInstallmentsEnabled, monthlyInstallmentsOptions, name, needsShippingContact, _object, onDemandEnabled, paidPaymentsCount, recurrent, smsSent, startsAt, status, successUrl, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponseCheckout {\n");
    sb.append("    allowedPaymentMethods: ").append(toIndentedString(allowedPaymentMethods)).append("\n");
    sb.append("    canNotExpire: ").append(toIndentedString(canNotExpire)).append("\n");
    sb.append("    emailsSent: ").append(toIndentedString(emailsSent)).append("\n");
    sb.append("    excludeCardNetworks: ").append(toIndentedString(excludeCardNetworks)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    failureUrl: ").append(toIndentedString(failureUrl)).append("\n");
    sb.append("    force3dsFlow: ").append(toIndentedString(force3dsFlow)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    monthlyInstallmentsEnabled: ").append(toIndentedString(monthlyInstallmentsEnabled)).append("\n");
    sb.append("    monthlyInstallmentsOptions: ").append(toIndentedString(monthlyInstallmentsOptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needsShippingContact: ").append(toIndentedString(needsShippingContact)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    onDemandEnabled: ").append(toIndentedString(onDemandEnabled)).append("\n");
    sb.append("    paidPaymentsCount: ").append(toIndentedString(paidPaymentsCount)).append("\n");
    sb.append("    recurrent: ").append(toIndentedString(recurrent)).append("\n");
    sb.append("    smsSent: ").append(toIndentedString(smsSent)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
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

