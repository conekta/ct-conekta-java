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
 * CreateRiskRulesData
 */
@JsonPropertyOrder({
  CreateRiskRulesData.JSON_PROPERTY_DESCRIPTION,
  CreateRiskRulesData.JSON_PROPERTY_FIELD,
  CreateRiskRulesData.JSON_PROPERTY_VALUE
})
@JsonTypeName("create_risk_rules_data")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class CreateRiskRulesData {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public CreateRiskRulesData() { 
  }

  public CreateRiskRulesData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the rule
   * @return description
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CreateRiskRulesData field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Field to be used for the rule
   * @return field
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setField(String field) {
    this.field = field;
  }


  public CreateRiskRulesData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value to be used for the rule
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this create_risk_rules_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRiskRulesData createRiskRulesData = (CreateRiskRulesData) o;
    return Objects.equals(this.description, createRiskRulesData.description) &&
        Objects.equals(this.field, createRiskRulesData.field) &&
        Objects.equals(this.value, createRiskRulesData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, field, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRiskRulesData {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

