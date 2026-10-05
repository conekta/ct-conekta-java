

# MonthlyInstallmentsValidateRequest

BIN and amount to evaluate for interest-free monthly installments

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bin** | **String** | First 6 or 8 digits of the card number (Bank Identification Number). An 8 digit BIN that yields no match is retried with its first 6 digits. |  |
|**amount** | **Integer** | Amount to charge in the smallest currency unit (cents for MXN). Used to compute the monthly fee of each available plan. |  |



