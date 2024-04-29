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
 * RiskRulesData
 */
@JsonPropertyOrder({
  RiskRulesData.JSON_PROPERTY_ID,
  RiskRulesData.JSON_PROPERTY_FIELD,
  RiskRulesData.JSON_PROPERTY_CREATED_AT,
  RiskRulesData.JSON_PROPERTY_VALUE,
  RiskRulesData.JSON_PROPERTY_IS_GLOBAL,
  RiskRulesData.JSON_PROPERTY_IS_TEST,
  RiskRulesData.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("risk_rules_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class RiskRulesData {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_IS_GLOBAL = "is_global";
  private Boolean isGlobal;

  public static final String JSON_PROPERTY_IS_TEST = "is_test";
  private Boolean isTest;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public RiskRulesData() { 
  }

  public RiskRulesData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * rule id
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


  public RiskRulesData field(String field) {
    this.field = field;
    return this;
  }

   /**
   * field to be used for the rule
   * @return field
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(String field) {
    this.field = field;
  }


  public RiskRulesData createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * rule creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public RiskRulesData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * value to be used for the rule
   * @return value
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public RiskRulesData isGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
    return this;
  }

   /**
   * if the rule is global
   * @return isGlobal
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsGlobal() {
    return isGlobal;
  }


  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }


  public RiskRulesData isTest(Boolean isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * if the rule is test
   * @return isTest
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsTest() {
    return isTest;
  }


  @JsonProperty(JSON_PROPERTY_IS_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }


  public RiskRulesData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of the rule
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this risk_rules_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskRulesData riskRulesData = (RiskRulesData) o;
    return Objects.equals(this.id, riskRulesData.id) &&
        Objects.equals(this.field, riskRulesData.field) &&
        Objects.equals(this.createdAt, riskRulesData.createdAt) &&
        Objects.equals(this.value, riskRulesData.value) &&
        Objects.equals(this.isGlobal, riskRulesData.isGlobal) &&
        Objects.equals(this.isTest, riskRulesData.isTest) &&
        Objects.equals(this.description, riskRulesData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, field, createdAt, value, isGlobal, isTest, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskRulesData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

