

# PayoutOrderRequest

a payout order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedPayoutMethods** | **List&lt;String&gt;** | The payout methods that are allowed for the payout order. |  |
|**amount** | **Long** | The amount of the payout order. |  |
|**currency** | **String** | The currency in which the payout order is made. |  |
|**customerInfo** | [**PayoutOrderRequestCustomerInfo**](PayoutOrderRequestCustomerInfo.md) |  |  |
|**expiresAt** | **Long** | The expiration time of the payout order in Unix timestamp. |  |
|**metadata** |  | The metadata of the payout order. |  [optional] |
|**payout** | [**Payout**](Payout.md) |  |  |
|**reason** | **String** | The reason for the payout order. |  |



