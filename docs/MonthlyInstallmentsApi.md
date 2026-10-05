# MonthlyInstallmentsApi

All URIs are relative to *https://api.conekta.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateMonthlyInstallments**](MonthlyInstallmentsApi.md#validateMonthlyInstallments) | **POST** /monthly_installments/validate | Validate Monthly Installments |



## validateMonthlyInstallments

> MonthlyInstallmentsValidateResponse validateMonthlyInstallments(monthlyInstallmentsValidateRequest, acceptLanguage)

Validate Monthly Installments

Returns the interest-free monthly installment plans available for a card BIN and an amount, so a checkout can offer only the plans a later charge will accept. Requires monthly installments to be enabled on the company.


### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.MonthlyInstallmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MonthlyInstallmentsApi apiInstance = new MonthlyInstallmentsApi(defaultClient);
        MonthlyInstallmentsValidateRequest monthlyInstallmentsValidateRequest = new MonthlyInstallmentsValidateRequest(); // MonthlyInstallmentsValidateRequest | requested field for monthly installments validate
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            MonthlyInstallmentsValidateResponse result = apiInstance.validateMonthlyInstallments(monthlyInstallmentsValidateRequest, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonthlyInstallmentsApi#validateMonthlyInstallments");
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
| **monthlyInstallmentsValidateRequest** | [**MonthlyInstallmentsValidateRequest**](MonthlyInstallmentsValidateRequest.md)| requested field for monthly installments validate | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |

### Return type

[**MonthlyInstallmentsValidateResponse**](MonthlyInstallmentsValidateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.3.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |

