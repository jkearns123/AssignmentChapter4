package com.jadekearns.question3.single_responsibility_principle.obey;

import java.util.Date;

public class Student {

    private String firstName;
    private String lastname;
    private Date joinDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public void yearsOnCampus(){

    }

    public void printInfo(){

    }
}
