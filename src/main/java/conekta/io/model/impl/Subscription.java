package conekta.io.model.impl;

import conekta.io.model.ConektaObject;
import lombok.Data;

@Data
public class Subscription extends ConektaObject {

    private String status;
    private String chargeId;
    private String createAt;
    private Long subscriptionStart;
    private Long billingCycleStart;
    private Long billingCycleEnd;
    private String planId;
    private String customerId;
    private String cardId;
}
