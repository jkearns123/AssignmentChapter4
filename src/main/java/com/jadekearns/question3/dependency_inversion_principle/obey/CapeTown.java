package com.jadekearns.question3.dependency_inversion_principle.obey;

public class CapeTown implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Cape Town: Eskom up and running");
    }

    @Override
    public void turnOff() {
        System.out.println("Cape Town: Load Shedding");
    }
}
