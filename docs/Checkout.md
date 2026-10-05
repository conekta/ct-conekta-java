

# Checkout

It is a sub-resource of the Order model that can be stipulated in order to configure its corresponding checkout

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedPaymentMethods** | **List&lt;String&gt;** | Those are the payment methods that will be available for the link. This field is mutually exclusive with excluded_payment_methods. |  [optional] |
|**excludedPaymentMethods** | [**List&lt;ExcludedPaymentMethodsEnum&gt;**](#List&lt;ExcludedPaymentMethodsEnum&gt;) | Payment methods to be excluded from the checkout. This field is mutually exclusive with allowed_payment_methods. |  [optional] |
|**excludeCardNetworks** | [**List&lt;ExcludeCardNetworksEnum&gt;**](#List&lt;ExcludeCardNetworksEnum&gt;) | List of card networks to exclude from the checkout. This field is only applicable for card payments. Accepted values: &#39;visa_master_card&#39; (a single token excluding both Visa and Mastercard) and &#39;amex&#39;. |  [optional] |
|**expiresAt** | **Long** | It is the time when the link will expire.  It is expressed in seconds since the Unix epoch. The valid range is from 5 minutes to 365 days from the creation date.  |  |
|**monthlyInstallmentsEnabled** | **Boolean** | This flag allows you to specify if months without interest will be active. |  [optional] |
|**monthlyInstallmentsOptions** | **List&lt;Integer&gt;** | This field allows you to specify the number of months without interest. |  [optional] |
|**threeDsMode** | [**ThreeDsModeEnum**](#ThreeDsModeEnum) | Indicates the 3DS2 mode: &#39;strict&#39;, &#39;not_strict&#39; or &#39;smart&#39;. To defer to the company-level 3DS configuration, omit the field (an explicit null is rejected on creation). |  [optional] |
|**name** | **String** | Reason for charge |  |
|**needsShippingContact** | **Boolean** | This flag allows you to fill in the shipping information at checkout. |  [optional] |
|**onDemandEnabled** | **Boolean** | This flag allows you to specify if the link will be on demand. |  [optional] |
|**planIds** | **List&lt;String&gt;** | It is a list of plan IDs that will be associated with the order. |  [optional] |
|**orderTemplate** | [**CheckoutOrderTemplate**](CheckoutOrderTemplate.md) |  |  |
|**paymentsLimitCount** | **Integer** | It is the number of payments that can be made through the link. |  [optional] |
|**redirectionTime** | **Integer** | It is the time in seconds that the checkout will wait before redirecting to the success_url. It must be greater than 0. |  [optional] |
|**successUrl** | **String** | The URL to redirect to after a successful payment. |  [optional] |
|**recurrent** | **Boolean** | false: single use. true: multiple payments |  |
|**type** | **String** | It is the type of link that will be created. It must be a valid type. |  |



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
| VISA_MASTER_CARD | &quot;visa_master_card&quot; |
| AMEX | &quot;amex&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ThreeDsModeEnum

| Name | Value |
|---- | -----|
| STRICT | &quot;strict&quot; |
| NOT_STRICT | &quot;not_strict&quot; |
| SMART | &quot;smart&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



