

# OrderResponseCheckout


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedPaymentMethods** | **List&lt;String&gt;** | Are the payment methods available for this link |  [optional] |
|**excludedPaymentMethods** | [**List&lt;ExcludedPaymentMethodsEnum&gt;**](#List&lt;ExcludedPaymentMethodsEnum&gt;) | Payment methods excluded from the checkout. This field is only returned when excluded_payment_methods is provided in the request. |  [optional] |
|**canNotExpire** | **Boolean** |  |  [optional] |
|**emailsSent** | **Integer** |  |  [optional] |
|**excludeCardNetworks** | [**List&lt;ExcludeCardNetworksEnum&gt;**](#List&lt;ExcludeCardNetworksEnum&gt;) |  |  [optional] |
|**expiresAt** | **Long** |  |  [optional] |
|**failureUrl** | **String** |  |  [optional] |
|**force3dsFlow** | **Boolean** |  |  [optional] |
|**forceSaveCard** | **Boolean** | Indicates whether the card used for the payment should be saved for future purchases. This field is only applicable for card payments. |  [optional] |
|**id** | **String** |  |  |
|**isRedirectOnFailure** | **Boolean** |  |  [optional] |
|**livemode** | **Boolean** |  |  |
|**maxFailedRetries** | **Integer** | Number of retries allowed before the checkout is marked as failed |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**monthlyInstallmentsEnabled** | **Boolean** |  |  [optional] |
|**monthlyInstallmentsOptions** | **List&lt;Integer&gt;** |  |  [optional] |
|**name** | **String** |  |  |
|**needsShippingContact** | **Boolean** |  |  [optional] |
|**_object** | **String** |  |  |
|**onDemandEnabled** | **Boolean** |  |  [optional] |
|**paidPaymentsCount** | **Integer** |  |  [optional] |
|**recurrent** | **Boolean** |  |  [optional] |
|**redirectionTime** | **Integer** | number of seconds to wait before redirecting to the success_url |  [optional] |
|**slug** | **String** |  |  [optional] |
|**smsSent** | **Integer** |  |  [optional] |
|**successUrl** | **URI** | Redirection url back to the site in case of successful payment, applies only to HostedPayment |  [optional] |
|**startsAt** | **Integer** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**type** | **String** | This field represents the type of checkout, which determines the user experience during the payment process. &#39;HostedPayment&#39; will redirect the customer to a Conekta-hosted page to complete the payment, while &#39;Integration&#39; allows the payment process to be handled entirely on your site using Conekta&#39;s APIs and SDKs. |  |
|**url** | **URI** | Indicate the url of the Conekta component to complete the payment. For HostedPayment, this will be a Conekta-hosted page |  [optional] |



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



