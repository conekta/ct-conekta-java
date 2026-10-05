# ChargebacksApi

All URIs are relative to *https://api.conekta.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getChargebackEvidenceTypes**](ChargebacksApi.md#getChargebackEvidenceTypes) | **GET** /charges/{charge_id}/chargebacks/{chargeback_id}/evidence-types | Get Chargeback Evidence Types |
| [**getChargebackFile**](ChargebacksApi.md#getChargebackFile) | **GET** /charges/{charge_id}/chargebacks/{chargeback_id}/files/{file_id} | Get Chargeback File |
| [**getChargebackFiles**](ChargebacksApi.md#getChargebackFiles) | **GET** /charges/{charge_id}/chargebacks/{chargeback_id}/files | Get Chargeback Files |
| [**uploadChargebackFilesBatch**](ChargebacksApi.md#uploadChargebackFilesBatch) | **POST** /charges/{charge_id}/chargebacks/{chargeback_id}/files/batch | Upload Chargeback Evidence Files (Batch) |



## getChargebackEvidenceTypes

> List&lt;ChargebackEvidenceTypeResponse&gt; getChargebackEvidenceTypes(chargeId, chargebackId, acceptLanguage, xChildCompanyId)

Get Chargeback Evidence Types

Retrieve the catalog of evidence types accepted for a chargeback, including which are mandatory and their allowed file formats.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.ChargebacksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
        String chargeId = "6966a06c044243000156c24d"; // String | Identifier of the charge resource
        String chargebackId = "chbk_2zPxWFUnGNLySoumn"; // String | Identifier of the chargeback resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            List<ChargebackEvidenceTypeResponse> result = apiInstance.getChargebackEvidenceTypes(chargeId, chargebackId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChargebacksApi#getChargebackEvidenceTypes");
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
| **chargeId** | **String**| Identifier of the charge resource | |
| **chargebackId** | **String**| Identifier of the chargeback resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**List&lt;ChargebackEvidenceTypeResponse&gt;**](ChargebackEvidenceTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.3.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of evidence types accepted for the chargeback. |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **400** | bad request |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## getChargebackFile

> ChargebackEvidenceFileResponse getChargebackFile(chargeId, chargebackId, fileId, acceptLanguage, xChildCompanyId)

Get Chargeback File

Retrieve the metadata and a presigned download URL for a single chargeback evidence file.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.ChargebacksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
        String chargeId = "6966a06c044243000156c24d"; // String | Identifier of the charge resource
        String chargebackId = "chbk_2zPxWFUnGNLySoumn"; // String | Identifier of the chargeback resource
        String fileId = "chbkf_2zPxWFUnGNLySoums"; // String | Identifier of the chargeback evidence file
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            ChargebackEvidenceFileResponse result = apiInstance.getChargebackFile(chargeId, chargebackId, fileId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChargebacksApi#getChargebackFile");
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
| **chargeId** | **String**| Identifier of the charge resource | |
| **chargebackId** | **String**| Identifier of the chargeback resource | |
| **fileId** | **String**| Identifier of the chargeback evidence file | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**ChargebackEvidenceFileResponse**](ChargebackEvidenceFileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.3.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested evidence file. |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **400** | bad request |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## getChargebackFiles

> List&lt;ChargebackEvidenceFileResponse&gt; getChargebackFiles(chargeId, chargebackId, acceptLanguage, xChildCompanyId)

Get Chargeback Files

Retrieve the list of evidence files uploaded for a chargeback.

### Example

```java
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.ChargebacksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
        String chargeId = "6966a06c044243000156c24d"; // String | Identifier of the charge resource
        String chargebackId = "chbk_2zPxWFUnGNLySoumn"; // String | Identifier of the chargeback resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            List<ChargebackEvidenceFileResponse> result = apiInstance.getChargebackFiles(chargeId, chargebackId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChargebacksApi#getChargebackFiles");
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
| **chargeId** | **String**| Identifier of the charge resource | |
| **chargebackId** | **String**| Identifier of the chargeback resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**List&lt;ChargebackEvidenceFileResponse&gt;**](ChargebackEvidenceFileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.3.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of evidence files for the chargeback. |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **400** | bad request |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## uploadChargebackFilesBatch

> ChargebackFilesBatchResponse uploadChargebackFilesBatch(chargeId, chargebackId, acceptLanguage, xChildCompanyId, chargeInformation, contract, otherEvidence, receiptOfShipment, identification, orderDetails, termsAndConditions, cardholderInformation, proofInvalidateClaim, internalValidations, proofOfCancellation, recurringContract, proofOfReturn, exhibit8, duplicateAnalysis, fullEvidence)

Upload Chargeback Evidence Files (Batch)

Uploads multiple evidence files for a chargeback in a single request. Each part of the multipart body must be keyed by an evidence type (see the evidence-types endpoint for the valid values for this chargeback), with exactly one file per evidence type. Limits: at most 10 files per request, at most 2MB per file, and only application/pdf, image/jpeg or image/png content is accepted. The chargeback must be in the `action_required` status, and none of the submitted evidence types may already exist on the chargeback. On success the chargeback transitions to `pending_review`.

### Example

```java
import java.io.File;
// Import classes:
import com.conekta.ApiClient;
import com.conekta.ApiException;
import com.conekta.Configuration;
import com.conekta.auth.*;
import com.conekta.model.*;
import com.conekta.ChargebacksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.conekta.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChargebacksApi apiInstance = new ChargebacksApi(defaultClient);
        String chargeId = "6966a06c044243000156c24d"; // String | Identifier of the charge resource
        String chargebackId = "chbk_2zPxWFUnGNLySoumn"; // String | Identifier of the chargeback resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        File chargeInformation = new File("/path/to/file"); // File | 
        File contract = new File("/path/to/file"); // File | 
        File otherEvidence = new File("/path/to/file"); // File | 
        File receiptOfShipment = new File("/path/to/file"); // File | 
        File identification = new File("/path/to/file"); // File | 
        File orderDetails = new File("/path/to/file"); // File | 
        File termsAndConditions = new File("/path/to/file"); // File | 
        File cardholderInformation = new File("/path/to/file"); // File | 
        File proofInvalidateClaim = new File("/path/to/file"); // File | 
        File internalValidations = new File("/path/to/file"); // File | 
        File proofOfCancellation = new File("/path/to/file"); // File | 
        File recurringContract = new File("/path/to/file"); // File | 
        File proofOfReturn = new File("/path/to/file"); // File | 
        File exhibit8 = new File("/path/to/file"); // File | 
        File duplicateAnalysis = new File("/path/to/file"); // File | 
        File fullEvidence = new File("/path/to/file"); // File | 
        try {
            ChargebackFilesBatchResponse result = apiInstance.uploadChargebackFilesBatch(chargeId, chargebackId, acceptLanguage, xChildCompanyId, chargeInformation, contract, otherEvidence, receiptOfShipment, identification, orderDetails, termsAndConditions, cardholderInformation, proofInvalidateClaim, internalValidations, proofOfCancellation, recurringContract, proofOfReturn, exhibit8, duplicateAnalysis, fullEvidence);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChargebacksApi#uploadChargebackFilesBatch");
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
| **chargeId** | **String**| Identifier of the charge resource | |
| **chargebackId** | **String**| Identifier of the chargeback resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |
| **chargeInformation** | **File**|  | [optional] |
| **contract** | **File**|  | [optional] |
| **otherEvidence** | **File**|  | [optional] |
| **receiptOfShipment** | **File**|  | [optional] |
| **identification** | **File**|  | [optional] |
| **orderDetails** | **File**|  | [optional] |
| **termsAndConditions** | **File**|  | [optional] |
| **cardholderInformation** | **File**|  | [optional] |
| **proofInvalidateClaim** | **File**|  | [optional] |
| **internalValidations** | **File**|  | [optional] |
| **proofOfCancellation** | **File**|  | [optional] |
| **recurringContract** | **File**|  | [optional] |
| **proofOfReturn** | **File**|  | [optional] |
| **exhibit8** | **File**|  | [optional] |
| **duplicateAnalysis** | **File**|  | [optional] |
| **fullEvidence** | **File**|  | [optional] |

### Return type

[**ChargebackFilesBatchResponse**](ChargebackFilesBatchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.conekta-v2.3.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Files uploaded successfully. |  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  |
| **400** | bad request |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |

