

# PaymentMethodBnplRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type of the payment method |  |
|**cancelUrl** | **String** | URL to redirect the customer after a canceled payment |  |
|**canNotExpire** | **Boolean** | Indicates if the payment method can not expire |  |
|**failureUrl** | **String** | URL to redirect the customer after a failed payment |  |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Product type of the payment method, use for the payment method to know the product type |  |
|**successUrl** | **String** | URL to redirect the customer after a successful payment |  |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| KLARNA_BNPL | &quot;klarna_bnpl&quot; |
| CREDITEA_BNPL | &quot;creditea_bnpl&quot; |



