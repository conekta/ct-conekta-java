

# CheckoutResponse

checkout response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedPaymentMethods** | **List&lt;String&gt;** | Are the payment methods available for this link |  [optional] |
|**excludedPaymentMethods** | [**List&lt;ExcludedPaymentMethodsEnum&gt;**](#List&lt;ExcludedPaymentMethodsEnum&gt;) | Payment methods excluded from the checkout. This field is only returned when excluded_payment_methods is provided in the request. |  [optional] |
|**planIds** | **List&lt;String&gt;** | List of plan IDs that are available for subscription |  [optional] |
|**canNotExpire** | **Boolean** |  |  [optional] |
|**emailsSent** | **Integer** |  |  [optional] |
|**excludeCardNetworks** | [**List&lt;ExcludeCardNetworksEnum&gt;**](#List&lt;ExcludeCardNetworksEnum&gt;) |  |  [optional] |
|**expiresAt** | **Long** |  |  [optional] |
|**failureUrl** | **String** |  |  [optional] |
|**force3dsFlow** | **Boolean** |  |  [optional] |
|**id** | **String** |  |  |
|**livemode** | **Boolean** |  |  |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**monthlyInstallmentsEnabled** | **Boolean** |  |  [optional] |
|**monthlyInstallmentsOptions** | **List&lt;Integer&gt;** |  |  [optional] |
|**name** | **String** | Reason for charge |  |
|**needsShippingContact** | **Boolean** |  |  [optional] |
|**_object** | **String** |  |  |
|**paidPaymentsCount** | **Integer** |  |  [optional] |
|**paymentsLimitCount** | **Integer** |  |  [optional] |
|**recurrent** | **Boolean** |  |  [optional] |
|**slug** | **String** |  |  [optional] |
|**smsSent** | **Integer** |  |  [optional] |
|**startsAt** | **Integer** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**successUrl** | **String** | The URL to redirect to after a successful payment. |  [optional] |
|**type** | **String** |  |  [optional] |
|**url** | **URI** |  |  [optional] |



## Enum: List&lt;ExcludedPaymentMethodsEnum&gt;

| Name | Value |
|---- | -----|
| CASH | &quot;cash&quot; |
| CARD | &quot;card&quot; |
| BANK_TRANSFER | &quot;bank_transfer&quot; |
| BNPL | &quot;bnpl&quot; |
| PAY_BY_BANK | &quot;pay_by_bank&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: List&lt;ExcludeCardNetworksEnum&gt;

| Name | Value |
|---- | -----|
| VISA | &quot;visa&quot; |
| MASTERCARD | &quot;mastercard&quot; |
| AMEX | &quot;amex&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



