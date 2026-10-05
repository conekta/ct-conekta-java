

# ProductDataResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antifraudInfo** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**brand** | **String** | The brand of the item. |  [optional] |
|**description** | **String** | Short description of the item |  [optional] |
|**metadata** | [**Map&lt;String, OrderTaxRequestMetadataValue&gt;**](OrderTaxRequestMetadataValue.md) | It is a key/value hash that can hold custom fields. Maximum 100 elements. Values must be scalar (string of at most 249 characters, integer, number or boolean); nested objects and arrays are not supported. |  [optional] |
|**name** | **String** | The name of the item. It will be displayed in the order. |  |
|**quantity** | **Integer** | The quantity of the item in the order. |  |
|**sku** | **String** | The stock keeping unit for the item. It is used to identify the item in the order. |  [optional] |
|**tags** | **List&lt;String&gt;** | List of tags for the item. It is used to identify the item in the order. |  [optional] |
|**unitPrice** | **Integer** | The price of the item in cents. |  |
|**id** | **String** |  |  [optional] |
|**_object** | **String** |  |  [optional] |
|**parentId** | **String** |  |  [optional] |



