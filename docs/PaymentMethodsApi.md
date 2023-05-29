# PaymentMethodsApi

All URIs are relative to *https://api.conekta.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomerPaymentMethods**](PaymentMethodsApi.md#createCustomerPaymentMethods) | **POST** /customers/{id}/payment_sources | Create Payment Method |
| [**deleteCustomerPaymentMethods**](PaymentMethodsApi.md#deleteCustomerPaymentMethods) | **DELETE** /customers/{id}/payment_sources/{payment_method_id} | Delete Payment Method |
| [**getCustomerPaymentMethods**](PaymentMethodsApi.md#getCustomerPaymentMethods) | **GET** /customers/{id}/payment_sources | Get Payment Methods |
| [**updateCustomerPaymentMethods**](PaymentMethodsApi.md#updateCustomerPaymentMethods) | **PUT** /customers/{id}/payment_sources/{payment_method_id} | Update Payment Method |



## createCustomerPaymentMethods

> CreateCustomerPaymentMethodsResponse createCustomerPaymentMethods(id, createCustomerPaymentMethodsRequest, acceptLanguage, xChildCompanyId)

Create Payment Method

Create a payment method for a customer.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.PaymentMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        CreateCustomerPaymentMethodsRequest createCustomerPaymentMethodsRequest = new CreateCustomerPaymentMethodsRequest(); // CreateCustomerPaymentMethodsRequest | requested field for customer payment methods
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            CreateCustomerPaymentMethodsResponse result = apiInstance.createCustomerPaymentMethods(id, createCustomerPaymentMethodsRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentMethodsApi#createCustomerPaymentMethods");
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
| **createCustomerPaymentMethodsRequest** | [**CreateCustomerPaymentMethodsRequest**](CreateCustomerPaymentMethodsRequest.md)| requested field for customer payment methods | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**CreateCustomerPaymentMethodsResponse**](CreateCustomerPaymentMethodsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## deleteCustomerPaymentMethods

> UpdateCustomerPaymentMethodsResponse deleteCustomerPaymentMethods(id, paymentMethodId, acceptLanguage, xChildCompanyId)

Delete Payment Method

Delete an existing payment method

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.PaymentMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String paymentMethodId = "src_2tQ974hSHcsdeSZHG"; // String | Identifier of the payment method
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            UpdateCustomerPaymentMethodsResponse result = apiInstance.deleteCustomerPaymentMethods(id, paymentMethodId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentMethodsApi#deleteCustomerPaymentMethods");
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
| **paymentMethodId** | **String**| Identifier of the payment method | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**UpdateCustomerPaymentMethodsResponse**](UpdateCustomerPaymentMethodsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## getCustomerPaymentMethods

> GetPaymentMethodResponse getCustomerPaymentMethods(id, acceptLanguage, xChildCompanyId, limit, next, previous, search)

Get Payment Methods

Get a list of Payment Methods

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.PaymentMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
        String next = "next_example"; // String | next page
        String previous = "previous_example"; // String | previous page
        String search = "search_example"; // String | General order search, e.g. by mail, reference etc.
        try {
            GetPaymentMethodResponse result = apiInstance.getCustomerPaymentMethods(id, acceptLanguage, xChildCompanyId, limit, next, previous, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentMethodsApi#getCustomerPaymentMethods");
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
| **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20] |
| **next** | **String**| next page | [optional] |
| **previous** | **String**| previous page | [optional] |
| **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] |

### Return type

[**GetPaymentMethodResponse**](GetPaymentMethodResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## updateCustomerPaymentMethods

> UpdateCustomerPaymentMethodsResponse updateCustomerPaymentMethods(id, paymentMethodId, updatePaymentMethods, acceptLanguage, xChildCompanyId)

Update Payment Method

Gets a payment Method that corresponds to a customer ID.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.PaymentMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PaymentMethodsApi apiInstance = new PaymentMethodsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String paymentMethodId = "src_2tQ974hSHcsdeSZHG"; // String | Identifier of the payment method
        UpdatePaymentMethods updatePaymentMethods = new UpdatePaymentMethods(); // UpdatePaymentMethods | requested field for customer payment methods
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            UpdateCustomerPaymentMethodsResponse result = apiInstance.updateCustomerPaymentMethods(id, paymentMethodId, updatePaymentMethods, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentMethodsApi#updateCustomerPaymentMethods");
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
| **paymentMethodId** | **String**| Identifier of the payment method | |
| **updatePaymentMethods** | [**UpdatePaymentMethods**](UpdatePaymentMethods.md)| requested field for customer payment methods | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**UpdateCustomerPaymentMethodsResponse**](UpdateCustomerPaymentMethodsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |

