package com.jadekearns.question3.principle_of_least_knowledge.violate;

public class RunApp {

    public static void main(String[] args) {
        try{
        Customer myCustomer = new Customer();
        double payment = 2.00;
        Wallet theWallet = myCustomer.getWallet();
        if (theWallet.getTotalMoney() > payment) {
            theWallet.subtractMoney((double) payment);
        } else {
            System.out.println("Come again");
        }
    }catch(Exception ex){
            System.out.println("Exception " + ex);
        }
    }

}
