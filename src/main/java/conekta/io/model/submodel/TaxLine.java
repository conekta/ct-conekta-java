package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;
@Data
public class TaxLine extends ConektaObject {
    private String description;
    private Integer amount;
    private String parentId;
    private Boolean deleted;
}
