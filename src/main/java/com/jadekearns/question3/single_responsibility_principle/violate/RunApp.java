package com.jadekearns.question3.single_responsibility_principle.violate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RunApp {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Jade");
        student.setLastname("Kearns");


        String dateInString = "31-08-1982 10:20:56";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        Date date = null;
        try {
            date = dateFormat.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        student.setJoinDate(date);


        student.printInfo();

    }
}
