package conekta.io.model.request;

import conekta.io.model.ConektaObject;
import conekta.io.model.submodel.*;
import lombok.Data;

import java.util.List;

@Data
public class OrderReq extends ConektaObject {
    private String currency;
    private Boolean preAuth;
    private CustomerReq customerInfo;
    private List<LineItem> lineItems;
    private List<TaxLine> taxLines;
    private ShippingContact shippingContact;
    private List<DiscountLine> discountLines;
    private List<ShippingLines> shippingLines;
    private Object metadata;
    private List<Charge> charges;
    private Checkout checkout;
}
