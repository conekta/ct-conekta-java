# SubscriptionsCustomerPortalApi

All URIs are relative to *https://api.conekta.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomerPortal**](SubscriptionsCustomerPortalApi.md#createCustomerPortal) | **POST** /subscriptions/{subscription_id}/customer_portal | Create customer portal |
| [**getCustomerPortal**](SubscriptionsCustomerPortalApi.md#getCustomerPortal) | **GET** /subscriptions/{subscription_id}/customer_portal | Get customer portal |



## createCustomerPortal

> CustomerPortalResponse createCustomerPortal(subscriptionId, acceptLanguage, xChildCompanyId)

Create customer portal

Creates a customer portal for a subscription. If a portal already exists, returns the existing one.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.SubscriptionsCustomerPortalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SubscriptionsCustomerPortalApi apiInstance = new SubscriptionsCustomerPortalApi(defaultClient);
        String subscriptionId = "sub_2tGzG1GxtDAZHEGPH"; // String | Identifier of the subscription resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            CustomerPortalResponse result = apiInstance.createCustomerPortal(subscriptionId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsCustomerPortalApi#createCustomerPortal");
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
| **subscriptionId** | **String**| Identifier of the subscription resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**CustomerPortalResponse**](CustomerPortalResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Customer portal created successfully |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **404** | not found entity |  -  |
| **401** | authentication error |  -  |
| **422** | parameter validation error |  -  |


## getCustomerPortal

> CustomerPortalResponse getCustomerPortal(subscriptionId, acceptLanguage, xChildCompanyId)

Get customer portal

Retrieves the customer portal for a subscription

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.SubscriptionsCustomerPortalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SubscriptionsCustomerPortalApi apiInstance = new SubscriptionsCustomerPortalApi(defaultClient);
        String subscriptionId = "sub_2tGzG1GxtDAZHEGPH"; // String | Identifier of the subscription resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            CustomerPortalResponse result = apiInstance.getCustomerPortal(subscriptionId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsCustomerPortalApi#getCustomerPortal");
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
| **subscriptionId** | **String**| Identifier of the subscription resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**CustomerPortalResponse**](CustomerPortalResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer portal retrieved successfully |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **404** | not found entity |  -  |
| **401** | authentication error |  -  |

