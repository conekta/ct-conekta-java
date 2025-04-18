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
 * DetailsError
 */
@JsonPropertyOrder({
  DetailsError.JSON_PROPERTY_CODE,
  DetailsError.JSON_PROPERTY_PARAM,
  DetailsError.JSON_PROPERTY_MESSAGE,
  DetailsError.JSON_PROPERTY_DEBUG_MESSAGE
})
@JsonTypeName("details_error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class DetailsError {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_PARAM = "param";
  private String param;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_DEBUG_MESSAGE = "debug_message";
  private String debugMessage;

  public DetailsError() { 
  }

  public DetailsError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public DetailsError param(String param) {
    this.param = param;
    return this;
  }

   /**
   * Get param
   * @return param
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParam() {
    return param;
  }


  @JsonProperty(JSON_PROPERTY_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParam(String param) {
    this.param = param;
  }


  public DetailsError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public DetailsError debugMessage(String debugMessage) {
    this.debugMessage = debugMessage;
    return this;
  }

   /**
   * Get debugMessage
   * @return debugMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEBUG_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDebugMessage() {
    return debugMessage;
  }


  @JsonProperty(JSON_PROPERTY_DEBUG_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebugMessage(String debugMessage) {
    this.debugMessage = debugMessage;
  }


  /**
   * Return true if this details_error object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailsError detailsError = (DetailsError) o;
    return Objects.equals(this.code, detailsError.code) &&
        Objects.equals(this.param, detailsError.param) &&
        Objects.equals(this.message, detailsError.message) &&
        Objects.equals(this.debugMessage, detailsError.debugMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, param, message, debugMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailsError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    debugMessage: ").append(toIndentedString(debugMessage)).append("\n");
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

