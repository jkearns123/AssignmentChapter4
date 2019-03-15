package com.jadekearns.question3.open_closed_principle.obey;

public class AssessingEngine {
    public void processClaim(ClaimValidation surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("AssessingEngine: Valid claim. processing claim....");
        }
    }
}
