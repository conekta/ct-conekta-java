

# CustomerUpdateShippingContacts

[Shipping](https://developers.conekta.com/v2.2.0/reference/createcustomershippingcontacts) details, required in case of sending a shipping. If we do not receive a shipping_contact on the order, the default shipping_contact of the customer will be used.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phone** | **String** | Phone contact |  [optional] |
|**receiver** | **String** | Name of the person who will receive the order |  [optional] |
|**betweenStreets** | **String** | The street names between which the order will be delivered. |  [optional] |
|**address** | [**CustomerShippingContactsAddress**](CustomerShippingContactsAddress.md) |  |  [optional] |
|**parentId** | **String** |  |  [optional] |
|**_default** | **Boolean** |  |  [optional] |
|**deleted** | **Boolean** |  |  [optional] |



