package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import javax.ws.rs.core.GenericType;

import com.conekta.model.Error;
import com.conekta.model.GetOrdersResponse;
import com.conekta.model.OrderCaptureRequest;
import com.conekta.model.OrderRefundRequest;
import com.conekta.model.OrderRequest;
import com.conekta.model.OrderResponse;
import com.conekta.model.OrderUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class OrdersApi {
  private ApiClient apiClient;

  public OrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrdersApi(ApiClient apiClient) {
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
   * Cancel Order
   * Cancel an order that has been previously created.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse cancelOrder(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return cancelOrderWithHttpInfo(id, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Cancel Order
   * Cancel an order that has been previously created.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> cancelOrderWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelOrder");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/cancel"
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
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.cancelOrder", localVarPath, "POST", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create order
   * Create a new order.
   * @param orderRequest requested field for order (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse createOrder(OrderRequest orderRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return createOrderWithHttpInfo(orderRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create order
   * Create a new order.
   * @param orderRequest requested field for order (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> createOrderWithHttpInfo(OrderRequest orderRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (orderRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'orderRequest' when calling createOrder");
    }

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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.createOrder", "/orders", "POST", new ArrayList<>(), orderRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Order
   * Info for a specific order
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
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
  public OrderResponse getOrderById(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return getOrderByIdWithHttpInfo(id, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Get Order
   * Info for a specific order
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
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
  public ApiResponse<OrderResponse> getOrderByIdWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOrderById");
    }

    // Path parameters
    String localVarPath = "/orders/{id}"
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
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.getOrderById", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a list of Orders
   * Get order details in the form of a list
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @param paymentStatus Filters by order status (optional)
   * @param lastPaymentInfoStatus Filters by last payment info status (optional)
   * @param createdAt created equal to (optional)
   * @param createdAtGte created at greater than or equal to (optional)
   * @param createdAtLte created at less than or equal to (optional)
   * @param updatedAtGte updated at greater than or equal to (optional)
   * @param updatedAtLte updated at less than or equal to (optional)
   * @return GetOrdersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public GetOrdersResponse getOrders(String acceptLanguage, String xChildCompanyId, Integer limit, String search, String next, String previous, String paymentStatus, String lastPaymentInfoStatus, Long createdAt, Long createdAtGte, Long createdAtLte, Long updatedAtGte, Long updatedAtLte) throws ApiException {
    return getOrdersWithHttpInfo(acceptLanguage, xChildCompanyId, limit, search, next, previous, paymentStatus, lastPaymentInfoStatus, createdAt, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte).getData();
  }

  /**
   * Get a list of Orders
   * Get order details in the form of a list
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @param paymentStatus Filters by order status (optional)
   * @param lastPaymentInfoStatus Filters by last payment info status (optional)
   * @param createdAt created equal to (optional)
   * @param createdAtGte created at greater than or equal to (optional)
   * @param createdAtLte created at less than or equal to (optional)
   * @param updatedAtGte updated at greater than or equal to (optional)
   * @param updatedAtLte updated at less than or equal to (optional)
   * @return ApiResponse&lt;GetOrdersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetOrdersResponse> getOrdersWithHttpInfo(String acceptLanguage, String xChildCompanyId, Integer limit, String search, String next, String previous, String paymentStatus, String lastPaymentInfoStatus, Long createdAt, Long createdAtGte, Long createdAtLte, Long updatedAtGte, Long updatedAtLte) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next", next));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "previous", previous));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "payment_status", paymentStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_payment_info.status", lastPaymentInfoStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at.gte", createdAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at.lte", createdAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at.gte", updatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at.lte", updatedAtLte));

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
    GenericType<GetOrdersResponse> localVarReturnType = new GenericType<GetOrdersResponse>() {};
    return apiClient.invokeAPI("OrdersApi.getOrders", "/orders", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Cancel Refund
   * A refunded order describes the items, amount, and reason an order is being refunded.
   * @param id Identifier of the resource (required)
   * @param refundId refund identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse orderCancelRefund(String id, String refundId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return orderCancelRefundWithHttpInfo(id, refundId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Cancel Refund
   * A refunded order describes the items, amount, and reason an order is being refunded.
   * @param id Identifier of the resource (required)
   * @param refundId refund identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> orderCancelRefundWithHttpInfo(String id, String refundId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling orderCancelRefund");
    }
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling orderCancelRefund");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/refunds/{refund_id}"
            .replaceAll("\\{id}", apiClient.escapeString(id))
            .replaceAll("\\{refund_id}", apiClient.escapeString(refundId));

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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.orderCancelRefund", localVarPath, "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Refund Order
   * A refunded order describes the items, amount, and reason an order is being refunded.
   * @param id Identifier of the resource (required)
   * @param orderRefundRequest requested field for a refund (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse orderRefund(String id, OrderRefundRequest orderRefundRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return orderRefundWithHttpInfo(id, orderRefundRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Refund Order
   * A refunded order describes the items, amount, and reason an order is being refunded.
   * @param id Identifier of the resource (required)
   * @param orderRefundRequest requested field for a refund (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> orderRefundWithHttpInfo(String id, OrderRefundRequest orderRefundRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling orderRefund");
    }
    if (orderRefundRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'orderRefundRequest' when calling orderRefund");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/refunds"
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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.orderRefund", localVarPath, "POST", new ArrayList<>(), orderRefundRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Capture Order
   * Processes an order that has been previously authorized.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param orderCaptureRequest requested fields for capture order (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse ordersCreateCapture(String id, String acceptLanguage, String xChildCompanyId, OrderCaptureRequest orderCaptureRequest) throws ApiException {
    return ordersCreateCaptureWithHttpInfo(id, acceptLanguage, xChildCompanyId, orderCaptureRequest).getData();
  }

  /**
   * Capture Order
   * Processes an order that has been previously authorized.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param orderCaptureRequest requested fields for capture order (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> ordersCreateCaptureWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId, OrderCaptureRequest orderCaptureRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersCreateCapture");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/capture"
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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.ordersCreateCapture", localVarPath, "POST", new ArrayList<>(), orderCaptureRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Order
   * Update an existing Order.
   * @param id Identifier of the resource (required)
   * @param orderUpdateRequest requested field for an order (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return OrderResponse
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
  public OrderResponse updateOrder(String id, OrderUpdateRequest orderUpdateRequest, String acceptLanguage) throws ApiException {
    return updateOrderWithHttpInfo(id, orderUpdateRequest, acceptLanguage).getData();
  }

  /**
   * Update Order
   * Update an existing Order.
   * @param id Identifier of the resource (required)
   * @param orderUpdateRequest requested field for an order (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;OrderResponse&gt;
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
  public ApiResponse<OrderResponse> updateOrderWithHttpInfo(String id, OrderUpdateRequest orderUpdateRequest, String acceptLanguage) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateOrder");
    }
    if (orderUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'orderUpdateRequest' when calling updateOrder");
    }

    // Path parameters
    String localVarPath = "/orders/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.1.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.updateOrder", localVarPath, "PUT", new ArrayList<>(), orderUpdateRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
