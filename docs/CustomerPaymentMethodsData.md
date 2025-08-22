

# CustomerPaymentMethodsData

## oneOf schemas
* [PaymentMethodCardResponse](PaymentMethodCardResponse.md)
* [PaymentMethodCashRecurrentResponse](PaymentMethodCashRecurrentResponse.md)
* [PaymentMethodCashResponse](PaymentMethodCashResponse.md)
* [PaymentMethodSpeiRecurrent](PaymentMethodSpeiRecurrent.md)

## Example
```java
// Import classes:
import com.conekta.model.CustomerPaymentMethodsData;
import com.conekta.model.PaymentMethodCardResponse;
import com.conekta.model.PaymentMethodCashRecurrentResponse;
import com.conekta.model.PaymentMethodCashResponse;
import com.conekta.model.PaymentMethodSpeiRecurrent;

public class Example {
    public static void main(String[] args) {
        CustomerPaymentMethodsData exampleCustomerPaymentMethodsData = new CustomerPaymentMethodsData();

        // create a new PaymentMethodCardResponse
        PaymentMethodCardResponse examplePaymentMethodCardResponse = new PaymentMethodCardResponse();
        // set CustomerPaymentMethodsData to PaymentMethodCardResponse
        exampleCustomerPaymentMethodsData.setActualInstance(examplePaymentMethodCardResponse);
        // to get back the PaymentMethodCardResponse set earlier
        PaymentMethodCardResponse testPaymentMethodCardResponse = (PaymentMethodCardResponse) exampleCustomerPaymentMethodsData.getActualInstance();

        // create a new PaymentMethodCashRecurrentResponse
        PaymentMethodCashRecurrentResponse examplePaymentMethodCashRecurrentResponse = new PaymentMethodCashRecurrentResponse();
        // set CustomerPaymentMethodsData to PaymentMethodCashRecurrentResponse
        exampleCustomerPaymentMethodsData.setActualInstance(examplePaymentMethodCashRecurrentResponse);
        // to get back the PaymentMethodCashRecurrentResponse set earlier
        PaymentMethodCashRecurrentResponse testPaymentMethodCashRecurrentResponse = (PaymentMethodCashRecurrentResponse) exampleCustomerPaymentMethodsData.getActualInstance();

        // create a new PaymentMethodCashResponse
        PaymentMethodCashResponse examplePaymentMethodCashResponse = new PaymentMethodCashResponse();
        // set CustomerPaymentMethodsData to PaymentMethodCashResponse
        exampleCustomerPaymentMethodsData.setActualInstance(examplePaymentMethodCashResponse);
        // to get back the PaymentMethodCashResponse set earlier
        PaymentMethodCashResponse testPaymentMethodCashResponse = (PaymentMethodCashResponse) exampleCustomerPaymentMethodsData.getActualInstance();

        // create a new PaymentMethodSpeiRecurrent
        PaymentMethodSpeiRecurrent examplePaymentMethodSpeiRecurrent = new PaymentMethodSpeiRecurrent();
        // set CustomerPaymentMethodsData to PaymentMethodSpeiRecurrent
        exampleCustomerPaymentMethodsData.setActualInstance(examplePaymentMethodSpeiRecurrent);
        // to get back the PaymentMethodSpeiRecurrent set earlier
        PaymentMethodSpeiRecurrent testPaymentMethodSpeiRecurrent = (PaymentMethodSpeiRecurrent) exampleCustomerPaymentMethodsData.getActualInstance();
    }
}
```


