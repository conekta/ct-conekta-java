

# ApplePaySessionRequest

Data required to validate an Apple Pay merchant session

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validationURL** | **URI** | Validation URL provided by Apple in the &#x60;onvalidatemerchant&#x60; event. Only Apple Pay gateway hosts are accepted: &#x60;https://apple-pay-gateway.apple.com&#x60; and &#x60;https://apple-pay-gateway-cert.apple.com&#x60;.  |  |
|**domain** | **String** | Fully qualified domain where the Apple Pay button is displayed, sent to Apple as the initiative context. It must be a domain previously registered with Conekta. When omitted, the domain configured for the account is used.  |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | Origin of the Apple Pay integration requesting the session. &#x60;external&#x60; uses the integrator credentials, any other value uses the merchant credentials.  |  [optional] |
|**companyId** | **String** | Apple Pay merchant identifier to validate the session with. When omitted, the merchant identifier configured for the account is used.  |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| INTERNAL | &quot;internal&quot; |
| EXTERNAL | &quot;external&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



