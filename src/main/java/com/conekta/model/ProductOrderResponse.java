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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * ProductOrderResponse
 */
@JsonPropertyOrder({
  ProductOrderResponse.JSON_PROPERTY_ANTIFRAUD_INFO,
  ProductOrderResponse.JSON_PROPERTY_BRAND,
  ProductOrderResponse.JSON_PROPERTY_DESCRIPTION,
  ProductOrderResponse.JSON_PROPERTY_METADATA,
  ProductOrderResponse.JSON_PROPERTY_NAME,
  ProductOrderResponse.JSON_PROPERTY_QUANTITY,
  ProductOrderResponse.JSON_PROPERTY_SKU,
  ProductOrderResponse.JSON_PROPERTY_TAGS,
  ProductOrderResponse.JSON_PROPERTY_UNIT_PRICE,
  ProductOrderResponse.JSON_PROPERTY_ID,
  ProductOrderResponse.JSON_PROPERTY_OBJECT,
  ProductOrderResponse.JSON_PROPERTY_PARENT_ID
})
@JsonTypeName("product_order_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ProductOrderResponse {
  public static final String JSON_PROPERTY_ANTIFRAUD_INFO = "antifraud_info";
  private Map<String, Object> antifraudInfo = new HashMap<>();

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Integer quantity;

  public static final String JSON_PROPERTY_SKU = "sku";
  private String sku;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_UNIT_PRICE = "unit_price";
  private Integer unitPrice;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public ProductOrderResponse() { 
  }

  public ProductOrderResponse antifraudInfo(Map<String, Object> antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
    return this;
  }

  public ProductOrderResponse putAntifraudInfoItem(String key, Object antifraudInfoItem) {
    if (this.antifraudInfo == null) {
      this.antifraudInfo = new HashMap<>();
    }
    this.antifraudInfo.put(key, antifraudInfoItem);
    return this;
  }

   /**
   * Get antifraudInfo
   * @return antifraudInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTIFRAUD_INFO)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getAntifraudInfo() {
    return antifraudInfo;
  }


  @JsonProperty(JSON_PROPERTY_ANTIFRAUD_INFO)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntifraudInfo(Map<String, Object> antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
  }


  public ProductOrderResponse brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the item.
   * @return brand
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public ProductOrderResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description of the item
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


  public ProductOrderResponse metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ProductOrderResponse putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * It is a key/value hash that can hold custom fields. Maximum 100 elements and allows special characters.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public ProductOrderResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the item. It will be displayed in the order.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ProductOrderResponse quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the item in the order.
   * minimum: 1
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public ProductOrderResponse sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The stock keeping unit for the item. It is used to identify the item in the order.
   * @return sku
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSku() {
    return sku;
  }


  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSku(String sku) {
    this.sku = sku;
  }


  public ProductOrderResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ProductOrderResponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags for the item. It is used to identify the item in the order.
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public ProductOrderResponse unitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The price of the item in cents.
   * minimum: 0
   * @return unitPrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUnitPrice() {
    return unitPrice;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }


  public ProductOrderResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public ProductOrderResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
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


  public ProductOrderResponse parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  /**
   * Return true if this product_order_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOrderResponse productOrderResponse = (ProductOrderResponse) o;
    return Objects.equals(this.antifraudInfo, productOrderResponse.antifraudInfo) &&
        Objects.equals(this.brand, productOrderResponse.brand) &&
        Objects.equals(this.description, productOrderResponse.description) &&
        Objects.equals(this.metadata, productOrderResponse.metadata) &&
        Objects.equals(this.name, productOrderResponse.name) &&
        Objects.equals(this.quantity, productOrderResponse.quantity) &&
        Objects.equals(this.sku, productOrderResponse.sku) &&
        Objects.equals(this.tags, productOrderResponse.tags) &&
        Objects.equals(this.unitPrice, productOrderResponse.unitPrice) &&
        Objects.equals(this.id, productOrderResponse.id) &&
        Objects.equals(this._object, productOrderResponse._object) &&
        Objects.equals(this.parentId, productOrderResponse.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antifraudInfo, brand, description, metadata, name, quantity, sku, tags, unitPrice, id, _object, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderResponse {\n");
    sb.append("    antifraudInfo: ").append(toIndentedString(antifraudInfo)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

