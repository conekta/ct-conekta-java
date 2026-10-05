

# ChargebackEvidenceFileResponse

A file uploaded as evidence for a chargeback

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**evidenceType** | [**EvidenceTypeEnum**](#EvidenceTypeEnum) | The evidence type used for a chargeback file upload |  [optional] |
|**url** | **String** | Presigned download URL for the file. Only present when fetching a single file. |  [optional] |



## Enum: EvidenceTypeEnum

| Name | Value |
|---- | -----|
| CHARGE_INFORMATION | &quot;charge_information&quot; |
| CONTRACT | &quot;contract&quot; |
| OTHER_EVIDENCE | &quot;other_evidence&quot; |
| RECEIPT_OF_SHIPMENT | &quot;receipt_of_shipment&quot; |
| IDENTIFICATION | &quot;identification&quot; |
| ORDER_DETAILS | &quot;order_details&quot; |
| TERMS_AND_CONDITIONS | &quot;terms_and_conditions&quot; |
| CARDHOLDER_INFORMATION | &quot;cardholder_information&quot; |
| PROOF_INVALIDATE_CLAIM | &quot;proof_invalidate_claim&quot; |
| INTERNAL_VALIDATIONS | &quot;internal_validations&quot; |
| PROOF_OF_CANCELLATION | &quot;proof_of_cancellation&quot; |
| RECURRING_CONTRACT | &quot;recurring_contract&quot; |
| PROOF_OF_RETURN | &quot;proof_of_return&quot; |
| EXHIBIT_8 | &quot;exhibit_8&quot; |
| DUPLICATE_ANALYSIS | &quot;duplicate_analysis&quot; |
| FULL_EVIDENCE | &quot;full_evidence&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



