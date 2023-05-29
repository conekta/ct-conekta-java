package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import jakarta.ws.rs.core.GenericType;

import com.conekta.model.BlacklistRuleResponse;
import com.conekta.model.CreateRiskRulesData;
import com.conekta.model.DeletedBlacklistRuleResponse;
import com.conekta.model.DeletedWhitelistRuleResponse;
import com.conekta.model.Error;
import com.conekta.model.RiskRulesList;
import com.conekta.model.WhitelistlistRuleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-29T15:59:59.366769-03:00[America/Argentina/Buenos_Aires]")
public class AntifraudApi {
  private ApiClient apiClient;

  public AntifraudApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AntifraudApi(ApiClient apiClient) {
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
   * Create blacklisted rule
   * 
   * @param createRiskRulesData requested field for blacklist rule (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return BlacklistRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successfully registered rule </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public BlacklistRuleResponse createRuleBlacklist(CreateRiskRulesData createRiskRulesData, String acceptLanguage) throws ApiException {
    return createRuleBlacklistWithHttpInfo(createRiskRulesData, acceptLanguage).getData();
  }

  /**
   * Create blacklisted rule
   * 
   * @param createRiskRulesData requested field for blacklist rule (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;BlacklistRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successfully registered rule </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BlacklistRuleResponse> createRuleBlacklistWithHttpInfo(CreateRiskRulesData createRiskRulesData, String acceptLanguage) throws ApiException {
    Object localVarPostBody = createRiskRulesData;
    
    // verify the required parameter 'createRiskRulesData' is set
    if (createRiskRulesData == null) {
      throw new ApiException(400, "Missing the required parameter 'createRiskRulesData' when calling createRuleBlacklist");
    }
    
    // create path and map variables
    String localVarPath = "/antifraud/blacklists";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));

    
    
    final String[] localVarAccepts = {
      "application/vnd.conekta-v2.1.0+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<BlacklistRuleResponse> localVarReturnType = new GenericType<BlacklistRuleResponse>() {};

    return apiClient.invokeAPI("AntifraudApi.createRuleBlacklist", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create whitelisted rule
   * 
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param createRiskRulesData  (optional)
   * @return WhitelistlistRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successfully registered rule </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> forbidden error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public WhitelistlistRuleResponse createRuleWhitelist(String acceptLanguage, CreateRiskRulesData createRiskRulesData) throws ApiException {
    return createRuleWhitelistWithHttpInfo(acceptLanguage, createRiskRulesData).getData();
  }

  /**
   * Create whitelisted rule
   * 
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param createRiskRulesData  (optional)
   * @return ApiResponse&lt;WhitelistlistRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successfully registered rule </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> forbidden error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WhitelistlistRuleResponse> createRuleWhitelistWithHttpInfo(String acceptLanguage, CreateRiskRulesData createRiskRulesData) throws ApiException {
    Object localVarPostBody = createRiskRulesData;
    
    // create path and map variables
    String localVarPath = "/antifraud/whitelists";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));

    
    
    final String[] localVarAccepts = {
      "application/vnd.conekta-v2.1.0+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<WhitelistlistRuleResponse> localVarReturnType = new GenericType<WhitelistlistRuleResponse>() {};

    return apiClient.invokeAPI("AntifraudApi.createRuleWhitelist", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete blacklisted rule
   * 
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return DeletedBlacklistRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successfully deleted rule </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public DeletedBlacklistRuleResponse deleteRuleBlacklist(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return deleteRuleBlacklistWithHttpInfo(id, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Delete blacklisted rule
   * 
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;DeletedBlacklistRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successfully deleted rule </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeletedBlacklistRuleResponse> deleteRuleBlacklistWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRuleBlacklist");
    }
    
    // create path and map variables
    String localVarPath = "/antifraud/blacklists/{id}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<DeletedBlacklistRuleResponse> localVarReturnType = new GenericType<DeletedBlacklistRuleResponse>() {};

    return apiClient.invokeAPI("AntifraudApi.deleteRuleBlacklist", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete whitelisted rule
   * 
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return DeletedWhitelistRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successfully deleted rule </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public DeletedWhitelistRuleResponse deleteRuleWhitelist(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return deleteRuleWhitelistWithHttpInfo(id, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Delete whitelisted rule
   * 
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;DeletedWhitelistRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successfully deleted rule </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeletedWhitelistRuleResponse> deleteRuleWhitelistWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRuleWhitelist");
    }
    
    // create path and map variables
    String localVarPath = "/antifraud/whitelists/{id}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<DeletedWhitelistRuleResponse> localVarReturnType = new GenericType<DeletedWhitelistRuleResponse>() {};

    return apiClient.invokeAPI("AntifraudApi.deleteRuleWhitelist", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get list of blacklisted rules
   * Return all rules
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return RiskRulesList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All the rules </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public RiskRulesList getRuleBlacklist(String acceptLanguage) throws ApiException {
    return getRuleBlacklistWithHttpInfo(acceptLanguage).getData();
  }

  /**
   * Get list of blacklisted rules
   * Return all rules
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;RiskRulesList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All the rules </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RiskRulesList> getRuleBlacklistWithHttpInfo(String acceptLanguage) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/antifraud/blacklists";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));

    
    
    final String[] localVarAccepts = {
      "application/vnd.conekta-v2.1.0+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<RiskRulesList> localVarReturnType = new GenericType<RiskRulesList>() {};

    return apiClient.invokeAPI("AntifraudApi.getRuleBlacklist", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a list of whitelisted rules
   * Return all rules
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return RiskRulesList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All the rules </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> forbidden error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public RiskRulesList getRuleWhitelist(String acceptLanguage) throws ApiException {
    return getRuleWhitelistWithHttpInfo(acceptLanguage).getData();
  }

  /**
   * Get a list of whitelisted rules
   * Return all rules
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;RiskRulesList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> All the rules </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> forbidden error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RiskRulesList> getRuleWhitelistWithHttpInfo(String acceptLanguage) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/antifraud/whitelists";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));

    
    
    final String[] localVarAccepts = {
      "application/vnd.conekta-v2.1.0+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<RiskRulesList> localVarReturnType = new GenericType<RiskRulesList>() {};

    return apiClient.invokeAPI("AntifraudApi.getRuleWhitelist", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
