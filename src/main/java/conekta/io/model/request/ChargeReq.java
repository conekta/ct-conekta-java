package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

@Data
public class ChargeReq extends ConektaObject {
    private PaymentMethodReq paymentMethod;
}
