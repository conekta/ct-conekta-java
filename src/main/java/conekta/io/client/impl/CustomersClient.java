package conekta.io.client.impl;

import conekta.io.client.ConektaRequestor;
import conekta.io.config.Constants;
import conekta.io.config.Headers;
import conekta.io.model.ConektaObject;

import java.net.http.HttpResponse;

public class CustomersClient implements ConektaRequestor {

    public HttpResponse<String> getCustomerList(ConektaObject conektaObject, Headers headers, String url, String method) {
        return ConektaRequestor.super.doRequest(conektaObject, headers, url, method);
    }

    public HttpResponse<String> createCustomer(ConektaObject conektaObject, Headers headers, String url, String method) {
        return ConektaRequestor.super.doRequest(conektaObject,
                headers,
                Constants.API_BASE + Constants.CUSTOMERS_PATH,
                "POST");
    }
}
