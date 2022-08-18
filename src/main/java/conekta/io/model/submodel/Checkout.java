package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Checkout extends ConektaObject {
    private List<Integer> allowedInstallmentOptions;
    private List<Integer> monthlyInstallmentsOptions;
    private List<String> allowedPaymentMethods;
    private List<Object> excludeCardNetworks;
    private BigDecimal emailsSent;
    private String successUrl;
    private String failureUrl;
    private BigDecimal expiredAt;
    private BigDecimal expiresAt;
    private BigDecimal startsAt;
    private Boolean force3dsFlow;
    private Boolean livemode;
    private Boolean monthlyInstallmentsEnabled;
    private Boolean isRedirectOnFailure;
    private Boolean canNotExpire;
    private String name;
    private Boolean needsShippingContact;
    private BigDecimal paidPaymentsCount;
    private Boolean recurrent;
    private String slug;
    private BigDecimal smsSent;
    private String status;
    private String type;
    private String url;
    private Object metadata;
}
