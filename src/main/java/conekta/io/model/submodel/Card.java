package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import conekta.io.model.request.TokenAddressReq;
import lombok.Data;

@Data
public class Card extends ConektaObject {
    private String number;
    private String name;
    private String expYear;
    private String expMonth;
    private String cvc;
    private TokenAddressReq tokenAddress;
}
