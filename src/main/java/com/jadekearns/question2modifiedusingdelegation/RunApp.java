package com.jadekearns.question2modifiedusingdelegation;

import java.util.ArrayList;

public class RunApp {

    public static void main(String[] args) {
        ArrayList<Question_2_Staff_Teacher_Details> staff_teacher_details = new ArrayList<>();


        staff_teacher_details.add(new Question_2_Staff_Teacher_Details(205074553,"Teacher","Olivia","Kearns", 'F',"Maths"));



        for(Question_2_Staff_Teacher_Details sdb : staff_teacher_details){
            System.out.println(sdb.toString()  );
        }
    }
}
