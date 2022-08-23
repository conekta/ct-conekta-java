package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderRefundReq extends ConektaObject {
    private String reason;
    private BigDecimal amount;
}
