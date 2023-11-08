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

import com.conekta.model.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * API tests for OrdersApi
 */
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi(new ApiClient().setBasePath(Utils.getBasePath()));

    /**
     * Cancel Order
     *
     * Cancel an order that has been previously created.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelOrderTest() throws ApiException {
        String id = "ord_2tqaGQYZyvBsMKEgs";
        String acceptLanguage = "es";
        OrderResponse response = api.cancelOrder(id, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Create order
     *
     * Create a new order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrderTest() throws ApiException {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setCurrency("MXN");
        orderRequest.setFiscalEntity(new OrderFiscalEntityRequest().metadata(new HashMap<>()));
        orderRequest.setShippingContact(new CustomerShippingContacts().metadata(new HashMap<>()));
        CustomerInfoJustCustomerId customer = new CustomerInfoJustCustomerId();
        customer.setCustomerId("cus_2tYENskzTjjgkGQLt");
        orderRequest.setCustomerInfo(new OrderRequestCustomerInfo(customer));
        ChargeRequest chargeRequest = new ChargeRequest();
        chargeRequest.setAmount(1000);
        orderRequest.setCharges(List.of(chargeRequest));
        String acceptLanguage = "es";

        OrderResponse response = api.createOrder(orderRequest, acceptLanguage, null);

        Assertions.assertNotNull(response);
    }

    /**
     * Get Order
     *
     * Info for a specific order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws ApiException {
        String id = "ord_2tUigJ8DgBhbp6w5D";
        String acceptLanguage = "es";
        OrderResponse response = api.getOrderById(id, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Get a list of Orders
     *
     * Get order details in the form of a list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrdersTest() throws ApiException {
        String acceptLanguage = "es";
        Integer limit = 20;
        GetOrdersResponse response = api.getOrders(acceptLanguage, null, limit, null, null, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Cancel Refund
     *
     * A refunded order describes the items, amount, and reason an order is being refunded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void orderCancelRefundTest() throws ApiException {
        String id = "ord_2tUigJ8DgBhbp6w5D";
        String refundId = "6407b5bee1329a000175ba11";
        String acceptLanguage = "es";
        OrderResponse response = api.orderCancelRefund(id, refundId, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Refund Order
     *
     * A refunded order describes the items, amount, and reason an order is being refunded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void orderRefundTest() throws ApiException {
        String id = "ord_2tUigJ8DgBhbp6w5D";
        OrderRefundRequest orderRefundRequest = new OrderRefundRequest();
        orderRefundRequest.setAmount(1500);
        String acceptLanguage = "es";
        OrderResponse response = api.orderRefund(id, orderRefundRequest, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Capture Order
     *
     * Processes an order that has been previously authorized.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ordersCreateCaptureTest() throws ApiException {
        String id = "ord_2tUigJ8DgBhbp6w5D";
        String acceptLanguage = "es";
        OrderCaptureRequest orderCaptureRequest = new OrderCaptureRequest();
        orderCaptureRequest.setAmount(1000L);
        OrderResponse response = api.ordersCreateCapture(id, acceptLanguage, null, orderCaptureRequest);
        Assertions.assertNotNull(response);
    }

    /**
     * Update Order
     *
     * Update an existing Order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrderTest() throws ApiException {
        String id = "ord_2tUigJ8DgBhbp6w5D";
        OrderUpdateRequest orderUpdateRequest = new OrderUpdateRequest();
        orderUpdateRequest.setCurrency("MXN");
        String acceptLanguage = "es";
        OrderResponse response = api.updateOrder(id, orderUpdateRequest, acceptLanguage);
        Assertions.assertNotNull(response);
    }

}
