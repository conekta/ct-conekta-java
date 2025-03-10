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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * an updated webhook
 */
@JsonPropertyOrder({
  WebhookUpdateRequest.JSON_PROPERTY_URL,
  WebhookUpdateRequest.JSON_PROPERTY_SYNCHRONOUS,
  WebhookUpdateRequest.JSON_PROPERTY_EVENTS
})
@JsonTypeName("webhook_update_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class WebhookUpdateRequest {
  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nonnull
  private String url;

  public static final String JSON_PROPERTY_SYNCHRONOUS = "synchronous";
  @javax.annotation.Nullable
  private Boolean synchronous = false;

  public static final String JSON_PROPERTY_EVENTS = "events";
  @javax.annotation.Nullable
  private List<String> events = new ArrayList<>();

  public WebhookUpdateRequest() { 
  }

  public WebhookUpdateRequest url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * Here you must place the URL of your Webhook remember that you must program what you will do with the events received. Also do not forget to handle the HTTPS protocol for greater security.
   * @return url
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }


  public WebhookUpdateRequest synchronous(@javax.annotation.Nullable Boolean synchronous) {
    this.synchronous = synchronous;
    return this;
  }

  /**
   * It is a value that allows to decide if the events will be synchronous or asynchronous. We recommend asynchronous &#x3D; false
   * @return synchronous
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSynchronous() {
    return synchronous;
  }


  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSynchronous(@javax.annotation.Nullable Boolean synchronous) {
    this.synchronous = synchronous;
  }


  public WebhookUpdateRequest events(@javax.annotation.Nullable List<String> events) {
    this.events = events;
    return this;
  }

  public WebhookUpdateRequest addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events
   * @return events
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(@javax.annotation.Nullable List<String> events) {
    this.events = events;
  }


  /**
   * Return true if this webhook_update_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUpdateRequest webhookUpdateRequest = (WebhookUpdateRequest) o;
    return Objects.equals(this.url, webhookUpdateRequest.url) &&
        Objects.equals(this.synchronous, webhookUpdateRequest.synchronous) &&
        Objects.equals(this.events, webhookUpdateRequest.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, synchronous, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUpdateRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    synchronous: ").append(toIndentedString(synchronous)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

