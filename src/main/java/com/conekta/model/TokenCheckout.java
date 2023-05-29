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
 * TokenCheckout
 * @deprecated
 */
@Deprecated
@JsonPropertyOrder({
  TokenCheckout.JSON_PROPERTY_RETURNS_CONTROL_ON
})
@JsonTypeName("token_checkout")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class TokenCheckout {
  public static final String JSON_PROPERTY_RETURNS_CONTROL_ON = "returns_control_on";
  private String returnsControlOn;

  public TokenCheckout() { 
  }

  public TokenCheckout returnsControlOn(String returnsControlOn) {
    this.returnsControlOn = returnsControlOn;
    return this;
  }

   /**
   * It is a value that allows identifying the returns control on.
   * @return returnsControlOn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURNS_CONTROL_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReturnsControlOn() {
    return returnsControlOn;
  }


  @JsonProperty(JSON_PROPERTY_RETURNS_CONTROL_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnsControlOn(String returnsControlOn) {
    this.returnsControlOn = returnsControlOn;
  }


  /**
   * Return true if this token_checkout object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCheckout tokenCheckout = (TokenCheckout) o;
    return Objects.equals(this.returnsControlOn, tokenCheckout.returnsControlOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnsControlOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCheckout {\n");
    sb.append("    returnsControlOn: ").append(toIndentedString(returnsControlOn)).append("\n");
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

