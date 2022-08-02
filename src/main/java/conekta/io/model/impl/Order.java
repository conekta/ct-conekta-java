package conekta.io.model.impl;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import conekta.io.model.ConektaObject;
import conekta.io.model.submodel.*;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Order extends ConektaObject {

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
}
