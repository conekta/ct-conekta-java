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
 * webhooks model
 */
@JsonPropertyOrder({
  WebhookResponse.JSON_PROPERTY_DELETED,
  WebhookResponse.JSON_PROPERTY_DEVELOPMENT_ENABLED,
  WebhookResponse.JSON_PROPERTY_ID,
  WebhookResponse.JSON_PROPERTY_LIVEMODE,
  WebhookResponse.JSON_PROPERTY_OBJECT,
  WebhookResponse.JSON_PROPERTY_PRODUCTION_ENABLED,
  WebhookResponse.JSON_PROPERTY_STATUS,
  WebhookResponse.JSON_PROPERTY_SUBSCRIBED_EVENTS,
  WebhookResponse.JSON_PROPERTY_SYNCHRONOUS,
  WebhookResponse.JSON_PROPERTY_URL
})
@JsonTypeName("webhook_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class WebhookResponse {
  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_DEVELOPMENT_ENABLED = "development_enabled";
  private Boolean developmentEnabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_PRODUCTION_ENABLED = "production_enabled";
  private Boolean productionEnabled;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SUBSCRIBED_EVENTS = "subscribed_events";
  private List<String> subscribedEvents = new ArrayList<>();

  public static final String JSON_PROPERTY_SYNCHRONOUS = "synchronous";
  private Boolean synchronous;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public WebhookResponse() { 
  }

  public WebhookResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public WebhookResponse developmentEnabled(Boolean developmentEnabled) {
    this.developmentEnabled = developmentEnabled;
    return this;
  }

   /**
   * Get developmentEnabled
   * @return developmentEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVELOPMENT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDevelopmentEnabled() {
    return developmentEnabled;
  }


  @JsonProperty(JSON_PROPERTY_DEVELOPMENT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevelopmentEnabled(Boolean developmentEnabled) {
    this.developmentEnabled = developmentEnabled;
  }


  public WebhookResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
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


  public WebhookResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Get livemode
   * @return livemode
  **/
  @jakarta.annotation.Nullable
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


  public WebhookResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @jakarta.annotation.Nullable
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


  public WebhookResponse productionEnabled(Boolean productionEnabled) {
    this.productionEnabled = productionEnabled;
    return this;
  }

   /**
   * Get productionEnabled
   * @return productionEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProductionEnabled() {
    return productionEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductionEnabled(Boolean productionEnabled) {
    this.productionEnabled = productionEnabled;
  }


  public WebhookResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
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


  public WebhookResponse subscribedEvents(List<String> subscribedEvents) {
    this.subscribedEvents = subscribedEvents;
    return this;
  }

  public WebhookResponse addSubscribedEventsItem(String subscribedEventsItem) {
    if (this.subscribedEvents == null) {
      this.subscribedEvents = new ArrayList<>();
    }
    this.subscribedEvents.add(subscribedEventsItem);
    return this;
  }

   /**
   * Get subscribedEvents
   * @return subscribedEvents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBED_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubscribedEvents() {
    return subscribedEvents;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBED_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscribedEvents(List<String> subscribedEvents) {
    this.subscribedEvents = subscribedEvents;
  }


  public WebhookResponse synchronous(Boolean synchronous) {
    this.synchronous = synchronous;
    return this;
  }

   /**
   * Get synchronous
   * @return synchronous
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSynchronous() {
    return synchronous;
  }


  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSynchronous(Boolean synchronous) {
    this.synchronous = synchronous;
  }


  public WebhookResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this webhook_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.deleted, webhookResponse.deleted) &&
        Objects.equals(this.developmentEnabled, webhookResponse.developmentEnabled) &&
        Objects.equals(this.id, webhookResponse.id) &&
        Objects.equals(this.livemode, webhookResponse.livemode) &&
        Objects.equals(this._object, webhookResponse._object) &&
        Objects.equals(this.productionEnabled, webhookResponse.productionEnabled) &&
        Objects.equals(this.status, webhookResponse.status) &&
        Objects.equals(this.subscribedEvents, webhookResponse.subscribedEvents) &&
        Objects.equals(this.synchronous, webhookResponse.synchronous) &&
        Objects.equals(this.url, webhookResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, developmentEnabled, id, livemode, _object, productionEnabled, status, subscribedEvents, synchronous, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    developmentEnabled: ").append(toIndentedString(developmentEnabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    productionEnabled: ").append(toIndentedString(productionEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscribedEvents: ").append(toIndentedString(subscribedEvents)).append("\n");
    sb.append("    synchronous: ").append(toIndentedString(synchronous)).append("\n");
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

