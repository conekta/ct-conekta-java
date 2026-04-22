

# Checkout

It is a sub-resource of the Order model that can be stipulated in order to configure its corresponding checkout

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedPaymentMethods** | **List&lt;String&gt;** | Those are the payment methods that will be available for the link |  |
|**excludeCardNetworks** | [**List&lt;ExcludeCardNetworksEnum&gt;**](#List&lt;ExcludeCardNetworksEnum&gt;) | List of card networks to exclude from the checkout. This field is only applicable for card payments. |  [optional] |
|**expiresAt** | **Long** | It is the time when the link will expire.  It is expressed in seconds since the Unix epoch. The valid range is from 10 minutes to 365 days from the creation date.  |  |
|**monthlyInstallmentsEnabled** | **Boolean** | This flag allows you to specify if months without interest will be active. |  [optional] |
|**monthlyInstallmentsOptions** | **List&lt;Integer&gt;** | This field allows you to specify the number of months without interest. |  [optional] |
|**threeDsMode** | **String** | Indicates the 3DS2 mode for the order, either smart or strict. This property is only applicable when 3DS is enabled. When 3DS is disabled, this field should be null. |  [optional] |
|**name** | **String** | Reason for charge |  |
|**needsShippingContact** | **Boolean** | This flag allows you to fill in the shipping information at checkout. |  [optional] |
|**onDemandEnabled** | **Boolean** | This flag allows you to specify if the link will be on demand. |  [optional] |
|**planIds** | **List&lt;String&gt;** | It is a list of plan IDs that will be associated with the order. |  [optional] |
|**orderTemplate** | [**CheckoutOrderTemplate**](CheckoutOrderTemplate.md) |  |  |
|**paymentsLimitCount** | **Integer** | It is the number of payments that can be made through the link. |  [optional] |
|**successUrl** | **String** | The URL to redirect to after a successful payment. |  [optional] |
|**recurrent** | **Boolean** | false: single use. true: multiple payments |  |
|**type** | **String** | It is the type of link that will be created. It must be a valid type. |  |



## Enum: List&lt;ExcludeCardNetworksEnum&gt;

| Name | Value |
|---- | -----|
| VISA | &quot;visa&quot; |
| MASTERCARD | &quot;mastercard&quot; |
| AMEX | &quot;amex&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



