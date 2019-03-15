package com.jadekearns.question3.open_closed_principle.obey;

public class OutOfHospitalClaim extends ClaimValidation {
    @Override
    public boolean isValidClaim() {
        System.out.println("OutOfHospitalClaim: Validating consultation claim...");
        return false;
    }
}
