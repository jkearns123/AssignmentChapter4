package com.jadekearns.question3.the_acyclic_dependencies_principle.obey;

public class CustomerDetails extends Customer implements ATMvalidation {
    public synchronized double getUserBalance(String accountNumber) {

        return getBalance(accountNumber);
    }
    public boolean exists(String username) {

        return true;
    }
}
