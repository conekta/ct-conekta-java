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
 * ApiKeyCreateResponseAllOf
 */
@JsonPropertyOrder({
  ApiKeyCreateResponseAllOf.JSON_PROPERTY_AUTHENTICATION_TOKEN
})
@JsonTypeName("api_key_create_response_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T11:12:04.718851-03:00[America/Argentina/Buenos_Aires]")
public class ApiKeyCreateResponseAllOf {
  public static final String JSON_PROPERTY_AUTHENTICATION_TOKEN = "authentication_token";
  private String authenticationToken;

  public ApiKeyCreateResponseAllOf() { 
  }

  public ApiKeyCreateResponseAllOf authenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
    return this;
  }

   /**
   * It is occupied as a user when authenticated with basic authentication, with a blank password. This value will only appear once, in the request to create a new key
   * @return authenticationToken
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this api_key_create_response_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyCreateResponseAllOf apiKeyCreateResponseAllOf = (ApiKeyCreateResponseAllOf) o;
    return Objects.equals(this.authenticationToken, apiKeyCreateResponseAllOf.authenticationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyCreateResponseAllOf {\n");
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

