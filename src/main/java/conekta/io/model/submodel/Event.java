package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

@Data
public class Event extends ConektaObject {

    private Object data;
    private boolean livemode;
    private String type;
    private String createdAt;

}
