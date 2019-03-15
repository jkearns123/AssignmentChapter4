package com.jadekearns.question3.single_responsibility_principle.obey;

public class MessageStudent extends Student{

    @Override
    public void printInfo() {
        //super.printInfo();
        System.out.println(getFirstName() + " " + getLastname() + " " + "you are a student of CPUT");
    }
}
