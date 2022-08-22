package conekta.io.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import conekta.io.client.ConektaRequestor;
import conekta.io.client.ConektaResponse;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.error.ConektaErrorResponse;
import conekta.io.model.PaginatedConektaObject;
import conekta.io.model.request.OrderReq;
import conekta.io.model.response.Order;
import conekta.io.model.submodel.Charge;

import java.net.http.HttpResponse;

public class OrdersClient extends ConektaRequestor {

    /**
     * Creates a new order.
     *
     * @param orderReq The order request.
     * @return The order.
     */
    public ConektaResponse<Order> createOrder(OrderReq orderReq) {
        HttpResponse<String> orderResponse = doRequest(orderReq, Constants.ORDERS_PATH, Constants.POST);
        return ConektaResponse.<Order>builder()
                .response(orderResponse)
                .statusCode(orderResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), Order.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Updates an order.
     *
     * @param orderReq The updated information.
     * @param orderId  The order id.
     * @return The order.
     */
    public ConektaResponse<Order> updateOrder(String orderId, OrderReq orderReq) {
        HttpResponse<String> orderResponse = doRequest(orderReq, Constants.ORDERS_PATH + Constants.SLASH + orderId, Constants.PUT);
        return ConektaResponse.<Order>builder()
                .response(orderResponse)
                .statusCode(orderResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), Order.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Retrieves an order.
     *
     * @param orderId The order id.
     * @return The order.
     */
    public ConektaResponse<Order> retrieveOrder(String orderId) {
        HttpResponse<String> orderResponse = doRequest(null, Constants.ORDERS_PATH + Constants.SLASH + orderId, Constants.GET);
        return ConektaResponse.<Order>builder()
                .response(orderResponse)
                .statusCode(orderResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), Order.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    public ConektaResponse<PaginatedConektaObject<Charge>> getOrderCharges(String orderId, String next) {
        HttpResponse<String> customerResponse = doRequest(null, Constants.ORDERS_PATH + Constants.SLASH + orderId + Constants.CHARGES + (next != null ? next : ""), Constants.GET);
        return ConektaResponse.<PaginatedConektaObject<Charge>>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), new TypeReference<PaginatedConektaObject<Charge>>() {
                }))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    public ConektaResponse<PaginatedConektaObject<Order>> getOrders(String next) {
        HttpResponse<String> customerResponse = doRequest(null, Constants.ORDERS_PATH + Constants.SLASH + (next != null ? next : ""), Constants.GET);
        return ConektaResponse.<PaginatedConektaObject<Order>>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), new TypeReference<PaginatedConektaObject<Order>>() {
                }))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }
}