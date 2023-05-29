

# ChargeResponsePaymentMethod

## oneOf schemas
* [PaymentMethodBankTransfer](PaymentMethodBankTransfer.md)
* [PaymentMethodCard](PaymentMethodCard.md)
* [PaymentMethodCash](PaymentMethodCash.md)

## Example
```java
// Import classes:
import com.conekta.model.ChargeResponsePaymentMethod;
import com.conekta.model.PaymentMethodBankTransfer;
import com.conekta.model.PaymentMethodCard;
import com.conekta.model.PaymentMethodCash;

public class Example {
    public static void main(String[] args) {
        ChargeResponsePaymentMethod exampleChargeResponsePaymentMethod = new ChargeResponsePaymentMethod();

        // create a new PaymentMethodBankTransfer
        PaymentMethodBankTransfer examplePaymentMethodBankTransfer = new PaymentMethodBankTransfer();
        // set ChargeResponsePaymentMethod to PaymentMethodBankTransfer
        exampleChargeResponsePaymentMethod.setActualInstance(examplePaymentMethodBankTransfer);
        // to get back the PaymentMethodBankTransfer set earlier
        PaymentMethodBankTransfer testPaymentMethodBankTransfer = (PaymentMethodBankTransfer) exampleChargeResponsePaymentMethod.getActualInstance();

        // create a new PaymentMethodCard
        PaymentMethodCard examplePaymentMethodCard = new PaymentMethodCard();
        // set ChargeResponsePaymentMethod to PaymentMethodCard
        exampleChargeResponsePaymentMethod.setActualInstance(examplePaymentMethodCard);
        // to get back the PaymentMethodCard set earlier
        PaymentMethodCard testPaymentMethodCard = (PaymentMethodCard) exampleChargeResponsePaymentMethod.getActualInstance();

        // create a new PaymentMethodCash
        PaymentMethodCash examplePaymentMethodCash = new PaymentMethodCash();
        // set ChargeResponsePaymentMethod to PaymentMethodCash
        exampleChargeResponsePaymentMethod.setActualInstance(examplePaymentMethodCash);
        // to get back the PaymentMethodCash set earlier
        PaymentMethodCash testPaymentMethodCash = (PaymentMethodCash) exampleChargeResponsePaymentMethod.getActualInstance();
    }
}
```


