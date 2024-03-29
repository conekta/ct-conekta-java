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
import com.conekta.model.CustomerShippingContacts;
import com.conekta.model.CustomerShippingContactsResponse;
import com.conekta.model.CustomerUpdateShippingContacts;
import com.conekta.model.Error;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShippingContactsApi
 */
public class ShippingContactsApiTest {

    private final ShippingContactsApi api = new ShippingContactsApi(new ApiClient().setBasePath(Utils.getBasePath()));

    /**
     * Create a shipping contacts
     *
     * Create a shipping contacts for a customer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomerShippingContactsTest() throws ApiException {
        String id = "cus_2tYENskzTjjgkGQLt";
        CustomerShippingContacts customerShippingContacts = new CustomerShippingContacts();
        customerShippingContacts.setPhone("55454545454");
        String acceptLanguage = "es";
        CustomerShippingContactsResponse response = api.createCustomerShippingContacts(id, customerShippingContacts, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Delete shipping contacts
     *
     * Delete shipping contact that corresponds to a customer ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomerShippingContactsTest() throws ApiException {
        String id = "cus_2tYENskzTjjgkGQLt";
        String shippingContactsId = "ship_cont_2tY2ncFSBLUaohto2";
        String acceptLanguage = "es";
        CustomerShippingContactsResponse response = api.deleteCustomerShippingContacts(id, shippingContactsId, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Update shipping contacts
     *
     * Update shipping contact that corresponds to a customer ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomerShippingContactsTest() throws ApiException {
        String id = "cus_2tYENskzTjjgkGQLt";
        String shippingContactsId = "ship_cont_2tY2ncFSBLUaohto2";
        CustomerUpdateShippingContacts customerUpdateShippingContacts = new CustomerUpdateShippingContacts();
        customerUpdateShippingContacts.setPhone("55454545455");
        String acceptLanguage = "es";
        CustomerShippingContactsResponse response = api.updateCustomerShippingContacts(id, shippingContactsId, customerUpdateShippingContacts, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

}
