package conekta.io.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import conekta.io.client.ConektaRequestor;
import conekta.io.client.ConektaResponse;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.error.ConektaErrorResponse;
import conekta.io.model.PaginatedConektaObject;
import conekta.io.model.impl.Customer;
import conekta.io.model.impl.Webhook;

import java.net.http.HttpResponse;

public class CustomersClient extends ConektaRequestor {

    /**
     * Creates a new customer in Conekta.
     *
     * @param customer The customer to be created.
     * @return The created ConektaResponse<Customer>.
     */
    public ConektaResponse<Customer> createCustomer(Customer customer){
        HttpResponse<String> customerResponse = doRequest(customer, Constants.CUSTOMERS_PATH, Constants.POST);
        return ConektaResponse.<Customer>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Customer.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Retrieves a customer in Conekta.
     *
     * @param customerId The id of the customer to be retrieved.
     * @return The retrieved ConektaResponse<Customer>.
     */
    public ConektaResponse<Customer> retrieveCustomer(String customerId){
        HttpResponse<String> customerResponse = doRequest(null, Constants.CUSTOMERS_PATH + Constants.SLASH + customerId, Constants.GET);
        return ConektaResponse.<Customer>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Customer.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Retrieves all customers paginated in Conekta.
     * @param next The next page of the customers to be retrieved.
     *             If null, the first page will be retrieved.
     *             If not null, the next page will be retrieved.
     * @return The retrieved ConektaResponse<PaginatedConektaObject<Customer>>.
     */
    public ConektaResponse<PaginatedConektaObject<Customer>> getCustomers(String next){
        HttpResponse<String> customersResponse = doRequest(null, Constants.CUSTOMERS_PATH + (next != null ? Constants.NEXT + next : ""), Constants.GET);
        return ConektaResponse.<PaginatedConektaObject<Customer>>builder()
                .response(customersResponse)
                .statusCode(customersResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customersResponse.body(), new TypeReference<PaginatedConektaObject<Customer>>() {
                }))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customersResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Updates a customer in Conekta.
     *
     * @param customer The customer to be updated.
     * @return The updated ConektaResponse<Customer>.
     */
    public ConektaResponse<Customer> updateCustomer(String customerId, Customer customer){
        HttpResponse<String> customerResponse = doRequest(customer, Constants.CUSTOMERS_PATH + Constants.SLASH + customerId, Constants.PUT);
        return ConektaResponse.<Customer>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Customer.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Deletes a customer in Conekta (Logically).
     *
     * @param customerId The id of the customer to be deleted.
     * @return The deleted ConektaResponse<Customer>.
     */
    public ConektaResponse<Customer> deleteCustomer(String customerId){
        HttpResponse<String> customerResponse = doRequest(null, Constants.CUSTOMERS_PATH + Constants.SLASH + customerId, Constants.DELETE);
        return ConektaResponse.<Customer>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Customer.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Retrieves customer's webhooks in Conekta.
     *
     * @param customerId The id of the customer to be retrieved.
     * @return The retrieved ConektaResponse<PaginatedConektaObject<Webhook>>.
     */
    public ConektaResponse<PaginatedConektaObject<Webhook>> getCustomerWebhooks(String customerId, String next){
        HttpResponse<String> customerResponse = doRequest(null, Constants.CUSTOMERS_PATH + Constants.SLASH + customerId + Constants.WEBHOOKS + (next != null ? Constants.NEXT + next : ""), Constants.GET);
        return ConektaResponse.<PaginatedConektaObject<Webhook>>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), new TypeReference<PaginatedConektaObject<Webhook>>() {
                }))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }
}
