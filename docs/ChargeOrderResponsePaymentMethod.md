

# ChargeOrderResponsePaymentMethod

## oneOf schemas
* [PaymentMethodBankTransfer](PaymentMethodBankTransfer.md)
* [PaymentMethodCard](PaymentMethodCard.md)
* [PaymentMethodCash](PaymentMethodCash.md)

## Example
```java
// Import classes:
import com.conekta.model.ChargeOrderResponsePaymentMethod;
import com.conekta.model.PaymentMethodBankTransfer;
import com.conekta.model.PaymentMethodCard;
import com.conekta.model.PaymentMethodCash;

public class Example {
    public static void main(String[] args) {
        ChargeOrderResponsePaymentMethod exampleChargeOrderResponsePaymentMethod = new ChargeOrderResponsePaymentMethod();

        // create a new PaymentMethodBankTransfer
        PaymentMethodBankTransfer examplePaymentMethodBankTransfer = new PaymentMethodBankTransfer();
        // set ChargeOrderResponsePaymentMethod to PaymentMethodBankTransfer
        exampleChargeOrderResponsePaymentMethod.setActualInstance(examplePaymentMethodBankTransfer);
        // to get back the PaymentMethodBankTransfer set earlier
        PaymentMethodBankTransfer testPaymentMethodBankTransfer = (PaymentMethodBankTransfer) exampleChargeOrderResponsePaymentMethod.getActualInstance();

        // create a new PaymentMethodCard
        PaymentMethodCard examplePaymentMethodCard = new PaymentMethodCard();
        // set ChargeOrderResponsePaymentMethod to PaymentMethodCard
        exampleChargeOrderResponsePaymentMethod.setActualInstance(examplePaymentMethodCard);
        // to get back the PaymentMethodCard set earlier
        PaymentMethodCard testPaymentMethodCard = (PaymentMethodCard) exampleChargeOrderResponsePaymentMethod.getActualInstance();

        // create a new PaymentMethodCash
        PaymentMethodCash examplePaymentMethodCash = new PaymentMethodCash();
        // set ChargeOrderResponsePaymentMethod to PaymentMethodCash
        exampleChargeOrderResponsePaymentMethod.setActualInstance(examplePaymentMethodCash);
        // to get back the PaymentMethodCash set earlier
        PaymentMethodCash testPaymentMethodCash = (PaymentMethodCash) exampleChargeOrderResponsePaymentMethod.getActualInstance();
    }
}
```


