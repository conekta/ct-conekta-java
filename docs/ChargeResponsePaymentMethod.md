

# ChargeResponsePaymentMethod

## oneOf schemas
* [PaymentMethodBankTransfer](PaymentMethodBankTransfer.md)
* [PaymentMethodBnplPayment](PaymentMethodBnplPayment.md)
* [PaymentMethodCard](PaymentMethodCard.md)
* [PaymentMethodCash](PaymentMethodCash.md)
* [PaymentMethodPbbPayment](PaymentMethodPbbPayment.md)

## Example
```java
// Import classes:
import com.conekta.model.ChargeResponsePaymentMethod;
import com.conekta.model.PaymentMethodBankTransfer;
import com.conekta.model.PaymentMethodBnplPayment;
import com.conekta.model.PaymentMethodCard;
import com.conekta.model.PaymentMethodCash;
import com.conekta.model.PaymentMethodPbbPayment;

public class Example {
    public static void main(String[] args) {
        ChargeResponsePaymentMethod exampleChargeResponsePaymentMethod = new ChargeResponsePaymentMethod();

        // create a new PaymentMethodBankTransfer
        PaymentMethodBankTransfer examplePaymentMethodBankTransfer = new PaymentMethodBankTransfer();
        // set ChargeResponsePaymentMethod to PaymentMethodBankTransfer
        exampleChargeResponsePaymentMethod.setActualInstance(examplePaymentMethodBankTransfer);
        // to get back the PaymentMethodBankTransfer set earlier
        PaymentMethodBankTransfer testPaymentMethodBankTransfer = (PaymentMethodBankTransfer) exampleChargeResponsePaymentMethod.getActualInstance();

        // create a new PaymentMethodBnplPayment
        PaymentMethodBnplPayment examplePaymentMethodBnplPayment = new PaymentMethodBnplPayment();
        // set ChargeResponsePaymentMethod to PaymentMethodBnplPayment
        exampleChargeResponsePaymentMethod.setActualInstance(examplePaymentMethodBnplPayment);
        // to get back the PaymentMethodBnplPayment set earlier
        PaymentMethodBnplPayment testPaymentMethodBnplPayment = (PaymentMethodBnplPayment) exampleChargeResponsePaymentMethod.getActualInstance();

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

        // create a new PaymentMethodPbbPayment
        PaymentMethodPbbPayment examplePaymentMethodPbbPayment = new PaymentMethodPbbPayment();
        // set ChargeResponsePaymentMethod to PaymentMethodPbbPayment
        exampleChargeResponsePaymentMethod.setActualInstance(examplePaymentMethodPbbPayment);
        // to get back the PaymentMethodPbbPayment set earlier
        PaymentMethodPbbPayment testPaymentMethodPbbPayment = (PaymentMethodPbbPayment) exampleChargeResponsePaymentMethod.getActualInstance();
    }
}
```


