package com.jadekearns.question3.principle_of_least_knowledge.obey;

public class RunApp {

    public static void main(String[] args) {
        Customer myCustomer = new Customer();
        double payment = 2.00; // “I want my two dollars!”
        double paidAmount = myCustomer.getPayment(payment);
        if (paidAmount == payment) {
            System.out.println("Thank you");
        } else {
            System.out.println("Whatever");
        }
    }

}
