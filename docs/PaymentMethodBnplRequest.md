

# PaymentMethodBnplRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type of the payment method |  |
|**cancelUrl** | **String** | Optional URL to redirect the customer after a canceled payment |  [optional] |
|**expiresAt** | **Long** | Optional expiry for the BNPL order, expressed in seconds since the Unix epoch. Defaults to one month from creation when omitted. |  [optional] |
|**failureUrl** | **String** | URL to redirect the customer after a failed payment |  |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Product type of the payment method, use for the payment method to know the product type |  |
|**successUrl** | **String** | URL to redirect the customer after a successful payment |  |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| APLAZO_BNPL | &quot;aplazo_bnpl&quot; |
| AZTECA_BNPL | &quot;azteca_bnpl&quot; |
| COPPEL_BNPL | &quot;coppel_bnpl&quot; |
| CREDITEA_BNPL | &quot;creditea_bnpl&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



