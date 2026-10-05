

# ShippingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Long** | Shipping amount in cents |  |
|**carrier** | **String** | Carrier name for the shipment |  [optional] |
|**trackingNumber** | **String** | Tracking number can be used to track the shipment |  [optional] |
|**method** | **String** | Method of shipment |  [optional] |
|**metadata** | [**Map&lt;String, OrderTaxRequestMetadataValue&gt;**](OrderTaxRequestMetadataValue.md) | Hash where the user can send additional information for each &#39;shipping&#39;. Values must be scalar (string of at most 249 characters, integer, number or boolean); nested objects and arrays are not supported. |  [optional] |



