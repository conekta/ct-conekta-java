package conekta.io.model.impl;

import conekta.io.model.ConektaModel;
import conekta.io.submodel.*;
import lombok.Data;

import java.net.http.HttpResponse;
import java.util.List;

@Data
public class Order implements ConektaModel {

    private String id;
    private String object;
    private String createdAt;
    private String updatedAt;
    private String currency;
    private List<Product> itemLines;
    private List<Shipping> shippingLines;
    private List<Tax> taxLines;
    private List<Discount> discountLines;
    private boolean livemode;
    private String metadata;
    private String shippingContact;
    private int amount;
    private int amountRefunded;
    private String paymentStatus;
    private String customerInfo;
    private String customerId;
    private String name;
    private String phone;
    private String email;
    private boolean corporate;
    private String antifraudInfo;
    private int paidTransactions;
    private int accountCreatedAt;
    private int firstPaidAt;
    private List<Charge> charges;


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
