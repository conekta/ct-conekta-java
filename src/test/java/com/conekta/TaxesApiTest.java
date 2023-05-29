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
import com.conekta.model.OrderTaxRequest;
import com.conekta.model.UpdateOrderTaxRequest;
import com.conekta.model.UpdateOrderTaxResponse;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxesApi
 */
public class TaxesApiTest {

    private final TaxesApi api = new TaxesApi(new ApiClient().setBasePath(Utils.getBasePath()));

    /**
     * Create Tax
     *
     * Create new taxes for an existing orden
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ordersCreateTaxesTest() throws ApiException {
        String id = "ord_2tUigJ8DgBhbp6w5D";
        OrderTaxRequest orderTaxRequest = new OrderTaxRequest();
        orderTaxRequest.setAmount(1000L);
        orderTaxRequest.setDescription("Test");
        String acceptLanguage = "es";
        UpdateOrderTaxResponse response = api.ordersCreateTaxes(id, orderTaxRequest, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Delete Tax
     *
     * Delete taxes for an existing orden
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ordersDeleteTaxesTest() throws ApiException {
        String id = "ord_2tUigJ8DgBhbp6w5D";
        String taxId = "tax_lin_2tVzVp6AAptCRHhgt";
        String acceptLanguage = "es";
        UpdateOrderTaxResponse response = api.ordersDeleteTaxes(id, taxId, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Update Tax
     *
     * Update taxes for an existing orden
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ordersUpdateTaxesTest() throws ApiException {
        String id = "ord_2tUigJ8DgBhbp6w5D";
        String taxId = "tax_lin_2tVzVp6AAptCRHhgt";
        UpdateOrderTaxRequest updateOrderTaxRequest = new UpdateOrderTaxRequest();
        updateOrderTaxRequest.setAmount(1300L);
        String acceptLanguage = "es";
        UpdateOrderTaxResponse response = api.ordersUpdateTaxes(id, taxId, updateOrderTaxRequest, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

}
