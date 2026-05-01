

# OrderCheckoutRequest

[Checkout](https://developers.conekta.com/v2.2.0/reference/payment-link) details 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedPaymentMethods** | [**List&lt;AllowedPaymentMethodsEnum&gt;**](#List&lt;AllowedPaymentMethodsEnum&gt;) | Are the payment methods available for this link. For subscriptions, only &#39;card&#39; is allowed due to the recurring nature of the payments. |  |
|**excludeCardNetworks** | [**List&lt;ExcludeCardNetworksEnum&gt;**](#List&lt;ExcludeCardNetworksEnum&gt;) | List of card networks to exclude from the checkout. This field is only applicable for card payments. |  [optional] |
|**planIds** | **List&lt;String&gt;** | List of plan IDs that will be available for subscription. This field is required for subscription payments. |  [optional] |
|**expiresAt** | **Long** | It is the time when the link will expire.  It is expressed in seconds since the Unix epoch. The valid range is from 5 minutes to 365 days from the creation date.  |  [optional] |
|**failureUrl** | **URI** | Redirection url back to the site in case of failed payment, applies only to HostedPayment. |  [optional] |
|**monthlyInstallmentsEnabled** | **Boolean** |  |  [optional] |
|**monthlyInstallmentsOptions** | **List&lt;Integer&gt;** |  |  [optional] |
|**maxFailedRetries** | **Integer** | Number of retries allowed before the checkout is marked as failed |  [optional] |
|**name** | **String** | Reason for payment |  [optional] |
|**onDemandEnabled** | **Boolean** |  |  [optional] |
|**redirectionTime** | **Integer** | number of seconds to wait before redirecting to the success_url |  [optional] |
|**successUrl** | **URI** | Redirection url back to the site in case of successful payment, applies only to HostedPayment |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Required. This field represents the type of checkout, which determines the user experience during the payment process. &#39;HostedPayment&#39; will redirect the customer to a Conekta-hosted page to complete the payment, while &#39;Integration&#39; allows the payment process to be handled entirely on your site using Conekta&#39;s APIs and SDKs. |  [optional] |



## Enum: List&lt;AllowedPaymentMethodsEnum&gt;

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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INTEGRATION | &quot;Integration&quot; |
| HOSTEDPAYMENT | &quot;HostedPayment&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



