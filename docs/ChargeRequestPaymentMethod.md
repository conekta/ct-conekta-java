

# ChargeRequestPaymentMethod

## oneOf schemas
* [PaymentMethodCardRequest](PaymentMethodCardRequest.md)
* [PaymentMethodGeneralRequest](PaymentMethodGeneralRequest.md)

## Example
```java
// Import classes:
import com.conekta.model.ChargeRequestPaymentMethod;
import com.conekta.model.PaymentMethodCardRequest;
import com.conekta.model.PaymentMethodGeneralRequest;

public class Example {
    public static void main(String[] args) {
        ChargeRequestPaymentMethod exampleChargeRequestPaymentMethod = new ChargeRequestPaymentMethod();

        // create a new PaymentMethodCardRequest
        PaymentMethodCardRequest examplePaymentMethodCardRequest = new PaymentMethodCardRequest();
        // set ChargeRequestPaymentMethod to PaymentMethodCardRequest
        exampleChargeRequestPaymentMethod.setActualInstance(examplePaymentMethodCardRequest);
        // to get back the PaymentMethodCardRequest set earlier
        PaymentMethodCardRequest testPaymentMethodCardRequest = (PaymentMethodCardRequest) exampleChargeRequestPaymentMethod.getActualInstance();

        // create a new PaymentMethodGeneralRequest
        PaymentMethodGeneralRequest examplePaymentMethodGeneralRequest = new PaymentMethodGeneralRequest();
        // set ChargeRequestPaymentMethod to PaymentMethodGeneralRequest
        exampleChargeRequestPaymentMethod.setActualInstance(examplePaymentMethodGeneralRequest);
        // to get back the PaymentMethodGeneralRequest set earlier
        PaymentMethodGeneralRequest testPaymentMethodGeneralRequest = (PaymentMethodGeneralRequest) exampleChargeRequestPaymentMethod.getActualInstance();
    }
}
```


