

# CustomerResponse

customer response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antifraudInfo** | [**CustomerAntifraudInfoResponse**](CustomerAntifraudInfoResponse.md) |  |  [optional] |
|**corporate** | **Boolean** | true if the customer is a company |  [optional] |
|**createdAt** | **Long** | Creation date of the object |  |
|**customReference** | **String** | Custom reference |  [optional] |
|**dateOfBirth** | **String** | It is a parameter that allows to identify the date of birth of the client. |  [optional] |
|**defaultFiscalEntityId** | **String** |  |  [optional] |
|**defaultShippingContactId** | **String** |  |  [optional] |
|**defaultPaymentSourceId** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**fiscalEntities** | [**CustomerFiscalEntitiesResponse**](CustomerFiscalEntitiesResponse.md) |  |  [optional] |
|**id** | **String** | Customer&#39;s ID |  |
|**livemode** | **Boolean** | true if the object exists in live mode or the value false if the object exists in test mode |  |
|**name** | **String** | Customer&#39;s name |  |
|**nationalId** | **String** | It is a parameter that allows to identify the national identification number of the client. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**_object** | **String** |  |  |
|**paymentSources** | [**CustomerPaymentMethodsResponse**](CustomerPaymentMethodsResponse.md) |  |  [optional] |
|**phone** | **String** | Customer&#39;s phone number |  [optional] |
|**shippingContacts** | [**CustomerResponseShippingContacts**](CustomerResponseShippingContacts.md) |  |  [optional] |
|**subscription** | [**SubscriptionResponse**](SubscriptionResponse.md) |  |  [optional] |



