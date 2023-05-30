/*
 * Conekta API
 * Conekta sdk
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: engineering@conekta.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.conekta;

import com.conekta.*;
import com.conekta.auth.*;
import com.conekta.model.Error;
import com.conekta.model.LogResponse;
import com.conekta.model.LogsResponse;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogsApi
 */
public class LogsApiTest {

    private final LogsApi api = new LogsApi(new ApiClient().setBasePath(Utils.getBasePath()));

    /**
     * Get Log
     *
     * Get the details of a specific log
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLogByIdTest() throws ApiException {
        String id = "6419dd15b985080001fc280e";
        String acceptLanguage = "es";
        LogResponse response = api.getLogById(id, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Get List Of Logs
     *
     * Get log details in the form of a list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLogsTest() throws ApiException {
        String acceptLanguage = "es";
        Integer limit = 20;
        LogsResponse response = api.getLogs(acceptLanguage, null, limit, null, null, null);
        Assertions.assertNotNull(response);
    }

}