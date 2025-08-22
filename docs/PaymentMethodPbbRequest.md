

# PaymentMethodPbbRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type of the payment method |  |
|**expiresAt** | **Long** | Expiration date of the payment method, in Unix timestamp format |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Product type of the payment method, use for the payment method to know the product type |  |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| BBVA_PAY_BY_BANK | &quot;bbva_pay_by_bank&quot; |



