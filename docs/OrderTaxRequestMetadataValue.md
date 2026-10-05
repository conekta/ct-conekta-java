

# OrderTaxRequestMetadataValue

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [Boolean](Boolean.md)
* [Integer](Integer.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.conekta.model.OrderTaxRequestMetadataValue;
import com.conekta.model.BigDecimal;
import com.conekta.model.Boolean;
import com.conekta.model.Integer;
import com.conekta.model.String;

public class Example {
    public static void main(String[] args) {
        OrderTaxRequestMetadataValue exampleOrderTaxRequestMetadataValue = new OrderTaxRequestMetadataValue();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set OrderTaxRequestMetadataValue to BigDecimal
        exampleOrderTaxRequestMetadataValue.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleOrderTaxRequestMetadataValue.getActualInstance();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set OrderTaxRequestMetadataValue to Boolean
        exampleOrderTaxRequestMetadataValue.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleOrderTaxRequestMetadataValue.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set OrderTaxRequestMetadataValue to Integer
        exampleOrderTaxRequestMetadataValue.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleOrderTaxRequestMetadataValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set OrderTaxRequestMetadataValue to String
        exampleOrderTaxRequestMetadataValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleOrderTaxRequestMetadataValue.getActualInstance();
    }
}
```


