package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;


@Data
public class OrderRefundReq extends ConektaObject {
    private String reason;
    private Integer amount;
}
