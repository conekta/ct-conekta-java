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
import com.conekta.model.EventResponse;
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
 * GetEventsResponse
 */
@JsonPropertyOrder({
  GetEventsResponse.JSON_PROPERTY_HAS_MORE,
  GetEventsResponse.JSON_PROPERTY_OBJECT,
  GetEventsResponse.JSON_PROPERTY_NEXT_PAGE_URL,
  GetEventsResponse.JSON_PROPERTY_PREVIOUS_PAGE_URL,
  GetEventsResponse.JSON_PROPERTY_DATA
})
@JsonTypeName("get_events_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetEventsResponse {
  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  private Boolean hasMore;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_NEXT_PAGE_URL = "next_page_url";
  private String nextPageUrl;

  public static final String JSON_PROPERTY_PREVIOUS_PAGE_URL = "previous_page_url";
  private String previousPageUrl;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<EventResponse> data;

  public GetEventsResponse() { 
  }

  public GetEventsResponse hasMore(Boolean hasMore) {
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


  public GetEventsResponse _object(String _object) {
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


  public GetEventsResponse nextPageUrl(String nextPageUrl) {
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


  public GetEventsResponse previousPageUrl(String previousPageUrl) {
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


  public GetEventsResponse data(List<EventResponse> data) {
    this.data = data;
    return this;
  }

  public GetEventsResponse addDataItem(EventResponse dataItem) {
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

  public List<EventResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<EventResponse> data) {
    this.data = data;
  }


  /**
   * Return true if this get_events_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEventsResponse getEventsResponse = (GetEventsResponse) o;
    return Objects.equals(this.hasMore, getEventsResponse.hasMore) &&
        Objects.equals(this._object, getEventsResponse._object) &&
        Objects.equals(this.nextPageUrl, getEventsResponse.nextPageUrl) &&
        Objects.equals(this.previousPageUrl, getEventsResponse.previousPageUrl) &&
        Objects.equals(this.data, getEventsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, _object, nextPageUrl, previousPageUrl, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEventsResponse {\n");
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

