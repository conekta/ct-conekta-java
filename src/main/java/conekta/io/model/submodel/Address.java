package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

@Data
public class Address extends ConektaObject {
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String country;
    private Boolean residential;
    private String postalCode;
}
