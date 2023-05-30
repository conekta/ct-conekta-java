package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import jakarta.ws.rs.core.GenericType;

import com.conekta.model.DiscountLinesResponse;
import com.conekta.model.Error;
import com.conekta.model.OrderDiscountLinesRequest;
import com.conekta.model.UpdateOrderDiscountLinesRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T11:12:04.718851-03:00[America/Argentina/Buenos_Aires]")
public class DiscountsApi {
  private ApiClient apiClient;

  public DiscountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DiscountsApi(ApiClient apiClient) {
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
   * Create Discount
   * Create discount lines for an existing orden
   * @param id Identifier of the resource (required)
   * @param orderDiscountLinesRequest requested field for a discount lines (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return DiscountLinesResponse
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
  public DiscountLinesResponse ordersCreateDiscountLine(String id, OrderDiscountLinesRequest orderDiscountLinesRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersCreateDiscountLineWithHttpInfo(id, orderDiscountLinesRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create Discount
   * Create discount lines for an existing orden
   * @param id Identifier of the resource (required)
   * @param orderDiscountLinesRequest requested field for a discount lines (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;DiscountLinesResponse&gt;
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
  public ApiResponse<DiscountLinesResponse> ordersCreateDiscountLineWithHttpInfo(String id, OrderDiscountLinesRequest orderDiscountLinesRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = orderDiscountLinesRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersCreateDiscountLine");
    }
    
    // verify the required parameter 'orderDiscountLinesRequest' is set
    if (orderDiscountLinesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'orderDiscountLinesRequest' when calling ordersCreateDiscountLine");
    }
    
    // create path and map variables
    String localVarPath = "/orders/{id}/discount_lines"
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

    GenericType<DiscountLinesResponse> localVarReturnType = new GenericType<DiscountLinesResponse>() {};

    return apiClient.invokeAPI("DiscountsApi.ordersCreateDiscountLine", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Discount
   * Delete an existing discount lines for an existing orden
   * @param id Identifier of the resource (required)
   * @param discountLinesId identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return DiscountLinesResponse
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
  public DiscountLinesResponse ordersDeleteDiscountLines(String id, String discountLinesId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersDeleteDiscountLinesWithHttpInfo(id, discountLinesId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Delete Discount
   * Delete an existing discount lines for an existing orden
   * @param id Identifier of the resource (required)
   * @param discountLinesId identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;DiscountLinesResponse&gt;
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
  public ApiResponse<DiscountLinesResponse> ordersDeleteDiscountLinesWithHttpInfo(String id, String discountLinesId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersDeleteDiscountLines");
    }
    
    // verify the required parameter 'discountLinesId' is set
    if (discountLinesId == null) {
      throw new ApiException(400, "Missing the required parameter 'discountLinesId' when calling ordersDeleteDiscountLines");
    }
    
    // create path and map variables
    String localVarPath = "/orders/{id}/discount_lines/{discount_lines_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "discount_lines_id" + "\\}", apiClient.escapeString(discountLinesId.toString()));

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

    GenericType<DiscountLinesResponse> localVarReturnType = new GenericType<DiscountLinesResponse>() {};

    return apiClient.invokeAPI("DiscountsApi.ordersDeleteDiscountLines", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Discount
   * Update an existing discount lines for an existing orden
   * @param id Identifier of the resource (required)
   * @param discountLinesId identifier (required)
   * @param updateOrderDiscountLinesRequest requested field for a discount lines (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return DiscountLinesResponse
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
  public DiscountLinesResponse ordersUpdateDiscountLines(String id, String discountLinesId, UpdateOrderDiscountLinesRequest updateOrderDiscountLinesRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersUpdateDiscountLinesWithHttpInfo(id, discountLinesId, updateOrderDiscountLinesRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Update Discount
   * Update an existing discount lines for an existing orden
   * @param id Identifier of the resource (required)
   * @param discountLinesId identifier (required)
   * @param updateOrderDiscountLinesRequest requested field for a discount lines (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;DiscountLinesResponse&gt;
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
  public ApiResponse<DiscountLinesResponse> ordersUpdateDiscountLinesWithHttpInfo(String id, String discountLinesId, UpdateOrderDiscountLinesRequest updateOrderDiscountLinesRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = updateOrderDiscountLinesRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersUpdateDiscountLines");
    }
    
    // verify the required parameter 'discountLinesId' is set
    if (discountLinesId == null) {
      throw new ApiException(400, "Missing the required parameter 'discountLinesId' when calling ordersUpdateDiscountLines");
    }
    
    // verify the required parameter 'updateOrderDiscountLinesRequest' is set
    if (updateOrderDiscountLinesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateOrderDiscountLinesRequest' when calling ordersUpdateDiscountLines");
    }
    
    // create path and map variables
    String localVarPath = "/orders/{id}/discount_lines/{discount_lines_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "discount_lines_id" + "\\}", apiClient.escapeString(discountLinesId.toString()));

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

    GenericType<DiscountLinesResponse> localVarReturnType = new GenericType<DiscountLinesResponse>() {};

    return apiClient.invokeAPI("DiscountsApi.ordersUpdateDiscountLines", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
