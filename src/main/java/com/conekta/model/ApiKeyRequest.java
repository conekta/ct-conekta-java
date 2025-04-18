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
 * ApiKeyRequest
 */
@JsonPropertyOrder({
  ApiKeyRequest.JSON_PROPERTY_DESCRIPTION,
  ApiKeyRequest.JSON_PROPERTY_ROLE
})
@JsonTypeName("api_key_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ApiKeyRequest {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public ApiKeyRequest() { 
  }

  public ApiKeyRequest description(String description) {
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


  public ApiKeyRequest role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(String role) {
    this.role = role;
  }


  /**
   * Return true if this api_key_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyRequest apiKeyRequest = (ApiKeyRequest) o;
    return Objects.equals(this.description, apiKeyRequest.description) &&
        Objects.equals(this.role, apiKeyRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

