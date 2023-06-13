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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;


/**
 * ProductDataResponse
 */
@JsonPropertyOrder({
  ProductDataResponse.JSON_PROPERTY_ANTIFRAUD_INFO,
  ProductDataResponse.JSON_PROPERTY_BRAND,
  ProductDataResponse.JSON_PROPERTY_DESCRIPTION,
  ProductDataResponse.JSON_PROPERTY_METADATA,
  ProductDataResponse.JSON_PROPERTY_NAME,
  ProductDataResponse.JSON_PROPERTY_QUANTITY,
  ProductDataResponse.JSON_PROPERTY_SKU,
  ProductDataResponse.JSON_PROPERTY_TAGS,
  ProductDataResponse.JSON_PROPERTY_UNIT_PRICE,
  ProductDataResponse.JSON_PROPERTY_ID,
  ProductDataResponse.JSON_PROPERTY_OBJECT,
  ProductDataResponse.JSON_PROPERTY_PARENT_ID
})
@JsonTypeName("product_data_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductDataResponse {
  public static final String JSON_PROPERTY_ANTIFRAUD_INFO = "antifraud_info";
  private Map<String, Object> antifraudInfo = new HashMap<>();

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Integer quantity;

  public static final String JSON_PROPERTY_SKU = "sku";
  private String sku;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags;

  public static final String JSON_PROPERTY_UNIT_PRICE = "unit_price";
  private Integer unitPrice;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public ProductDataResponse() { 
  }

  public ProductDataResponse antifraudInfo(Map<String, Object> antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
    return this;
  }

  public ProductDataResponse putAntifraudInfoItem(String key, Object antifraudInfoItem) {
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
  @jakarta.annotation.Nullable
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


  public ProductDataResponse brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the item.
   * @return brand
  **/
  @jakarta.annotation.Nullable
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


  public ProductDataResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description of the item
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


  public ProductDataResponse metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ProductDataResponse putMetadataItem(String key, String metadataItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public ProductDataResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the item. It will be displayed in the order.
   * @return name
  **/
  @jakarta.annotation.Nonnull
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


  public ProductDataResponse quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the item in the order.
   * minimum: 1
   * @return quantity
  **/
  @jakarta.annotation.Nonnull
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


  public ProductDataResponse sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The stock keeping unit for the item. It is used to identify the item in the order.
   * @return sku
  **/
  @jakarta.annotation.Nullable
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


  public ProductDataResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ProductDataResponse addTagsItem(String tagsItem) {
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
  @jakarta.annotation.Nullable
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


  public ProductDataResponse unitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The price of the item in cents.
   * minimum: 0
   * @return unitPrice
  **/
  @jakarta.annotation.Nonnull
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


  public ProductDataResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public ProductDataResponse _object(String _object) {
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


  public ProductDataResponse parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this product_data_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDataResponse productDataResponse = (ProductDataResponse) o;
    return Objects.equals(this.antifraudInfo, productDataResponse.antifraudInfo) &&
        Objects.equals(this.brand, productDataResponse.brand) &&
        Objects.equals(this.description, productDataResponse.description) &&
        Objects.equals(this.metadata, productDataResponse.metadata) &&
        Objects.equals(this.name, productDataResponse.name) &&
        Objects.equals(this.quantity, productDataResponse.quantity) &&
        Objects.equals(this.sku, productDataResponse.sku) &&
        Objects.equals(this.tags, productDataResponse.tags) &&
        Objects.equals(this.unitPrice, productDataResponse.unitPrice) &&
        Objects.equals(this.id, productDataResponse.id) &&
        Objects.equals(this._object, productDataResponse._object) &&
        Objects.equals(this.parentId, productDataResponse.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antifraudInfo, brand, description, metadata, name, quantity, sku, tags, unitPrice, id, _object, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDataResponse {\n");
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

