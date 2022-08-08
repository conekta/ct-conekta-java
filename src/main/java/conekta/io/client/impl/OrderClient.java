package conekta.io.client.impl;

import conekta.io.client.ConektaRequestor;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.model.impl.Order;

import java.io.IOException;
import java.net.http.HttpResponse;

public class OrderClient extends ConektaRequestor {

    /**
     * Creates a new customer.
     *
     * @param order The customer to be created.
     * @return The created order.
     * @throws IOException          If an error occurs while communicating with the API.
     * @throws InterruptedException If the thread is interrupted while communicating with the API.
     */
    public Order createOrder(Order order) throws IOException, InterruptedException {
        HttpResponse<String> orderResponse = doRequest(order, Constants.ORDERS_PATH, Constants.POST);
        return ConektaObjectMapper.getInstance().stringJsonToObject(orderResponse.body(), Order.class);
    }
}
