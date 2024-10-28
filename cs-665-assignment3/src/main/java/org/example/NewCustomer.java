package org.example;

public class NewCustomer extends Customer {
    public NewCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmailContent() {
        return "Dear " + getName() + ",\nThank you for joining us! We're excited to have you.";
    }
}

