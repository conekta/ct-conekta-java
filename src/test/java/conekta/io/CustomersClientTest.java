package conekta.io;

import conekta.io.client.ConektaResponse;
import conekta.io.client.impl.CustomersClient;
import conekta.io.config.ConektaAuthenticator;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.error.ConektaErrorResponse;
import conekta.io.model.PaginatedConektaObject;
import conekta.io.model.impl.Customer;
import conekta.io.model.request.CustomerReq;
import conekta.io.model.submodel.Event;
import conekta.io.model.submodel.PaymentSource;
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
    void createCustomer() throws URISyntaxException, IOException {

        // Arrange
        String customerJson = Utils.readFile("clients/customer.json");
        String customerResponseJson = Utils.readFile("clients/customerCreateResponse.json");
        CustomerReq customerReq = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, CustomerReq.class);
        Customer customerResponse = ConektaObjectMapper.getInstance().stringJsonToObject(customerResponseJson, Customer.class);

        Utils.buildMockServer(this.mockWebServer, customerResponseJson, 201);

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.createCustomer(customerReq);

        // Assert
        Assertions.assertEquals(customerConektaResponse.getData(), customerResponse);
        Assertions.assertEquals(201, customerConektaResponse.getStatusCode());
    }

    @Test
    void createCustomerWithError() throws URISyntaxException, IOException {
        // Arrange
        String customerJson = Utils.readFile("clients/customerWithNoMail.json");
        String errorJson = Utils.readFile("clients/errorMail.json");
        CustomerReq cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, CustomerReq.class);
        ConektaErrorResponse error = ConektaObjectMapper.getInstance().stringJsonToObject(errorJson, ConektaErrorResponse.class);

        Utils.buildMockServer(this.mockWebServer, errorJson, 404);

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.createCustomer(cus);

        // Assert
        Assertions.assertEquals(customerConektaResponse.getError(), error);
        Assertions.assertEquals(404, customerConektaResponse.getStatusCode());
    }

    @Test
    void retrieveCustomer() throws IOException, URISyntaxException {
        // Arrange
        String customerJson = Utils.readFile("clients/customerResponse.json");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, Customer.class);

        Utils.buildMockServer(this.mockWebServer, customerJson, 200);

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.retrieveCustomer("1");

        // Assert
        Assertions.assertEquals(customerConektaResponse.getData(), cus);
    }

    @Test
    void getCustomers() throws IOException, URISyntaxException {
        String customerListJson = Utils.readFile("clients/customerListResponse.json");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerListJson, Customer.class);
        PaginatedConektaObject<Customer> paginatedConektaObject = new PaginatedConektaObject<>();
        paginatedConektaObject.setData(List.of(cus));
        String s = ConektaObjectMapper.getInstance().conektaObjectToString(paginatedConektaObject);

        Utils.buildMockServer(this.mockWebServer, s, 200);

        // Act
        ConektaResponse<PaginatedConektaObject<Customer>> customers = customersClient.getCustomers(null);

        // Assert
        Assertions.assertEquals(customers.getData().getData().get(0), cus);
    }

    @Test
    void updateCustomer() throws IOException, URISyntaxException {
        String customerJson = Utils.readFile("clients/customer.json");
        String customerJsonModified = Utils.readFile("clients/customerModified.json");
        CustomerReq cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, CustomerReq.class);
        Customer cusModified = ConektaObjectMapper.getInstance().stringJsonToObject(customerJsonModified, Customer.class);

        Utils.buildMockServer(this.mockWebServer, customerJsonModified, 200);

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.updateCustomer("1", cusModified);

        // Assert
        Assertions.assertEquals(customerConektaResponse.getData(), cusModified);
        Assertions.assertNotEquals(cus, customerConektaResponse.getData());
        Assertions.assertNotEquals(cus, cusModified);
    }

    @Test
    void deleteCustomer() throws IOException, URISyntaxException {
        // Arrange
        String customerJson = Utils.readFile("clients/customerDeleteResponse.json");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerJson, Customer.class);
        cus.setDeleted(true);
        String deletedJson = ConektaObjectMapper.getInstance().conektaObjectToString(cus);

        Utils.buildMockServer(this.mockWebServer, deletedJson, 200);

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.deleteCustomer("1");

        // Assert
        Assertions.assertEquals(customerConektaResponse.getData(), cus);
    }

    @Test
    void deleteCustomerFail() throws IOException, URISyntaxException {
        // Arrange
        String customerDeleteFailResponseJson = Utils.readFile("clients/customerDeleteFailResponse.json");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerDeleteFailResponseJson, Customer.class);
        cus.setDeleted(true);
        String deletedJson = ConektaObjectMapper.getInstance().conektaObjectToString(cus);

        Utils.buildMockServer(this.mockWebServer, deletedJson, 404);

        // Act
        ConektaResponse<Customer> customerConektaResponse = customersClient.deleteCustomer("1");

        // Assert
        Assertions.assertEquals(customerConektaResponse.getData(), cus);
    }

    @Test
    void getCustomerEvents() throws IOException, URISyntaxException {
        // Arrange
        String eventJson = Utils.readFile("clients/clientEvents.json");
        Event event = ConektaObjectMapper.getInstance().stringJsonToObject(eventJson, Event.class);
        PaginatedConektaObject<Event> paginatedConektaObject = new PaginatedConektaObject<>();
        paginatedConektaObject.setData(List.of(event));
        String s = ConektaObjectMapper.getInstance().conektaObjectToString(paginatedConektaObject);

        Utils.buildMockServer(this.mockWebServer, s, 200);

        // Act
        ConektaResponse<PaginatedConektaObject<Event>> customerEvents = customersClient.getCustomerEvents("1", null);

        // Assert
        Assertions.assertEquals(customerEvents.getData(), paginatedConektaObject);
    }

    @Test
    void getCustomerPaymentSources() throws IOException, URISyntaxException {
        // Arrange
        String paymentSourceJson = Utils.readFile("clients/paymentSource.json");
        PaymentSource paymentSource = ConektaObjectMapper.getInstance().stringJsonToObject(paymentSourceJson, PaymentSource.class);
        PaginatedConektaObject<PaymentSource> paginatedConektaObject = new PaginatedConektaObject<>();
        paginatedConektaObject.setData(List.of(paymentSource));
        String s = ConektaObjectMapper.getInstance().conektaObjectToString(paginatedConektaObject);

        Utils.buildMockServer(this.mockWebServer, s, 200);

        // Act
        ConektaResponse<PaginatedConektaObject<PaymentSource>> customerPaymentSources = customersClient.getCustomerPaymentSources("1", null);
        // Assert
        Assertions.assertEquals(customerPaymentSources.getData(), paginatedConektaObject);
    }
}
