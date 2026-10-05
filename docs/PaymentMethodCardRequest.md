

# PaymentMethodCardRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type of payment method |  |
|**cvc** | **String** | Card security code |  |
|**expMonth** | **String** | Card expiration month |  |
|**expYear** | **String** | Card expiration year |  |
|**name** | **String** | Cardholder name. Must include first and last name separated by a space; single-word names are rejected. Letters (including accented Latin characters), spaces, and the characters , . &#39; - are accepted; digits and other symbols are rejected. |  |
|**number** | **String** | Card number |  |
|**contractId** | **String** | Optional merchant-supplied identifier (exactly 10 characters) that links a card transaction to a recurring/subscription contract at the acquiring bank. Forwarded to the bank gateway and stored on the resulting charge. Accepted on creation only; ignored on update. Do not place sensitive bank data here — the value is returned in charge responses. |  [optional] |
|**customerIpAddress** | **String** | Optional field used to capture the customer&#39;s IP address for fraud prevention and security monitoring purposes |  [optional] |



