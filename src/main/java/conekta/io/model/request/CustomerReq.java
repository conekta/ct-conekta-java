package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.util.List;

@Data
public class CustomerReq extends ConektaObject {
    private String name;
    private String phone;
    private String email;
    private List<PaymentSourceCreateReq> PaymentSources;
    private Boolean Corporate;
    private String DefaultPaymentSourceID;
    private List<ShippingContactReq> ShippingContacts;
}
