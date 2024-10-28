package org.example;

public class CustomerFactory {
    public static Customer createCustomer(String type, String name, String email) {
        switch (type.toLowerCase()) {
            case "business":
                return new BusinessCustomer(name, email);
            case "returning":
                return new ReturningCustomer(name, email);
            case "frequent":
                return new FrequentCustomer(name, email);
            case "new":
                return new NewCustomer(name, email);
            case "vip":
                return new VIPCustomer(name, email);
            default:
                throw new IllegalArgumentException("Invalid customer type: " + type);
        }
    }
}


