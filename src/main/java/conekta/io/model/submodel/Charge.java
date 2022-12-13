package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;


@Data
public class Charge extends ConektaObject {
    private String status;
    private Integer amount;
    private Integer fee;
    private String orderId;
    private String customerId;
    private Boolean livemode;
    private Integer monthlyInstallments;
    private Integer createdAt;
    private Integer paidAt;
    private String currency;
    private String description;
    private PaymentMethod paymentMethod;
}
