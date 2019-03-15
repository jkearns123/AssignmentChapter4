package com.jadekearns.question3.open_closed_principle.violate;

public class AssessingEngine {
    public void processInHospital (InHospitalClaim check)
    {
        if(check.isValidClaim()){
            System.out.println("AssessingEngine: Valid claim. processing claim....");
        }
    }

    public void processOutHospital (OutOfHospitalClaim check)
    {
        if(check.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
