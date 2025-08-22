

# GetCustomerPaymentMethodDataResponse

## oneOf schemas
* [PaymentMethodCardResponse](PaymentMethodCardResponse.md)
* [PaymentMethodCashRecurrentResponse](PaymentMethodCashRecurrentResponse.md)
* [PaymentMethodCashResponse](PaymentMethodCashResponse.md)
* [PaymentMethodSpeiRecurrent](PaymentMethodSpeiRecurrent.md)

## Example
```java
// Import classes:
import com.conekta.model.GetCustomerPaymentMethodDataResponse;
import com.conekta.model.PaymentMethodCardResponse;
import com.conekta.model.PaymentMethodCashRecurrentResponse;
import com.conekta.model.PaymentMethodCashResponse;
import com.conekta.model.PaymentMethodSpeiRecurrent;

public class Example {
    public static void main(String[] args) {
        GetCustomerPaymentMethodDataResponse exampleGetCustomerPaymentMethodDataResponse = new GetCustomerPaymentMethodDataResponse();

        // create a new PaymentMethodCardResponse
        PaymentMethodCardResponse examplePaymentMethodCardResponse = new PaymentMethodCardResponse();
        // set GetCustomerPaymentMethodDataResponse to PaymentMethodCardResponse
        exampleGetCustomerPaymentMethodDataResponse.setActualInstance(examplePaymentMethodCardResponse);
        // to get back the PaymentMethodCardResponse set earlier
        PaymentMethodCardResponse testPaymentMethodCardResponse = (PaymentMethodCardResponse) exampleGetCustomerPaymentMethodDataResponse.getActualInstance();

        // create a new PaymentMethodCashRecurrentResponse
        PaymentMethodCashRecurrentResponse examplePaymentMethodCashRecurrentResponse = new PaymentMethodCashRecurrentResponse();
        // set GetCustomerPaymentMethodDataResponse to PaymentMethodCashRecurrentResponse
        exampleGetCustomerPaymentMethodDataResponse.setActualInstance(examplePaymentMethodCashRecurrentResponse);
        // to get back the PaymentMethodCashRecurrentResponse set earlier
        PaymentMethodCashRecurrentResponse testPaymentMethodCashRecurrentResponse = (PaymentMethodCashRecurrentResponse) exampleGetCustomerPaymentMethodDataResponse.getActualInstance();

        // create a new PaymentMethodCashResponse
        PaymentMethodCashResponse examplePaymentMethodCashResponse = new PaymentMethodCashResponse();
        // set GetCustomerPaymentMethodDataResponse to PaymentMethodCashResponse
        exampleGetCustomerPaymentMethodDataResponse.setActualInstance(examplePaymentMethodCashResponse);
        // to get back the PaymentMethodCashResponse set earlier
        PaymentMethodCashResponse testPaymentMethodCashResponse = (PaymentMethodCashResponse) exampleGetCustomerPaymentMethodDataResponse.getActualInstance();

        // create a new PaymentMethodSpeiRecurrent
        PaymentMethodSpeiRecurrent examplePaymentMethodSpeiRecurrent = new PaymentMethodSpeiRecurrent();
        // set GetCustomerPaymentMethodDataResponse to PaymentMethodSpeiRecurrent
        exampleGetCustomerPaymentMethodDataResponse.setActualInstance(examplePaymentMethodSpeiRecurrent);
        // to get back the PaymentMethodSpeiRecurrent set earlier
        PaymentMethodSpeiRecurrent testPaymentMethodSpeiRecurrent = (PaymentMethodSpeiRecurrent) exampleGetCustomerPaymentMethodDataResponse.getActualInstance();
    }
}
```


