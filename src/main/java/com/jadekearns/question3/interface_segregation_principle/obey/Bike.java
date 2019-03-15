package com.jadekearns.question3.interface_segregation_principle.obey;

public class Bike implements Vehicle_Wheels{
    @Override
    public int wheels(int quantity) {
        return quantity;
    }
}
