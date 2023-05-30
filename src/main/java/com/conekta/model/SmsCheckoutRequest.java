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
 * SmsCheckoutRequest
 */
@JsonPropertyOrder({
  SmsCheckoutRequest.JSON_PROPERTY_PHONENUMBER
})
@JsonTypeName("smsCheckout_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T11:12:04.718851-03:00[America/Argentina/Buenos_Aires]")
public class SmsCheckoutRequest {
  public static final String JSON_PROPERTY_PHONENUMBER = "phonenumber";
  private String phonenumber;

  public SmsCheckoutRequest() { 
  }

  public SmsCheckoutRequest phonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
    return this;
  }

   /**
   * Get phonenumber
   * @return phonenumber
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PHONENUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhonenumber() {
    return phonenumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONENUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }


  /**
   * Return true if this smsCheckout_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsCheckoutRequest smsCheckoutRequest = (SmsCheckoutRequest) o;
    return Objects.equals(this.phonenumber, smsCheckoutRequest.phonenumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phonenumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsCheckoutRequest {\n");
    sb.append("    phonenumber: ").append(toIndentedString(phonenumber)).append("\n");
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

