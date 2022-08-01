package conekta.io.client.impl;

import conekta.io.client.ConektaRequestor;
import conekta.io.config.Constants;
import conekta.io.model.impl.Customer;

import java.net.http.HttpResponse;

public class CustomersClient implements ConektaRequestor {
    public HttpResponse<String> createCustomer(Customer customer) {
        return ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH, "POST");
    }

    public HttpResponse<String> getCustomers(Customer customer) {
        return ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH, "GET");
    }

    public HttpResponse<String> updateCustomer(Customer customer) {
        return ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH, "PUT");
    }

    public HttpResponse<String> deleteCustomer(Customer customer) {
        return ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH, "DELETE");
    }
}
