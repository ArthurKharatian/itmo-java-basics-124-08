package itmo.java.basics.lesson3;

public class StaticExample {
    public static final String STATIC_STRING = "static constant";
    private String string;
    private final String nonStatic;
    public static String staticString;
    protected String protectedString;
    Integer number;

    static {
        System.out.println("====================");
        System.out.println("static block start");
        staticString = "static-string";
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("====================");
    }

    {
        System.out.println("====================");
        System.out.println("non-static block start");
        nonStatic = "non-static-string";
        System.out.println(nonStatic);
        System.out.println("non-static block end");
        System.out.println("====================");

        staticString = "12345";
    }


    public static void main(String[] args) {
//        new StaticExample();
//        System.out.println(staticString);

//        StaticExample staticExample = null;
//        staticExample.getNonStatic();

        Integer integer = null;
        String number = "123";

        int x = integer.parseInt(number);

        System.out.println(x);

    }

    public void someMethod() {
        System.out.println(nonStatic);
        System.out.println(staticString);
    }

    public static void printStaticVars() {
        System.out.println(staticString);
        System.out.println(new StaticExample().getNonStatic());
    }

    public String getNonStatic() {
        return nonStatic;
    }
}
