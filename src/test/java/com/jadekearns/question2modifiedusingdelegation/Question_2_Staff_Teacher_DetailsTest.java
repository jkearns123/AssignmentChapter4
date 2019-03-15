package com.jadekearns.question2modifiedusingdelegation;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Question_2_Staff_Teacher_DetailsTest{

    @Test
    public void testAssertListTeacherDetails1(){
        ArrayList<Question_2_Staff_Teacher_Details> staff_teacher_details = new ArrayList<>();
        Question_2_Staff_Teacher_Details teacherDetails1 = new Question_2_Staff_Teacher_Details(205074553,"Teacher","Olivia","Kearns", 'F',"Maths");
        Question_2_Staff_Teacher_Details teacherDetails2 = new Question_2_Staff_Teacher_Details(195074545,"Teacher","Adam","Wessons", 'M',"Computer Science");

        staff_teacher_details.add(teacherDetails1);
        staff_teacher_details.add(teacherDetails2);


        Assert.assertEquals(staff_teacher_details.get(0).toString(),"Question_1_Staff_Details_Basic{staffID=205074553, role='Teacher', firstName='Olivia', lastName='Kearns', gender=F}15000.0");
    }

    @Test
    public void testAssertListTeacherDetails2(){
        ArrayList<Question_2_Staff_Teacher_Details> staff_teacher_details = new ArrayList<>();
        Question_2_Staff_Teacher_Details teacherDetails1 = new Question_2_Staff_Teacher_Details(205074553,"Teacher","Olivia","Kearns", 'F',"Maths");
        Question_2_Staff_Teacher_Details teacherDetails2 = new Question_2_Staff_Teacher_Details(195074545,"Teacher","Adam","Wessons", 'M',"Computer Science");

        staff_teacher_details.add(teacherDetails1);
        staff_teacher_details.add(teacherDetails2);

        assertEquals(staff_teacher_details.size(),2);

    }

    @Test
    public void testSalaryMethodTeacherDetails3(){
        Question_2_Staff_Teacher_Details question_2_staff_teacher_details = new Question_2_Staff_Teacher_Details();


        Assert.assertEquals(question_2_staff_teacher_details.monthlySalary(),15000.0,20.0);



    }

    @Test
    public void testSalaryMethodTeacherDetails4(){
        Question_2_Staff_Teacher_Details question_2_staff_teacher_details = new Question_2_Staff_Teacher_Details();

        String valueToString = String.valueOf( question_2_staff_teacher_details.monthlySalary());

        Assert.assertEquals(valueToString,"15000.0");



    }

}