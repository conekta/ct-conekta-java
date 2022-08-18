package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Charge extends ConektaObject {
    private String status;
    private BigDecimal amount;
    private BigDecimal fee;
    private String orderId;
    private String customerId;
    private Boolean livemode;
    private BigDecimal monthlyInstallments;
    private BigDecimal createdAt;
    private BigDecimal paidAt;
    private String currency;
    private String description;
    private PaymentMethod paymentMethod;
}
