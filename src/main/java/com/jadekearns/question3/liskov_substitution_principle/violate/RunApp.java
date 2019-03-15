package com.jadekearns.question3.liskov_substitution_principle.violate;

import java.util.ArrayList;
import java.util.List;

public class RunApp {

    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<Bird>();
        birdList.add(new Eagle("Eagle","Fish",98.90));
        birdList.add(new Penguine("Penguine","Fish",0.00));
        birdsThatFly(birdList);
    }

    //Penguine cant fly
    static void birdsThatFly(List<Bird> birdList){
        for(Bird blist : birdList){
            System.out.println(blist.toString());
        }
    }
}
