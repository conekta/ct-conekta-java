package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
public class PaymentMethod extends ConektaObject {

    private String type;
    private BigDecimal createdAt;
    private String last4;
    private String bin;
    private String expMonth;
    private String expYear;
    private String brand;
    private String name;
    private String parentId;
    @ToString.Include(name = "default")
    private Boolean conektaDefault;
    private String reference;
    private String storeName;
    private String serviceName;
    private String serviceNumber;
    private BigDecimal expiresAt;
    private String description;
    private String authCode;
    private String store;
    private DefaultAddress address;
    private String tokenID;
    private String paymentSourceID;
    private BigDecimal monthlyInstallments;
}
