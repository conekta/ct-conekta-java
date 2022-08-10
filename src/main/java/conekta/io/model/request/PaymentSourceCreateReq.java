package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentSourceCreateReq extends ConektaObject {
    private String tokenId;
    private String paymentType;
    private BigDecimal expiresAt;
    private CardReq card;
}
