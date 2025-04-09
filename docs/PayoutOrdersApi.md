# PayoutOrdersApi

All URIs are relative to *https://api.conekta.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelPayoutOrderById**](PayoutOrdersApi.md#cancelPayoutOrderById) | **PUT** /payout_orders/{id}/cancel | Cancel Payout Order |
| [**createPayoutOrder**](PayoutOrdersApi.md#createPayoutOrder) | **POST** /payout_orders | Create payout order |
| [**getPayoutOrderById**](PayoutOrdersApi.md#getPayoutOrderById) | **GET** /payout_orders/{id} | Get Payout Order |
| [**getPayoutOrders**](PayoutOrdersApi.md#getPayoutOrders) | **GET** /payout_orders | Get a list of Payout Orders |



## cancelPayoutOrderById

> PayoutOrderResponse cancelPayoutOrderById(id, acceptLanguage)

Cancel Payout Order

Cancel a payout Order resource that corresponds to a payout order ID.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.PayoutOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PayoutOrdersApi apiInstance = new PayoutOrdersApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            PayoutOrderResponse result = apiInstance.cancelPayoutOrderById(id, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutOrdersApi#cancelPayoutOrderById");
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

[**PayoutOrderResponse**](PayoutOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## createPayoutOrder

> PayoutOrderResponse createPayoutOrder(payoutOrder, acceptLanguage)

Create payout order

Create a new payout order.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.PayoutOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PayoutOrdersApi apiInstance = new PayoutOrdersApi(defaultClient);
        PayoutOrder payoutOrder = new PayoutOrder(); // PayoutOrder | requested field for payout order
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            PayoutOrderResponse result = apiInstance.createPayoutOrder(payoutOrder, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutOrdersApi#createPayoutOrder");
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
| **payoutOrder** | [**PayoutOrder**](PayoutOrder.md)| requested field for payout order | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |

### Return type

[**PayoutOrderResponse**](PayoutOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **422** | parameter validation error |  -  |
| **401** | authentication error |  -  |
| **402** | payment required error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## getPayoutOrderById

> PayoutOrderResponse getPayoutOrderById(id, acceptLanguage)

Get Payout Order

Gets a payout Order resource that corresponds to a payout order ID.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.PayoutOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PayoutOrdersApi apiInstance = new PayoutOrdersApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            PayoutOrderResponse result = apiInstance.getPayoutOrderById(id, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutOrdersApi#getPayoutOrderById");
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

[**PayoutOrderResponse**](PayoutOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## getPayoutOrders

> PayoutOrdersResponse getPayoutOrders(acceptLanguage, limit, search, next, previous)

Get a list of Payout Orders

Get Payout order details in the form of a list

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.PayoutOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PayoutOrdersApi apiInstance = new PayoutOrdersApi(defaultClient);
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
        String search = "search_example"; // String | General order search, e.g. by mail, reference etc.
        String next = "next_example"; // String | next page
        String previous = "previous_example"; // String | previous page
        try {
            PayoutOrdersResponse result = apiInstance.getPayoutOrders(acceptLanguage, limit, search, next, previous);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutOrdersApi#getPayoutOrders");
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
| **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20] |
| **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] |
| **next** | **String**| next page | [optional] |
| **previous** | **String**| previous page | [optional] |

### Return type

[**PayoutOrdersResponse**](PayoutOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication error |  -  |
| **500** | internal server error |  -  |

