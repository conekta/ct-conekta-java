

# ChargeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** |  |  [optional] |
|**channel** | [**ChargeResponseChannel**](ChargeResponseChannel.md) |  |  [optional] |
|**conektaAccountId** | **String** | Conekta account ID of the charge, if the charge was paid through a Conekta account. |  [optional] |
|**createdAt** | **Long** | Charge creation date, in seconds since the Unix epoch |  |
|**currency** | **String** | Currency of the charge, in ISO 4217 format |  |
|**customerId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**deviceFingerprint** | **String** |  |  [optional] |
|**failureCode** | **String** |  |  [optional] |
|**failureMessage** | **String** |  |  [optional] |
|**id** | **String** | Charge ID |  |
|**livemode** | **Boolean** | Whether the charge was made in live mode or not |  |
|**_object** | **String** |  |  |
|**orderId** | **String** | Order ID |  |
|**paidAt** | **Long** | charge Payment date |  [optional] |
|**paymentMethod** | [**ChargeResponsePaymentMethod**](ChargeResponsePaymentMethod.md) |  |  [optional] |
|**referenceId** | **String** | Reference ID of the charge |  [optional] |
|**refunds** | [**ChargeResponseRefunds**](ChargeResponseRefunds.md) |  |  [optional] |
|**chargeback** | [**ChargebackResponse**](ChargebackResponse.md) |  |  [optional] |
|**status** | **String** | Charge status |  |



