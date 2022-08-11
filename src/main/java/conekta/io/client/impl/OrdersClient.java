package conekta.io.client.impl;

import conekta.io.client.ConektaRequestor;
import conekta.io.client.ConektaResponse;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.error.ConektaErrorResponse;
import conekta.io.model.request.OrderReq;
import conekta.io.model.response.Order;

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


    public ConektaResponse<Order> updateOrder(String orderId, OrderReq orderReq) {
        HttpResponse<String> orderResponse = doRequest(orderReq, Constants.ORDERS_PATH + Constants.SLASH + orderId, Constants.PUT);
        return ConektaResponse.<Order>builder()
                .response(orderResponse)
                .statusCode(orderResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), Order.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), ConektaErrorResponse.class))
                .build();
    }
}
