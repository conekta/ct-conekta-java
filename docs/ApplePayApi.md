# ApplePayApi

All URIs are relative to *https://api.conekta.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApplePaySession**](ApplePayApi.md#createApplePaySession) | **POST** /apple_pay/session | Create Apple Pay Session |



## createApplePaySession

> ApplePaySessionResponse createApplePaySession(applePaySessionRequest, acceptLanguage)

Create Apple Pay Session

Validate an Apple Pay merchant session using Conekta's Apple Pay certificates. Call this
endpoint from your backend with the `validationURL` received in the `onvalidatemerchant`
event and return the response to the browser to complete the merchant validation.

This endpoint does not require authentication, it is meant to be called during the Apple Pay
checkout flow.


### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.model.*;
import com.conekta.ApplePayApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");

        ApplePayApi apiInstance = new ApplePayApi(defaultClient);
        ApplePaySessionRequest applePaySessionRequest = new ApplePaySessionRequest(); // ApplePaySessionRequest | requested fields for creating an Apple Pay session
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            ApplePaySessionResponse result = apiInstance.createApplePaySession(applePaySessionRequest, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplePayApi#createApplePaySession");
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
| **applePaySessionRequest** | [**ApplePaySessionRequest**](ApplePaySessionRequest.md)| requested fields for creating an Apple Pay session | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |

### Return type

[**ApplePaySessionResponse**](ApplePaySessionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/vnd.conekta-v2.3.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The validated Apple Pay merchant session. |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |

