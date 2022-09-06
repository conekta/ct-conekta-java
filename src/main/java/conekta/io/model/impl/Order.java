package conekta.io.model.impl;

import conekta.io.model.ConektaObject;
import conekta.io.model.PaginatedConektaObject;
import conekta.io.model.submodel.Checkout;
import conekta.io.model.submodel.*;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Frase corta descriptiva
 * Descripción de la clase
 *
 * @author Nombre Apellido / Empresa
 * @version 0.1, 2004/05/30
 */
@Data
public class Order extends ConektaObject {

    /**
     * Frase corta descriptiva
     * Descripción de la variable.
     * Valores válidos (si aplica)
     * Comportamiento en caso de que sea null(si aplica)
     */
    private Boolean livemode;
    private BigDecimal amount;
    private BigDecimal amountRefunded;
    private String paymentStatus;
    private String currency;
    private Integer createdAt;
    private Integer updatedAt;
    private Boolean preAuth;
    private Object metadata;
    private Customer customerInfo;
    private ShippingContact shippingContact;
    private PaginatedConektaObject<LineItem> lineItems;
    private PaginatedConektaObject<TaxLine> taxLines;
    private PaginatedConektaObject<ShippingLines> shippingLines;
    private PaginatedConektaObject<DiscountLine> discountLines;
    private PaginatedConektaObject<Charge> charges;
    private Checkout checkout;
}
