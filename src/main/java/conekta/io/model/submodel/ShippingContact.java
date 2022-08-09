package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

@Data
public class ShippingContact extends ConektaObject {
    private String receiver;
    private String phone;
    private String betweenStreets;
    private Address address;
    private Long createdAt;
    private String parentId;
    private Boolean isDefault;
    private Boolean deleted;
}
