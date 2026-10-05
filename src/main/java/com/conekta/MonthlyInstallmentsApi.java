package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import javax.ws.rs.core.GenericType;

import com.conekta.model.Error;
import com.conekta.model.MonthlyInstallmentsValidateRequest;
import com.conekta.model.MonthlyInstallmentsValidateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class MonthlyInstallmentsApi {
  private ApiClient apiClient;

  public MonthlyInstallmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MonthlyInstallmentsApi(ApiClient apiClient) {
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
   * Validate Monthly Installments
   * Returns the interest-free monthly installment plans available for a card BIN and an amount, so a checkout can offer only the plans a later charge will accept. Requires monthly installments to be enabled on the company. 
   * @param monthlyInstallmentsValidateRequest requested field for monthly installments validate (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return MonthlyInstallmentsValidateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public MonthlyInstallmentsValidateResponse validateMonthlyInstallments(@javax.annotation.Nonnull MonthlyInstallmentsValidateRequest monthlyInstallmentsValidateRequest, @javax.annotation.Nullable String acceptLanguage) throws ApiException {
    return validateMonthlyInstallmentsWithHttpInfo(monthlyInstallmentsValidateRequest, acceptLanguage).getData();
  }

  /**
   * Validate Monthly Installments
   * Returns the interest-free monthly installment plans available for a card BIN and an amount, so a checkout can offer only the plans a later charge will accept. Requires monthly installments to be enabled on the company. 
   * @param monthlyInstallmentsValidateRequest requested field for monthly installments validate (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;MonthlyInstallmentsValidateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MonthlyInstallmentsValidateResponse> validateMonthlyInstallmentsWithHttpInfo(@javax.annotation.Nonnull MonthlyInstallmentsValidateRequest monthlyInstallmentsValidateRequest, @javax.annotation.Nullable String acceptLanguage) throws ApiException {
    // Check required parameters
    if (monthlyInstallmentsValidateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'monthlyInstallmentsValidateRequest' when calling validateMonthlyInstallments");
    }

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.3.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<MonthlyInstallmentsValidateResponse> localVarReturnType = new GenericType<MonthlyInstallmentsValidateResponse>() {};
    return apiClient.invokeAPI("MonthlyInstallmentsApi.validateMonthlyInstallments", "/monthly_installments/validate", "POST", new ArrayList<>(), monthlyInstallmentsValidateRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
