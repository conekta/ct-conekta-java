package conekta.io.client.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import conekta.io.client.ConektaRequestor;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.model.impl.Customer;

import java.net.http.HttpResponse;

public class CustomersClient implements ConektaRequestor {


    public Customer createCustomer(Customer customer) throws JsonProcessingException {
        HttpResponse<String> cosa = ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH, "POST");
        Customer cus = ConektaObjectMapper.getInstance().stringJsonToObject(cosa.body(), Customer.class);
        return cus;
    }

    public HttpResponse<String> getCustomers(Customer customer) throws JsonProcessingException {
        return ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH, "GET");
    }

    public HttpResponse<String> updateCustomer(Customer customer) throws JsonProcessingException {
        return ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH, "PUT");
    }

    public HttpResponse<String> deleteCustomer(Customer customer) throws JsonProcessingException {
        return ConektaRequestor.super.doRequest(customer, Constants.API_BASE + Constants.CUSTOMERS_PATH, "DELETE");
    }
}
