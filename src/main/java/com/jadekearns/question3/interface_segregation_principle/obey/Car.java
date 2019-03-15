package com.jadekearns.question3.interface_segregation_principle.obey;

public class Car implements Vehicle_Wheels, Vehicle_Windshield, Vehicle_Interior{

    @Override
    public String interior(String colour) {
        return colour;
    }

    @Override
    public int wheels(int quantity) {
        return quantity;
    }

    @Override
    public double windshield(double weight, double height) {
        return (weight * height);
    }
}
