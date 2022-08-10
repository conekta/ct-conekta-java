package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import conekta.io.model.submodel.Address;
import lombok.Data;

@Data
public class ShippingContactReq extends ConektaObject {
    private String phone;
    private String receiver;
    private String betweenStreets;
    private Address address;
}
