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
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * event model
 */
@JsonPropertyOrder({
  EventsResendResponse.JSON_PROPERTY_FAILED_ATTEMPTS,
  EventsResendResponse.JSON_PROPERTY_ID,
  EventsResendResponse.JSON_PROPERTY_LAST_ATTEMPTED_AT,
  EventsResendResponse.JSON_PROPERTY_LAST_HTTP_RESPONSE_STATUS,
  EventsResendResponse.JSON_PROPERTY_RESPONSE_DATA,
  EventsResendResponse.JSON_PROPERTY_URL
})
@JsonTypeName("events_resend_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventsResendResponse {
  public static final String JSON_PROPERTY_FAILED_ATTEMPTS = "failed_attempts";
  private Integer failedAttempts;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LAST_ATTEMPTED_AT = "last_attempted_at";
  private Integer lastAttemptedAt;

  public static final String JSON_PROPERTY_LAST_HTTP_RESPONSE_STATUS = "last_http_response_status";
  private Integer lastHttpResponseStatus;

  public static final String JSON_PROPERTY_RESPONSE_DATA = "response_data";
  private Map<String, Object> responseData = new HashMap<>();

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public EventsResendResponse() { 
  }

  public EventsResendResponse failedAttempts(Integer failedAttempts) {
    this.failedAttempts = failedAttempts;
    return this;
  }

   /**
   * Get failedAttempts
   * @return failedAttempts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFailedAttempts() {
    return failedAttempts;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedAttempts(Integer failedAttempts) {
    this.failedAttempts = failedAttempts;
  }


  public EventsResendResponse id(String id) {
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


  public EventsResendResponse lastAttemptedAt(Integer lastAttemptedAt) {
    this.lastAttemptedAt = lastAttemptedAt;
    return this;
  }

   /**
   * Get lastAttemptedAt
   * @return lastAttemptedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_ATTEMPTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastAttemptedAt() {
    return lastAttemptedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ATTEMPTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastAttemptedAt(Integer lastAttemptedAt) {
    this.lastAttemptedAt = lastAttemptedAt;
  }


  public EventsResendResponse lastHttpResponseStatus(Integer lastHttpResponseStatus) {
    this.lastHttpResponseStatus = lastHttpResponseStatus;
    return this;
  }

   /**
   * Get lastHttpResponseStatus
   * @return lastHttpResponseStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_HTTP_RESPONSE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastHttpResponseStatus() {
    return lastHttpResponseStatus;
  }


  @JsonProperty(JSON_PROPERTY_LAST_HTTP_RESPONSE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastHttpResponseStatus(Integer lastHttpResponseStatus) {
    this.lastHttpResponseStatus = lastHttpResponseStatus;
  }


  public EventsResendResponse responseData(Map<String, Object> responseData) {
    this.responseData = responseData;
    return this;
  }

  public EventsResendResponse putResponseDataItem(String key, Object responseDataItem) {
    if (this.responseData == null) {
      this.responseData = new HashMap<>();
    }
    this.responseData.put(key, responseDataItem);
    return this;
  }

   /**
   * Get responseData
   * @return responseData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_DATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getResponseData() {
    return responseData;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_DATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseData(Map<String, Object> responseData) {
    this.responseData = responseData;
  }


  public EventsResendResponse url(URI url) {
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

  public URI getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(URI url) {
    this.url = url;
  }


  /**
   * Return true if this events_resend_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsResendResponse eventsResendResponse = (EventsResendResponse) o;
    return Objects.equals(this.failedAttempts, eventsResendResponse.failedAttempts) &&
        Objects.equals(this.id, eventsResendResponse.id) &&
        Objects.equals(this.lastAttemptedAt, eventsResendResponse.lastAttemptedAt) &&
        Objects.equals(this.lastHttpResponseStatus, eventsResendResponse.lastHttpResponseStatus) &&
        Objects.equals(this.responseData, eventsResendResponse.responseData) &&
        Objects.equals(this.url, eventsResendResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedAttempts, id, lastAttemptedAt, lastHttpResponseStatus, responseData, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsResendResponse {\n");
    sb.append("    failedAttempts: ").append(toIndentedString(failedAttempts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastAttemptedAt: ").append(toIndentedString(lastAttemptedAt)).append("\n");
    sb.append("    lastHttpResponseStatus: ").append(toIndentedString(lastHttpResponseStatus)).append("\n");
    sb.append("    responseData: ").append(toIndentedString(responseData)).append("\n");
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

