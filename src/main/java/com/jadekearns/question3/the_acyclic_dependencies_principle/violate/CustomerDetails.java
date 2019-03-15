package com.jadekearns.question3.the_acyclic_dependencies_principle.violate;

public class CustomerDetails extends Customer {

    public synchronized double getUserBalance(String accountNumber) {
// Use a method of Customer to get the account balance
        return getBalance(accountNumber);
    }

    public boolean exists(String username) {
// Check whether user exists
        return true; // Exists
    }
}
