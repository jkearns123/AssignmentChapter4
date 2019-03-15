package com.jadekearns.question3.the_acyclic_dependencies_principle.obey;

class ATMop {
    private ATMvalidation atmValidation;
    public ATMop(ATMvalidation atmValidation) {
        this.atmValidation = atmValidation;
    }

    public void doUserActions() {
        System.out.println(atmValidation.exists("user"));
        System.out.println(atmValidation.getUserBalance("1111"));
    }

    public static void main(String[] args) {
        Customer aCustomer = new Customer();
        aCustomer.depositFunds(new CustomerDetails(), "user", 1.0);
        ATMop atmOp = new ATMop(new CustomerDetails());
        atmOp.doUserActions();
    }
}
