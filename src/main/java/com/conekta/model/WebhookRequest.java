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
 * a webhook
 */
@JsonPropertyOrder({
  WebhookRequest.JSON_PROPERTY_URL,
  WebhookRequest.JSON_PROPERTY_SYNCHRONOUS
})
@JsonTypeName("webhook_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookRequest {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_SYNCHRONOUS = "synchronous";
  private Boolean synchronous = false;

  public WebhookRequest() { 
  }

  public WebhookRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Here you must place the URL of your Webhook remember that you must program what you will do with the events received. Also do not forget to handle the HTTPS protocol for greater security.
   * @return url
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookRequest synchronous(Boolean synchronous) {
    this.synchronous = synchronous;
    return this;
  }

   /**
   * It is a value that allows to decide if the events will be synchronous or asynchronous. We recommend asynchronous &#x3D; false
   * @return synchronous
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSynchronous() {
    return synchronous;
  }


  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSynchronous(Boolean synchronous) {
    this.synchronous = synchronous;
  }


  /**
   * Return true if this webhook_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRequest webhookRequest = (WebhookRequest) o;
    return Objects.equals(this.url, webhookRequest.url) &&
        Objects.equals(this.synchronous, webhookRequest.synchronous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, synchronous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    synchronous: ").append(toIndentedString(synchronous)).append("\n");
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

