package itmo.java.basics.lesson6;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        Field[] declaredFields = car.getClass().getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }

        Object object = new Object();

        Parent parent = new Parent("Jack");
        Parent child = new Child("Tom", 35);
        Parent anotherChild = new AnotherChild("Alice");
//
//        parent.print();
//        child.print();
//        anotherChild.print();

//        Child child1 = new Parent("John");   // создание невозможно

//        ((Child)parent).print();  // <- ClassCastException

//        if (parent instanceof Parent) {
//            System.out.println("It's true");
//        }

//        Child child1 = new Child("Mike", 18);
//
//        child1.childMethod();

//        getSomebody(parent);
//        getSomebody(child);
//        getSomebody(anotherChild);

//        Movable car = new Car();
//        Movable bus = new Bus();

//        Movable movable = new Movable(); // <- создание невозможно

//        printTransportInfo(car);
//        printTransportInfo(bus);


        Transport bus = new Bus(2000, 50, false);
        Transport plane = new Plane(20000, 250, true);

        printTransportInfo(plane);
        printTransportInfo(bus);

    }

    public static Parent getSomebody(Parent parent) {

        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.childMethod();
            System.out.println("It's a child!!!");
        }
        if (parent instanceof AnotherChild) {
            System.out.println("It's a another child!!!");
        }

        return parent;
    }

    public static void printTransportInfo(Movable transport) {
        transport.printTransportInfo();
    }


    public static void printTransportInfo(Transport transport) {
        transport.printTransportInfo();
    }
}
