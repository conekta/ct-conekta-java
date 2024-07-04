

# CreateCustomerPaymentMethodsRequest

Contains details of the payment methods that the customer has active or has used in Conekta

## oneOf schemas
* [PaymentMethodCashRequest](PaymentMethodCashRequest.md)
* [PaymentMethodSpeiRequest](PaymentMethodSpeiRequest.md)
* [PaymentMethodTokenRequest](PaymentMethodTokenRequest.md)

## Example
```java
// Import classes:
import com.conekta.model.CreateCustomerPaymentMethodsRequest;
import com.conekta.model.PaymentMethodCashRequest;
import com.conekta.model.PaymentMethodSpeiRequest;
import com.conekta.model.PaymentMethodTokenRequest;

public class Example {
    public static void main(String[] args) {
        CreateCustomerPaymentMethodsRequest exampleCreateCustomerPaymentMethodsRequest = new CreateCustomerPaymentMethodsRequest();

        // create a new PaymentMethodCashRequest
        PaymentMethodCashRequest examplePaymentMethodCashRequest = new PaymentMethodCashRequest();
        // set CreateCustomerPaymentMethodsRequest to PaymentMethodCashRequest
        exampleCreateCustomerPaymentMethodsRequest.setActualInstance(examplePaymentMethodCashRequest);
        // to get back the PaymentMethodCashRequest set earlier
        PaymentMethodCashRequest testPaymentMethodCashRequest = (PaymentMethodCashRequest) exampleCreateCustomerPaymentMethodsRequest.getActualInstance();

        // create a new PaymentMethodSpeiRequest
        PaymentMethodSpeiRequest examplePaymentMethodSpeiRequest = new PaymentMethodSpeiRequest();
        // set CreateCustomerPaymentMethodsRequest to PaymentMethodSpeiRequest
        exampleCreateCustomerPaymentMethodsRequest.setActualInstance(examplePaymentMethodSpeiRequest);
        // to get back the PaymentMethodSpeiRequest set earlier
        PaymentMethodSpeiRequest testPaymentMethodSpeiRequest = (PaymentMethodSpeiRequest) exampleCreateCustomerPaymentMethodsRequest.getActualInstance();

        // create a new PaymentMethodTokenRequest
        PaymentMethodTokenRequest examplePaymentMethodTokenRequest = new PaymentMethodTokenRequest();
        // set CreateCustomerPaymentMethodsRequest to PaymentMethodTokenRequest
        exampleCreateCustomerPaymentMethodsRequest.setActualInstance(examplePaymentMethodTokenRequest);
        // to get back the PaymentMethodTokenRequest set earlier
        PaymentMethodTokenRequest testPaymentMethodTokenRequest = (PaymentMethodTokenRequest) exampleCreateCustomerPaymentMethodsRequest.getActualInstance();
    }
}
```


