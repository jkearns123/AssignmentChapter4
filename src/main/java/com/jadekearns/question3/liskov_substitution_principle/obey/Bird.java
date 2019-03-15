package com.jadekearns.question3.liskov_substitution_principle.obey;

public class Bird {

    String name;
    String eat;

    public Bird(String name, String eat) {
        this.name = name;
        this.eat = eat;
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

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }
}
