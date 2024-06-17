package itmo.java.basics.lesson7;

import itmo.java.basics.lesson6.Transport;

public class Main {
    public static void main(String[] args) {
//        OuterClass outerClass = new OuterClass();
//        outerClass.innerMethodCall();

//        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
//        nestedStaticClass.nestedStaticClassMethod();

        SomeInterface someInterface = new SomeInterface() {
            @Override
            public void print() {
                System.out.println(name());
            }

            @Override
            public String name() {
                return "Alice";
            }
        };

        someInterface.print();

        Transport transport = new Transport(2000, 15, false) {
            @Override
            protected void abstractMethod() {

            }

            @Override
            public void printTransportInfo() {

            }

            @Override
            public String transportName() {
                return null;
            }
        };
    }

//    public void someMethod() {
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
//    }
}
