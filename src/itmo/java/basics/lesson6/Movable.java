package itmo.java.basics.lesson6;

import java.io.Serializable;

public interface Movable extends Interface, Serializable, Cloneable {
    public static final String NAME = "Brand";

    public abstract void printTransportInfo();

    String transportName();

    default void someMethod() {
        System.out.println("someMethod");
    }

    public static void staticMethod() {
        //logic
    }

    private static void privateMethod() {   // в Java 8 нет private static

    }

}
