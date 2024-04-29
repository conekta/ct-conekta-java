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
import com.conekta.model.WebhookLog;
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
 * event model
 */
@JsonPropertyOrder({
  EventResponse.JSON_PROPERTY_CREATED_AT,
  EventResponse.JSON_PROPERTY_DATA,
  EventResponse.JSON_PROPERTY_ID,
  EventResponse.JSON_PROPERTY_LIVEMODE,
  EventResponse.JSON_PROPERTY_OBJECT,
  EventResponse.JSON_PROPERTY_TYPE,
  EventResponse.JSON_PROPERTY_WEBHOOK_LOGS,
  EventResponse.JSON_PROPERTY_WEBHOOK_STATUS
})
@JsonTypeName("event_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class EventResponse {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_DATA = "data";
  private Map<String, Object> data = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_WEBHOOK_LOGS = "webhook_logs";
  private List<WebhookLog> webhookLogs = new ArrayList<>();

  public static final String JSON_PROPERTY_WEBHOOK_STATUS = "webhook_status";
  private String webhookStatus;

  public EventResponse() { 
  }

  public EventResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
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


  public EventResponse data(Map<String, Object> data) {
    this.data = data;
    return this;
  }

  public EventResponse putDataItem(String key, Object dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Map<String, Object> data) {
    this.data = data;
  }


  public EventResponse id(String id) {
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


  public EventResponse livemode(Boolean livemode) {
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


  public EventResponse _object(String _object) {
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


  public EventResponse type(String type) {
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


  public EventResponse webhookLogs(List<WebhookLog> webhookLogs) {
    this.webhookLogs = webhookLogs;
    return this;
  }

  public EventResponse addWebhookLogsItem(WebhookLog webhookLogsItem) {
    if (this.webhookLogs == null) {
      this.webhookLogs = new ArrayList<>();
    }
    this.webhookLogs.add(webhookLogsItem);
    return this;
  }

   /**
   * Get webhookLogs
   * @return webhookLogs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBHOOK_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WebhookLog> getWebhookLogs() {
    return webhookLogs;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookLogs(List<WebhookLog> webhookLogs) {
    this.webhookLogs = webhookLogs;
  }


  public EventResponse webhookStatus(String webhookStatus) {
    this.webhookStatus = webhookStatus;
    return this;
  }

   /**
   * Get webhookStatus
   * @return webhookStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBHOOK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookStatus() {
    return webhookStatus;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookStatus(String webhookStatus) {
    this.webhookStatus = webhookStatus;
  }


  /**
   * Return true if this event_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResponse eventResponse = (EventResponse) o;
    return Objects.equals(this.createdAt, eventResponse.createdAt) &&
        Objects.equals(this.data, eventResponse.data) &&
        Objects.equals(this.id, eventResponse.id) &&
        Objects.equals(this.livemode, eventResponse.livemode) &&
        Objects.equals(this._object, eventResponse._object) &&
        Objects.equals(this.type, eventResponse.type) &&
        Objects.equals(this.webhookLogs, eventResponse.webhookLogs) &&
        Objects.equals(this.webhookStatus, eventResponse.webhookStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, data, id, livemode, _object, type, webhookLogs, webhookStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    webhookLogs: ").append(toIndentedString(webhookLogs)).append("\n");
    sb.append("    webhookStatus: ").append(toIndentedString(webhookStatus)).append("\n");
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

