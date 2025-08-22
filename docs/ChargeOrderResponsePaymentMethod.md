

# ChargeOrderResponsePaymentMethod

## oneOf schemas
* [PaymentMethodBankTransfer](PaymentMethodBankTransfer.md)
* [PaymentMethodBnplPayment](PaymentMethodBnplPayment.md)
* [PaymentMethodCard](PaymentMethodCard.md)
* [PaymentMethodCash](PaymentMethodCash.md)
* [PaymentMethodPbbPayment](PaymentMethodPbbPayment.md)

## Example
```java
// Import classes:
import com.conekta.model.ChargeOrderResponsePaymentMethod;
import com.conekta.model.PaymentMethodBankTransfer;
import com.conekta.model.PaymentMethodBnplPayment;
import com.conekta.model.PaymentMethodCard;
import com.conekta.model.PaymentMethodCash;
import com.conekta.model.PaymentMethodPbbPayment;

public class Example {
    public static void main(String[] args) {
        ChargeOrderResponsePaymentMethod exampleChargeOrderResponsePaymentMethod = new ChargeOrderResponsePaymentMethod();

        // create a new PaymentMethodBankTransfer
        PaymentMethodBankTransfer examplePaymentMethodBankTransfer = new PaymentMethodBankTransfer();
        // set ChargeOrderResponsePaymentMethod to PaymentMethodBankTransfer
        exampleChargeOrderResponsePaymentMethod.setActualInstance(examplePaymentMethodBankTransfer);
        // to get back the PaymentMethodBankTransfer set earlier
        PaymentMethodBankTransfer testPaymentMethodBankTransfer = (PaymentMethodBankTransfer) exampleChargeOrderResponsePaymentMethod.getActualInstance();

        // create a new PaymentMethodBnplPayment
        PaymentMethodBnplPayment examplePaymentMethodBnplPayment = new PaymentMethodBnplPayment();
        // set ChargeOrderResponsePaymentMethod to PaymentMethodBnplPayment
        exampleChargeOrderResponsePaymentMethod.setActualInstance(examplePaymentMethodBnplPayment);
        // to get back the PaymentMethodBnplPayment set earlier
        PaymentMethodBnplPayment testPaymentMethodBnplPayment = (PaymentMethodBnplPayment) exampleChargeOrderResponsePaymentMethod.getActualInstance();

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

        // create a new PaymentMethodPbbPayment
        PaymentMethodPbbPayment examplePaymentMethodPbbPayment = new PaymentMethodPbbPayment();
        // set ChargeOrderResponsePaymentMethod to PaymentMethodPbbPayment
        exampleChargeOrderResponsePaymentMethod.setActualInstance(examplePaymentMethodPbbPayment);
        // to get back the PaymentMethodPbbPayment set earlier
        PaymentMethodPbbPayment testPaymentMethodPbbPayment = (PaymentMethodPbbPayment) exampleChargeOrderResponsePaymentMethod.getActualInstance();
    }
}
```


