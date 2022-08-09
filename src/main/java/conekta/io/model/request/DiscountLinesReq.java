package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DiscountLinesReq extends ConektaObject {
    private String code;
    private BigDecimal amount;
    private String type;
    private String parentID;
    private Boolean deleted;
}
