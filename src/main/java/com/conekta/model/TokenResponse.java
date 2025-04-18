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
import com.conekta.model.TokenResponseCheckout;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * token response
 */
@JsonPropertyOrder({
  TokenResponse.JSON_PROPERTY_CHECKOUT,
  TokenResponse.JSON_PROPERTY_ID,
  TokenResponse.JSON_PROPERTY_LIVEMODE,
  TokenResponse.JSON_PROPERTY_OBJECT,
  TokenResponse.JSON_PROPERTY_USED
})
@JsonTypeName("token_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class TokenResponse {
  public static final String JSON_PROPERTY_CHECKOUT = "checkout";
  @Deprecated
  private TokenResponseCheckout checkout;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_USED = "used";
  private Boolean used;

  public TokenResponse() { 
  }

  @Deprecated
  public TokenResponse checkout(TokenResponseCheckout checkout) {
    this.checkout = checkout;
    return this;
  }

   /**
   * Get checkout
   * @return checkout
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenResponseCheckout getCheckout() {
    return checkout;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckout(TokenResponseCheckout checkout) {
    this.checkout = checkout;
  }


  public TokenResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the token generated by Conekta.
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public TokenResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Indicates whether the token is in live mode or test mode.
   * @return livemode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLivemode() {
    return livemode;
  }


  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }


  public TokenResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Indicates the type of object, in this case token
   * @return _object
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(String _object) {
    this._object = _object;
  }


  public TokenResponse used(Boolean used) {
    this.used = used;
    return this;
  }

   /**
   * Indicates if the token has been used
   * @return used
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUsed() {
    return used;
  }


  @JsonProperty(JSON_PROPERTY_USED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsed(Boolean used) {
    this.used = used;
  }


  /**
   * Return true if this token_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenResponse tokenResponse = (TokenResponse) o;
    return Objects.equals(this.checkout, tokenResponse.checkout) &&
        Objects.equals(this.id, tokenResponse.id) &&
        Objects.equals(this.livemode, tokenResponse.livemode) &&
        Objects.equals(this._object, tokenResponse._object) &&
        Objects.equals(this.used, tokenResponse.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkout, id, livemode, _object, used);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponse {\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

