package conekta.io.model.impl;

import conekta.io.model.ConektaModel;
import conekta.io.submodel.PaymentSource;
import conekta.io.submodel.ShippingContact;
import lombok.Data;

import java.net.http.HttpResponse;
import java.util.List;

@Data
public class Customer implements ConektaModel {

    String id;
    String name;
    String phone;
    String planId;
    List<PaymentSource> paymentSources;
    boolean corporate;
    List<ShippingContact> shippingContacts;
    Subscription subscription;
    String antifraudInfo;
    String accountCreatedAt;
    String firstPaidAt;

    @Override
    public HttpResponse get() {
        return null;
    }

    @Override
    public HttpResponse post() {
        return null;
    }

    @Override
    public HttpResponse update() {
        return null;
    }

    @Override
    public HttpResponse find() {
        return null;
    }

    @Override
    public HttpResponse delete() {
        return null;
    }
}
