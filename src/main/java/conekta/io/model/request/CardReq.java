package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

@Data
public class CardReq extends ConektaObject {
    private String number;
    private String name;
    private String expYear;
    private String expMonth;
    private String cvc;
    private TokenAddressReq tokenAddress;
}
