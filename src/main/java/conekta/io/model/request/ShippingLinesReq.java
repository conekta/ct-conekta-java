package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShippingLinesReq extends ConektaObject {
    private BigDecimal amount;
    private String trackingNumber;
    private String carrier;
    private String method;
}