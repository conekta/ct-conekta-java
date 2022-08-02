package conekta.io.client.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import conekta.io.client.ConektaRequestor;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.model.impl.Customer;
import conekta.io.model.impl.Webhook;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;

public class CustomersClient implements ConektaRequestor {

    /**
     * Creates a new customer.
     *
     * @param customer The customer to be created.
     * @return The created customer.
     * @throws IOException If an error occurs while communicating with the API.
     * @throws InterruptedException If the thread is interrupted while communicating with the API.
     */
    public Customer createCustomer(Customer customer) throws IOException, InterruptedException {
        HttpResponse<String> customerResponse = ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH, "POST");
        return ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Customer.class);
    }

    /**
     * Retrieves a customer.
     *
     * @param customerId The customer's ID.
     * @return The customer.
     * @throws IOException If an error occurs while communicating with the API.
     * @throws InterruptedException If the thread is interrupted while communicating with the API.
     */
    public Customer retrieveCustomer(String customerId) throws IOException, InterruptedException {
        HttpResponse<String> customerResponse = ConektaRequestor.super.doRequest(null, Constants.API_BASE + Constants.CUSTOMERS_PATH + "/" + customerId, "GET");
        return ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Customer.class);
    }

    /**
     * Retrieves all customers.
     *
     * @return List<Customer>
     * @throws IOException If an error occurs while communicating with the API.
     * @throws InterruptedException If the thread is interrupted while communicating with the API.
     */
    public List<Customer> getCustomers() throws IOException, InterruptedException {
        HttpResponse<String> customersResponse = ConektaRequestor.super.doRequest(null, Constants.API_BASE + Constants.CUSTOMERS_PATH, "GET");
        return Arrays.asList(ConektaObjectMapper.getInstance().stringJsonToObject(customersResponse.body(), Customer[].class));
    }

    /**
     * Updates a customer.
     *
     * @param customer The customer to be updated.
     * @return The updated customer.
     * @throws IOException If an error occurs while communicating with the API.
     * @throws InterruptedException If the thread is interrupted while communicating with the API.
     */
    public Customer updateCustomer(String customerId, Customer customer) throws IOException, InterruptedException {
        HttpResponse<String> customerResponse = ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH + "/" + customerId , "PUT");
        return ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Customer.class);
    }

    /**
     * Logically deletes a customer.
     *
     * @param customerId The customer's ID.
     * @return The logically deleted customer.
     * @throws IOException If an error occurs while communicating with the API.
     * @throws InterruptedException If the thread is interrupted while communicating with the API.
     */
    public Customer deleteCustomer(String customerId) throws IOException, InterruptedException {
        HttpResponse<String> customerResponse = ConektaRequestor.super.doRequest(null, Constants.API_BASE + Constants.CUSTOMERS_PATH + "/" + customerId, "DELETE");
        return ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Customer.class);
    }

    /**
     * Get customer webhooks.
     *
     * @param customerId The customer's ID.
     * @return List<Webhook>
     * @throws IOException If an error occurs while communicating with the API.
     * @throws InterruptedException If the thread is interrupted while communicating with the API.
     */
    public List<Webhook> getCustomerWebhooks(String customerId) throws IOException, InterruptedException {
        HttpResponse<String> customerResponse = ConektaRequestor.super.doRequest(null, Constants.API_BASE + Constants.CUSTOMERS_PATH + "/" + customerId + "/webhooks", "GET");
        return Arrays.asList(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Webhook[].class));
    }
}
