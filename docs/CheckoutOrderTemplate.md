

# CheckoutOrderTemplate

It maintains the attributes with which the order will be created when receiving a new payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | It is the currency in which the order will be created. It must be a valid ISO 4217 currency code. |  |
|**customerInfo** | [**CheckoutOrderTemplateCustomerInfo**](CheckoutOrderTemplateCustomerInfo.md) |  |  [optional] |
|**lineItems** | [**List&lt;Product&gt;**](Product.md) | They are the products to buy. Each contains the \&quot;unit price\&quot; and \&quot;quantity\&quot; parameters that are used to calculate the total amount of the order. |  |
|**metadata** | **Map&lt;String, Object&gt;** | It is a set of key-value pairs that you can attach to the order. It can be used to store additional information about the order in a structured format. |  [optional] |
|**taxLines** | [**List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) | List of [taxes](https://developers.conekta.com/v2.2.0/reference/orderscreatetaxes) that are applied to the order. |  [optional] |
|**discountLines** | [**List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of [discounts](https://developers.conekta.com/v2.2.0/reference/orderscreatediscountline) that are applied to the order. |  [optional] |



