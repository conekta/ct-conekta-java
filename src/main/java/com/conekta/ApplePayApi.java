package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import javax.ws.rs.core.GenericType;

import com.conekta.model.ApplePaySessionRequest;
import com.conekta.model.ApplePaySessionResponse;
import com.conekta.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class ApplePayApi {
  private ApiClient apiClient;

  public ApplePayApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplePayApi(ApiClient apiClient) {
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
   * Create Apple Pay Session
   * Validate an Apple Pay merchant session using Conekta&#39;s Apple Pay certificates. Call this endpoint from your backend with the &#x60;validationURL&#x60; received in the &#x60;onvalidatemerchant&#x60; event and return the response to the browser to complete the merchant validation.  This endpoint does not require authentication, it is meant to be called during the Apple Pay checkout flow. 
   * @param applePaySessionRequest requested fields for creating an Apple Pay session (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApplePaySessionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The validated Apple Pay merchant session. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApplePaySessionResponse createApplePaySession(@javax.annotation.Nonnull ApplePaySessionRequest applePaySessionRequest, @javax.annotation.Nullable String acceptLanguage) throws ApiException {
    return createApplePaySessionWithHttpInfo(applePaySessionRequest, acceptLanguage).getData();
  }

  /**
   * Create Apple Pay Session
   * Validate an Apple Pay merchant session using Conekta&#39;s Apple Pay certificates. Call this endpoint from your backend with the &#x60;validationURL&#x60; received in the &#x60;onvalidatemerchant&#x60; event and return the response to the browser to complete the merchant validation.  This endpoint does not require authentication, it is meant to be called during the Apple Pay checkout flow. 
   * @param applePaySessionRequest requested fields for creating an Apple Pay session (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;ApplePaySessionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The validated Apple Pay merchant session. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ApplePaySessionResponse> createApplePaySessionWithHttpInfo(@javax.annotation.Nonnull ApplePaySessionRequest applePaySessionRequest, @javax.annotation.Nullable String acceptLanguage) throws ApiException {
    // Check required parameters
    if (applePaySessionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'applePaySessionRequest' when calling createApplePaySession");
    }

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "application/vnd.conekta-v2.3.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ApplePaySessionResponse> localVarReturnType = new GenericType<ApplePaySessionResponse>() {};
    return apiClient.invokeAPI("ApplePayApi.createApplePaySession", "/apple_pay/session", "POST", new ArrayList<>(), applePaySessionRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
