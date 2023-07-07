

# OrderRequestCustomerInfo

Customer information

## oneOf schemas
* [CustomerInfo](CustomerInfo.md)
* [CustomerInfoJustCustomerId](CustomerInfoJustCustomerId.md)

## Example
```java
// Import classes:
import com.conekta.model.OrderRequestCustomerInfo;
import com.conekta.model.CustomerInfo;
import com.conekta.model.CustomerInfoJustCustomerId;

public class Example {
    public static void main(String[] args) {
        OrderRequestCustomerInfo exampleOrderRequestCustomerInfo = new OrderRequestCustomerInfo();

        // create a new CustomerInfo
        CustomerInfo exampleCustomerInfo = new CustomerInfo();
        // set OrderRequestCustomerInfo to CustomerInfo
        exampleOrderRequestCustomerInfo.setActualInstance(exampleCustomerInfo);
        // to get back the CustomerInfo set earlier
        CustomerInfo testCustomerInfo = (CustomerInfo) exampleOrderRequestCustomerInfo.getActualInstance();

        // create a new CustomerInfoJustCustomerId
        CustomerInfoJustCustomerId exampleCustomerInfoJustCustomerId = new CustomerInfoJustCustomerId();
        // set OrderRequestCustomerInfo to CustomerInfoJustCustomerId
        exampleOrderRequestCustomerInfo.setActualInstance(exampleCustomerInfoJustCustomerId);
        // to get back the CustomerInfoJustCustomerId set earlier
        CustomerInfoJustCustomerId testCustomerInfoJustCustomerId = (CustomerInfoJustCustomerId) exampleOrderRequestCustomerInfo.getActualInstance();
    }
}
```


