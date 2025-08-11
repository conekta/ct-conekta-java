package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import javax.ws.rs.core.GenericType;

import com.conekta.model.CompanyDocumentRequest;
import com.conekta.model.CompanyDocumentResponse;
import com.conekta.model.CompanyResponse;
import com.conekta.model.CreateCompanyRequest;
import com.conekta.model.Error;
import com.conekta.model.GetCompaniesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CompaniesApi {
  private ApiClient apiClient;

  public CompaniesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompaniesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Company
   * Create a new company.
   * @param createCompanyRequest Company data (required)
   * @return CompanyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Company created successfully </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CompanyResponse createCompany(CreateCompanyRequest createCompanyRequest) throws ApiException {
    return createCompanyWithHttpInfo(createCompanyRequest).getData();
  }

  /**
   * Create Company
   * Create a new company.
   * @param createCompanyRequest Company data (required)
   * @return ApiResponse&lt;CompanyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Company created successfully </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyResponse> createCompanyWithHttpInfo(CreateCompanyRequest createCompanyRequest) throws ApiException {
    // Check required parameters
    if (createCompanyRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createCompanyRequest' when calling createCompany");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<CompanyResponse> localVarReturnType = new GenericType<CompanyResponse>() {};
    return apiClient.invokeAPI("CompaniesApi.createCompany", "/companies", "POST", new ArrayList<>(), createCompanyRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get List of Companies
   * Consume the list of child companies.  This is used for holding companies with several child entities.
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @return GetCompaniesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public GetCompaniesResponse getCompanies(String acceptLanguage, Integer limit, String search, String next, String previous) throws ApiException {
    return getCompaniesWithHttpInfo(acceptLanguage, limit, search, next, previous).getData();
  }

  /**
   * Get List of Companies
   * Consume the list of child companies.  This is used for holding companies with several child entities.
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @return ApiResponse&lt;GetCompaniesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetCompaniesResponse> getCompaniesWithHttpInfo(String acceptLanguage, Integer limit, String search, String next, String previous) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next", next));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "previous", previous));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<GetCompaniesResponse> localVarReturnType = new GenericType<GetCompaniesResponse>() {};
    return apiClient.invokeAPI("CompaniesApi.getCompanies", "/companies", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Company
   * 
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return CompanyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CompanyResponse getCompany(String id, String acceptLanguage) throws ApiException {
    return getCompanyWithHttpInfo(id, acceptLanguage).getData();
  }

  /**
   * Get Company
   * 
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;CompanyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyResponse> getCompanyWithHttpInfo(String id, String acceptLanguage) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCompany");
    }

    // Path parameters
    String localVarPath = "/companies/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<CompanyResponse> localVarReturnType = new GenericType<CompanyResponse>() {};
    return apiClient.invokeAPI("CompaniesApi.getCompany", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Company Documents
   * Retrieve a list of documents associated with a specific company.
   * @param companyId The unique identifier of the company. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return List&lt;CompanyDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of documents for the company. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public List<CompanyDocumentResponse> getCompanyDocuments(String companyId, String acceptLanguage) throws ApiException {
    return getCompanyDocumentsWithHttpInfo(companyId, acceptLanguage).getData();
  }

  /**
   * Get Company Documents
   * Retrieve a list of documents associated with a specific company.
   * @param companyId The unique identifier of the company. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;List&lt;CompanyDocumentResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of documents for the company. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CompanyDocumentResponse>> getCompanyDocumentsWithHttpInfo(String companyId, String acceptLanguage) throws ApiException {
    // Check required parameters
    if (companyId == null) {
      throw new ApiException(400, "Missing the required parameter 'companyId' when calling getCompanyDocuments");
    }

    // Path parameters
    String localVarPath = "/companies/{company_id}/documents"
            .replaceAll("\\{company_id}", apiClient.escapeString(companyId));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<List<CompanyDocumentResponse>> localVarReturnType = new GenericType<List<CompanyDocumentResponse>>() {};
    return apiClient.invokeAPI("CompaniesApi.getCompanyDocuments", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Company Document
   * Updates an existing document associated with a specific company.
   * @param companyId The unique identifier of the company. (required)
   * @param companyDocumentRequest Document information to update. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return CompanyDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Document updated successfully. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CompanyDocumentResponse updateCompanyDocument(String companyId, CompanyDocumentRequest companyDocumentRequest, String acceptLanguage) throws ApiException {
    return updateCompanyDocumentWithHttpInfo(companyId, companyDocumentRequest, acceptLanguage).getData();
  }

  /**
   * Update Company Document
   * Updates an existing document associated with a specific company.
   * @param companyId The unique identifier of the company. (required)
   * @param companyDocumentRequest Document information to update. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;CompanyDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Document updated successfully. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyDocumentResponse> updateCompanyDocumentWithHttpInfo(String companyId, CompanyDocumentRequest companyDocumentRequest, String acceptLanguage) throws ApiException {
    // Check required parameters
    if (companyId == null) {
      throw new ApiException(400, "Missing the required parameter 'companyId' when calling updateCompanyDocument");
    }
    if (companyDocumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companyDocumentRequest' when calling updateCompanyDocument");
    }

    // Path parameters
    String localVarPath = "/companies/{company_id}/document"
            .replaceAll("\\{company_id}", apiClient.escapeString(companyId));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<CompanyDocumentResponse> localVarReturnType = new GenericType<CompanyDocumentResponse>() {};
    return apiClient.invokeAPI("CompaniesApi.updateCompanyDocument", localVarPath, "PATCH", new ArrayList<>(), companyDocumentRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Upload Company Document
   * Uploads a document associated with a specific company.
   * @param companyId The unique identifier of the company. (required)
   * @param companyDocumentRequest Document information to upload. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return CompanyDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Document uploaded successfully. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CompanyDocumentResponse uploadCompanyDocument(String companyId, CompanyDocumentRequest companyDocumentRequest, String acceptLanguage) throws ApiException {
    return uploadCompanyDocumentWithHttpInfo(companyId, companyDocumentRequest, acceptLanguage).getData();
  }

  /**
   * Upload Company Document
   * Uploads a document associated with a specific company.
   * @param companyId The unique identifier of the company. (required)
   * @param companyDocumentRequest Document information to upload. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;CompanyDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Document uploaded successfully. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CompanyDocumentResponse> uploadCompanyDocumentWithHttpInfo(String companyId, CompanyDocumentRequest companyDocumentRequest, String acceptLanguage) throws ApiException {
    // Check required parameters
    if (companyId == null) {
      throw new ApiException(400, "Missing the required parameter 'companyId' when calling uploadCompanyDocument");
    }
    if (companyDocumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'companyDocumentRequest' when calling uploadCompanyDocument");
    }

    // Path parameters
    String localVarPath = "/companies/{company_id}/document"
            .replaceAll("\\{company_id}", apiClient.escapeString(companyId));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<CompanyDocumentResponse> localVarReturnType = new GenericType<CompanyDocumentResponse>() {};
    return apiClient.invokeAPI("CompaniesApi.uploadCompanyDocument", localVarPath, "POST", new ArrayList<>(), companyDocumentRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
