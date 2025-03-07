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
import com.conekta.model.ChargeResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * GetChargesResponse
 */
@JsonPropertyOrder({
  GetChargesResponse.JSON_PROPERTY_HAS_MORE,
  GetChargesResponse.JSON_PROPERTY_OBJECT,
  GetChargesResponse.JSON_PROPERTY_NEXT_PAGE_URL,
  GetChargesResponse.JSON_PROPERTY_PREVIOUS_PAGE_URL,
  GetChargesResponse.JSON_PROPERTY_DATA
})
@JsonTypeName("get_charges_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class GetChargesResponse {
  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  @javax.annotation.Nonnull
  private Boolean hasMore;

  public static final String JSON_PROPERTY_OBJECT = "object";
  @javax.annotation.Nonnull
  private String _object;

  public static final String JSON_PROPERTY_NEXT_PAGE_URL = "next_page_url";
  @javax.annotation.Nullable
  private String nextPageUrl;

  public static final String JSON_PROPERTY_PREVIOUS_PAGE_URL = "previous_page_url";
  @javax.annotation.Nullable
  private String previousPageUrl;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private List<ChargeResponse> data = new ArrayList<>();

  public GetChargesResponse() { 
  }

  public GetChargesResponse hasMore(@javax.annotation.Nonnull Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Indicates if there are more pages to be requested
   * @return hasMore
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasMore() {
    return hasMore;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasMore(@javax.annotation.Nonnull Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public GetChargesResponse _object(@javax.annotation.Nonnull String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Object type, in this case is list
   * @return _object
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(@javax.annotation.Nonnull String _object) {
    this._object = _object;
  }


  public GetChargesResponse nextPageUrl(@javax.annotation.Nullable String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
    return this;
  }

  /**
   * URL of the next page.
   * @return nextPageUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPageUrl() {
    return nextPageUrl;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPageUrl(@javax.annotation.Nullable String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }


  public GetChargesResponse previousPageUrl(@javax.annotation.Nullable String previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
    return this;
  }

  /**
   * Url of the previous page.
   * @return previousPageUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreviousPageUrl() {
    return previousPageUrl;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousPageUrl(@javax.annotation.Nullable String previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
  }


  public GetChargesResponse data(@javax.annotation.Nullable List<ChargeResponse> data) {
    this.data = data;
    return this;
  }

  public GetChargesResponse addDataItem(ChargeResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChargeResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(@javax.annotation.Nullable List<ChargeResponse> data) {
    this.data = data;
  }


  /**
   * Return true if this get_charges_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChargesResponse getChargesResponse = (GetChargesResponse) o;
    return Objects.equals(this.hasMore, getChargesResponse.hasMore) &&
        Objects.equals(this._object, getChargesResponse._object) &&
        Objects.equals(this.nextPageUrl, getChargesResponse.nextPageUrl) &&
        Objects.equals(this.previousPageUrl, getChargesResponse.previousPageUrl) &&
        Objects.equals(this.data, getChargesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, _object, nextPageUrl, previousPageUrl, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChargesResponse {\n");
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

