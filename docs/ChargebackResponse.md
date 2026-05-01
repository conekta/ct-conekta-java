

# ChargebackResponse

Chargeback object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) |  |  [optional] |
|**note** | **String** |  |  [optional] |
|**followupStatus** | [**FollowupStatusEnum**](#FollowupStatusEnum) |  |  [optional] |
|**responseFromClient** | **String** |  |  [optional] |
|**files** | [**List&lt;ChargebackFileResponse&gt;**](ChargebackFileResponse.md) |  |  [optional] |
|**_object** | **String** |  |  [optional] |
|**chargeId** | **String** |  |  [optional] |
|**createdAt** | **Long** |  |  [optional] |
|**evidenceDueBy** | **Long** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WON | &quot;won&quot; |
| LOST | &quot;lost&quot; |
| ACTION_REQUIRED | &quot;action_required&quot; |
| PENDING_REVIEW | &quot;pending_review&quot; |
| UNDER_REVIEW | &quot;under_review&quot; |
| COVERED | &quot;covered&quot; |
| RT | &quot;rt&quot; |
| RT_SENT | &quot;rt_sent&quot; |
| REPRESENTED | &quot;represented&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| UNRECOGNIZED | &quot;unrecognized&quot; |
| UNAUTHORIZED | &quot;unauthorized&quot; |
| UNAUTHORIZED_BY_CLIENT | &quot;unauthorized_by_client&quot; |
| UNRECOGNIZED_LIKE_FRAUD | &quot;unrecognized_like_fraud&quot; |
| INSUFFICIENT_EVIDENCE | &quot;insufficient_evidence&quot; |
| ILLEGIBLE_EVIDENCE | &quot;illegible_evidence&quot; |
| GENERAL | &quot;general&quot; |
| LATE_EVIDENCE | &quot;late_evidence&quot; |
| INCORRECT_EXCHANGE | &quot;incorrect_exchange&quot; |
| FRAUDULENT_BUSINESS | &quot;fraudulent_business&quot; |
| BILLING | &quot;billing&quot; |
| TWICE_TRANSACTION | &quot;twice_transaction&quot; |
| TRANSACTION_NOT_REFUNDED | &quot;transaction_not_refunded&quot; |
| BANK_DOC_REQUEST | &quot;bank_doc_request&quot; |
| UNRECOGNIZED_PURCHASE | &quot;unrecognized_purchase&quot; |
| SUBSCRIPTION_CANCELED | &quot;subscription_canceled&quot; |
| COPY_OF_PURCHASE | &quot;copy_of_purchase&quot; |
| DIFFERENTS_AMOUNTS | &quot;differents_amounts&quot; |
| SUBSCRIPTION_NOT_REQUESTED | &quot;subscription_not_requested&quot; |
| DAMAGED_PRODUCTS | &quot;damaged_products&quot; |
| SHOW_DOCUMENTS | &quot;show_documents&quot; |
| DUPLICATE | &quot;duplicate&quot; |
| FRAUDULENT | &quot;fraudulent&quot; |
| SERVICE_CANCELED | &quot;service_canceled&quot; |
| PRODUCT_UNACCEPTABLE | &quot;product_unacceptable&quot; |
| PRODUCT_NOT_RECEIVED | &quot;product_not_received&quot; |
| INCORRECT_AMOUNT | &quot;incorrect_amount&quot; |
| CHIP_LIABILIATY_SHIFT | &quot;chip_liabiliaty_shift&quot; |
| CREDIT_NOT_PROCESSED | &quot;credit_not_processed&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: FollowupStatusEnum

| Name | Value |
|---- | -----|
| CUSTOMER_UNCONTACTED | &quot;customer_uncontacted&quot; |
| CUSTOMER_CONTACTED | &quot;customer_contacted&quot; |
| CUSTOMER_UNREACHABLE | &quot;customer_unreachable&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



