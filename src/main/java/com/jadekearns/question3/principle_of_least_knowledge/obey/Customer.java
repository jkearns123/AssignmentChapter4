package com.jadekearns.question3.principle_of_least_knowledge.obey;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Customer {

        private String firstName;
        private String lastName;
        private Wallet myWallet;

        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }
        public double getPayment(double bill) {
            if (myWallet != null) {
                if (myWallet.getTotalMoney() > bill) {
                    double payment = 2.00;
                    myWallet.subtractMoney(payment);
                    return payment;
                }
            }
return 0.00;

    }}
