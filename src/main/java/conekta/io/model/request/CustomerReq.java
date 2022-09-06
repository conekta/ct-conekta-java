package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import conekta.io.model.submodel.PaymentSource;
import conekta.io.model.submodel.ShippingContact;
import lombok.Data;

import java.util.List;

@Data
public class CustomerReq extends ConektaObject {
    private String customerId;
    private String name;
    private String phone;
    private String email;
    private List<PaymentSource> paymentSources;
    private Boolean corporate;
    private String defaultPaymentSourceID;
    private List<ShippingContact> shippingContacts;
    private Boolean deleted;
}
