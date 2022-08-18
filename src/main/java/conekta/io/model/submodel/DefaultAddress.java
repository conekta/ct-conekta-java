package conekta.io.model.submodel;

import lombok.Data;

@Data
public class DefaultAddress {
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String country;
    private String object;
    private String postalCode;
}
