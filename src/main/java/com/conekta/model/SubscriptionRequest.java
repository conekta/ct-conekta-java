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
 * It is a parameter that allows to identify in the response, the detailed content of the plans to which the client has subscribed
 */
@JsonPropertyOrder({
  SubscriptionRequest.JSON_PROPERTY_PLAN_ID,
  SubscriptionRequest.JSON_PROPERTY_CARD_ID,
  SubscriptionRequest.JSON_PROPERTY_TRIAL_END
})
@JsonTypeName("subscription_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionRequest {
  public static final String JSON_PROPERTY_PLAN_ID = "plan_id";
  private String planId;

  public static final String JSON_PROPERTY_CARD_ID = "card_id";
  private String cardId;

  public static final String JSON_PROPERTY_TRIAL_END = "trial_end";
  private Integer trialEnd;

  public SubscriptionRequest() { 
  }

  public SubscriptionRequest planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlanId() {
    return planId;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public SubscriptionRequest cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardId() {
    return cardId;
  }


  @JsonProperty(JSON_PROPERTY_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  public SubscriptionRequest trialEnd(Integer trialEnd) {
    this.trialEnd = trialEnd;
    return this;
  }

   /**
   * Get trialEnd
   * @return trialEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIAL_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTrialEnd() {
    return trialEnd;
  }


  @JsonProperty(JSON_PROPERTY_TRIAL_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrialEnd(Integer trialEnd) {
    this.trialEnd = trialEnd;
  }


  /**
   * Return true if this subscription_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRequest subscriptionRequest = (SubscriptionRequest) o;
    return Objects.equals(this.planId, subscriptionRequest.planId) &&
        Objects.equals(this.cardId, subscriptionRequest.cardId) &&
        Objects.equals(this.trialEnd, subscriptionRequest.trialEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, cardId, trialEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequest {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    trialEnd: ").append(toIndentedString(trialEnd)).append("\n");
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
