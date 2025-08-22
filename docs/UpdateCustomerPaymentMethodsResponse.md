

# UpdateCustomerPaymentMethodsResponse

## oneOf schemas
* [PaymentMethodCardResponse](PaymentMethodCardResponse.md)
* [PaymentMethodCashRecurrentResponse](PaymentMethodCashRecurrentResponse.md)
* [PaymentMethodCashResponse](PaymentMethodCashResponse.md)
* [PaymentMethodSpeiRecurrent](PaymentMethodSpeiRecurrent.md)

## Example
```java
// Import classes:
import com.conekta.model.UpdateCustomerPaymentMethodsResponse;
import com.conekta.model.PaymentMethodCardResponse;
import com.conekta.model.PaymentMethodCashRecurrentResponse;
import com.conekta.model.PaymentMethodCashResponse;
import com.conekta.model.PaymentMethodSpeiRecurrent;

public class Example {
    public static void main(String[] args) {
        UpdateCustomerPaymentMethodsResponse exampleUpdateCustomerPaymentMethodsResponse = new UpdateCustomerPaymentMethodsResponse();

        // create a new PaymentMethodCardResponse
        PaymentMethodCardResponse examplePaymentMethodCardResponse = new PaymentMethodCardResponse();
        // set UpdateCustomerPaymentMethodsResponse to PaymentMethodCardResponse
        exampleUpdateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCardResponse);
        // to get back the PaymentMethodCardResponse set earlier
        PaymentMethodCardResponse testPaymentMethodCardResponse = (PaymentMethodCardResponse) exampleUpdateCustomerPaymentMethodsResponse.getActualInstance();

        // create a new PaymentMethodCashRecurrentResponse
        PaymentMethodCashRecurrentResponse examplePaymentMethodCashRecurrentResponse = new PaymentMethodCashRecurrentResponse();
        // set UpdateCustomerPaymentMethodsResponse to PaymentMethodCashRecurrentResponse
        exampleUpdateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCashRecurrentResponse);
        // to get back the PaymentMethodCashRecurrentResponse set earlier
        PaymentMethodCashRecurrentResponse testPaymentMethodCashRecurrentResponse = (PaymentMethodCashRecurrentResponse) exampleUpdateCustomerPaymentMethodsResponse.getActualInstance();

        // create a new PaymentMethodCashResponse
        PaymentMethodCashResponse examplePaymentMethodCashResponse = new PaymentMethodCashResponse();
        // set UpdateCustomerPaymentMethodsResponse to PaymentMethodCashResponse
        exampleUpdateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCashResponse);
        // to get back the PaymentMethodCashResponse set earlier
        PaymentMethodCashResponse testPaymentMethodCashResponse = (PaymentMethodCashResponse) exampleUpdateCustomerPaymentMethodsResponse.getActualInstance();

        // create a new PaymentMethodSpeiRecurrent
        PaymentMethodSpeiRecurrent examplePaymentMethodSpeiRecurrent = new PaymentMethodSpeiRecurrent();
        // set UpdateCustomerPaymentMethodsResponse to PaymentMethodSpeiRecurrent
        exampleUpdateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodSpeiRecurrent);
        // to get back the PaymentMethodSpeiRecurrent set earlier
        PaymentMethodSpeiRecurrent testPaymentMethodSpeiRecurrent = (PaymentMethodSpeiRecurrent) exampleUpdateCustomerPaymentMethodsResponse.getActualInstance();
    }
}
```


