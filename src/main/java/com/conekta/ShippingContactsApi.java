package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import jakarta.ws.rs.core.GenericType;

import com.conekta.model.CustomerShippingContacts;
import com.conekta.model.CustomerShippingContactsResponse;
import com.conekta.model.CustomerUpdateShippingContacts;
import com.conekta.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class ShippingContactsApi {
  private ApiClient apiClient;

  public ShippingContactsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ShippingContactsApi(ApiClient apiClient) {
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
   * Create a shipping contacts
   * Create a shipping contacts for a customer.
   * @param id Identifier of the resource (required)
   * @param customerShippingContacts requested field for customer shippings contacts (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return CustomerShippingContactsResponse
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
  public CustomerShippingContactsResponse createCustomerShippingContacts(String id, CustomerShippingContacts customerShippingContacts, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return createCustomerShippingContactsWithHttpInfo(id, customerShippingContacts, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create a shipping contacts
   * Create a shipping contacts for a customer.
   * @param id Identifier of the resource (required)
   * @param customerShippingContacts requested field for customer shippings contacts (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;CustomerShippingContactsResponse&gt;
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
  public ApiResponse<CustomerShippingContactsResponse> createCustomerShippingContactsWithHttpInfo(String id, CustomerShippingContacts customerShippingContacts, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = customerShippingContacts;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createCustomerShippingContacts");
    }
    
    // verify the required parameter 'customerShippingContacts' is set
    if (customerShippingContacts == null) {
      throw new ApiException(400, "Missing the required parameter 'customerShippingContacts' when calling createCustomerShippingContacts");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}/shipping_contacts"
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

    GenericType<CustomerShippingContactsResponse> localVarReturnType = new GenericType<CustomerShippingContactsResponse>() {};

    return apiClient.invokeAPI("ShippingContactsApi.createCustomerShippingContacts", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete shipping contacts
   * Delete shipping contact that corresponds to a customer ID.
   * @param id Identifier of the resource (required)
   * @param shippingContactsId identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return CustomerShippingContactsResponse
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
  public CustomerShippingContactsResponse deleteCustomerShippingContacts(String id, String shippingContactsId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return deleteCustomerShippingContactsWithHttpInfo(id, shippingContactsId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Delete shipping contacts
   * Delete shipping contact that corresponds to a customer ID.
   * @param id Identifier of the resource (required)
   * @param shippingContactsId identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;CustomerShippingContactsResponse&gt;
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
  public ApiResponse<CustomerShippingContactsResponse> deleteCustomerShippingContactsWithHttpInfo(String id, String shippingContactsId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteCustomerShippingContacts");
    }
    
    // verify the required parameter 'shippingContactsId' is set
    if (shippingContactsId == null) {
      throw new ApiException(400, "Missing the required parameter 'shippingContactsId' when calling deleteCustomerShippingContacts");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}/shipping_contacts/{shipping_contacts_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "shipping_contacts_id" + "\\}", apiClient.escapeString(shippingContactsId.toString()));

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

    GenericType<CustomerShippingContactsResponse> localVarReturnType = new GenericType<CustomerShippingContactsResponse>() {};

    return apiClient.invokeAPI("ShippingContactsApi.deleteCustomerShippingContacts", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update shipping contacts
   * Update shipping contact that corresponds to a customer ID.
   * @param id Identifier of the resource (required)
   * @param shippingContactsId identifier (required)
   * @param customerUpdateShippingContacts requested field for customer update shippings contacts (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return CustomerShippingContactsResponse
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
  public CustomerShippingContactsResponse updateCustomerShippingContacts(String id, String shippingContactsId, CustomerUpdateShippingContacts customerUpdateShippingContacts, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return updateCustomerShippingContactsWithHttpInfo(id, shippingContactsId, customerUpdateShippingContacts, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Update shipping contacts
   * Update shipping contact that corresponds to a customer ID.
   * @param id Identifier of the resource (required)
   * @param shippingContactsId identifier (required)
   * @param customerUpdateShippingContacts requested field for customer update shippings contacts (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;CustomerShippingContactsResponse&gt;
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
  public ApiResponse<CustomerShippingContactsResponse> updateCustomerShippingContactsWithHttpInfo(String id, String shippingContactsId, CustomerUpdateShippingContacts customerUpdateShippingContacts, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = customerUpdateShippingContacts;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCustomerShippingContacts");
    }
    
    // verify the required parameter 'shippingContactsId' is set
    if (shippingContactsId == null) {
      throw new ApiException(400, "Missing the required parameter 'shippingContactsId' when calling updateCustomerShippingContacts");
    }
    
    // verify the required parameter 'customerUpdateShippingContacts' is set
    if (customerUpdateShippingContacts == null) {
      throw new ApiException(400, "Missing the required parameter 'customerUpdateShippingContacts' when calling updateCustomerShippingContacts");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}/shipping_contacts/{shipping_contacts_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "shipping_contacts_id" + "\\}", apiClient.escapeString(shippingContactsId.toString()));

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

    GenericType<CustomerShippingContactsResponse> localVarReturnType = new GenericType<CustomerShippingContactsResponse>() {};

    return apiClient.invokeAPI("ShippingContactsApi.updateCustomerShippingContacts", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
