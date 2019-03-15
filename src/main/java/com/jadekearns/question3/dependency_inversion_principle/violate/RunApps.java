package com.jadekearns.question3.dependency_inversion_principle.violate;


public class RunApps {

    public static void main(String[] args) {

        CapeTown capeTown = new CapeTown();
        EskomPowerStation eskomPowerStation = new EskomPowerStation(capeTown);

        eskomPowerStation.press();
    }
}
