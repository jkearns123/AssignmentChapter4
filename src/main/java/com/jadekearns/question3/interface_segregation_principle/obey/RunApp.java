package com.jadekearns.question3.interface_segregation_principle.obey;

public class RunApp {

    private static Car car;
    private static Bike bike;

    public static void main(String[] args) {

        car = new Car();
        bike = new Bike();

        String carMessage = "Car has " + car.wheels(4) + " wheels, the size of the windshield is " + car.windshield(3,7) + "m2" + " , the interior colour is " + car.interior("Red");
        String bikeMessage = "Car has " + bike.wheels(2);

        System.out.println(carMessage);
        System.out.println(bikeMessage);

    }
}
