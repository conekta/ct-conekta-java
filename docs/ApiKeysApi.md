# ApiKeysApi

All URIs are relative to *https://api.conekta.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApiKey**](ApiKeysApi.md#createApiKey) | **POST** /api_keys | Create Api Key |
| [**deleteApiKey**](ApiKeysApi.md#deleteApiKey) | **DELETE** /api_keys/{id} | Delete Api Key |
| [**getApiKey**](ApiKeysApi.md#getApiKey) | **GET** /api_keys/{id} | Get Api Key |
| [**getApiKeys**](ApiKeysApi.md#getApiKeys) | **GET** /api_keys | Get list of Api Keys |
| [**updateApiKey**](ApiKeysApi.md#updateApiKey) | **PUT** /api_keys/{id} | Update Api Key |



## createApiKey

> ApiKeyCreateResponse createApiKey(apiKeyRequest, acceptLanguage, xChildCompanyId)

Create Api Key

Create a api key

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        ApiKeyRequest apiKeyRequest = new ApiKeyRequest(); // ApiKeyRequest | requested field for a api keys
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            ApiKeyCreateResponse result = apiInstance.createApiKey(apiKeyRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#createApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKeyRequest** | [**ApiKeyRequest**](ApiKeyRequest.md)| requested field for a api keys | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**ApiKeyCreateResponse**](ApiKeyCreateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * Content-Type - The format of the response body <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## deleteApiKey

> DeleteApiKeysResponse deleteApiKey(id, acceptLanguage)

Delete Api Key

Deletes a api key that corresponds to a api key ID

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            DeleteApiKeysResponse result = apiInstance.deleteApiKey(id, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#deleteApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of the resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |

### Return type

[**DeleteApiKeysResponse**](DeleteApiKeysResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  * Content-Type - The format of the response body <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## getApiKey

> ApiKeyResponse getApiKey(id, acceptLanguage, xChildCompanyId)

Get Api Key

Gets a api key that corresponds to a api key ID

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            ApiKeyResponse result = apiInstance.getApiKey(id, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#getApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of the resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  * Content-Type - The format of the response body <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## getApiKeys

> GetApiKeysResponse getApiKeys(acceptLanguage, xChildCompanyId, limit, next, previous, search)

Get list of Api Keys

Consume the list of api keys you have

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
        String next = "next_example"; // String | next page
        String previous = "previous_example"; // String | previous page
        String search = "search_example"; // String | General search, e.g. by id, description, prefix
        try {
            GetApiKeysResponse result = apiInstance.getApiKeys(acceptLanguage, xChildCompanyId, limit, next, previous, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#getApiKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |
| **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20] |
| **next** | **String**| next page | [optional] |
| **previous** | **String**| previous page | [optional] |
| **search** | **String**| General search, e.g. by id, description, prefix | [optional] |

### Return type

[**GetApiKeysResponse**](GetApiKeysResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  * Content-Type - The format of the response body <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **500** | internal server error |  -  |


## updateApiKey

> ApiKeyResponse updateApiKey(id, acceptLanguage, apiKeyUpdateRequest)

Update Api Key

Update an existing api key

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        ApiKeyUpdateRequest apiKeyUpdateRequest = new ApiKeyUpdateRequest(); // ApiKeyUpdateRequest | 
        try {
            ApiKeyResponse result = apiInstance.updateApiKey(id, acceptLanguage, apiKeyUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#updateApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of the resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **apiKeyUpdateRequest** | [**ApiKeyUpdateRequest**](ApiKeyUpdateRequest.md)|  | [optional] |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **404** | not found entity |  -  |
| **401** | authentication error |  -  |
| **500** | internal server error |  -  |

