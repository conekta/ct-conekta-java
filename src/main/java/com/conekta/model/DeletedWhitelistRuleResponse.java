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
 * DeletedWhitelistRuleResponse
 */
@JsonPropertyOrder({
  DeletedWhitelistRuleResponse.JSON_PROPERTY_ID,
  DeletedWhitelistRuleResponse.JSON_PROPERTY_FIELD,
  DeletedWhitelistRuleResponse.JSON_PROPERTY_VALUE,
  DeletedWhitelistRuleResponse.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("deleted_whitelist_rule_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class DeletedWhitelistRuleResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public DeletedWhitelistRuleResponse() { 
  }

  public DeletedWhitelistRuleResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Whitelist rule id
   * @return id
  **/
  @jakarta.annotation.Nullable
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


  public DeletedWhitelistRuleResponse field(String field) {
    this.field = field;
    return this;
  }

   /**
   * field used for whitelists rule deleted
   * @return field
  **/
  @jakarta.annotation.Nullable
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


  public DeletedWhitelistRuleResponse value(String value) {
    this.value = value;
    return this;
  }

   /**
   * value used for whitelists rule deleted
   * @return value
  **/
  @jakarta.annotation.Nullable
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


  public DeletedWhitelistRuleResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * use an description for whitelisted rule
   * @return description
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this deleted_whitelist_rule_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedWhitelistRuleResponse deletedWhitelistRuleResponse = (DeletedWhitelistRuleResponse) o;
    return Objects.equals(this.id, deletedWhitelistRuleResponse.id) &&
        Objects.equals(this.field, deletedWhitelistRuleResponse.field) &&
        Objects.equals(this.value, deletedWhitelistRuleResponse.value) &&
        Objects.equals(this.description, deletedWhitelistRuleResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, field, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedWhitelistRuleResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

