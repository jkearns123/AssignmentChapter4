package com.jadekearns.question3.principle_of_least_knowledge.violate;

public class Wallet {

    private double value = 2.00;

    public double getTotalMoney() {
        return value;
    }
    public void setTotalMoney(double newValue) {
        value = newValue;
    }
    public void addMoney(double deposit) {
        value += deposit;
    }
    public void subtractMoney(double debit) {
        value -= debit;
    }
}
