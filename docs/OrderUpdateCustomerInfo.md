

# OrderUpdateCustomerInfo

## oneOf schemas
* [CustomerInfo](CustomerInfo.md)
* [CustomerInfoCustomerId](CustomerInfoCustomerId.md)

## Example
```java
// Import classes:
import com.conekta.model.OrderUpdateCustomerInfo;
import com.conekta.model.CustomerInfo;
import com.conekta.model.CustomerInfoCustomerId;

public class Example {
    public static void main(String[] args) {
        OrderUpdateCustomerInfo exampleOrderUpdateCustomerInfo = new OrderUpdateCustomerInfo();

        // create a new CustomerInfo
        CustomerInfo exampleCustomerInfo = new CustomerInfo();
        // set OrderUpdateCustomerInfo to CustomerInfo
        exampleOrderUpdateCustomerInfo.setActualInstance(exampleCustomerInfo);
        // to get back the CustomerInfo set earlier
        CustomerInfo testCustomerInfo = (CustomerInfo) exampleOrderUpdateCustomerInfo.getActualInstance();

        // create a new CustomerInfoCustomerId
        CustomerInfoCustomerId exampleCustomerInfoCustomerId = new CustomerInfoCustomerId();
        // set OrderUpdateCustomerInfo to CustomerInfoCustomerId
        exampleOrderUpdateCustomerInfo.setActualInstance(exampleCustomerInfoCustomerId);
        // to get back the CustomerInfoCustomerId set earlier
        CustomerInfoCustomerId testCustomerInfoCustomerId = (CustomerInfoCustomerId) exampleOrderUpdateCustomerInfo.getActualInstance();
    }
}
```


