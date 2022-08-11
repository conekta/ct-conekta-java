package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentMethodReq extends ConektaObject {
    private String type;
    private String tokenID;
    private String paymentSourceID;
    private BigDecimal monthlyInstallments;
    private BigDecimal expiresAt;
}
