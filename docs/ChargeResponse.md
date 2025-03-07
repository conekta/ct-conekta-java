

# ChargeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** |  |  |
|**channel** | [**ChargeResponseChannel**](ChargeResponseChannel.md) |  |  [optional] |
|**createdAt** | **Long** |  |  |
|**currency** | **String** |  |  |
|**customerId** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**deviceFingerprint** | **String** |  |  [optional] |
|**failureCode** | **String** |  |  [optional] |
|**failureMessage** | **String** |  |  [optional] |
|**id** | **String** | Charge ID |  |
|**livemode** | **Boolean** | Whether the charge was made in live mode or not |  |
|**_object** | **String** |  |  |
|**orderId** | **String** | Order ID |  |
|**paidAt** | **Long** | Payment date |  [optional] |
|**paymentMethod** | [**ChargeResponsePaymentMethod**](ChargeResponsePaymentMethod.md) |  |  [optional] |
|**referenceId** | **String** | Reference ID of the charge |  [optional] |
|**refunds** | [**ChargeResponseRefunds**](ChargeResponseRefunds.md) |  |  [optional] |
|**status** | **String** | Charge status |  |



