

# CheckoutOrderTemplateCustomerInfo

It is the information of the customer who will be created when receiving a new payment.

## oneOf schemas
* [CustomerInfo](CustomerInfo.md)
* [CustomerInfoJustCustomerId](CustomerInfoJustCustomerId.md)

## Example
```java
// Import classes:
import com.conekta.model.CheckoutOrderTemplateCustomerInfo;
import com.conekta.model.CustomerInfo;
import com.conekta.model.CustomerInfoJustCustomerId;

public class Example {
    public static void main(String[] args) {
        CheckoutOrderTemplateCustomerInfo exampleCheckoutOrderTemplateCustomerInfo = new CheckoutOrderTemplateCustomerInfo();

        // create a new CustomerInfo
        CustomerInfo exampleCustomerInfo = new CustomerInfo();
        // set CheckoutOrderTemplateCustomerInfo to CustomerInfo
        exampleCheckoutOrderTemplateCustomerInfo.setActualInstance(exampleCustomerInfo);
        // to get back the CustomerInfo set earlier
        CustomerInfo testCustomerInfo = (CustomerInfo) exampleCheckoutOrderTemplateCustomerInfo.getActualInstance();

        // create a new CustomerInfoJustCustomerId
        CustomerInfoJustCustomerId exampleCustomerInfoJustCustomerId = new CustomerInfoJustCustomerId();
        // set CheckoutOrderTemplateCustomerInfo to CustomerInfoJustCustomerId
        exampleCheckoutOrderTemplateCustomerInfo.setActualInstance(exampleCustomerInfoJustCustomerId);
        // to get back the CustomerInfoJustCustomerId set earlier
        CustomerInfoJustCustomerId testCustomerInfoJustCustomerId = (CustomerInfoJustCustomerId) exampleCheckoutOrderTemplateCustomerInfo.getActualInstance();
    }
}
```


