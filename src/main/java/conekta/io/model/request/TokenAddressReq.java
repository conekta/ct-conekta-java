package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

@Data
public class TokenAddressReq extends ConektaObject {
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zip;
    private String country;
}
