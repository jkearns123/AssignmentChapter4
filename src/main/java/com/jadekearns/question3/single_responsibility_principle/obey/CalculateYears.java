package com.jadekearns.question3.single_responsibility_principle.obey;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateYears extends Student{

    public void yearsOnCampus() {



        /*SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Date date1 = dateFormat1.parse(getJoinDate().getTime());

        Student student = new Student();
        int numberYears = 6;//(int) (date.getTime() - student.getJoinDate().getTime());*/

        Date date = new Date();



        System.out.println("You have been on campus for " + (date.getYear() - getJoinDate().getYear()) + " Years");

    }
}
