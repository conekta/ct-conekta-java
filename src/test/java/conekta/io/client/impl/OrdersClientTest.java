package conekta.io.client.impl;

import conekta.io.Utils;
import conekta.io.config.ConektaAuthenticator;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.model.request.OrderReq;
import conekta.io.model.response.Order;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class OrdersClientTest {

    private MockWebServer mockWebServer;
    private OrdersClient ordersClient;

    @BeforeEach
    void generateAuthenticator() {
        this.mockWebServer = new MockWebServer();
        this.ordersClient = new OrdersClient();
        ordersClient.setEnvironment(mockWebServer.url("/").toString());
        ConektaAuthenticator.getInstance();
        ConektaAuthenticator.setCredentials("USER", "");
    }

    @Test
    void createOrder() throws URISyntaxException, IOException, InterruptedException {
        // Arrange
        String orderRequestJson = Utils.readFile("order.json");
        String orderResponseJson = Utils.readFile("orderResponse.json");
        OrderReq orderReq = ConektaObjectMapper.getInstance().stringJsonToObject(orderRequestJson, OrderReq.class);
        Order orderResp = ConektaObjectMapper.getInstance().stringJsonToObject(orderResponseJson, Order.class);
        mockWebServer.enqueue(new MockResponse()
                .addHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .addHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setBody(orderResponseJson)
                .setResponseCode(200));

        // Act
        Order order = ordersClient.createOrder(orderReq);

        // Assert
        Assertions.assertEquals(order, orderResp);
    }


    @Test
    void updateOrder() throws IOException, InterruptedException, URISyntaxException {
        String orderUpdateRequest = Utils.readFile("orderUpdateRequest.json");
        String orderJsonModified = Utils.readFile("orderModified.json");
        OrderReq orderReq = ConektaObjectMapper.getInstance().stringJsonToObject(orderUpdateRequest, OrderReq.class);
        Order ordModified = ConektaObjectMapper.getInstance().stringJsonToObject(orderJsonModified, Order.class);
        mockWebServer.enqueue(new MockResponse()
                .addHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .addHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setBody(orderJsonModified)
                .setResponseCode(200));

        // Act
        Order order = ordersClient.updateOrder("1", orderReq);

        // Assert
        Assertions.assertNotNull(order.getCustomerInfo());
        Assertions.assertEquals(order.getCustomerInfo().getName(), ordModified.getCustomerInfo().getName());
        Assertions.assertEquals(order.getCustomerInfo().getEmail(), ordModified.getCustomerInfo().getEmail());
    }
}
