package com.jadekearns.question3.dependency_inversion_principle.obey;

public class Milnerton implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Milnerton: Eskom up and running");
    }

    @Override
    public void turnOff() {

        System.out.println("Milnerton: Load Shedding");
    }
}
