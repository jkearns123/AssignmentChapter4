package com.jadekearns.question3.liskov_substitution_principle.obey;

import java.util.ArrayList;
import java.util.List;

public class RunApp {

    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<Bird>();

        birdList.add(new BirdFly("Eagle","Fish",98.90));

        birdList.add(new BirdFlightless("Penguine","Fish"));
        birdsThatFly(birdList);
    }

    private static void birdsThatFly(List<Bird> birdList) {
        for(Bird blist : birdList){
            System.out.println(blist.toString());
        }
    }

}
