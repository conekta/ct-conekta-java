

# PaymentMethodSetting

Enablement flags for a single payment method.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**admin** | **Boolean** | Indicates if the payment method is enabled by Conekta for the company. |  |
|**merchant** | **Boolean** | Indicates if the payment method is enabled by the merchant in its own settings. |  |
|**effective** | **Boolean** | Final state of the payment method. It is only true when both &#x60;admin&#x60; and &#x60;merchant&#x60; are enabled. |  |



