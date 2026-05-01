

# OrderResponseCheckout


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedPaymentMethods** | **List&lt;String&gt;** | Are the payment methods available for this link |  |
|**canNotExpire** | **Boolean** |  |  [optional] |
|**emailsSent** | **Integer** |  |  [optional] |
|**excludeCardNetworks** | [**List&lt;ExcludeCardNetworksEnum&gt;**](#List&lt;ExcludeCardNetworksEnum&gt;) |  |  [optional] |
|**expiresAt** | **Long** |  |  [optional] |
|**failureUrl** | **String** |  |  [optional] |
|**force3dsFlow** | **Boolean** |  |  [optional] |
|**id** | **String** |  |  |
|**isRedirectOnFailure** | **Boolean** |  |  [optional] |
|**livemode** | **Boolean** |  |  [optional] |
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
|**successUrl** | **String** | Redirection url back to the site in case of successful payment, applies only to HostedPayment |  [optional] |
|**startsAt** | **Integer** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**type** | **String** | This field represents the type of checkout, which determines the user experience during the payment process. &#39;HostedPayment&#39; will redirect the customer to a Conekta-hosted page to complete the payment, while &#39;Integration&#39; allows the payment process to be handled entirely on your site using Conekta&#39;s APIs and SDKs. |  |
|**url** | **String** | Indicate the url of the Conekta component to complete the payment. For HostedPayment, this will be a Conekta-hosted page |  [optional] |



## Enum: List&lt;ExcludeCardNetworksEnum&gt;

| Name | Value |
|---- | -----|
| VISA | &quot;visa&quot; |
| MASTERCARD | &quot;mastercard&quot; |
| AMEX | &quot;amex&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



