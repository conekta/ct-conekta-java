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
import com.conekta.model.DetailsError;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * err model
 */
@JsonPropertyOrder({
  Error.JSON_PROPERTY_DETAILS,
  Error.JSON_PROPERTY_LOG_ID,
  Error.JSON_PROPERTY_TYPE,
  Error.JSON_PROPERTY_OBJECT
})
@JsonTypeName("error")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T11:12:04.718851-03:00[America/Argentina/Buenos_Aires]")
public class Error {
  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<DetailsError> details = new ArrayList<>();

  public static final String JSON_PROPERTY_LOG_ID = "log_id";
  private String logId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public Error() { 
  }

  public Error details(List<DetailsError> details) {
    this.details = details;
    return this;
  }

  public Error addDetailsItem(DetailsError detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DetailsError> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(List<DetailsError> details) {
    this.details = details;
  }


  public Error logId(String logId) {
    this.logId = logId;
    return this;
  }

   /**
   * log id
   * @return logId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogId() {
    return logId;
  }


  @JsonProperty(JSON_PROPERTY_LOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogId(String logId) {
    this.logId = logId;
  }


  public Error type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public Error _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(String _object) {
    this._object = _object;
  }


  /**
   * Return true if this error object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.details, error.details) &&
        Objects.equals(this.logId, error.logId) &&
        Objects.equals(this.type, error.type) &&
        Objects.equals(this._object, error._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, logId, type, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
