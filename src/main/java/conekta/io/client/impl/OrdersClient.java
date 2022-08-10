package conekta.io.client.impl;

import conekta.io.client.ConektaRequestor;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.model.request.OrderReq;
import conekta.io.model.response.Order;

import java.io.IOException;
import java.net.http.HttpResponse;

public class OrdersClient extends ConektaRequestor {

    /**
     * Creates a new order.
     *
     * @param order The Order to be created.
     * @return The created order.
     * @throws IOException          If an error occurs while communicating with the API.
     * @throws InterruptedException If the thread is interrupted while communicating with the API.
     */
    public Order createOrder(OrderReq orderReq) throws IOException, InterruptedException {
        HttpResponse<String> orderResponse = doRequest(orderReq, Constants.ORDERS_PATH, Constants.POST);
        Order cosa = ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), Order.class);
        return cosa;
    }
}
