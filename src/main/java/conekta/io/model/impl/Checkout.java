package conekta.io.model.impl;

import conekta.io.model.ConektaObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Checkout extends ConektaObject {
    private String url;
}
