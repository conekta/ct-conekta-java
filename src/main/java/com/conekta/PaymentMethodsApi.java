package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import jakarta.ws.rs.core.GenericType;

import com.conekta.model.CreateCustomerPaymentMethodsRequest;
import com.conekta.model.CreateCustomerPaymentMethodsResponse;
import com.conekta.model.Error;
import com.conekta.model.GetPaymentMethodResponse;
import com.conekta.model.UpdateCustomerPaymentMethodsResponse;
import com.conekta.model.UpdatePaymentMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodsApi {
  private ApiClient apiClient;

  public PaymentMethodsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentMethodsApi(ApiClient apiClient) {
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
   * Create Payment Method
   * Create a payment method for a customer.
   * @param id Identifier of the resource (required)
   * @param createCustomerPaymentMethodsRequest requested field for customer payment methods (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return CreateCustomerPaymentMethodsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CreateCustomerPaymentMethodsResponse createCustomerPaymentMethods(String id, CreateCustomerPaymentMethodsRequest createCustomerPaymentMethodsRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return createCustomerPaymentMethodsWithHttpInfo(id, createCustomerPaymentMethodsRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create Payment Method
   * Create a payment method for a customer.
   * @param id Identifier of the resource (required)
   * @param createCustomerPaymentMethodsRequest requested field for customer payment methods (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;CreateCustomerPaymentMethodsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateCustomerPaymentMethodsResponse> createCustomerPaymentMethodsWithHttpInfo(String id, CreateCustomerPaymentMethodsRequest createCustomerPaymentMethodsRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = createCustomerPaymentMethodsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createCustomerPaymentMethods");
    }
    
    // verify the required parameter 'createCustomerPaymentMethodsRequest' is set
    if (createCustomerPaymentMethodsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createCustomerPaymentMethodsRequest' when calling createCustomerPaymentMethods");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}/payment_sources"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
if (xChildCompanyId != null)
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));

    
    
    final String[] localVarAccepts = {
      "application/vnd.conekta-v2.1.0+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateCustomerPaymentMethodsResponse> localVarReturnType = new GenericType<CreateCustomerPaymentMethodsResponse>() {};

    return apiClient.invokeAPI("PaymentMethodsApi.createCustomerPaymentMethods", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Payment Method
   * Delete an existing payment method
   * @param id Identifier of the resource (required)
   * @param paymentMethodId Identifier of the payment method (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return UpdateCustomerPaymentMethodsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateCustomerPaymentMethodsResponse deleteCustomerPaymentMethods(String id, String paymentMethodId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return deleteCustomerPaymentMethodsWithHttpInfo(id, paymentMethodId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Delete Payment Method
   * Delete an existing payment method
   * @param id Identifier of the resource (required)
   * @param paymentMethodId Identifier of the payment method (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;UpdateCustomerPaymentMethodsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateCustomerPaymentMethodsResponse> deleteCustomerPaymentMethodsWithHttpInfo(String id, String paymentMethodId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteCustomerPaymentMethods");
    }
    
    // verify the required parameter 'paymentMethodId' is set
    if (paymentMethodId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentMethodId' when calling deleteCustomerPaymentMethods");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}/payment_sources/{payment_method_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "payment_method_id" + "\\}", apiClient.escapeString(paymentMethodId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
if (xChildCompanyId != null)
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));

    
    
    final String[] localVarAccepts = {
      "application/vnd.conekta-v2.1.0+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<UpdateCustomerPaymentMethodsResponse> localVarReturnType = new GenericType<UpdateCustomerPaymentMethodsResponse>() {};

    return apiClient.invokeAPI("PaymentMethodsApi.deleteCustomerPaymentMethods", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Payment Methods
   * Get a list of Payment Methods
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @return GetPaymentMethodResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public GetPaymentMethodResponse getCustomerPaymentMethods(String id, String acceptLanguage, String xChildCompanyId, Integer limit, String next, String previous, String search) throws ApiException {
    return getCustomerPaymentMethodsWithHttpInfo(id, acceptLanguage, xChildCompanyId, limit, next, previous, search).getData();
  }

  /**
   * Get Payment Methods
   * Get a list of Payment Methods
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @return ApiResponse&lt;GetPaymentMethodResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetPaymentMethodResponse> getCustomerPaymentMethodsWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId, Integer limit, String next, String previous, String search) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCustomerPaymentMethods");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}/payment_sources"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next", next));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "previous", previous));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

    if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
if (xChildCompanyId != null)
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));

    
    
    final String[] localVarAccepts = {
      "application/vnd.conekta-v2.1.0+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetPaymentMethodResponse> localVarReturnType = new GenericType<GetPaymentMethodResponse>() {};

    return apiClient.invokeAPI("PaymentMethodsApi.getCustomerPaymentMethods", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Payment Method
   * Gets a payment Method that corresponds to a customer ID.
   * @param id Identifier of the resource (required)
   * @param paymentMethodId Identifier of the payment method (required)
   * @param updatePaymentMethods requested field for customer payment methods (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return UpdateCustomerPaymentMethodsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateCustomerPaymentMethodsResponse updateCustomerPaymentMethods(String id, String paymentMethodId, UpdatePaymentMethods updatePaymentMethods, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return updateCustomerPaymentMethodsWithHttpInfo(id, paymentMethodId, updatePaymentMethods, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Update Payment Method
   * Gets a payment Method that corresponds to a customer ID.
   * @param id Identifier of the resource (required)
   * @param paymentMethodId Identifier of the payment method (required)
   * @param updatePaymentMethods requested field for customer payment methods (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;UpdateCustomerPaymentMethodsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateCustomerPaymentMethodsResponse> updateCustomerPaymentMethodsWithHttpInfo(String id, String paymentMethodId, UpdatePaymentMethods updatePaymentMethods, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = updatePaymentMethods;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCustomerPaymentMethods");
    }
    
    // verify the required parameter 'paymentMethodId' is set
    if (paymentMethodId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentMethodId' when calling updateCustomerPaymentMethods");
    }
    
    // verify the required parameter 'updatePaymentMethods' is set
    if (updatePaymentMethods == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePaymentMethods' when calling updateCustomerPaymentMethods");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}/payment_sources/{payment_method_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "payment_method_id" + "\\}", apiClient.escapeString(paymentMethodId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
if (xChildCompanyId != null)
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));

    
    
    final String[] localVarAccepts = {
      "application/vnd.conekta-v2.1.0+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<UpdateCustomerPaymentMethodsResponse> localVarReturnType = new GenericType<UpdateCustomerPaymentMethodsResponse>() {};

    return apiClient.invokeAPI("PaymentMethodsApi.updateCustomerPaymentMethods", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
