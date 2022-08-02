package conekta.io.model.submodel;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import conekta.io.model.ConektaObject;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
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
}
