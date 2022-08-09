package conekta.io.model.submodel;

import lombok.Data;

@Data
public class ShippingLines extends ConektaData {
    public String carrier;
    public String method;
    public String trackingNumber;
}
