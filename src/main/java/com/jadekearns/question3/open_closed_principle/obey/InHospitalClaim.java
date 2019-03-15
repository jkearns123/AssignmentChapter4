package com.jadekearns.question3.open_closed_principle.obey;

public class InHospitalClaim extends ClaimValidation {

    @Override
    public boolean isValidClaim() {
        System.out.println("InHospitalClaim: Validating hospital claim...");
        return true;
    }
}
