package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TaxLinesReq extends ConektaObject {
    private String description;
    private BigDecimal amount;
    private String parentId;
    private Boolean deleted;
}
