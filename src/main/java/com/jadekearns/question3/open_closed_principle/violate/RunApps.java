package com.jadekearns.question3.open_closed_principle.violate;

public class RunApps {



    public static void main(String[] args) {
        InHospitalClaim inHospitalClaim = new InHospitalClaim();
        OutOfHospitalClaim outOfHospitalClaim = new OutOfHospitalClaim();
        AssessingEngine assessingEngine = new AssessingEngine();

        assessingEngine.processInHospital(inHospitalClaim);
        assessingEngine.processOutHospital(outOfHospitalClaim);


    }

}
