package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;


@Data
public class DiscountLine extends ConektaObject {
    private String code;
    private Integer amount;
    private String type;
    private String parentId;
    private Boolean deleted;
}