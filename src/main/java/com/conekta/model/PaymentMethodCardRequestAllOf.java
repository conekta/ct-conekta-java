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
 * PaymentMethodCardRequestAllOf
 */
@JsonPropertyOrder({
  PaymentMethodCardRequestAllOf.JSON_PROPERTY_TOKEN_ID
})
@JsonTypeName("payment_method_card_request_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodCardRequestAllOf {
  public static final String JSON_PROPERTY_TOKEN_ID = "token_id";
  private String tokenId;

  public PaymentMethodCardRequestAllOf() { 
  }

  public PaymentMethodCardRequestAllOf tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Token id that will be used to create a \&quot;card\&quot; type payment method. See the (subscriptions)[https://developers.conekta.com/v2.1.0/reference/createsubscription] tutorial for more information on how to tokenize cards.
   * @return tokenId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenId() {
    return tokenId;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  /**
   * Return true if this payment_method_card_request_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCardRequestAllOf paymentMethodCardRequestAllOf = (PaymentMethodCardRequestAllOf) o;
    return Objects.equals(this.tokenId, paymentMethodCardRequestAllOf.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCardRequestAllOf {\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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
