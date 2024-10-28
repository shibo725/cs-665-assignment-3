package org.example;

public class FrequentCustomer extends Customer {
    public FrequentCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmailContent() {
        return "Dear " + getName() + ",\nWe appreciate your frequent visits! Enjoy exclusive discounts.";
    }
}

