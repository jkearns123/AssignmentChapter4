package com.jadekearns.question1;

import java.util.ArrayList;

public class RunApp {
    public static void main(String[] args) {

        //Question_1_Staff_Teacher_Details staffTeacherDetails = new Question_1_Staff_Teacher_Details();

        ArrayList<Question_1_Staff_Details_Basic>staff_teacher_details = new ArrayList<>();


        staff_teacher_details.add(new Question_1_Staff_Teacher_Details(205074553,"Teacher","Olivia","Kearns", 'F',"Maths"));



        for(Question_1_Staff_Details_Basic sdb : staff_teacher_details){
            System.out.println(sdb.toString() + "Salary: " );
        }
    }
}
