package com.conekta;

import com.conekta.ApiException;
import com.conekta.ApiClient;
import com.conekta.ApiResponse;
import com.conekta.Configuration;
import com.conekta.Pair;

import javax.ws.rs.core.GenericType;

import com.conekta.model.ChargebackEvidenceFileResponse;
import com.conekta.model.ChargebackEvidenceTypeResponse;
import com.conekta.model.ChargebackFilesBatchResponse;
import com.conekta.model.Error;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class ChargebacksApi {
  private ApiClient apiClient;

  public ChargebacksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChargebacksApi(ApiClient apiClient) {
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
   * Get Chargeback Evidence Types
   * Retrieve the catalog of evidence types accepted for a chargeback, including which are mandatory and their allowed file formats.
   * @param chargeId Identifier of the charge resource (required)
   * @param chargebackId Identifier of the chargeback resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return List&lt;ChargebackEvidenceTypeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The list of evidence types accepted for the chargeback. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public List<ChargebackEvidenceTypeResponse> getChargebackEvidenceTypes(@javax.annotation.Nonnull String chargeId, @javax.annotation.Nonnull String chargebackId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    return getChargebackEvidenceTypesWithHttpInfo(chargeId, chargebackId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Get Chargeback Evidence Types
   * Retrieve the catalog of evidence types accepted for a chargeback, including which are mandatory and their allowed file formats.
   * @param chargeId Identifier of the charge resource (required)
   * @param chargebackId Identifier of the chargeback resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;List&lt;ChargebackEvidenceTypeResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The list of evidence types accepted for the chargeback. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ChargebackEvidenceTypeResponse>> getChargebackEvidenceTypesWithHttpInfo(@javax.annotation.Nonnull String chargeId, @javax.annotation.Nonnull String chargebackId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (chargeId == null) {
      throw new ApiException(400, "Missing the required parameter 'chargeId' when calling getChargebackEvidenceTypes");
    }
    if (chargebackId == null) {
      throw new ApiException(400, "Missing the required parameter 'chargebackId' when calling getChargebackEvidenceTypes");
    }

    // Path parameters
    String localVarPath = "/charges/{charge_id}/chargebacks/{chargeback_id}/evidence-types"
            .replaceAll("\\{charge_id}", apiClient.escapeString(chargeId.toString()))
            .replaceAll("\\{chargeback_id}", apiClient.escapeString(chargebackId.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.3.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<List<ChargebackEvidenceTypeResponse>> localVarReturnType = new GenericType<List<ChargebackEvidenceTypeResponse>>() {};
    return apiClient.invokeAPI("ChargebacksApi.getChargebackEvidenceTypes", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Chargeback File
   * Retrieve the metadata and a presigned download URL for a single chargeback evidence file.
   * @param chargeId Identifier of the charge resource (required)
   * @param chargebackId Identifier of the chargeback resource (required)
   * @param fileId Identifier of the chargeback evidence file (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ChargebackEvidenceFileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The requested evidence file. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ChargebackEvidenceFileResponse getChargebackFile(@javax.annotation.Nonnull String chargeId, @javax.annotation.Nonnull String chargebackId, @javax.annotation.Nonnull String fileId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    return getChargebackFileWithHttpInfo(chargeId, chargebackId, fileId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Get Chargeback File
   * Retrieve the metadata and a presigned download URL for a single chargeback evidence file.
   * @param chargeId Identifier of the charge resource (required)
   * @param chargebackId Identifier of the chargeback resource (required)
   * @param fileId Identifier of the chargeback evidence file (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;ChargebackEvidenceFileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The requested evidence file. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChargebackEvidenceFileResponse> getChargebackFileWithHttpInfo(@javax.annotation.Nonnull String chargeId, @javax.annotation.Nonnull String chargebackId, @javax.annotation.Nonnull String fileId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (chargeId == null) {
      throw new ApiException(400, "Missing the required parameter 'chargeId' when calling getChargebackFile");
    }
    if (chargebackId == null) {
      throw new ApiException(400, "Missing the required parameter 'chargebackId' when calling getChargebackFile");
    }
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getChargebackFile");
    }

    // Path parameters
    String localVarPath = "/charges/{charge_id}/chargebacks/{chargeback_id}/files/{file_id}"
            .replaceAll("\\{charge_id}", apiClient.escapeString(chargeId.toString()))
            .replaceAll("\\{chargeback_id}", apiClient.escapeString(chargebackId.toString()))
            .replaceAll("\\{file_id}", apiClient.escapeString(fileId.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.3.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ChargebackEvidenceFileResponse> localVarReturnType = new GenericType<ChargebackEvidenceFileResponse>() {};
    return apiClient.invokeAPI("ChargebacksApi.getChargebackFile", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Chargeback Files
   * Retrieve the list of evidence files uploaded for a chargeback.
   * @param chargeId Identifier of the charge resource (required)
   * @param chargebackId Identifier of the chargeback resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return List&lt;ChargebackEvidenceFileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of evidence files for the chargeback. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public List<ChargebackEvidenceFileResponse> getChargebackFiles(@javax.annotation.Nonnull String chargeId, @javax.annotation.Nonnull String chargebackId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    return getChargebackFilesWithHttpInfo(chargeId, chargebackId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Get Chargeback Files
   * Retrieve the list of evidence files uploaded for a chargeback.
   * @param chargeId Identifier of the charge resource (required)
   * @param chargebackId Identifier of the chargeback resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;List&lt;ChargebackEvidenceFileResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of evidence files for the chargeback. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ChargebackEvidenceFileResponse>> getChargebackFilesWithHttpInfo(@javax.annotation.Nonnull String chargeId, @javax.annotation.Nonnull String chargebackId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (chargeId == null) {
      throw new ApiException(400, "Missing the required parameter 'chargeId' when calling getChargebackFiles");
    }
    if (chargebackId == null) {
      throw new ApiException(400, "Missing the required parameter 'chargebackId' when calling getChargebackFiles");
    }

    // Path parameters
    String localVarPath = "/charges/{charge_id}/chargebacks/{chargeback_id}/files"
            .replaceAll("\\{charge_id}", apiClient.escapeString(chargeId.toString()))
            .replaceAll("\\{chargeback_id}", apiClient.escapeString(chargebackId.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.3.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<List<ChargebackEvidenceFileResponse>> localVarReturnType = new GenericType<List<ChargebackEvidenceFileResponse>>() {};
    return apiClient.invokeAPI("ChargebacksApi.getChargebackFiles", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Upload Chargeback Evidence Files (Batch)
   * Uploads multiple evidence files for a chargeback in a single request. Each part of the multipart body must be keyed by an evidence type (see the evidence-types endpoint for the valid values for this chargeback), with exactly one file per evidence type. Limits: at most 10 files per request, at most 2MB per file, and only application/pdf, image/jpeg or image/png content is accepted. The chargeback must be in the &#x60;action_required&#x60; status, and none of the submitted evidence types may already exist on the chargeback. On success the chargeback transitions to &#x60;pending_review&#x60;.
   * @param chargeId Identifier of the charge resource (required)
   * @param chargebackId Identifier of the chargeback resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param chargeInformation  (optional)
   * @param contract  (optional)
   * @param otherEvidence  (optional)
   * @param receiptOfShipment  (optional)
   * @param identification  (optional)
   * @param orderDetails  (optional)
   * @param termsAndConditions  (optional)
   * @param cardholderInformation  (optional)
   * @param proofInvalidateClaim  (optional)
   * @param internalValidations  (optional)
   * @param proofOfCancellation  (optional)
   * @param recurringContract  (optional)
   * @param proofOfReturn  (optional)
   * @param exhibit8  (optional)
   * @param duplicateAnalysis  (optional)
   * @param fullEvidence  (optional)
   * @return ChargebackFilesBatchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Files uploaded successfully. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ChargebackFilesBatchResponse uploadChargebackFilesBatch(@javax.annotation.Nonnull String chargeId, @javax.annotation.Nonnull String chargebackId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId, @javax.annotation.Nullable File chargeInformation, @javax.annotation.Nullable File contract, @javax.annotation.Nullable File otherEvidence, @javax.annotation.Nullable File receiptOfShipment, @javax.annotation.Nullable File identification, @javax.annotation.Nullable File orderDetails, @javax.annotation.Nullable File termsAndConditions, @javax.annotation.Nullable File cardholderInformation, @javax.annotation.Nullable File proofInvalidateClaim, @javax.annotation.Nullable File internalValidations, @javax.annotation.Nullable File proofOfCancellation, @javax.annotation.Nullable File recurringContract, @javax.annotation.Nullable File proofOfReturn, @javax.annotation.Nullable File exhibit8, @javax.annotation.Nullable File duplicateAnalysis, @javax.annotation.Nullable File fullEvidence) throws ApiException {
    return uploadChargebackFilesBatchWithHttpInfo(chargeId, chargebackId, acceptLanguage, xChildCompanyId, chargeInformation, contract, otherEvidence, receiptOfShipment, identification, orderDetails, termsAndConditions, cardholderInformation, proofInvalidateClaim, internalValidations, proofOfCancellation, recurringContract, proofOfReturn, exhibit8, duplicateAnalysis, fullEvidence).getData();
  }

  /**
   * Upload Chargeback Evidence Files (Batch)
   * Uploads multiple evidence files for a chargeback in a single request. Each part of the multipart body must be keyed by an evidence type (see the evidence-types endpoint for the valid values for this chargeback), with exactly one file per evidence type. Limits: at most 10 files per request, at most 2MB per file, and only application/pdf, image/jpeg or image/png content is accepted. The chargeback must be in the &#x60;action_required&#x60; status, and none of the submitted evidence types may already exist on the chargeback. On success the chargeback transitions to &#x60;pending_review&#x60;.
   * @param chargeId Identifier of the charge resource (required)
   * @param chargebackId Identifier of the chargeback resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param chargeInformation  (optional)
   * @param contract  (optional)
   * @param otherEvidence  (optional)
   * @param receiptOfShipment  (optional)
   * @param identification  (optional)
   * @param orderDetails  (optional)
   * @param termsAndConditions  (optional)
   * @param cardholderInformation  (optional)
   * @param proofInvalidateClaim  (optional)
   * @param internalValidations  (optional)
   * @param proofOfCancellation  (optional)
   * @param recurringContract  (optional)
   * @param proofOfReturn  (optional)
   * @param exhibit8  (optional)
   * @param duplicateAnalysis  (optional)
   * @param fullEvidence  (optional)
   * @return ApiResponse&lt;ChargebackFilesBatchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Files uploaded successfully. </td><td>  * Date - The date and time that the response was sent <br>  * Content-Type - The format of the response body <br>  * Content-Length - The length of the response body in bytes <br>  * Connection - The type of connection used to transfer the response <br>  * Conekta-Media-Type -  <br>  </td></tr>
       <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChargebackFilesBatchResponse> uploadChargebackFilesBatchWithHttpInfo(@javax.annotation.Nonnull String chargeId, @javax.annotation.Nonnull String chargebackId, @javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable String xChildCompanyId, @javax.annotation.Nullable File chargeInformation, @javax.annotation.Nullable File contract, @javax.annotation.Nullable File otherEvidence, @javax.annotation.Nullable File receiptOfShipment, @javax.annotation.Nullable File identification, @javax.annotation.Nullable File orderDetails, @javax.annotation.Nullable File termsAndConditions, @javax.annotation.Nullable File cardholderInformation, @javax.annotation.Nullable File proofInvalidateClaim, @javax.annotation.Nullable File internalValidations, @javax.annotation.Nullable File proofOfCancellation, @javax.annotation.Nullable File recurringContract, @javax.annotation.Nullable File proofOfReturn, @javax.annotation.Nullable File exhibit8, @javax.annotation.Nullable File duplicateAnalysis, @javax.annotation.Nullable File fullEvidence) throws ApiException {
    // Check required parameters
    if (chargeId == null) {
      throw new ApiException(400, "Missing the required parameter 'chargeId' when calling uploadChargebackFilesBatch");
    }
    if (chargebackId == null) {
      throw new ApiException(400, "Missing the required parameter 'chargebackId' when calling uploadChargebackFilesBatch");
    }

    // Path parameters
    String localVarPath = "/charges/{charge_id}/chargebacks/{chargeback_id}/files/batch"
            .replaceAll("\\{charge_id}", apiClient.escapeString(chargeId.toString()))
            .replaceAll("\\{chargeback_id}", apiClient.escapeString(chargebackId.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (chargeInformation != null) {
      localVarFormParams.put("charge_information", chargeInformation);
    }
    if (contract != null) {
      localVarFormParams.put("contract", contract);
    }
    if (otherEvidence != null) {
      localVarFormParams.put("other_evidence", otherEvidence);
    }
    if (receiptOfShipment != null) {
      localVarFormParams.put("receipt_of_shipment", receiptOfShipment);
    }
    if (identification != null) {
      localVarFormParams.put("identification", identification);
    }
    if (orderDetails != null) {
      localVarFormParams.put("order_details", orderDetails);
    }
    if (termsAndConditions != null) {
      localVarFormParams.put("terms_and_conditions", termsAndConditions);
    }
    if (cardholderInformation != null) {
      localVarFormParams.put("cardholder_information", cardholderInformation);
    }
    if (proofInvalidateClaim != null) {
      localVarFormParams.put("proof_invalidate_claim", proofInvalidateClaim);
    }
    if (internalValidations != null) {
      localVarFormParams.put("internal_validations", internalValidations);
    }
    if (proofOfCancellation != null) {
      localVarFormParams.put("proof_of_cancellation", proofOfCancellation);
    }
    if (recurringContract != null) {
      localVarFormParams.put("recurring_contract", recurringContract);
    }
    if (proofOfReturn != null) {
      localVarFormParams.put("proof_of_return", proofOfReturn);
    }
    if (exhibit8 != null) {
      localVarFormParams.put("exhibit_8", exhibit8);
    }
    if (duplicateAnalysis != null) {
      localVarFormParams.put("duplicate_analysis", duplicateAnalysis);
    }
    if (fullEvidence != null) {
      localVarFormParams.put("full_evidence", fullEvidence);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.conekta-v2.3.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ChargebackFilesBatchResponse> localVarReturnType = new GenericType<ChargebackFilesBatchResponse>() {};
    return apiClient.invokeAPI("ChargebacksApi.uploadChargebackFilesBatch", localVarPath, "POST", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
