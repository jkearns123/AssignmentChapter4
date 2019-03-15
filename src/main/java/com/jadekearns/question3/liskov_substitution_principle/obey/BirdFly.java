package com.jadekearns.question3.liskov_substitution_principle.obey;

public class BirdFly extends Bird{
    double flySpeed;

    public BirdFly(String name, String eat, double flySpeed) {
        super(name, eat);
        this.flySpeed = flySpeed;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    @Override
    public String toString() {
        return "BirdFly{" +
                "flySpeed=" + flySpeed +
                ", name='" + name + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }
}
