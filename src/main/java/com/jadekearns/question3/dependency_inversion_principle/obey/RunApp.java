package com.jadekearns.question3.dependency_inversion_principle.obey;

public class RunApp {

    public static void main(String[] args) {
        Switchable switchableCapetown = new CapeTown();
        Switch capetownPower = new EskomPowerStation(switchableCapetown);
        capetownPower.press();

        Switchable switchableMilnerton = new Milnerton();
        Switch milnertonPower = new EskomPowerStation(switchableMilnerton);
        milnertonPower.press();
        milnertonPower.press();
    }
}
