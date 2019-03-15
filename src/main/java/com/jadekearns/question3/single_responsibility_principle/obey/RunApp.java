package com.jadekearns.question3.single_responsibility_principle.obey;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RunApp {

    public static void main(String[] args) {


        try {
            String dateInString = "31-08-1982 10:20:56";
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            Date date = dateFormat.parse(dateInString);

            Student cYears = new CalculateYears();
            Student student = new MessageStudent();
            student.setFirstName("Jade");
            student.setLastname("Kearns");
            cYears.setJoinDate(date);

            student.printInfo();
            cYears.yearsOnCampus();

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}
