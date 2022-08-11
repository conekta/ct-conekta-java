package conekta.io.client.impl;

import conekta.io.Utils;
import conekta.io.client.ConektaResponse;
import conekta.io.config.ConektaAuthenticator;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.model.PaginatedConektaObject;
import conekta.io.model.impl.Customer;
import conekta.io.model.impl.Webhook;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

class CustomersClientTest {

    private MockWebServer mockWebServer;
    private CustomersClient customersClient;

    @BeforeEach
    void generateAuthenticator() {
        this.mockWebServer = new MockWebServer();
        this.customersClient = new CustomersClient();
        customersClient.setEnvironment(mockWebServer.url("/").toString());
        ConektaAuthenticator.getInstance();
        ConektaAuthenticator.setCredentials("USER", "");
    }

    @Test
    void createCustomer() throws URISyntaxException, IOException, InterruptedException {
        // Arrange
        String customerJson = Utils.readFile("customer.json");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, Customer.class);
        mockWebServer.enqueue(new MockResponse()
                .addHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .addHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setBody(customerJson)
                .setResponseCode(200));

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.createCustomer(cus);

        // Assert
        Assertions.assertEquals(customerConektaResponse.getData(), cus);
    }

    @Test
    void retrieveCustomer() throws IOException, URISyntaxException, InterruptedException {
        // Arrange
        String customerJson = Utils.readFile("customer.json");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, Customer.class);
        mockWebServer.enqueue(new MockResponse()
                .addHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .addHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setBody(customerJson)
                .setResponseCode(200));

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.retrieveCustomer("1");

        // Assert
        Assertions.assertEquals(customerConektaResponse.getData(), cus);
    }

    @Test
    void getCustomers() throws IOException, InterruptedException, URISyntaxException {
        String customerJson = Utils.readFile("customer.json");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, Customer.class);
        PaginatedConektaObject<Customer> paginatedConektaObject = new PaginatedConektaObject<>();
        paginatedConektaObject.setData(List.of(cus));
        String s = ConektaObjectMapper.getInstance().conektaObjectToString(paginatedConektaObject);
        mockWebServer.enqueue(new MockResponse()
                .addHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .addHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setBody(s)
                .setResponseCode(200));

        // Act
        ConektaResponse<PaginatedConektaObject<Customer>> customers = customersClient.getCustomers(null);

        // Assert
        Assertions.assertEquals(customers.getData().getData().get(0), cus);
    }

    @Test
    void updateCustomer() throws IOException, InterruptedException, URISyntaxException {
        String customerJson = Utils.readFile("customer.json");
        String customerJsonModified = Utils.readFile("customerModified.json");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, Customer.class);
        Customer cusModified = ConektaObjectMapper.getInstance().stringJsonToObject(customerJsonModified, Customer.class);
        mockWebServer.enqueue(new MockResponse()
                .addHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .addHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setBody(customerJsonModified)
                .setResponseCode(200));

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.updateCustomer("1", cusModified);

        // Assert
        Assertions.assertEquals(customerConektaResponse.getData(), cusModified);
        Assertions.assertNotEquals(cus, customerConektaResponse.getData());
        Assertions.assertNotEquals(cus, cusModified);

    }

    @Test
    void deleteCustomer() throws IOException, URISyntaxException, InterruptedException {
        // Arrange
        String customerJson = Utils.readFile("customer.json");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, Customer.class);
        cus.setDeleted(true);
        String deletedJson = ConektaObjectMapper.getInstance().conektaObjectToString(cus);
        mockWebServer.enqueue(new MockResponse()
                .addHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .addHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setBody(deletedJson)
                .setResponseCode(200));

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.deleteCustomer("1");

        // Assert
        Assertions.assertEquals(customerConektaResponse.getData(), cus);
    }

    @Test
    void getCustomerWebhooks() throws IOException, URISyntaxException, InterruptedException {
        // Arrange
        String webhookJson = Utils.readFile("webhook.json");
        Webhook webhook = ConektaObjectMapper.getInstance().stringJsonToObject(webhookJson, Webhook.class);
        PaginatedConektaObject<Webhook> paginatedConektaObject = new PaginatedConektaObject<>();
        paginatedConektaObject.setData(List.of(webhook));
        String s = ConektaObjectMapper.getInstance().conektaObjectToString(paginatedConektaObject);
        mockWebServer.enqueue(new MockResponse()
                .addHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .addHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setBody(s)
                .setResponseCode(200));

        // Act
        ConektaResponse<PaginatedConektaObject<Webhook>> customerWebhooks = customersClient.getCustomerWebhooks("1", null);

        // Assert
        Assertions.assertEquals(customerWebhooks.getData(), paginatedConektaObject);
    }
}