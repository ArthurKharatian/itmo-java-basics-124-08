package itmo.java.basics.lesson3;


import itmo.java.basics.lesson2.Car;

import java.util.Calendar;

import static itmo.java.basics.lesson2.CarService.getTotalPrice;

public class Main {
    public static void main(String[] args) {
//        System.out.println(STATIC_STRING);
//
//        getTotalPrice(null, null);
//
//        Color green = Color.GREEN;

//        var car = new Car();
//        var carPrice = getTotalPrice(car, 1000);
//
//        var x = 0;
//
//        String string = null;
//        int number;

        Sun sun = Sun.getSun();
        sun.setSize(555);
        sun.setColor("White");

        Sun sun2 = Sun.getSun();
        sun2.setSize(777);
        sun2.setColor("Yellow");


        System.out.println(sun);
        System.out.println(sun2);

    }
}
