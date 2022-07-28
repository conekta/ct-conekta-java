package conekta.io.model.impl;

import conekta.io.model.ConektaObject;
import conekta.io.model.submodel.AntifraudInfo;
import conekta.io.model.submodel.PaymentSource;
import conekta.io.model.submodel.ShippingContact;
import lombok.Data;

import java.util.List;

@Data
public class Customer extends ConektaObject {

    private Boolean livemode;
    private String name;
    private String email;
    private String phone;
    private String defaultShippingContactId;
    private Long createdAt;
    private Boolean corporate;
    private String customReference;
    private AntifraudInfo antifraudInfo;
    private String defaultPaymentSourceId;
    private List<PaymentSource> paymentSources;
    private List<ShippingContact> shippingContacts;


}
