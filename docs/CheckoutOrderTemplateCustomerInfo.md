

# CheckoutOrderTemplateCustomerInfo

It is the information of the customer who will be created when receiving a new payment.

## oneOf schemas
* [CustomerInfo](CustomerInfo.md)
* [CustomerInfoCustomerId](CustomerInfoCustomerId.md)

## Example
```java
// Import classes:
import com.conekta.model.CheckoutOrderTemplateCustomerInfo;
import com.conekta.model.CustomerInfo;
import com.conekta.model.CustomerInfoCustomerId;

public class Example {
    public static void main(String[] args) {
        CheckoutOrderTemplateCustomerInfo exampleCheckoutOrderTemplateCustomerInfo = new CheckoutOrderTemplateCustomerInfo();

        // create a new CustomerInfo
        CustomerInfo exampleCustomerInfo = new CustomerInfo();
        // set CheckoutOrderTemplateCustomerInfo to CustomerInfo
        exampleCheckoutOrderTemplateCustomerInfo.setActualInstance(exampleCustomerInfo);
        // to get back the CustomerInfo set earlier
        CustomerInfo testCustomerInfo = (CustomerInfo) exampleCheckoutOrderTemplateCustomerInfo.getActualInstance();

        // create a new CustomerInfoCustomerId
        CustomerInfoCustomerId exampleCustomerInfoCustomerId = new CustomerInfoCustomerId();
        // set CheckoutOrderTemplateCustomerInfo to CustomerInfoCustomerId
        exampleCheckoutOrderTemplateCustomerInfo.setActualInstance(exampleCustomerInfoCustomerId);
        // to get back the CustomerInfoCustomerId set earlier
        CustomerInfoCustomerId testCustomerInfoCustomerId = (CustomerInfoCustomerId) exampleCheckoutOrderTemplateCustomerInfo.getActualInstance();
    }
}
```


