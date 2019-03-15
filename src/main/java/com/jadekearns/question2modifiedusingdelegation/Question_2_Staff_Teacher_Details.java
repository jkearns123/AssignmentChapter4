package com.jadekearns.question2modifiedusingdelegation;

public class Question_2_Staff_Teacher_Details {

    private final Question_2_Staff_Details_Basic question_2_staff_details_basic;

    public Question_2_Staff_Teacher_Details(int staffID, String role, String firstName, String lastName, char gender, String maths) {
        question_2_staff_details_basic = new Question_2_Staff_Details_Basic(staffID, role, firstName, lastName, gender);
    }

    public Question_2_Staff_Teacher_Details() {
        question_2_staff_details_basic = new Question_2_Staff_Details_Basic();
    }

    public Question_2_Staff_Details_Basic getQuestion_2_staff_details_basic() {
        return question_2_staff_details_basic;
    }

    public int getStaffID() {
        return question_2_staff_details_basic.getStaffID();
    }

    public void setStaffID(int staffID) {
        question_2_staff_details_basic.setStaffID(staffID);
    }

    public String getRole() {
        return question_2_staff_details_basic.getRole();
    }

    public void setRole(String role) {
        question_2_staff_details_basic.setRole(role);
    }

    public String getFirstName() {
        return question_2_staff_details_basic.getFirstName();
    }

    public void setFirstName(String firstName) {
        question_2_staff_details_basic.setFirstName(firstName);
    }

    public String getLastName() {
        return question_2_staff_details_basic.getLastName();
    }

    public void setLastName(String lastName) {
        question_2_staff_details_basic.setLastName(lastName);
    }

    public char getGender() {
        return question_2_staff_details_basic.getGender();
    }

    public void setGender(char gender) {
        question_2_staff_details_basic.setGender(gender);
    }

    public double monthlySalary() {
        return 15000.00;
    }

    public String toString() {
        return question_2_staff_details_basic.toString() + monthlySalary();
    }
}
