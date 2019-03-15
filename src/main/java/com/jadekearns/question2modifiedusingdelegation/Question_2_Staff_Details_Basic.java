package com.jadekearns.question2modifiedusingdelegation;

public class Question_2_Staff_Details_Basic {
    protected int staffID;
    protected String role;
    protected String firstName;
    protected String lastName;
    protected char gender;
    //protected double salary;

    public Question_2_Staff_Details_Basic() {
    }

    public Question_2_Staff_Details_Basic(int staffID, String role, String firstName, String lastName, char gender) {
        this.staffID = staffID;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }



    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double monthlySalary(){
        return 9000.00;
    }

    @Override
    public String toString() {
        return "Question_1_Staff_Details_Basic{" +
                "staffID=" + staffID +
                ", role='" + role + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
