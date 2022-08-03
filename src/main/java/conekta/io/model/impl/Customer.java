package conekta.io.model.impl;

import conekta.io.model.ConektaObject;
import conekta.io.model.submodel.AntifraudInfo;
import lombok.Builder;
import lombok.Data;

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
    private Object paymentSources;
    private Object shippingContacts;
    //TODO REVISAR CON UN EXPERTO
    private Boolean deleted;
}
