package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TaxLine extends ConektaObject {
    private String description;
    private BigDecimal amount;
    private String parentId;
    private Boolean deleted;
}
