package org.example;

public class VIPCustomer extends Customer {
    public VIPCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmailContent() {
        return "Dear VIP " + getName() + ",\nWe value your loyalty and offer you personalized VIP services.";
    }
}
