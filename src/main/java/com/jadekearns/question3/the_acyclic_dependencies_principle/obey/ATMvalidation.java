package com.jadekearns.question3.the_acyclic_dependencies_principle.obey;

public interface ATMvalidation {
    void depositFunds(ATMvalidation atmValidation, String username, double amount);
    double getBalance(String accountNumber);
    double getUserBalance(String accountNumber);
    boolean exists(String username);
}
