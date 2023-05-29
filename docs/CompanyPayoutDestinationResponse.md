

# CompanyPayoutDestinationResponse

Company payout destination model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The resource&#39;s type |  [optional] |
|**currency** | **String** | currency of the receiving account |  [optional] |
|**accountHolderName** | **String** | Name of the account holder |  [optional] |
|**bank** | **String** | Name of the bank |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the payout destination |  [optional] |
|**accountNumber** | **String** | Account number of the receiving account |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PAYOUT_DESTINATION | &quot;payout_destination&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BANK_ACCOUNT | &quot;bank_account&quot; |



