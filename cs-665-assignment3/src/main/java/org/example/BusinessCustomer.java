package org.example;

public class BusinessCustomer extends Customer {

    public BusinessCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmailContent() {
        return "Dear " + getName() + ",\nThank you for your continued business with us!";
    }
}

