

# CreateCustomerPaymentMethodsResponse

## oneOf schemas
* [PaymentMethodCardResponse](PaymentMethodCardResponse.md)
* [PaymentMethodCashRecurrentResponse](PaymentMethodCashRecurrentResponse.md)
* [PaymentMethodCashResponse](PaymentMethodCashResponse.md)
* [PaymentMethodSpeiRecurrentResponse](PaymentMethodSpeiRecurrentResponse.md)

## Example
```java
// Import classes:
import com.conekta.model.CreateCustomerPaymentMethodsResponse;
import com.conekta.model.PaymentMethodCardResponse;
import com.conekta.model.PaymentMethodCashRecurrentResponse;
import com.conekta.model.PaymentMethodCashResponse;
import com.conekta.model.PaymentMethodSpeiRecurrentResponse;

public class Example {
    public static void main(String[] args) {
        CreateCustomerPaymentMethodsResponse exampleCreateCustomerPaymentMethodsResponse = new CreateCustomerPaymentMethodsResponse();

        // create a new PaymentMethodCardResponse
        PaymentMethodCardResponse examplePaymentMethodCardResponse = new PaymentMethodCardResponse();
        // set CreateCustomerPaymentMethodsResponse to PaymentMethodCardResponse
        exampleCreateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCardResponse);
        // to get back the PaymentMethodCardResponse set earlier
        PaymentMethodCardResponse testPaymentMethodCardResponse = (PaymentMethodCardResponse) exampleCreateCustomerPaymentMethodsResponse.getActualInstance();

        // create a new PaymentMethodCashRecurrentResponse
        PaymentMethodCashRecurrentResponse examplePaymentMethodCashRecurrentResponse = new PaymentMethodCashRecurrentResponse();
        // set CreateCustomerPaymentMethodsResponse to PaymentMethodCashRecurrentResponse
        exampleCreateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCashRecurrentResponse);
        // to get back the PaymentMethodCashRecurrentResponse set earlier
        PaymentMethodCashRecurrentResponse testPaymentMethodCashRecurrentResponse = (PaymentMethodCashRecurrentResponse) exampleCreateCustomerPaymentMethodsResponse.getActualInstance();

        // create a new PaymentMethodCashResponse
        PaymentMethodCashResponse examplePaymentMethodCashResponse = new PaymentMethodCashResponse();
        // set CreateCustomerPaymentMethodsResponse to PaymentMethodCashResponse
        exampleCreateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCashResponse);
        // to get back the PaymentMethodCashResponse set earlier
        PaymentMethodCashResponse testPaymentMethodCashResponse = (PaymentMethodCashResponse) exampleCreateCustomerPaymentMethodsResponse.getActualInstance();

        // create a new PaymentMethodSpeiRecurrentResponse
        PaymentMethodSpeiRecurrentResponse examplePaymentMethodSpeiRecurrentResponse = new PaymentMethodSpeiRecurrentResponse();
        // set CreateCustomerPaymentMethodsResponse to PaymentMethodSpeiRecurrentResponse
        exampleCreateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodSpeiRecurrentResponse);
        // to get back the PaymentMethodSpeiRecurrentResponse set earlier
        PaymentMethodSpeiRecurrentResponse testPaymentMethodSpeiRecurrentResponse = (PaymentMethodSpeiRecurrentResponse) exampleCreateCustomerPaymentMethodsResponse.getActualInstance();
    }
}
```


