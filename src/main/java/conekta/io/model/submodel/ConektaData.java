package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;


@Data
public class ConektaData extends ConektaObject {
    private String description;
    private Integer amount;
    private String parentId;
}
