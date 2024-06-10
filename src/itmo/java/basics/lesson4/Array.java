package itmo.java.basics.lesson4;

import itmo.java.basics.lesson2.Car;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] ints = new int[10];

        ints[0] = 20;
        ints[1] = 320;
        ints[2] = 420;
        ints[3] = 250;
        ints[4] = 2440;
        ints[5] = 2;

//        System.out.println(Arrays.toString(ints));

        long[] longs = new long[]{123L, 321L, 333L};
        long[] long2 = {123L, 321L, 333L};

//        System.out.println(Arrays.toString(longs));


//        String[] strings = new String[5];
//
//        System.out.println(Arrays.toString(strings));


        Car[] cars = new Car[3];

        cars[0] = new Car("BMW", "X3");
        cars[1] = new Car("Lada", "Vesta");
        cars[2] = new Car("KIA", "Rio");

//        System.out.println(Arrays.toString(cars));


//        for (int i = 0; i < cars.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(cars[i]);
//            }
//        }


//        for (Car car : cars) {
//            if (car.getBrand().equals("BMW")) {
//                System.out.println(car);
//            }
//        }

        int x = 0;

//        do {
//
//            System.out.println(x++);
//
//        } while (x != 10);


//        while (x != 5) {
//            x++;
//
//            if (x < 2) {
//                continue;
//            }
//
//            System.out.println(x);
//
//
//            if (x == 3) {
//                break;
//            }
//
//        }

//        varargMethod(true, "Hello");
//        varargMethod(true, "Hello", "world", "!");


        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        int searchResult = Arrays.binarySearch(ints, 250);
        int searchResult2 = Arrays.binarySearch(ints, 280);

        System.out.println(searchResult);
        System.out.println(searchResult2);


    }

    public void someMethod(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void varargMethod(boolean bool, String... line) {
        for (String s : line) {
            System.out.println(s);
        }
    }

}
