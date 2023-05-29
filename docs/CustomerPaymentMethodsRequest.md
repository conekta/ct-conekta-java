

# CustomerPaymentMethodsRequest

## oneOf schemas
* [PaymentMethodCardRequest](PaymentMethodCardRequest.md)
* [PaymentMethodCashRequest](PaymentMethodCashRequest.md)
* [PaymentMethodSpeiRequest](PaymentMethodSpeiRequest.md)

## Example
```java
// Import classes:
import com.conekta.model.CustomerPaymentMethodsRequest;
import com.conekta.model.PaymentMethodCardRequest;
import com.conekta.model.PaymentMethodCashRequest;
import com.conekta.model.PaymentMethodSpeiRequest;

public class Example {
    public static void main(String[] args) {
        CustomerPaymentMethodsRequest exampleCustomerPaymentMethodsRequest = new CustomerPaymentMethodsRequest();

        // create a new PaymentMethodCardRequest
        PaymentMethodCardRequest examplePaymentMethodCardRequest = new PaymentMethodCardRequest();
        // set CustomerPaymentMethodsRequest to PaymentMethodCardRequest
        exampleCustomerPaymentMethodsRequest.setActualInstance(examplePaymentMethodCardRequest);
        // to get back the PaymentMethodCardRequest set earlier
        PaymentMethodCardRequest testPaymentMethodCardRequest = (PaymentMethodCardRequest) exampleCustomerPaymentMethodsRequest.getActualInstance();

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
    }
}
```


