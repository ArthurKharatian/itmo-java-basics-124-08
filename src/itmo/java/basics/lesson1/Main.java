package itmo.java.basics.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        int x = 1;
//        int y = 2;
//        int z = 2;

        byte b = 100;
        short s = 123;
        int i = 100;
        long l = 5000000000L;
        float f = 12.3f;
        double d = 14;


        char c = 'a';
        char number = 555;
        boolean isTrue = true;
        boolean isFalse = false;

//        System.out.println(c);
//        System.out.println(number);

//        double result =  (double) (i / 3);


//        System.out.println(result);

//        byte result = (byte) (b + i);
//
//        System.out.println(result);
//
//        int t;
//
//        System.out.println(t);

//        int res = getNumber();
//        someMethod(res);

//        if (true) {
//            // logic
//        }
//
//        if (true) {
//            // logic
//        } else {
//            // another logic
//        }
//
//
//        if (true) {
//
//        } else if (false) {
//
//        } else if (false) {
//
//        } else if (false) {
//
//        } else if (false) {
//
//        }


        int x = 11;
        int y = 20;

        // x == y;  x != y; x > y; x < y; x >= y; x <= y; x % 2 == 0;

//        if (x % 2 == 0) {
//            System.out.println("OK!");
//        }

//
//        if (x % 2 == 0 && x != y) {
//
//        }

//        if (x % 2 == 0 || x != y) {
//
//        }

//        int a;
//
//        if (x > y) {
//            a = 10;
//        } else {
//            a = 100;
//        }

//        int res = x > y ? 10 : 100;

//        int res2 = x > y ? x > 10 ? 123 : 333 : 100;

//        long someNumber = getSomeNumber(4);
//        System.out.println(someNumber);

//        someOperation(10);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(num + 222);

    }

    public static int getNumber() {
        int result = 123 + 321;
        return result;
    }

    public static void someMethod(double number) {
        System.out.println(number);
    }

    public static long getSomeNumber(int x) {
        switch (x) {
            case 10:
                return 5000000000L;
            case 50:
                return 1000000000L;
            default:
                return 0;
        }
    }

    public static void someOperation(int x) {
        long res;

        switch (x) {
            case 10:
                res = 5000000000L;
                break;
            case 50:
                res = 1000000000L;
                break;
            default:
                res = 0;
        }

        System.out.println(res);
    }

    public void testMethod() {
        System.out.println("Hello world!");
    }

}
