package com.jadekearns.question3.the_acyclic_dependencies_principle.violate;

public class RunnApp {

    public static void main(String[] args) {
        CustomerDetails customerDetails = new CustomerDetails();

        Customer ah = new Customer();

        ah.depositFunds("user",1.0);


        System.out.println(customerDetails.exists("user"));
        System.out.println(customerDetails.getUserBalance("1111"));

    }
}