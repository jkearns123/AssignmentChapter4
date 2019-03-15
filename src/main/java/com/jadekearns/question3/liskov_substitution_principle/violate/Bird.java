package com.jadekearns.question3.liskov_substitution_principle.violate;

public class Bird {

    String name;
    String eat;
    double flySpeed;

    public Bird(String name, String eat, double flySpeed) {
        this.name = name;
        this.eat = eat;
        this.flySpeed = flySpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", eat='" + eat + '\'' +
                ", flySpeed=" + flySpeed +
                '}';
    }
}
