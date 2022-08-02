package conekta.io.model.submodel;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import conekta.io.model.ConektaObject;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ShippingContact extends ConektaObject {
    private String receiver;
    private String phone;
    private String betweenStreets;
    private Address address;
    private Long createdAt;
    private String parentId;
    private Boolean isDefault;
}
