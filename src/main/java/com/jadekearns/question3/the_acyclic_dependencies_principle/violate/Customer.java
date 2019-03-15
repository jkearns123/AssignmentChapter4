package com.jadekearns.question3.the_acyclic_dependencies_principle.violate;



public class Customer {
    private CustomerDetails ud;

    synchronized void depositFunds(String username, double amount) {

        if (ud.exists(username)) {
            System.out.println("Deposit Amount");
        }
    }

    protected double getBalance(String accountNumber) {

        return 1.00;
    }

}


