# DiscountsApi

All URIs are relative to *https://api.conekta.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ordersCreateDiscountLine**](DiscountsApi.md#ordersCreateDiscountLine) | **POST** /orders/{id}/discount_lines | Create Discount |
| [**ordersDeleteDiscountLines**](DiscountsApi.md#ordersDeleteDiscountLines) | **DELETE** /orders/{id}/discount_lines/{discount_lines_id} | Delete Discount |
| [**ordersUpdateDiscountLines**](DiscountsApi.md#ordersUpdateDiscountLines) | **PUT** /orders/{id}/discount_lines/{discount_lines_id} | Update Discount |



## ordersCreateDiscountLine

> DiscountLinesResponse ordersCreateDiscountLine(id, orderDiscountLinesRequest, acceptLanguage, xChildCompanyId)

Create Discount

Create discount lines for an existing orden

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.DiscountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DiscountsApi apiInstance = new DiscountsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        OrderDiscountLinesRequest orderDiscountLinesRequest = new OrderDiscountLinesRequest(); // OrderDiscountLinesRequest | requested field for a discount lines
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            DiscountLinesResponse result = apiInstance.ordersCreateDiscountLine(id, orderDiscountLinesRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscountsApi#ordersCreateDiscountLine");
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
| **orderDiscountLinesRequest** | [**OrderDiscountLinesRequest**](OrderDiscountLinesRequest.md)| requested field for a discount lines | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## ordersDeleteDiscountLines

> DiscountLinesResponse ordersDeleteDiscountLines(id, discountLinesId, acceptLanguage, xChildCompanyId)

Delete Discount

Delete an existing discount lines for an existing orden

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.DiscountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DiscountsApi apiInstance = new DiscountsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String discountLinesId = "dis_lin_2tQ974hSHcsdeSZHG"; // String | identifier
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            DiscountLinesResponse result = apiInstance.ordersDeleteDiscountLines(id, discountLinesId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscountsApi#ordersDeleteDiscountLines");
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
| **discountLinesId** | **String**| identifier | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## ordersUpdateDiscountLines

> DiscountLinesResponse ordersUpdateDiscountLines(id, discountLinesId, updateOrderDiscountLinesRequest, acceptLanguage, xChildCompanyId)

Update Discount

Update an existing discount lines for an existing orden

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.DiscountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DiscountsApi apiInstance = new DiscountsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String discountLinesId = "dis_lin_2tQ974hSHcsdeSZHG"; // String | identifier
        UpdateOrderDiscountLinesRequest updateOrderDiscountLinesRequest = new UpdateOrderDiscountLinesRequest(); // UpdateOrderDiscountLinesRequest | requested field for a discount lines
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            DiscountLinesResponse result = apiInstance.ordersUpdateDiscountLines(id, discountLinesId, updateOrderDiscountLinesRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscountsApi#ordersUpdateDiscountLines");
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
| **discountLinesId** | **String**| identifier | |
| **updateOrderDiscountLinesRequest** | [**UpdateOrderDiscountLinesRequest**](UpdateOrderDiscountLinesRequest.md)| requested field for a discount lines | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |

