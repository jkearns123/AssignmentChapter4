package com.jadekearns.question3.interface_segregation_principle.violate;

public class Car implements Vehicle{


    @Override
    public int wheels(int quantity) {
        return quantity;
    }

    @Override
    public double windshield(double weight, double height) {
        return (weight * height);
    }

    @Override
    public String interior(String colour) {
        return colour;
    }
}
