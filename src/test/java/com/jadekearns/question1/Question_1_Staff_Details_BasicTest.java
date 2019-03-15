package com.jadekearns.question1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Question_1_Staff_Details_BasicTest {
    @Test
    public void testAssertListDetailsBasic1(){
        ArrayList<Question_1_Staff_Details_Basic> staff_teacher_details = new ArrayList<>();
        Question_1_Staff_Details_Basic Details1 = new Question_1_Staff_Details_Basic(205074553,"Teacher","Olivia","Kearns", 'F');
        Question_1_Staff_Details_Basic Details2 = new Question_1_Staff_Details_Basic(195074545,"Teacher","Adam","Wessons", 'M');

        staff_teacher_details.add(Details1);
        staff_teacher_details.add(Details2);


        Assert.assertEquals(staff_teacher_details.get(0).toString(),"Question_1_Staff_Details_Basic{staffID=205074553, role='Teacher', firstName='Olivia', lastName='Kearns', gender=F}");
    }

    @Test
    public void testAssertListDetailsBasic2(){
        ArrayList<Question_1_Staff_Details_Basic> staff_teacher_details = new ArrayList<>();
        Question_1_Staff_Details_Basic Details1 = new Question_1_Staff_Details_Basic(205074553,"Teacher","Olivia","Kearns", 'F');
        Question_1_Staff_Details_Basic Details2 = new Question_1_Staff_Details_Basic(195074545,"Teacher","Adam","Wessons", 'M');

        staff_teacher_details.add(Details1);
        staff_teacher_details.add(Details2);

        assertEquals(staff_teacher_details.size(),2);


    }

    @Test
    public void testSalaryMethodDetailsBasic3(){
        Question_1_Staff_Details_Basic question_2_staff_details = new Question_1_Staff_Details_Basic();


        Assert.assertEquals(question_2_staff_details.monthlySalary(),9000.0,1.0);



    }

    @Test
    public void testSalaryMethodDetailsBasic4(){
        Question_1_Staff_Details_Basic question_2_staff_details = new Question_1_Staff_Details_Basic();

        String valueToString = String.valueOf( question_2_staff_details.monthlySalary());

        Assert.assertEquals(valueToString,"9000.0");



    }
}