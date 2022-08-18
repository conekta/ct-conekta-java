package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import conekta.io.model.submodel.Checkout;
import lombok.Data;

import java.util.List;

@Data
public class OrderReq extends ConektaObject {
    private String currency;
    private Boolean preAuth;
    private CustomerReq customerInfo;
    private List<LineItemsReq> lineItems;
    private List<TaxLinesReq> taxLines;
    private ShippingContactReq shippingContact;
    private List<DiscountLinesReq> discountLines;
    private List<ShippingLinesReq> shippingLines;
    private Object metadata;
    private List<ChargeReq> charges;
    private Checkout checkout;
}
