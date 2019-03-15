package com.jadekearns.question1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Question_1_Staff_Teacher_DetailsTest {

    @Test
    public void monthlySalary1() {
        Question_1_Staff_Details_Basic question_1_staff_teacher_details = new Question_1_Staff_Details_Basic();


        Assert.assertEquals(question_1_staff_teacher_details.monthlySalary(),9000.0,1.0);
    }

    @Test
    public void testSalaryMethodTeacherDetails2(){
        Question_1_Staff_Teacher_Details question_1_staff_teacher_details = new Question_1_Staff_Teacher_Details();

        String valueToString = String.valueOf( question_1_staff_teacher_details.monthlySalary());

        Assert.assertEquals(valueToString,"12000.0");



    }

    @Test
    public void testAssertListTeacherDetails3(){
        ArrayList<Question_1_Staff_Teacher_Details> staff_teacher_details = new ArrayList<>();
        Question_1_Staff_Teacher_Details teacherDetails1 = new Question_1_Staff_Teacher_Details(205074553,"Teacher","Olivia","Kearns", 'F',"Maths");
        Question_1_Staff_Teacher_Details teacherDetails2 = new Question_1_Staff_Teacher_Details(195074545,"Teacher","Adam","Wessons", 'M',"Computer Science");

        staff_teacher_details.add(teacherDetails1);
        staff_teacher_details.add(teacherDetails2);

        assertEquals(staff_teacher_details.size(),2);

    }

    @Test
    public void testAssertListTeacherDetails4(){
        ArrayList<Question_1_Staff_Teacher_Details> staff_teacher_details = new ArrayList<>();
        Question_1_Staff_Teacher_Details teacherDetails1 = new Question_1_Staff_Teacher_Details(205074553,"Teacher","Olivia","Kearns", 'F',"Maths");
        Question_1_Staff_Teacher_Details teacherDetails2 = new Question_1_Staff_Teacher_Details(195074545,"Teacher","Adam","Wessons", 'M',"Computer Science");

        staff_teacher_details.add(teacherDetails1);
        staff_teacher_details.add(teacherDetails2);
System.out.println(staff_teacher_details.get(0).toString());

        Assert.assertEquals(staff_teacher_details.get(0).toString(),"Question_1_Staff_Teacher_Details{staffID=205074553, role='Teacher', firstName='Olivia', lastName='Kearns', gender=F}Teachers earn a monthly salary of : 12000.0\n" +
                "______This is polymorphic as it overrides the toString method of Staff_Details_Basic");
    }


}