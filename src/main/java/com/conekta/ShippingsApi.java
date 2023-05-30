package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import jakarta.ws.rs.core.GenericType;

import com.conekta.model.Error;
import com.conekta.model.ShippingOrderResponse;
import com.conekta.model.ShippingRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShippingsApi {
  private ApiClient apiClient;

  public ShippingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ShippingsApi(ApiClient apiClient) {
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
   * Create Shipping
   * Create new shipping for an existing orden
   * @param id Identifier of the resource (required)
   * @param shippingRequest requested field for a shipping (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ShippingOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ShippingOrderResponse ordersCreateShipping(String id, ShippingRequest shippingRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersCreateShippingWithHttpInfo(id, shippingRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create Shipping
   * Create new shipping for an existing orden
   * @param id Identifier of the resource (required)
   * @param shippingRequest requested field for a shipping (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;ShippingOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShippingOrderResponse> ordersCreateShippingWithHttpInfo(String id, ShippingRequest shippingRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = shippingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersCreateShipping");
    }
    
    // verify the required parameter 'shippingRequest' is set
    if (shippingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'shippingRequest' when calling ordersCreateShipping");
    }
    
    // create path and map variables
    String localVarPath = "/orders/{id}/shipping_lines"
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

    GenericType<ShippingOrderResponse> localVarReturnType = new GenericType<ShippingOrderResponse>() {};

    return apiClient.invokeAPI("ShippingsApi.ordersCreateShipping", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Shipping
   * Delete shipping
   * @param id Identifier of the resource (required)
   * @param shippingId identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ShippingOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ShippingOrderResponse ordersDeleteShipping(String id, String shippingId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersDeleteShippingWithHttpInfo(id, shippingId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Delete Shipping
   * Delete shipping
   * @param id Identifier of the resource (required)
   * @param shippingId identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;ShippingOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShippingOrderResponse> ordersDeleteShippingWithHttpInfo(String id, String shippingId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersDeleteShipping");
    }
    
    // verify the required parameter 'shippingId' is set
    if (shippingId == null) {
      throw new ApiException(400, "Missing the required parameter 'shippingId' when calling ordersDeleteShipping");
    }
    
    // create path and map variables
    String localVarPath = "/orders/{id}/shipping_lines/{shipping_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "shipping_id" + "\\}", apiClient.escapeString(shippingId.toString()));

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

    GenericType<ShippingOrderResponse> localVarReturnType = new GenericType<ShippingOrderResponse>() {};

    return apiClient.invokeAPI("ShippingsApi.ordersDeleteShipping", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Shipping
   * Update existing shipping for an existing orden
   * @param id Identifier of the resource (required)
   * @param shippingId identifier (required)
   * @param shippingRequest requested field for a shipping (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ShippingOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ShippingOrderResponse ordersUpdateShipping(String id, String shippingId, ShippingRequest shippingRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersUpdateShippingWithHttpInfo(id, shippingId, shippingRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Update Shipping
   * Update existing shipping for an existing orden
   * @param id Identifier of the resource (required)
   * @param shippingId identifier (required)
   * @param shippingRequest requested field for a shipping (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;ShippingOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShippingOrderResponse> ordersUpdateShippingWithHttpInfo(String id, String shippingId, ShippingRequest shippingRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = shippingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersUpdateShipping");
    }
    
    // verify the required parameter 'shippingId' is set
    if (shippingId == null) {
      throw new ApiException(400, "Missing the required parameter 'shippingId' when calling ordersUpdateShipping");
    }
    
    // verify the required parameter 'shippingRequest' is set
    if (shippingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'shippingRequest' when calling ordersUpdateShipping");
    }
    
    // create path and map variables
    String localVarPath = "/orders/{id}/shipping_lines/{shipping_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "shipping_id" + "\\}", apiClient.escapeString(shippingId.toString()));

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

    GenericType<ShippingOrderResponse> localVarReturnType = new GenericType<ShippingOrderResponse>() {};

    return apiClient.invokeAPI("ShippingsApi.ordersUpdateShipping", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
