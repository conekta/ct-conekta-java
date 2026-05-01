package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import javax.ws.rs.core.GenericType;

import com.conekta.model.CustomerPortalResponse;
import com.conekta.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.21.0")
public class SubscriptionsCustomerPortalApi {
  private ApiClient apiClient;

  public SubscriptionsCustomerPortalApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionsCustomerPortalApi(ApiClient apiClient) {
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
   * Create customer portal
   * Creates a customer portal for a subscription. If a portal already exists, returns the existing one.
   * @param subscriptionId Identifier of the subscription resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return CustomerPortalResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Customer portal created successfully </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
     </table>
   */
  public CustomerPortalResponse createCustomerPortal(@javax.annotation.Nonnull String subscriptionId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    return createCustomerPortalWithHttpInfo(subscriptionId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create customer portal
   * Creates a customer portal for a subscription. If a portal already exists, returns the existing one.
   * @param subscriptionId Identifier of the subscription resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;CustomerPortalResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Customer portal created successfully </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerPortalResponse> createCustomerPortalWithHttpInfo(@javax.annotation.Nonnull String subscriptionId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling createCustomerPortal");
    }

    // Path parameters
    String localVarPath = "/subscriptions/{subscription_id}/customer_portal"
            .replaceAll("\\{subscription_id}", apiClient.escapeString(subscriptionId.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<CustomerPortalResponse> localVarReturnType = new GenericType<CustomerPortalResponse>() {};
    return apiClient.invokeAPI("SubscriptionsCustomerPortalApi.createCustomerPortal", localVarPath, "POST", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get customer portal
   * Retrieves the customer portal for a subscription
   * @param subscriptionId Identifier of the subscription resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return CustomerPortalResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Customer portal retrieved successfully </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
     </table>
   */
  public CustomerPortalResponse getCustomerPortal(@javax.annotation.Nonnull String subscriptionId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    return getCustomerPortalWithHttpInfo(subscriptionId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Get customer portal
   * Retrieves the customer portal for a subscription
   * @param subscriptionId Identifier of the subscription resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;CustomerPortalResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Customer portal retrieved successfully </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerPortalResponse> getCustomerPortalWithHttpInfo(@javax.annotation.Nonnull String subscriptionId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (subscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionId' when calling getCustomerPortal");
    }

    // Path parameters
    String localVarPath = "/subscriptions/{subscription_id}/customer_portal"
            .replaceAll("\\{subscription_id}", apiClient.escapeString(subscriptionId.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<CustomerPortalResponse> localVarReturnType = new GenericType<CustomerPortalResponse>() {};
    return apiClient.invokeAPI("SubscriptionsCustomerPortalApi.getCustomerPortal", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
