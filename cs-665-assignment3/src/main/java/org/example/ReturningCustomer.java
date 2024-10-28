package org.example;

public class ReturningCustomer extends Customer {

    public ReturningCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmailContent() {
        return "Welcome back, " + getName() + "! We're glad to see you again.";
    }
}

