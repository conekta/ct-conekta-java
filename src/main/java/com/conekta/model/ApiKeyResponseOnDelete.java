/*
 * Conekta API
 * Conekta sdk
 *
 * The version of the OpenAPI document: 2.2.0
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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * api keys model
 */
@JsonPropertyOrder({
  ApiKeyResponseOnDelete.JSON_PROPERTY_ACTIVE,
  ApiKeyResponseOnDelete.JSON_PROPERTY_CREATED_AT,
  ApiKeyResponseOnDelete.JSON_PROPERTY_DESCRIPTION,
  ApiKeyResponseOnDelete.JSON_PROPERTY_LIVEMODE,
  ApiKeyResponseOnDelete.JSON_PROPERTY_PREFIX,
  ApiKeyResponseOnDelete.JSON_PROPERTY_ID,
  ApiKeyResponseOnDelete.JSON_PROPERTY_OBJECT,
  ApiKeyResponseOnDelete.JSON_PROPERTY_LAST_USED_AT,
  ApiKeyResponseOnDelete.JSON_PROPERTY_ROLE
})
@JsonTypeName("api_key_response_on_delete")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ApiKeyResponseOnDelete {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_LAST_USED_AT = "last_used_at";
  private Long lastUsedAt;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public ApiKeyResponseOnDelete() { 
  }

  public ApiKeyResponseOnDelete active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates if the api key is active
   * @return active
  **/
  @javax.annotation.Nullable
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


  public ApiKeyResponseOnDelete createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Unix timestamp in seconds of when the api key was created
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


  public ApiKeyResponseOnDelete description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A name or brief explanation of what this api key is used for
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ApiKeyResponseOnDelete livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Indicates if the api key is in production
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


  public ApiKeyResponseOnDelete prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * The first few characters of the authentication_token
   * @return prefix
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public ApiKeyResponseOnDelete id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the api key
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


  public ApiKeyResponseOnDelete _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Object name, value is &#39;api_key&#39;
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


  public ApiKeyResponseOnDelete lastUsedAt(Long lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
    return this;
  }

   /**
   * Unix timestamp in seconds with the api key was used
   * @return lastUsedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastUsedAt() {
    return lastUsedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUsedAt(Long lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }


  public ApiKeyResponseOnDelete role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Indicates if the api key is private or public
   * @return role
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(String role) {
    this.role = role;
  }


  /**
   * Return true if this api_key_response_on_delete object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyResponseOnDelete apiKeyResponseOnDelete = (ApiKeyResponseOnDelete) o;
    return Objects.equals(this.active, apiKeyResponseOnDelete.active) &&
        Objects.equals(this.createdAt, apiKeyResponseOnDelete.createdAt) &&
        Objects.equals(this.description, apiKeyResponseOnDelete.description) &&
        Objects.equals(this.livemode, apiKeyResponseOnDelete.livemode) &&
        Objects.equals(this.prefix, apiKeyResponseOnDelete.prefix) &&
        Objects.equals(this.id, apiKeyResponseOnDelete.id) &&
        Objects.equals(this._object, apiKeyResponseOnDelete._object) &&
        Objects.equals(this.lastUsedAt, apiKeyResponseOnDelete.lastUsedAt) &&
        Objects.equals(this.role, apiKeyResponseOnDelete.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, createdAt, description, livemode, prefix, id, _object, lastUsedAt, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyResponseOnDelete {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

