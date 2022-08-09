package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

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
    //TODO SET FIELD NAME
    private Boolean Default;
    private String reference;
    private String storeName;
    private String serviceName;
    private String serviceNumber;
    private BigDecimal expiresAt;
    private String description;
    private BigDecimal authCode;
    private String store;
    private DefaultAddress Address;

}
