package conekta.io.model.submodel;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShippingLines extends ConektaData {
    private String carrier;
    private String method;
    private String trackingNumber;
    private BigDecimal amount;
}
