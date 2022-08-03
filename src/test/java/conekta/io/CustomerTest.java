package conekta.io;

import conekta.io.client.impl.CustomersClient;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.model.impl.Customer;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    CustomersClient customersClient = new CustomersClient();


    public CustomerTest() {
        super();
    }

    private Customer createMockCustomer() {
        Customer cus = new Customer();

        String customerStr = "{\n" +
                "    \"name\": \"Andres Falla\",\n" +
                "    \"email\": \"andres.falla@conekta.com\",\n" +
                "    \"phone\": \"+5215555555555\",\n" +
                "    \"corporate\": true,\n" +
                "    \"antifraud_info\": {\n" +
                "        \"account_created_at\": 1484040996,\n" +
                "        \"first_paid_at\": 1485151007\n" +
                "    },\n" +
                "    \"payment_sources\": [\n" +
                "        {\n" +
                "            \"token_id\": \"tok_test_visa_4242\",\n" +
                "            \"type\": \"card\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"shipping_contacts\": [\n" +
                "        {\n" +
                "            \"phone\": \"+5215555555555\",\n" +
                "            \"receiver\": \"Marvin Fuller\",\n" +
                "            \"between_streets\": \"Morelos Campeche\",\n" +
                "            \"address\": {\n" +
                "                \"street1\": \"Nuevo Leon 4\",\n" +
                "                \"street2\": \"fake street\",\n" +
                "                \"city\": \"Ciudad de Mexico\",\n" +
                "                \"state\": \"Ciudad de Mexico\",\n" +
                "                \"country\": \"MX\",\n" +
                "                \"postal_code\": \"06100\",\n" +
                "                \"residential\": true\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}}";
        try {
            cus = ConektaObjectMapper.getInstance().stringJsonToObject(customerStr, Customer.class);
        } catch (Exception e) {

        }
        return cus;
    }

    @Test
    public void testSuccesfulCustomerCreate() throws Exception {

        Customer customerMock = this.createMockCustomer();
        Customer cus = customersClient.createCustomer(customerMock);

        assertTrue(cus instanceof Customer);
        assertNotNull(cus.getId());
    }
}
