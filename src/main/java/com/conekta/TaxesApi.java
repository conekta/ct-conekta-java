package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import jakarta.ws.rs.core.GenericType;

import com.conekta.model.Error;
import com.conekta.model.OrderTaxRequest;
import com.conekta.model.UpdateOrderTaxRequest;
import com.conekta.model.UpdateOrderTaxResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaxesApi {
  private ApiClient apiClient;

  public TaxesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TaxesApi(ApiClient apiClient) {
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
   * Create Tax
   * Create new taxes for an existing orden
   * @param id Identifier of the resource (required)
   * @param orderTaxRequest requested field for a taxes (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return UpdateOrderTaxResponse
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
  public UpdateOrderTaxResponse ordersCreateTaxes(String id, OrderTaxRequest orderTaxRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersCreateTaxesWithHttpInfo(id, orderTaxRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create Tax
   * Create new taxes for an existing orden
   * @param id Identifier of the resource (required)
   * @param orderTaxRequest requested field for a taxes (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;UpdateOrderTaxResponse&gt;
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
  public ApiResponse<UpdateOrderTaxResponse> ordersCreateTaxesWithHttpInfo(String id, OrderTaxRequest orderTaxRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersCreateTaxes");
    }
    if (orderTaxRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'orderTaxRequest' when calling ordersCreateTaxes");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/tax_lines"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.1.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<UpdateOrderTaxResponse> localVarReturnType = new GenericType<UpdateOrderTaxResponse>() {};
    return apiClient.invokeAPI("TaxesApi.ordersCreateTaxes", localVarPath, "POST", new ArrayList<>(), orderTaxRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Tax
   * Delete taxes for an existing orden
   * @param id Identifier of the resource (required)
   * @param taxId identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return UpdateOrderTaxResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateOrderTaxResponse ordersDeleteTaxes(String id, String taxId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersDeleteTaxesWithHttpInfo(id, taxId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Delete Tax
   * Delete taxes for an existing orden
   * @param id Identifier of the resource (required)
   * @param taxId identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;UpdateOrderTaxResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateOrderTaxResponse> ordersDeleteTaxesWithHttpInfo(String id, String taxId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersDeleteTaxes");
    }
    if (taxId == null) {
      throw new ApiException(400, "Missing the required parameter 'taxId' when calling ordersDeleteTaxes");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/tax_lines/{tax_id}"
            .replaceAll("\\{id}", apiClient.escapeString(id))
            .replaceAll("\\{tax_id}", apiClient.escapeString(taxId));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.1.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<UpdateOrderTaxResponse> localVarReturnType = new GenericType<UpdateOrderTaxResponse>() {};
    return apiClient.invokeAPI("TaxesApi.ordersDeleteTaxes", localVarPath, "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Tax
   * Update taxes for an existing orden
   * @param id Identifier of the resource (required)
   * @param taxId identifier (required)
   * @param updateOrderTaxRequest requested field for taxes (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return UpdateOrderTaxResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateOrderTaxResponse ordersUpdateTaxes(String id, String taxId, UpdateOrderTaxRequest updateOrderTaxRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersUpdateTaxesWithHttpInfo(id, taxId, updateOrderTaxRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Update Tax
   * Update taxes for an existing orden
   * @param id Identifier of the resource (required)
   * @param taxId identifier (required)
   * @param updateOrderTaxRequest requested field for taxes (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;UpdateOrderTaxResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateOrderTaxResponse> ordersUpdateTaxesWithHttpInfo(String id, String taxId, UpdateOrderTaxRequest updateOrderTaxRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersUpdateTaxes");
    }
    if (taxId == null) {
      throw new ApiException(400, "Missing the required parameter 'taxId' when calling ordersUpdateTaxes");
    }
    if (updateOrderTaxRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateOrderTaxRequest' when calling ordersUpdateTaxes");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/tax_lines/{tax_id}"
            .replaceAll("\\{id}", apiClient.escapeString(id))
            .replaceAll("\\{tax_id}", apiClient.escapeString(taxId));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.1.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<UpdateOrderTaxResponse> localVarReturnType = new GenericType<UpdateOrderTaxResponse>() {};
    return apiClient.invokeAPI("TaxesApi.ordersUpdateTaxes", localVarPath, "PUT", new ArrayList<>(), updateOrderTaxRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
