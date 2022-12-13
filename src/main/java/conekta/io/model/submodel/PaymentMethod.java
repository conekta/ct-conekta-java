package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;
import lombok.ToString;


@Data
public class PaymentMethod extends ConektaObject {

    private String type;
    private Integer createdAt;
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
    private Integer expiresAt;
    private String description;
    private String authCode;
    private String store;
    private DefaultAddress address;
    private String tokenID;
    private String paymentSourceID;
    private Integer monthlyInstallments;
}
