package com.jadekearns.question3.interface_segregation_principle.violate;

public class Bike implements Vehicle{
    @Override
    public int wheels(int quantity) {
        return quantity;
    }

    @Override
    public double windshield(double weight, double height) {
        return 0;
    }

    @Override
    public String interior(String colour) {
        return null;
    }
}
