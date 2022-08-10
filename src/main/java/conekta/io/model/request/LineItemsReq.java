package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LineItemsReq extends ConektaObject {
    private String name;
    private BigDecimal unitPrice;
    private Integer quantity;
    private Object metadata;
}

