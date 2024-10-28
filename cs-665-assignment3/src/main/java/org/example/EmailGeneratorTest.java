package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmailGeneratorTest {

    @Test
    public void testBusinessCustomerEmail() {
        Customer customer = CustomerFactory.createCustomer("business", "Alice", "alice@company.com");
        String expected = "Dear Alice,\nThank you for your continued business with us!";
        assertEquals(expected, customer.generateEmailContent());
    }

    @Test
    public void testReturningCustomerEmail() {
        Customer customer = CustomerFactory.createCustomer("returning", "Bob", "bob@example.com");
        String expected = "Welcome back, Bob! We're glad to see you again.";
        assertEquals(expected, customer.generateEmailContent());
    }

    @Test
    public void testFrequentCustomerEmail() {
        Customer customer = CustomerFactory.createCustomer("frequent", "Charlie", "charlie@example.com");
        String expected = "Dear Charlie,\nWe appreciate your frequent visits! Enjoy exclusive discounts.";
        assertEquals(expected, customer.generateEmailContent());
    }

    @Test
    public void testNewCustomerEmail() {
        Customer customer = CustomerFactory.createCustomer("new", "Dana", "dana@example.com");
        String expected = "Dear Dana,\nThank you for joining us! We're excited to have you.";
        assertEquals(expected, customer.generateEmailContent());
    }

    @Test
    public void testVIPCustomerEmail() {
        Customer customer = CustomerFactory.createCustomer("vip", "Edward", "edward@example.com");
        String expected = "Dear VIP Edward,\nWe value your loyalty and offer you personalized VIP services.";
        assertEquals(expected, customer.generateEmailContent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCustomerType() {
        CustomerFactory.createCustomer("unknown", "Invalid", "invalid@example.com");
    }
}
