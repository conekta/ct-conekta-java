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
import com.conekta.model.PlanResponse;
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
 * GetPlansResponse
 */
@JsonPropertyOrder({
  GetPlansResponse.JSON_PROPERTY_HAS_MORE,
  GetPlansResponse.JSON_PROPERTY_OBJECT,
  GetPlansResponse.JSON_PROPERTY_NEXT_PAGE_URL,
  GetPlansResponse.JSON_PROPERTY_PREVIOUS_PAGE_URL,
  GetPlansResponse.JSON_PROPERTY_DATA
})
@JsonTypeName("get_plans_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetPlansResponse {
  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  private Boolean hasMore;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_NEXT_PAGE_URL = "next_page_url";
  private String nextPageUrl;

  public static final String JSON_PROPERTY_PREVIOUS_PAGE_URL = "previous_page_url";
  private String previousPageUrl;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<PlanResponse> data;

  public GetPlansResponse() { 
  }

  public GetPlansResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Indicates if there are more pages to be requested
   * @return hasMore
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasMore() {
    return hasMore;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public GetPlansResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Object type, in this case is list
   * @return _object
  **/
  @jakarta.annotation.Nonnull
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


  public GetPlansResponse nextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
    return this;
  }

   /**
   * URL of the next page.
   * @return nextPageUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPageUrl() {
    return nextPageUrl;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }


  public GetPlansResponse previousPageUrl(String previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
    return this;
  }

   /**
   * Url of the previous page.
   * @return previousPageUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreviousPageUrl() {
    return previousPageUrl;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousPageUrl(String previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
  }


  public GetPlansResponse data(List<PlanResponse> data) {
    this.data = data;
    return this;
  }

  public GetPlansResponse addDataItem(PlanResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlanResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<PlanResponse> data) {
    this.data = data;
  }


  /**
   * Return true if this get_plans_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPlansResponse getPlansResponse = (GetPlansResponse) o;
    return Objects.equals(this.hasMore, getPlansResponse.hasMore) &&
        Objects.equals(this._object, getPlansResponse._object) &&
        Objects.equals(this.nextPageUrl, getPlansResponse.nextPageUrl) &&
        Objects.equals(this.previousPageUrl, getPlansResponse.previousPageUrl) &&
        Objects.equals(this.data, getPlansResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, _object, nextPageUrl, previousPageUrl, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPlansResponse {\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    nextPageUrl: ").append(toIndentedString(nextPageUrl)).append("\n");
    sb.append("    previousPageUrl: ").append(toIndentedString(previousPageUrl)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
