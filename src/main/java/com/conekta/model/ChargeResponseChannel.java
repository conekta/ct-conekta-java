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
 * ChargeResponseChannel
 */
@JsonPropertyOrder({
  ChargeResponseChannel.JSON_PROPERTY_SEGMENT,
  ChargeResponseChannel.JSON_PROPERTY_CHECKOUT_REQUEST_ID,
  ChargeResponseChannel.JSON_PROPERTY_CHECKOUT_REQUEST_TYPE,
  ChargeResponseChannel.JSON_PROPERTY_ID
})
@JsonTypeName("charge_response_channel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChargeResponseChannel {
  public static final String JSON_PROPERTY_SEGMENT = "segment";
  private String segment;

  public static final String JSON_PROPERTY_CHECKOUT_REQUEST_ID = "checkout_request_id";
  private String checkoutRequestId;

  public static final String JSON_PROPERTY_CHECKOUT_REQUEST_TYPE = "checkout_request_type";
  private String checkoutRequestType;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public ChargeResponseChannel() { 
  }

  public ChargeResponseChannel segment(String segment) {
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSegment() {
    return segment;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegment(String segment) {
    this.segment = segment;
  }


  public ChargeResponseChannel checkoutRequestId(String checkoutRequestId) {
    this.checkoutRequestId = checkoutRequestId;
    return this;
  }

   /**
   * Get checkoutRequestId
   * @return checkoutRequestId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutRequestId() {
    return checkoutRequestId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutRequestId(String checkoutRequestId) {
    this.checkoutRequestId = checkoutRequestId;
  }


  public ChargeResponseChannel checkoutRequestType(String checkoutRequestType) {
    this.checkoutRequestType = checkoutRequestType;
    return this;
  }

   /**
   * Get checkoutRequestType
   * @return checkoutRequestType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutRequestType() {
    return checkoutRequestType;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutRequestType(String checkoutRequestType) {
    this.checkoutRequestType = checkoutRequestType;
  }


  public ChargeResponseChannel id(String id) {
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


  /**
   * Return true if this charge_response_channel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeResponseChannel chargeResponseChannel = (ChargeResponseChannel) o;
    return Objects.equals(this.segment, chargeResponseChannel.segment) &&
        Objects.equals(this.checkoutRequestId, chargeResponseChannel.checkoutRequestId) &&
        Objects.equals(this.checkoutRequestType, chargeResponseChannel.checkoutRequestType) &&
        Objects.equals(this.id, chargeResponseChannel.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, checkoutRequestId, checkoutRequestType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeResponseChannel {\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    checkoutRequestId: ").append(toIndentedString(checkoutRequestId)).append("\n");
    sb.append("    checkoutRequestType: ").append(toIndentedString(checkoutRequestType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

