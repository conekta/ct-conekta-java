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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * webhook keys model
 */
@JsonPropertyOrder({
  WebhookKeyResponse.JSON_PROPERTY_ID,
  WebhookKeyResponse.JSON_PROPERTY_ACTIVE,
  WebhookKeyResponse.JSON_PROPERTY_CREATED_AT,
  WebhookKeyResponse.JSON_PROPERTY_DEACTIVATED_AT,
  WebhookKeyResponse.JSON_PROPERTY_PUBLIC_KEY,
  WebhookKeyResponse.JSON_PROPERTY_LIVEMODE,
  WebhookKeyResponse.JSON_PROPERTY_OBJECT
})
@JsonTypeName("webhook-key_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookKeyResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_DEACTIVATED_AT = "deactivated_at";
  private Long deactivatedAt;

  public static final String JSON_PROPERTY_PUBLIC_KEY = "public_key";
  private String publicKey;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public WebhookKeyResponse() { 
  }

  public WebhookKeyResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the webhook key
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


  public WebhookKeyResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates if the webhook key is active
   * @return active
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public WebhookKeyResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Unix timestamp in seconds with the creation date of the webhook key
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
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


  public WebhookKeyResponse deactivatedAt(Long deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
    return this;
  }

   /**
   * Unix timestamp in seconds with the deactivation date of the webhook key
   * @return deactivatedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEACTIVATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeactivatedAt() {
    return deactivatedAt;
  }


  @JsonProperty(JSON_PROPERTY_DEACTIVATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeactivatedAt(Long deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
  }


  public WebhookKeyResponse publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Public key to be used in the webhook
   * @return publicKey
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicKey() {
    return publicKey;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public WebhookKeyResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Indicates if the webhook key is in live mode
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


  public WebhookKeyResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Object name, value is webhook_key
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


  /**
   * Return true if this webhook-key_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookKeyResponse webhookKeyResponse = (WebhookKeyResponse) o;
    return Objects.equals(this.id, webhookKeyResponse.id) &&
        Objects.equals(this.active, webhookKeyResponse.active) &&
        Objects.equals(this.createdAt, webhookKeyResponse.createdAt) &&
        Objects.equals(this.deactivatedAt, webhookKeyResponse.deactivatedAt) &&
        Objects.equals(this.publicKey, webhookKeyResponse.publicKey) &&
        Objects.equals(this.livemode, webhookKeyResponse.livemode) &&
        Objects.equals(this._object, webhookKeyResponse._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, createdAt, deactivatedAt, publicKey, livemode, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookKeyResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deactivatedAt: ").append(toIndentedString(deactivatedAt)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

