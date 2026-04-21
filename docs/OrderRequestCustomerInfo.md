

# OrderRequestCustomerInfo

Customer information

## oneOf schemas
* [CustomerInfo](CustomerInfo.md)
* [CustomerInfoCustomerId](CustomerInfoCustomerId.md)

## Example
```java
// Import classes:
import com.conekta.model.OrderRequestCustomerInfo;
import com.conekta.model.CustomerInfo;
import com.conekta.model.CustomerInfoCustomerId;

public class Example {
    public static void main(String[] args) {
        OrderRequestCustomerInfo exampleOrderRequestCustomerInfo = new OrderRequestCustomerInfo();

        // create a new CustomerInfo
        CustomerInfo exampleCustomerInfo = new CustomerInfo();
        // set OrderRequestCustomerInfo to CustomerInfo
        exampleOrderRequestCustomerInfo.setActualInstance(exampleCustomerInfo);
        // to get back the CustomerInfo set earlier
        CustomerInfo testCustomerInfo = (CustomerInfo) exampleOrderRequestCustomerInfo.getActualInstance();

        // create a new CustomerInfoCustomerId
        CustomerInfoCustomerId exampleCustomerInfoCustomerId = new CustomerInfoCustomerId();
        // set OrderRequestCustomerInfo to CustomerInfoCustomerId
        exampleOrderRequestCustomerInfo.setActualInstance(exampleCustomerInfoCustomerId);
        // to get back the CustomerInfoCustomerId set earlier
        CustomerInfoCustomerId testCustomerInfoCustomerId = (CustomerInfoCustomerId) exampleOrderRequestCustomerInfo.getActualInstance();
    }
}
```


