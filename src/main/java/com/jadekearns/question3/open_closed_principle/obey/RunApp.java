package com.jadekearns.question3.open_closed_principle.obey;

public class RunApp {

    public static void main(String[] args) {
        InHospitalClaim inHospitalClaim =new InHospitalClaim();
        AssessingEngine claim1=new AssessingEngine();
        claim1.processClaim(inHospitalClaim);

        OutOfHospitalClaim outOfHospitalClaim =new OutOfHospitalClaim();
        AssessingEngine claim2=new AssessingEngine();
        claim2.processClaim(outOfHospitalClaim);
    }
}
