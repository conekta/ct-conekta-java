package conekta.io.model.submodel;

import lombok.Data;

@Data
public class ShippingLines extends ConektaData {
    private String carrier;
    private String method;
    private String trackingNumber;
}
