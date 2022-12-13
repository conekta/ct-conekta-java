package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.util.List;

@Data
public class Checkout extends ConektaObject {
    private List<Integer> allowedInstallmentOptions;
    private List<Integer> monthlyInstallmentsOptions;
    private List<String> allowedPaymentMethods;
    private List<Object> excludeCardNetworks;
    private Integer emailsSent;
    private String successUrl;
    private String failureUrl;
    private Integer expiredAt;
    private Integer expiresAt;
    private Integer startsAt;
    private Boolean force3dsFlow;
    private Boolean livemode;
    private Boolean monthlyInstallmentsEnabled;
    private Boolean isRedirectOnFailure;
    private Boolean canNotExpire;
    private String name;
    private Boolean needsShippingContact;
    private Integer paidPaymentsCount;
    private Boolean recurrent;
    private String slug;
    private Integer smsSent;
    private String status;
    private String type;
    private String url;
    private Object metadata;
}
