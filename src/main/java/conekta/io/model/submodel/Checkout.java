package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Checkout extends ConektaObject {
    private List<Integer> allowedInstallmentOptions;
    private List<String> allowedPaymentMethods;
    private BigDecimal emailsSent;
    private BigDecimal expiredAt;
    private BigDecimal expiresAt;
    private Boolean force3dsFlow;
    private Boolean livemode;
    private Boolean monthlyInstallmentsEnabled;
    private String name;
    private Boolean needsShippingContact;
    private BigDecimal paidPaymentsCount;
    private Boolean recurrent;
    private String slug;
    private BigDecimal smsSent;
    private String status;
    private String type;
    private String url;
}
