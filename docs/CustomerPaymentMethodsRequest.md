

# CustomerPaymentMethodsRequest

## oneOf schemas
* [PaymentMethodCashRequest](PaymentMethodCashRequest.md)
* [PaymentMethodSpeiRequest](PaymentMethodSpeiRequest.md)
* [PaymentMethodTokenRequest](PaymentMethodTokenRequest.md)

## Example
```java
// Import classes:
import com.conekta.model.CustomerPaymentMethodsRequest;
import com.conekta.model.PaymentMethodCashRequest;
import com.conekta.model.PaymentMethodSpeiRequest;
import com.conekta.model.PaymentMethodTokenRequest;

public class Example {
    public static void main(String[] args) {
        CustomerPaymentMethodsRequest exampleCustomerPaymentMethodsRequest = new CustomerPaymentMethodsRequest();

        // create a new PaymentMethodCashRequest
        PaymentMethodCashRequest examplePaymentMethodCashRequest = new PaymentMethodCashRequest();
        // set CustomerPaymentMethodsRequest to PaymentMethodCashRequest
        exampleCustomerPaymentMethodsRequest.setActualInstance(examplePaymentMethodCashRequest);
        // to get back the PaymentMethodCashRequest set earlier
        PaymentMethodCashRequest testPaymentMethodCashRequest = (PaymentMethodCashRequest) exampleCustomerPaymentMethodsRequest.getActualInstance();

        // create a new PaymentMethodSpeiRequest
        PaymentMethodSpeiRequest examplePaymentMethodSpeiRequest = new PaymentMethodSpeiRequest();
        // set CustomerPaymentMethodsRequest to PaymentMethodSpeiRequest
        exampleCustomerPaymentMethodsRequest.setActualInstance(examplePaymentMethodSpeiRequest);
        // to get back the PaymentMethodSpeiRequest set earlier
        PaymentMethodSpeiRequest testPaymentMethodSpeiRequest = (PaymentMethodSpeiRequest) exampleCustomerPaymentMethodsRequest.getActualInstance();

        // create a new PaymentMethodTokenRequest
        PaymentMethodTokenRequest examplePaymentMethodTokenRequest = new PaymentMethodTokenRequest();
        // set CustomerPaymentMethodsRequest to PaymentMethodTokenRequest
        exampleCustomerPaymentMethodsRequest.setActualInstance(examplePaymentMethodTokenRequest);
        // to get back the PaymentMethodTokenRequest set earlier
        PaymentMethodTokenRequest testPaymentMethodTokenRequest = (PaymentMethodTokenRequest) exampleCustomerPaymentMethodsRequest.getActualInstance();
    }
}
```


