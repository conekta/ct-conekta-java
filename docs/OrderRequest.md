

# OrderRequest

a order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**charges** | [**List&lt;ChargeRequest&gt;**](ChargeRequest.md) | List of [charges](https://developers.conekta.com/v2.3.0/reference/orderscreatecharge) that are applied to the order |  [optional] |
|**checkout** | [**OrderCheckoutRequest**](OrderCheckoutRequest.md) |  |  [optional] |
|**currency** | **String** | Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) |  |
|**customerInfo** | [**OrderRequestCustomerInfo**](OrderRequestCustomerInfo.md) |  |  |
|**discountLines** | [**List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of [discounts](https://developers.conekta.com/v2.3.0/reference/orderscreatediscountline) that are applied to the order. |  [optional] |
|**fiscalEntity** | [**OrderFiscalEntityRequest**](OrderFiscalEntityRequest.md) |  |  [optional] |
|**lineItems** | [**List&lt;Product&gt;**](Product.md) | List of [products](https://developers.conekta.com/v2.3.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product. |  |
|**metadata** | [**Map&lt;String, OrderTaxRequestMetadataValue&gt;**](OrderTaxRequestMetadataValue.md) | Metadata associated with the order. Values must be scalar (string of at most 249 characters, integer, number or boolean); nested objects and arrays are not supported. |  [optional] |
|**needsShippingContact** | **Boolean** | Allows you to fill out the shipping information at checkout |  [optional] |
|**preAuthorize** | **Boolean** | Indicates whether the order charges must be preauthorized |  [optional] |
|**processingMode** | **String** | Indicates the processing mode for the order, either ecommerce, recurrent or validation. |  [optional] |
|**returnUrl** | **URI** | Indicates the redirection callback upon completion of the 3DS2 flow. Do not use this parameter if your order has a checkout parameter |  [optional] |
|**reuseCustomerCashReference** | **Boolean** | Reuses the customer&#39;s recurrent cash reference (&#x60;cash_recurrent&#x60; payment source) in the order&#39;s cash charges instead of generating a new reference. Requires &#x60;customer_info.customer_id&#x60;. |  [optional] |
|**reuseCustomerClabe** | **Boolean** | Reuses the customer&#39;s recurrent SPEI CLABE (&#x60;spei_recurrent&#x60; payment source) in the order&#39;s SPEI charges instead of generating a new CLABE. Requires &#x60;customer_info.customer_id&#x60;. |  [optional] |
|**shippingContact** | [**CustomerShippingContactsRequest**](CustomerShippingContactsRequest.md) |  |  [optional] |
|**shippingLines** | [**List&lt;ShippingRequest&gt;**](ShippingRequest.md) | List of [shipping costs](https://developers.conekta.com/v2.3.0/reference/orderscreateshipping). If the online store offers digital products. |  [optional] |
|**taxLines** | [**List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) | List of [taxes](https://developers.conekta.com/v2.3.0/reference/orderscreatetaxes) that are applied to the order. |  [optional] |
|**threeDsMode** | [**ThreeDsModeEnum**](#ThreeDsModeEnum) | Indicates the 3DS2 mode: &#39;strict&#39;, &#39;not_strict&#39; or &#39;smart&#39;. The value is validated against the allowed set on creation; sending an explicit null is rejected. Omit the field to create the order without requesting 3DS through the API (company-level 3DS applies only to orders paid through Checkout or when antifraud forces 3DS). |  [optional] |



## Enum: ThreeDsModeEnum

| Name | Value |
|---- | -----|
| STRICT | &quot;strict&quot; |
| NOT_STRICT | &quot;not_strict&quot; |
| SMART | &quot;smart&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



