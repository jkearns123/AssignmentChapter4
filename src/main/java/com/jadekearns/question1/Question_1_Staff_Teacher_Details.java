package com.jadekearns.question1;

public class Question_1_Staff_Teacher_Details extends Question_1_Staff_Details_Basic {

    private String subject;

    public Question_1_Staff_Teacher_Details() {
    }

    public Question_1_Staff_Teacher_Details(int staffID, String role, String firstName, String lastName, char gender, String subject) {
        super(staffID, role, firstName, lastName, gender);
        this.subject = subject;

    }

    public double monthlySalary(){

        return 12000;
    }

    @Override
    public String toString() {
        return "Question_1_Staff_Teacher_Details{" + "staffID=" + staffID + ", role='" + role + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", gender=" + gender +
                '}' + "Teachers earn a monthly salary of : " + monthlySalary() + "\n______This is polymorphic as it overrides the toString method of Staff_Details_Basic";
    }
}
