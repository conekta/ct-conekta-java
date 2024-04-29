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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * ApiKeyCreateResponse
 */
@JsonPropertyOrder({
  ApiKeyCreateResponse.JSON_PROPERTY_ACTIVE,
  ApiKeyCreateResponse.JSON_PROPERTY_CREATED_AT,
  ApiKeyCreateResponse.JSON_PROPERTY_UPDATED_AT,
  ApiKeyCreateResponse.JSON_PROPERTY_DEACTIVATED_AT,
  ApiKeyCreateResponse.JSON_PROPERTY_DESCRIPTION,
  ApiKeyCreateResponse.JSON_PROPERTY_ID,
  ApiKeyCreateResponse.JSON_PROPERTY_LIVEMODE,
  ApiKeyCreateResponse.JSON_PROPERTY_DELETED,
  ApiKeyCreateResponse.JSON_PROPERTY_OBJECT,
  ApiKeyCreateResponse.JSON_PROPERTY_PREFIX,
  ApiKeyCreateResponse.JSON_PROPERTY_ROLE,
  ApiKeyCreateResponse.JSON_PROPERTY_AUTHENTICATION_TOKEN
})
@JsonTypeName("api_key_create_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ApiKeyCreateResponse {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public static final String JSON_PROPERTY_DEACTIVATED_AT = "deactivated_at";
  private Long deactivatedAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_AUTHENTICATION_TOKEN = "authentication_token";
  private String authenticationToken;

  public ApiKeyCreateResponse() { 
  }

  public ApiKeyCreateResponse active(Boolean active) {
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


  public ApiKeyCreateResponse createdAt(Long createdAt) {
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


  public ApiKeyCreateResponse updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Unix timestamp in seconds of when the api key was last updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ApiKeyCreateResponse deactivatedAt(Long deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
    return this;
  }

   /**
   * Unix timestamp in seconds of when the api key was deleted
   * @return deactivatedAt
  **/
  @javax.annotation.Nullable
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


  public ApiKeyCreateResponse description(String description) {
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


  public ApiKeyCreateResponse id(String id) {
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


  public ApiKeyCreateResponse livemode(Boolean livemode) {
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


  public ApiKeyCreateResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Indicates if the api key was deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
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


  public ApiKeyCreateResponse _object(String _object) {
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


  public ApiKeyCreateResponse prefix(String prefix) {
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


  public ApiKeyCreateResponse role(String role) {
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


  public ApiKeyCreateResponse authenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
    return this;
  }

   /**
   * It is occupied as a user when authenticated with basic authentication, with a blank password. This value will only appear once, in the request to create a new key. Copy and save it in a safe place.
   * @return authenticationToken
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticationToken() {
    return authenticationToken;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
  }


  /**
   * Return true if this api_key_create_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyCreateResponse apiKeyCreateResponse = (ApiKeyCreateResponse) o;
    return Objects.equals(this.active, apiKeyCreateResponse.active) &&
        Objects.equals(this.createdAt, apiKeyCreateResponse.createdAt) &&
        Objects.equals(this.updatedAt, apiKeyCreateResponse.updatedAt) &&
        Objects.equals(this.deactivatedAt, apiKeyCreateResponse.deactivatedAt) &&
        Objects.equals(this.description, apiKeyCreateResponse.description) &&
        Objects.equals(this.id, apiKeyCreateResponse.id) &&
        Objects.equals(this.livemode, apiKeyCreateResponse.livemode) &&
        Objects.equals(this.deleted, apiKeyCreateResponse.deleted) &&
        Objects.equals(this._object, apiKeyCreateResponse._object) &&
        Objects.equals(this.prefix, apiKeyCreateResponse.prefix) &&
        Objects.equals(this.role, apiKeyCreateResponse.role) &&
        Objects.equals(this.authenticationToken, apiKeyCreateResponse.authenticationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, createdAt, updatedAt, deactivatedAt, description, id, livemode, deleted, _object, prefix, role, authenticationToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyCreateResponse {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deactivatedAt: ").append(toIndentedString(deactivatedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    authenticationToken: ").append(toIndentedString(authenticationToken)).append("\n");
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

