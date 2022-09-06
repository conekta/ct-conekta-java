package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentSource extends ConektaObject {
    private String type;
    private String tokenId;
    private Long createdAt;
    private String last4;
    private String bin;
    private String cardType;
    private String expMonth;
    private String expYear;
    private String brand;
    private String name;
    private String parentId;
    private Boolean isDefault;
    private Boolean visibleOnCheckout;
    private String paymentType;
    private BigDecimal expiresAt;
    private Card card;
}
