package conekta.io.model.impl;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import conekta.io.model.ConektaObject;
import conekta.io.model.submodel.AntifraudInfo;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Customer extends ConektaObject {

    private Boolean livemode;
    private String name;
    private String email;
    private String phone;
    private String defaultShippingContactId;
    private Long createdAt;
    private Boolean corporate;
    private String customReference;
    private AntifraudInfo antifraudInfo;
    private String defaultPaymentSourceId;

  /*  private PaginatedConektaObject<PaymentSource> paymentSources;
    private List<PaymentSource> lstPaymentSources;
    private List<ShippingContact> lstShippingContacts;
    private PaginatedConektaObject<ShippingContact> shippingContacts; */

    private Object paymentSources;
    private Object shippingContacts;
    //TODO REVISAR CON UN EXPERTO


}
