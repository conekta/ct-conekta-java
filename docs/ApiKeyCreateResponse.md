

# ApiKeyCreateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authenticationToken** | **String** | It is occupied as a user when authenticated with basic authentication, with a blank password. This value will only appear once, in the request to create a new key |  [optional] |
|**active** | **Boolean** | Indicates if the api key is active |  [optional] |
|**createdAt** | **Long** | Unix timestamp in seconds with the creation date of the api key |  [optional] |
|**description** | **String** | Detail of the use that will be given to the api key |  [optional] |
|**id** | **String** | Unique identifier of the api key |  [optional] |
|**livemode** | **Boolean** | Indicates if the api key is in live mode |  [optional] |
|**_object** | **String** | Object name, value is api_key |  [optional] |
|**prefix** | **String** | The first few characters of the authentication_token |  [optional] |
|**role** | **String** | Indicates the user account private&#x3D;owner or public&#x3D;public |  [optional] |



