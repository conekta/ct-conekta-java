package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DiscountLine extends ConektaObject {
    private String code;
    private BigDecimal amount;
    private String type;
    private String ParentId;
    private Boolean deleted;
}
