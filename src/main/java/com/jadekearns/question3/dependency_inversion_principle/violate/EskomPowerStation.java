package com.jadekearns.question3.dependency_inversion_principle.violate;

public class EskomPowerStation {

    public CapeTown capeTown;
    public boolean on;

    public EskomPowerStation(CapeTown capeTown){
        this.capeTown = capeTown;
        this.on = false;
    }

    public boolean isOn(){
        return this.on;
    }

    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            capeTown.turnOff();
            this.on = false;
        } else {
            capeTown.turnOn();
            this.on = true;
        }
}
}

