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
 * a plan
 */
@JsonPropertyOrder({
  PlanRequest.JSON_PROPERTY_AMOUNT,
  PlanRequest.JSON_PROPERTY_CURRENCY,
  PlanRequest.JSON_PROPERTY_EXPIRY_COUNT,
  PlanRequest.JSON_PROPERTY_FREQUENCY,
  PlanRequest.JSON_PROPERTY_ID,
  PlanRequest.JSON_PROPERTY_INTERVAL,
  PlanRequest.JSON_PROPERTY_NAME,
  PlanRequest.JSON_PROPERTY_TRIAL_PERIOD_DAYS
})
@JsonTypeName("plan_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class PlanRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private Integer amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_EXPIRY_COUNT = "expiry_count";
  @javax.annotation.Nullable
  private Integer expiryCount;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  @javax.annotation.Nonnull
  private Integer frequency;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  /**
   * The interval of time between each charge.
   */
  public enum IntervalEnum {
    WEEK(String.valueOf("week")),
    
    HALF_MONTH(String.valueOf("half_month")),
    
    MONTH(String.valueOf("month")),
    
    YEAR(String.valueOf("year"));

    private String value;

    IntervalEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IntervalEnum fromValue(String value) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  @javax.annotation.Nonnull
  private IntervalEnum interval;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_TRIAL_PERIOD_DAYS = "trial_period_days";
  @javax.annotation.Nullable
  private Integer trialPeriodDays;

  public PlanRequest() { 
  }

  public PlanRequest amount(@javax.annotation.Nonnull Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount in cents that will be charged on the interval specified.
   * minimum: 1
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@javax.annotation.Nonnull Integer amount) {
    this.amount = amount;
  }


  public PlanRequest currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 4217 for currencies, for the Mexican peso it is MXN/USD
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public PlanRequest expiryCount(@javax.annotation.Nullable Integer expiryCount) {
    this.expiryCount = expiryCount;
    return this;
  }

  /**
   * Number of repetitions of the frequency NUMBER OF CHARGES TO BE MADE, considering the interval and frequency, this evolves over time, but is subject to the expiration count.
   * @return expiryCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiryCount() {
    return expiryCount;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryCount(@javax.annotation.Nullable Integer expiryCount) {
    this.expiryCount = expiryCount;
  }


  public PlanRequest frequency(@javax.annotation.Nonnull Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Frequency of the charge, which together with the interval, can be every 3 weeks, every 4 months, every 2 years, every 5 fortnights
   * minimum: 1
   * @return frequency
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(@javax.annotation.Nonnull Integer frequency) {
    this.frequency = frequency;
  }


  public PlanRequest id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * internal reference id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public PlanRequest interval(@javax.annotation.Nonnull IntervalEnum interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The interval of time between each charge.
   * @return interval
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IntervalEnum getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterval(@javax.annotation.Nonnull IntervalEnum interval) {
    this.interval = interval;
  }


  public PlanRequest name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the plan.
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public PlanRequest trialPeriodDays(@javax.annotation.Nullable Integer trialPeriodDays) {
    this.trialPeriodDays = trialPeriodDays;
    return this;
  }

  /**
   * The number of days the customer will have a free trial.
   * @return trialPeriodDays
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIAL_PERIOD_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTrialPeriodDays() {
    return trialPeriodDays;
  }


  @JsonProperty(JSON_PROPERTY_TRIAL_PERIOD_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrialPeriodDays(@javax.annotation.Nullable Integer trialPeriodDays) {
    this.trialPeriodDays = trialPeriodDays;
  }


  /**
   * Return true if this plan_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanRequest planRequest = (PlanRequest) o;
    return Objects.equals(this.amount, planRequest.amount) &&
        Objects.equals(this.currency, planRequest.currency) &&
        Objects.equals(this.expiryCount, planRequest.expiryCount) &&
        Objects.equals(this.frequency, planRequest.frequency) &&
        Objects.equals(this.id, planRequest.id) &&
        Objects.equals(this.interval, planRequest.interval) &&
        Objects.equals(this.name, planRequest.name) &&
        Objects.equals(this.trialPeriodDays, planRequest.trialPeriodDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, expiryCount, frequency, id, interval, name, trialPeriodDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    expiryCount: ").append(toIndentedString(expiryCount)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trialPeriodDays: ").append(toIndentedString(trialPeriodDays)).append("\n");
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

