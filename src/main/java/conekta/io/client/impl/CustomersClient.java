package conekta.io.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import conekta.io.client.ConektaRequestor;
import conekta.io.client.ConektaResponse;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.error.ConektaErrorResponse;
import conekta.io.model.PaginatedConektaObject;
import conekta.io.model.impl.Customer;
import conekta.io.model.request.CustomerReq;
import conekta.io.model.submodel.Event;
import conekta.io.model.submodel.PaymentSource;

import java.net.http.HttpResponse;

public class CustomersClient extends ConektaRequestor {

    /**
     * Creates a new customer in Conekta.
     *
     * @param customerReq the customer to be created.
     * @return The created customer.
     */
    public ConektaResponse<Customer> createCustomer(CustomerReq customerReq) {
        HttpResponse<String> customerResponse = doRequest(customerReq, Constants.CUSTOMERS_PATH, Constants.POST);
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
     * @return The retrieved customer.
     */
    public ConektaResponse<Customer> retrieveCustomer(String customerId) {
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
     *
     * @param next The next page of the customers to be retrieved.
     *             If null, the first page will be retrieved.
     *             If not null, the next page will be retrieved.
     * @return The retrieved paginated object of customers.
     */
    public ConektaResponse<PaginatedConektaObject<Customer>> getCustomers(String next) {
        HttpResponse<String> customersResponse = doRequest(null, Constants.CUSTOMERS_PATH + (next != null ? Constants.NEXT + next : ""), Constants.GET);
        return ConektaResponse.<PaginatedConektaObject<Customer>>builder()
                .response(customersResponse)
                .statusCode(customersResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customersResponse.body(), new TypeReference<>() {
                }))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customersResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Updates a customer in Conekta.
     *
     * @param customer The customer to be updated.
     * @param customerId The id of the customer to be updated.
     * @return The updated customer.
     */
    public ConektaResponse<Customer> updateCustomer(String customerId, Customer customer) {
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
     * @return The deleted customer with deleted == true.
     */
    public ConektaResponse<Customer> deleteCustomer(String customerId) {
        HttpResponse<String> customerResponse = doRequest(null, Constants.CUSTOMERS_PATH + Constants.SLASH + customerId, Constants.DELETE);
        return ConektaResponse.<Customer>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), Customer.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Retrieves all subscriptions events of a customer in Conekta.
     *
     * @param customerId The id of the customer to be retrieved.
     * @param next       The next page of the subscriptions events to be retrieved
     *                   If null, the first page will be retrieved.
     *                   If not null, the next page will be retrieved.
     * @return The retrieved paginated object of subscriptions events.
     */
    public ConektaResponse<PaginatedConektaObject<Event>> getCustomerEvents(String customerId, String next) {
        HttpResponse<String> customerResponse = doRequest(null, Constants.CUSTOMERS_PATH + Constants.SLASH + customerId + Constants.EVENTS_PATH + (next != null ? Constants.NEXT + next : ""), Constants.GET);
        return ConektaResponse.<PaginatedConektaObject<Event>>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), new TypeReference<>() {
                }))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    /**
     * Retrieves all payments sources of a customer in Conekta.
     *
     * @param customerId The id of the customer to be retrieved.
     * @param next       The next page of the payments sources to be retrieved
     * @return The retrieved paginated object of payments sources.
     */
    public ConektaResponse<PaginatedConektaObject<PaymentSource>> getCustomerPaymentSources(String customerId, String next) {
        HttpResponse<String> customerResponse = doRequest(null, Constants.CUSTOMERS_PATH + Constants.SLASH + customerId + Constants.PAYMENT_SOURCES + (next != null ? Constants.NEXT + next : ""), Constants.GET);
        return ConektaResponse.<PaginatedConektaObject<PaymentSource>>builder()
                .response(customerResponse)
                .statusCode(customerResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), new TypeReference<>() {
                }))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(customerResponse.body(), ConektaErrorResponse.class))
                .build();
    }
}
