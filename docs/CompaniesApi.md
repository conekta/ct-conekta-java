# CompaniesApi

All URIs are relative to *https://api.conekta.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompany**](CompaniesApi.md#createCompany) | **POST** /companies | Create Company |
| [**getCompanies**](CompaniesApi.md#getCompanies) | **GET** /companies | Get List of Companies |
| [**getCompany**](CompaniesApi.md#getCompany) | **GET** /companies/{id} | Get Company |
| [**getCompanyDocuments**](CompaniesApi.md#getCompanyDocuments) | **GET** /companies/{company_id}/documents | Get Company Documents |
| [**updateCompanyDocument**](CompaniesApi.md#updateCompanyDocument) | **PATCH** /companies/{company_id}/document | Update Company Document |
| [**uploadCompanyDocument**](CompaniesApi.md#uploadCompanyDocument) | **POST** /companies/{company_id}/document | Upload Company Document |



## createCompany

> CompanyResponse createCompany(createCompanyRequest)

Create Company

Create a new company.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        CreateCompanyRequest createCompanyRequest = new CreateCompanyRequest(); // CreateCompanyRequest | Company data
        try {
            CompanyResponse result = apiInstance.createCompany(createCompanyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#createCompany");
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
| **createCompanyRequest** | [**CreateCompanyRequest**](CreateCompanyRequest.md)| Company data | |

### Return type

[**CompanyResponse**](CompanyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Company created successfully |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **500** | internal server error |  -  |


## getCompanies

> GetCompaniesResponse getCompanies(acceptLanguage, limit, search, next, previous)

Get List of Companies

Consume the list of child companies.  This is used for holding companies with several child entities.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
        String search = "search_example"; // String | General order search, e.g. by mail, reference etc.
        String next = "next_example"; // String | next page
        String previous = "previous_example"; // String | previous page
        try {
            GetCompaniesResponse result = apiInstance.getCompanies(acceptLanguage, limit, search, next, previous);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#getCompanies");
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

[**GetCompaniesResponse**](GetCompaniesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **500** | internal server error |  -  |


## getCompany

> CompanyResponse getCompany(id, acceptLanguage)

Get Company

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            CompanyResponse result = apiInstance.getCompany(id, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#getCompany");
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

[**CompanyResponse**](CompanyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## getCompanyDocuments

> List&lt;CompanyDocumentResponse&gt; getCompanyDocuments(companyId, acceptLanguage)

Get Company Documents

Retrieve a list of documents associated with a specific company.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        String companyId = "6307a60c41de27127515a575"; // String | The unique identifier of the company.
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            List<CompanyDocumentResponse> result = apiInstance.getCompanyDocuments(companyId, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#getCompanyDocuments");
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
| **companyId** | **String**| The unique identifier of the company. | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |

### Return type

[**List&lt;CompanyDocumentResponse&gt;**](CompanyDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of documents for the company. |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## updateCompanyDocument

> CompanyDocumentResponse updateCompanyDocument(companyId, companyDocumentRequest, acceptLanguage)

Update Company Document

Updates an existing document associated with a specific company.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        String companyId = "6827206b1ec60400015eb09a"; // String | The unique identifier of the company.
        CompanyDocumentRequest companyDocumentRequest = new CompanyDocumentRequest(); // CompanyDocumentRequest | Document information to update.
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            CompanyDocumentResponse result = apiInstance.updateCompanyDocument(companyId, companyDocumentRequest, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#updateCompanyDocument");
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
| **companyId** | **String**| The unique identifier of the company. | |
| **companyDocumentRequest** | [**CompanyDocumentRequest**](CompanyDocumentRequest.md)| Document information to update. | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |

### Return type

[**CompanyDocumentResponse**](CompanyDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document updated successfully. |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## uploadCompanyDocument

> CompanyDocumentResponse uploadCompanyDocument(companyId, companyDocumentRequest, acceptLanguage)

Upload Company Document

Uploads a document associated with a specific company.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        String companyId = "6827206b1ec60400015eb09a"; // String | The unique identifier of the company.
        CompanyDocumentRequest companyDocumentRequest = new CompanyDocumentRequest(); // CompanyDocumentRequest | Document information to upload.
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            CompanyDocumentResponse result = apiInstance.uploadCompanyDocument(companyId, companyDocumentRequest, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#uploadCompanyDocument");
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
| **companyId** | **String**| The unique identifier of the company. | |
| **companyDocumentRequest** | [**CompanyDocumentRequest**](CompanyDocumentRequest.md)| Document information to upload. | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |

### Return type

[**CompanyDocumentResponse**](CompanyDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Document uploaded successfully. |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |

