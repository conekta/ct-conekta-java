package conekta.io.client.impl;

import conekta.io.Utils;
import conekta.io.client.ConektaResponse;
import conekta.io.config.ConektaAuthenticator;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.error.ConektaError;
import conekta.io.model.PaginatedConektaObject;
import conekta.io.model.impl.Order;
import conekta.io.model.request.OrderRefundReq;
import conekta.io.model.request.OrderReq;
import conekta.io.model.submodel.Charge;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;

class OrdersClientTest {

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
        String orderRequestJson = Utils.readFile("orders/order.json");
        String orderResponseJson = Utils.readFile("orders/orderResponse.json");
        OrderReq orderReq = ConektaObjectMapper.getInstance().stringJsonToObject(orderRequestJson, OrderReq.class);
        Order orderResp = ConektaObjectMapper.getInstance().stringJsonToObject(orderResponseJson, Order.class);

        Utils.buildMockServer(this.mockWebServer, orderResponseJson, 200);

        // Act
        ConektaResponse<Order> order = ordersClient.createOrder(orderReq);

        // Assert
        Assertions.assertEquals(order.getData(), orderResp);
    }

    @Test
    void createOrderFail() throws URISyntaxException, IOException, InterruptedException {
        // Arrange
        String orderRequestJson = Utils.readFile("orders/order.json");
        String orderResponseFailJson = Utils.readFile("orders/orderCreateResponseFail.json");
        OrderReq orderReq = ConektaObjectMapper.getInstance().stringJsonToObject(orderRequestJson, OrderReq.class);
        ConektaError orderResp = ConektaObjectMapper.getInstance().stringJsonToObject(orderResponseFailJson, ConektaError.class);

        Utils.buildMockServer(this.mockWebServer, orderResponseFailJson, 404);

        // Act
        ConektaResponse<Order> order = ordersClient.createOrder(orderReq);

        // Assert
        Assertions.assertNotNull(order.getError());
        Assertions.assertEquals(order.getError().getCode(), orderResp.getCode());
    }

    @Test
    void updateOrder() throws IOException, InterruptedException, URISyntaxException {
        String orderUpdateRequest = Utils.readFile("orders/orderUpdateRequest.json");
        String orderJsonModified = Utils.readFile("orders/orderModified.json");
        OrderReq orderReq = ConektaObjectMapper.getInstance().stringJsonToObject(orderUpdateRequest, OrderReq.class);
        Order ordModified = ConektaObjectMapper.getInstance().stringJsonToObject(orderJsonModified, Order.class);

        Utils.buildMockServer(this.mockWebServer, orderJsonModified, 200);

        // Act
        ConektaResponse<Order> order = ordersClient.updateOrder("1", orderReq);

        // Assert
        Assertions.assertNotNull(order.getData().getCustomerInfo());
        Assertions.assertEquals(order.getData().getCustomerInfo().getName(), ordModified.getCustomerInfo().getName());
        Assertions.assertEquals(order.getData().getCustomerInfo().getEmail(), ordModified.getCustomerInfo().getEmail());
    }

    @Test
    void updateOrderFail() throws IOException, InterruptedException, URISyntaxException {
        // Arrange
        String orderRequestJson = Utils.readFile("orders/order.json");
        String orderUpdateRespFailJson = Utils.readFile("orders/orderUpdateResponseFail.json");
        OrderReq orderReq = ConektaObjectMapper.getInstance().stringJsonToObject(orderRequestJson, OrderReq.class);
        ConektaError orderResp = ConektaObjectMapper.getInstance().stringJsonToObject(orderUpdateRespFailJson, ConektaError.class);

        Utils.buildMockServer(this.mockWebServer, orderUpdateRespFailJson, 404);

        // Act
        ConektaResponse<Order> order = ordersClient.updateOrder("1", orderReq);

        // Assert
        Assertions.assertNotNull(order.getError());
        Assertions.assertEquals(order.getError().getCode(), orderResp.getCode());
    }

    @Test
    void getOrder() throws IOException, InterruptedException, URISyntaxException {
        String orderJson = Utils.readFile("orders/orderResponse.json");
        Order order = ConektaObjectMapper.getInstance().stringJsonToObject(orderJson, Order.class);

        Utils.buildMockServer(this.mockWebServer, orderJson, 200);

        // Act
        ConektaResponse<Order> orderResponse = ordersClient.retrieveOrder("1");
        // Assert
        Assertions.assertEquals(orderResponse.getData(), order);
    }

    @Test
    void getChargesOrder() throws IOException, URISyntaxException {
        // Arrange
        String orderChargesResponse = Utils.readFile("orders/orderChargesResponse.json");
        String orderCharge = Utils.readFile("orders/orderCharge.json");

        Charge charge = ConektaObjectMapper.getInstance().stringJsonToObject(orderCharge, Charge.class);

        Utils.buildMockServer(this.mockWebServer, orderChargesResponse, 200);

        // Act
        ConektaResponse<PaginatedConektaObject<Charge>> order = ordersClient.getOrderCharges("1", null);

        // Assert
        Assertions.assertNotNull(order.getData().getData());
        Assertions.assertEquals(order.getData().getData().get(0).getAmount().toString(), charge.getAmount().toString());
    }

    @Test
    void getChargesOrderFail() throws IOException, URISyntaxException {
        // Arrange
        String orderChargesFailResponse = Utils.readFile("orders/orderChargesFail.json");
        ConektaError orderResp = ConektaObjectMapper.getInstance().stringJsonToObject(orderChargesFailResponse, ConektaError.class);

        Utils.buildMockServer(this.mockWebServer, orderChargesFailResponse, 404);

        // Act
        ConektaResponse<PaginatedConektaObject<Charge>> order = ordersClient.getOrderCharges("1", null);

        // Assert
        Assertions.assertNotNull(order.getError());
        Assertions.assertEquals(order.getError().getCode(), orderResp.getCode());
    }

    @Test
    void getChargeOrder() throws IOException, URISyntaxException {
        // Arrange
        String orderChargeResponse = Utils.readFile("orders/orderChargeResponse.json");
        String orderCharge = Utils.readFile("orders/orderCharge.json");

        Charge charge = ConektaObjectMapper.getInstance().stringJsonToObject(orderCharge, Charge.class);

        Utils.buildMockServer(this.mockWebServer, orderChargeResponse, 200);

        // Act
        ConektaResponse<Charge> order = ordersClient.getOrderCharge("1", "anything");

        // Assert
        Assertions.assertNotNull(order.getData());
        Assertions.assertEquals(order.getData().getAmount().toString(), charge.getAmount().toString());
    }

    @Test
    void getChargeOrderFail() throws IOException, URISyntaxException {
        // Arrange
        String orderChargeFailResponse = Utils.readFile("orders/orderChargeFailResponse.json");
        ConektaError orderResp = ConektaObjectMapper.getInstance().stringJsonToObject(orderChargeFailResponse, ConektaError.class);

        Utils.buildMockServer(this.mockWebServer, orderChargeFailResponse, 404);

        // Act
        ConektaResponse<Charge> order = ordersClient.getOrderCharge("1", "nothing");

        // Assert
        Assertions.assertNotNull(order.getError());
        Assertions.assertEquals(order.getError().getCode(), orderResp.getCode());
    }

    @Test
    void getOrders() throws IOException, URISyntaxException {
        // Arrange
        String orderListResponse = Utils.readFile("orders/orderListResponse.json");
        String orderStr = Utils.readFile("orders/orderData.json");

        Order order = ConektaObjectMapper.getInstance().stringJsonToObject(orderStr, Order.class);

        Utils.buildMockServer(this.mockWebServer, orderListResponse, 200);

        // Act
        ConektaResponse<PaginatedConektaObject<Order>> orderResponse = ordersClient.getOrders(null);
        // Assert
        Assertions.assertNotNull(orderResponse.getData());
        Assertions.assertEquals(orderResponse.getData().getData().get(0), order);
    }

    @Test
    void getOrdersFail() throws IOException, URISyntaxException {
        // Arrange
        String orderChargesFailResponse = Utils.readFile("orders/orderChargesFail.json");
        ConektaError orderResp = ConektaObjectMapper.getInstance().stringJsonToObject(orderChargesFailResponse, ConektaError.class);

        Utils.buildMockServer(this.mockWebServer, orderChargesFailResponse, 404);

        // Act
        ConektaResponse<PaginatedConektaObject<Order>> orderResponse = ordersClient.getOrders(null);

        // Assert
        Assertions.assertNotNull(orderResponse.getError());
        Assertions.assertEquals(orderResponse.getError().getCode(), orderResp.getCode());
    }

    @Test
    void refundOrder() throws URISyntaxException, IOException, InterruptedException {
        // Arrange
        String orderRefundRequestJson = Utils.readFile("orders/orderRefundRequest.json");
        String orderRefundResponseJson = Utils.readFile("orders/orderRefundResponse.json");
        OrderRefundReq orderRefundReq = ConektaObjectMapper.getInstance().stringJsonToObject(orderRefundRequestJson, OrderRefundReq.class);
        Order orderResp = ConektaObjectMapper.getInstance().stringJsonToObject(orderRefundResponseJson, Order.class);

        Utils.buildMockServer(this.mockWebServer, orderRefundResponseJson, 200);

        // Act
        ConektaResponse<Order> order = ordersClient.refundOrder("anything", orderRefundReq);

        // Assert
        Assertions.assertEquals(order.getData(), orderResp);
    }

    @Test
    void refundOrdersFail() throws IOException, URISyntaxException {
        // Arrange
        String orderRefundRequestJson = Utils.readFile("orders/orderRefundRequest.json");
        String orderRefundFailResponse = Utils.readFile("orders/orderRefundFailResponse.json");
        OrderRefundReq orderRefundReq = ConektaObjectMapper.getInstance().stringJsonToObject(orderRefundRequestJson, OrderRefundReq.class);
        ConektaError orderResp = ConektaObjectMapper.getInstance().stringJsonToObject(orderRefundFailResponse, ConektaError.class);

        Utils.buildMockServer(this.mockWebServer, orderRefundFailResponse, 404);

        // Act
        ConektaResponse<Order> orderResponse = ordersClient.refundOrder("anything", orderRefundReq);

        // Assert
        Assertions.assertNotNull(orderResponse.getError());
        Assertions.assertEquals(orderResponse.getError().getCode(), orderResp.getCode());
    }
}