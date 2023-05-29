

# CreateCustomerPaymentMethodsResponse

## oneOf schemas
* [PaymentMethodCardResponse](PaymentMethodCardResponse.md)
* [PaymentMethodCashResponse](PaymentMethodCashResponse.md)
* [PaymentMethodSpeiRecurrent](PaymentMethodSpeiRecurrent.md)

## Example
```java
// Import classes:
import com.conekta.model.CreateCustomerPaymentMethodsResponse;
import com.conekta.model.PaymentMethodCardResponse;
import com.conekta.model.PaymentMethodCashResponse;
import com.conekta.model.PaymentMethodSpeiRecurrent;

public class Example {
    public static void main(String[] args) {
        CreateCustomerPaymentMethodsResponse exampleCreateCustomerPaymentMethodsResponse = new CreateCustomerPaymentMethodsResponse();

        // create a new PaymentMethodCardResponse
        PaymentMethodCardResponse examplePaymentMethodCardResponse = new PaymentMethodCardResponse();
        // set CreateCustomerPaymentMethodsResponse to PaymentMethodCardResponse
        exampleCreateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCardResponse);
        // to get back the PaymentMethodCardResponse set earlier
        PaymentMethodCardResponse testPaymentMethodCardResponse = (PaymentMethodCardResponse) exampleCreateCustomerPaymentMethodsResponse.getActualInstance();

        // create a new PaymentMethodCashResponse
        PaymentMethodCashResponse examplePaymentMethodCashResponse = new PaymentMethodCashResponse();
        // set CreateCustomerPaymentMethodsResponse to PaymentMethodCashResponse
        exampleCreateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCashResponse);
        // to get back the PaymentMethodCashResponse set earlier
        PaymentMethodCashResponse testPaymentMethodCashResponse = (PaymentMethodCashResponse) exampleCreateCustomerPaymentMethodsResponse.getActualInstance();

        // create a new PaymentMethodSpeiRecurrent
        PaymentMethodSpeiRecurrent examplePaymentMethodSpeiRecurrent = new PaymentMethodSpeiRecurrent();
        // set CreateCustomerPaymentMethodsResponse to PaymentMethodSpeiRecurrent
        exampleCreateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodSpeiRecurrent);
        // to get back the PaymentMethodSpeiRecurrent set earlier
        PaymentMethodSpeiRecurrent testPaymentMethodSpeiRecurrent = (PaymentMethodSpeiRecurrent) exampleCreateCustomerPaymentMethodsResponse.getActualInstance();
    }
}
```


