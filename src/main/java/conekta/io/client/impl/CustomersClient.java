package conekta.io.client.impl;

import conekta.io.client.ConektaRequestor;
import conekta.io.config.Headers;
import conekta.io.model.ConektaObject;
import conekta.io.model.impl.Customer;

import java.net.http.HttpResponse;

public class CustomersClient implements ConektaRequestor {

    public HttpResponse<String> getClientList(ConektaObject conektaObject, Headers headers, String url, String method) {
        return ConektaRequestor.super.doRequest(conektaObject, headers, url, method);
    }
}
